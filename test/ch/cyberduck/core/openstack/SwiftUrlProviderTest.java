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

import ch.cyberduck.core.*;

import org.junit.Test;

import java.util.Collections;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @version $Id$
 */
public class SwiftUrlProviderTest extends AbstractTestCase {

    @Test
    public void testGet() throws Exception {
        final SwiftSession session = new SwiftSession(new Host(new SwiftProtocol(), "identity.api.rackspacecloud.com",
                new Credentials(properties.getProperty("rackspace.key"), properties.getProperty("rackspace.secret"))
        ));
        session.open(new DefaultHostKeyController());
        session.login(new DisabledPasswordStore(), new DisabledLoginController());
        final Path container = new Path("test.cyberduck.ch", Path.VOLUME_TYPE);
        assertEquals("https://storage101.dfw1.clouddrive.com/v1/MossoCloudFS_59113590-c679-46c3-bf62-9d7c3d5176ee/test.cyberduck.ch/f", new SwiftUrlProvider(session).toUrl(new Path(container, "f", Path.FILE_TYPE)).find(
                DescriptiveUrl.Type.provider).getUrl());
        session.close();
    }

    @Test
    public void testSignedHp() throws Exception {
        final SwiftProtocol protocol = new SwiftProtocol() {
            @Override
            public String getContext() {
                return "/v2.0/tokens";
            }
        };
        final Host host = new Host(protocol, "region-a.geo-1.identity.hpcloudsvc.com", 35357, new Credentials(
                properties.getProperty("hpcloud.key"), properties.getProperty("hpcloud.secret")
        ));
        final SwiftSession session = new SwiftSession(host);
        session.open(new DefaultHostKeyController());
        session.login(new DisabledPasswordStore(), new DisabledLoginController());
        final Path container = new Path("test.cyberduck.ch", Path.VOLUME_TYPE);
        final Path file = new Path(container, UUID.randomUUID().toString(), Path.FILE_TYPE);
        new SwiftTouchFeature(session).touch(file);
        final UrlProvider provider = new SwiftUrlProvider(session, session.accounts, new DisabledPasswordStore() {
            @Override
            public String getPassword(final Scheme scheme, final int port, final String hostname, final String user) {
                return properties.getProperty("hpcloud.secret");
            }
        });
        assertTrue(provider.toUrl(file).find(DescriptiveUrl.Type.signed).getUrl().startsWith(
                "https://region-a.geo-1.objects.hpcloudsvc.com/v1/88650632417788/test.cyberduck.ch/" + file.getName()));
        new SwiftDeleteFeature(session).delete(Collections.singletonList(file), new DisabledLoginController());
        session.close();
    }

    @Test
    public void testSignedRax() throws Exception {
        final SwiftSession session = new SwiftSession(new Host(new SwiftProtocol(), "identity.api.rackspacecloud.com",
                new Credentials(properties.getProperty("rackspace.key"), properties.getProperty("rackspace.secret"))
        ));
        final UrlProvider provider = new SwiftUrlProvider(session, session.accounts, new DisabledPasswordStore());
        final Path container = new Path("test.cyberduck.ch", Path.VOLUME_TYPE);
        final Path file = new Path(container, UUID.randomUUID().toString(), Path.FILE_TYPE);
        assertEquals(DescriptiveUrl.EMPTY, provider.toUrl(file).find(DescriptiveUrl.Type.signed));
        session.open(new DefaultHostKeyController());
        session.login(new DisabledPasswordStore(), new DisabledLoginController());
        new SwiftTouchFeature(session).touch(file);
        assertTrue(provider.toUrl(file).find(DescriptiveUrl.Type.signed).getUrl().startsWith(
                "https://storage101.dfw1.clouddrive.com/v1/MossoCloudFS_59113590-c679-46c3-bf62-9d7c3d5176ee/test.cyberduck.ch/" + file.getName()));
        new SwiftDeleteFeature(session).delete(Collections.singletonList(file), new DisabledLoginController());
        session.close();
    }
}
