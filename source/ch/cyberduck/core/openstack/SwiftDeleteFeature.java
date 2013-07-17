package ch.cyberduck.core.openstack;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathContainerService;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.exception.DefaultIOExceptionMappingService;
import ch.cyberduck.core.exception.NotfoundException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.i18n.Locale;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

import ch.iterate.openstack.swift.exception.GenericException;

/**
 * @version $Id$
 */
public class SwiftDeleteFeature implements Delete {
    private static final Logger log = Logger.getLogger(SwiftDeleteFeature.class);

    private SwiftSession session;

    private PathContainerService containerService
            = new PathContainerService();

    public SwiftDeleteFeature(final SwiftSession session) {
        this.session = session;
    }

    @Override
    public void delete(final List<Path> files) throws BackgroundException {
        for(Path file : files) {
            session.message(MessageFormat.format(Locale.localizedString("Deleting {0}", "Status"),
                    file.getName()));
            try {
                try {
                    if(file.attributes().isFile()) {
                        session.getClient().deleteObject(session.getRegion(containerService.getContainer(file)),
                                containerService.getContainer(file).getName(), containerService.getKey(file));
                    }
                    else if(file.attributes().isDirectory()) {
                        if(containerService.isContainer(file)) {
                            session.getClient().deleteContainer(session.getRegion(containerService.getContainer(file)),
                                    containerService.getContainer(file).getName());
                        }
                        else {
                            session.getClient().deleteObject(session.getRegion(containerService.getContainer(file)),
                                    containerService.getContainer(file).getName(), containerService.getKey(file));
                        }
                    }
                }
                catch(GenericException e) {
                    throw new SwiftExceptionMappingService().map("Cannot delete {0}", e, file);
                }
                catch(IOException e) {
                    throw new DefaultIOExceptionMappingService().map("Cannot delete {0}", e, file);
                }
            }
            catch(NotfoundException e) {
                // No real placeholder but just a delimiter returned in the object listing.
                log.warn(e.getMessage());
            }
        }
    }
}
