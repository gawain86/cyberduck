/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.8.0-LTS  - built at: 2018-05-03 15:44:37<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.8.0-LTS
 * Contact: develop@dracoon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateDownloadShareRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class CreateDownloadShareRequest {
  @JsonProperty("nodeId")
  private Long nodeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("showCreatorName")
  private Boolean showCreatorName = null;

  @JsonProperty("showCreatorUsername")
  private Boolean showCreatorUsername = null;

  @JsonProperty("notifyCreator")
  private Boolean notifyCreator = null;

  @JsonProperty("maxDownloads")
  private Integer maxDownloads = null;

  @JsonProperty("sendMail")
  private Boolean sendMail = null;

  @JsonProperty("mailRecipients")
  private String mailRecipients = null;

  @JsonProperty("mailSubject")
  private String mailSubject = null;

  @JsonProperty("mailBody")
  private String mailBody = null;

  @JsonProperty("keyPair")
  private UserKeyPairContainer keyPair = null;

  @JsonProperty("fileKey")
  private FileKey fileKey = null;

  @JsonProperty("sendSms")
  private Boolean sendSms = null;

  @JsonProperty("smsRecipients")
  private String smsRecipients = null;

  @JsonProperty("creatorLanguage")
  private String creatorLanguage = null;

  @JsonProperty("receiverLanguage")
  private String receiverLanguage = null;

  public CreateDownloadShareRequest nodeId(Long nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Source node ID
   * @return nodeId
  **/
  @ApiModelProperty(required = true, value = "Source node ID")
  public Long getNodeId() {
    return nodeId;
  }

  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }

  public CreateDownloadShareRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Alias name
   * @return name
  **/
  @ApiModelProperty(value = "Alias name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateDownloadShareRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Access password, not allowed for encrypted shares
   * @return password
  **/
  @ApiModelProperty(value = "Access password, not allowed for encrypted shares")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateDownloadShareRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Expiration date / time
   * @return expiration
  **/
  @ApiModelProperty(value = "Expiration date / time")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public CreateDownloadShareRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes (limited to 255 characters)
   * @return notes
  **/
  @ApiModelProperty(value = "User notes (limited to 255 characters)")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CreateDownloadShareRequest showCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
    return this;
  }

   /**
   * Show creator first and last name. (default: false)
   * @return showCreatorName
  **/
  @ApiModelProperty(example = "false", value = "Show creator first and last name. (default: false)")
  public Boolean getShowCreatorName() {
    return showCreatorName;
  }

  public void setShowCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
  }

  public CreateDownloadShareRequest showCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
    return this;
  }

   /**
   * Show creator email address. (default: false)
   * @return showCreatorUsername
  **/
  @ApiModelProperty(example = "false", value = "Show creator email address. (default: false)")
  public Boolean getShowCreatorUsername() {
    return showCreatorUsername;
  }

  public void setShowCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
  }

  public CreateDownloadShareRequest notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }

   /**
   * Notify creator on every download. (default: false)
   * @return notifyCreator
  **/
  @ApiModelProperty(example = "false", value = "Notify creator on every download. (default: false)")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }

  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }

  public CreateDownloadShareRequest maxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
    return this;
  }

   /**
   * Max allowed downloads
   * @return maxDownloads
  **/
  @ApiModelProperty(value = "Max allowed downloads")
  public Integer getMaxDownloads() {
    return maxDownloads;
  }

  public void setMaxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
  }

  public CreateDownloadShareRequest sendMail(Boolean sendMail) {
    this.sendMail = sendMail;
    return this;
  }

   /**
   * Notify recipients (default: false)
   * @return sendMail
  **/
  @ApiModelProperty(example = "false", value = "Notify recipients (default: false)")
  public Boolean getSendMail() {
    return sendMail;
  }

  public void setSendMail(Boolean sendMail) {
    this.sendMail = sendMail;
  }

  public CreateDownloadShareRequest mailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
    return this;
  }

   /**
   * CSV string of recipient emails
   * @return mailRecipients
  **/
  @ApiModelProperty(value = "CSV string of recipient emails")
  public String getMailRecipients() {
    return mailRecipients;
  }

  public void setMailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
  }

  public CreateDownloadShareRequest mailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
    return this;
  }

   /**
   * Notification email subject
   * @return mailSubject
  **/
  @ApiModelProperty(value = "Notification email subject")
  public String getMailSubject() {
    return mailSubject;
  }

  public void setMailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
  }

  public CreateDownloadShareRequest mailBody(String mailBody) {
    this.mailBody = mailBody;
    return this;
  }

   /**
   * Notification email content
   * @return mailBody
  **/
  @ApiModelProperty(value = "Notification email content")
  public String getMailBody() {
    return mailBody;
  }

  public void setMailBody(String mailBody) {
    this.mailBody = mailBody;
  }

  public CreateDownloadShareRequest keyPair(UserKeyPairContainer keyPair) {
    this.keyPair = keyPair;
    return this;
  }

   /**
   * Keypair for Download Share pseudo-user
   * @return keyPair
  **/
  @ApiModelProperty(value = "Keypair for Download Share pseudo-user")
  public UserKeyPairContainer getKeyPair() {
    return keyPair;
  }

  public void setKeyPair(UserKeyPairContainer keyPair) {
    this.keyPair = keyPair;
  }

  public CreateDownloadShareRequest fileKey(FileKey fileKey) {
    this.fileKey = fileKey;
    return this;
  }

   /**
   * Encrypted file key for shares out of encrypted rooms
   * @return fileKey
  **/
  @ApiModelProperty(value = "Encrypted file key for shares out of encrypted rooms")
  public FileKey getFileKey() {
    return fileKey;
  }

  public void setFileKey(FileKey fileKey) {
    this.fileKey = fileKey;
  }

  public CreateDownloadShareRequest sendSms(Boolean sendSms) {
    this.sendSms = sendSms;
    return this;
  }

   /**
   * Send share password via SMS (default: false)
   * @return sendSms
  **/
  @ApiModelProperty(example = "false", value = "Send share password via SMS (default: false)")
  public Boolean getSendSms() {
    return sendSms;
  }

  public void setSendSms(Boolean sendSms) {
    this.sendSms = sendSms;
  }

  public CreateDownloadShareRequest smsRecipients(String smsRecipients) {
    this.smsRecipients = smsRecipients;
    return this;
  }

   /**
   * CSV string of recipient MSISDNs
   * @return smsRecipients
  **/
  @ApiModelProperty(value = "CSV string of recipient MSISDNs")
  public String getSmsRecipients() {
    return smsRecipients;
  }

  public void setSmsRecipients(String smsRecipients) {
    this.smsRecipients = smsRecipients;
  }

  public CreateDownloadShareRequest creatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
    return this;
  }

   /**
   * Language tag for messages to creator
   * @return creatorLanguage
  **/
  @ApiModelProperty(example = "de-DE", value = "Language tag for messages to creator")
  public String getCreatorLanguage() {
    return creatorLanguage;
  }

  public void setCreatorLanguage(String creatorLanguage) {
    this.creatorLanguage = creatorLanguage;
  }

  public CreateDownloadShareRequest receiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
    return this;
  }

   /**
   * Language tag for messages to receiver
   * @return receiverLanguage
  **/
  @ApiModelProperty(example = "de-DE", value = "Language tag for messages to receiver")
  public String getReceiverLanguage() {
    return receiverLanguage;
  }

  public void setReceiverLanguage(String receiverLanguage) {
    this.receiverLanguage = receiverLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDownloadShareRequest createDownloadShareRequest = (CreateDownloadShareRequest) o;
    return Objects.equals(this.nodeId, createDownloadShareRequest.nodeId) &&
        Objects.equals(this.name, createDownloadShareRequest.name) &&
        Objects.equals(this.password, createDownloadShareRequest.password) &&
        Objects.equals(this.expiration, createDownloadShareRequest.expiration) &&
        Objects.equals(this.notes, createDownloadShareRequest.notes) &&
        Objects.equals(this.showCreatorName, createDownloadShareRequest.showCreatorName) &&
        Objects.equals(this.showCreatorUsername, createDownloadShareRequest.showCreatorUsername) &&
        Objects.equals(this.notifyCreator, createDownloadShareRequest.notifyCreator) &&
        Objects.equals(this.maxDownloads, createDownloadShareRequest.maxDownloads) &&
        Objects.equals(this.sendMail, createDownloadShareRequest.sendMail) &&
        Objects.equals(this.mailRecipients, createDownloadShareRequest.mailRecipients) &&
        Objects.equals(this.mailSubject, createDownloadShareRequest.mailSubject) &&
        Objects.equals(this.mailBody, createDownloadShareRequest.mailBody) &&
        Objects.equals(this.keyPair, createDownloadShareRequest.keyPair) &&
        Objects.equals(this.fileKey, createDownloadShareRequest.fileKey) &&
        Objects.equals(this.sendSms, createDownloadShareRequest.sendSms) &&
        Objects.equals(this.smsRecipients, createDownloadShareRequest.smsRecipients) &&
        Objects.equals(this.creatorLanguage, createDownloadShareRequest.creatorLanguage) &&
        Objects.equals(this.receiverLanguage, createDownloadShareRequest.receiverLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, name, password, expiration, notes, showCreatorName, showCreatorUsername, notifyCreator, maxDownloads, sendMail, mailRecipients, mailSubject, mailBody, keyPair, fileKey, sendSms, smsRecipients, creatorLanguage, receiverLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDownloadShareRequest {\n");

    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
    sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
    sb.append("    sendMail: ").append(toIndentedString(sendMail)).append("\n");
    sb.append("    mailRecipients: ").append(toIndentedString(mailRecipients)).append("\n");
    sb.append("    mailSubject: ").append(toIndentedString(mailSubject)).append("\n");
    sb.append("    mailBody: ").append(toIndentedString(mailBody)).append("\n");
    sb.append("    keyPair: ").append(toIndentedString(keyPair)).append("\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
    sb.append("    sendSms: ").append(toIndentedString(sendSms)).append("\n");
    sb.append("    smsRecipients: ").append(toIndentedString(smsRecipients)).append("\n");
    sb.append("    creatorLanguage: ").append(toIndentedString(creatorLanguage)).append("\n");
    sb.append("    receiverLanguage: ").append(toIndentedString(receiverLanguage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
