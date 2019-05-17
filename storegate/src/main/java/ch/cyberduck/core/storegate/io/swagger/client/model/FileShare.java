/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.storegate.io.swagger.client.model.BankIDContact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A FileShare
 */
@ApiModel(description = "A FileShare")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class FileShare {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("pathFile")
  private ch.cyberduck.core.storegate.io.swagger.client.model.File pathFile = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("accessed")
  private Integer accessed = null;

  @JsonProperty("lastAccessed")
  private DateTime lastAccessed = null;

  @JsonProperty("ownerId")
  private String ownerId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("sentToEmails")
  private List<String> sentToEmails = null;

  @JsonProperty("accessLimit")
  private Integer accessLimit = null;

  @JsonProperty("accessUntil")
  private DateTime accessUntil = null;

  @JsonProperty("allowUpload")
  private Boolean allowUpload = null;

  @JsonProperty("uploadNotificationEmails")
  private List<String> uploadNotificationEmails = null;

  @JsonProperty("uploadHideContents")
  private Boolean uploadHideContents = null;

  @JsonProperty("mediaAllowDownload")
  private Boolean mediaAllowDownload = null;

  @JsonProperty("allowComments")
  private Boolean allowComments = null;

  @JsonProperty("bankIDContacts")
  private List<BankIDContact> bankIDContacts = null;

  /**
   * Share AuthMethod
   */
  public enum AuthMethodEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    AuthMethodEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthMethodEnum fromValue(String text) {
      for (AuthMethodEnum b : AuthMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("authMethod")
  private AuthMethodEnum authMethod = null;

  public FileShare url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url to the share
   * @return url
  **/
  @ApiModelProperty(value = "Url to the share")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public FileShare pathFile(ch.cyberduck.core.storegate.io.swagger.client.model.File pathFile) {
    this.pathFile = pathFile;
    return this;
  }

   /**
   * The shared item.
   * @return pathFile
  **/
  @ApiModelProperty(value = "The shared item.")
  public ch.cyberduck.core.storegate.io.swagger.client.model.File getPathFile() {
    return pathFile;
  }

  public void setPathFile(ch.cyberduck.core.storegate.io.swagger.client.model.File pathFile) {
    this.pathFile = pathFile;
  }

  public FileShare id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The share id.
   * @return id
  **/
  @ApiModelProperty(value = "The share id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileShare created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When the share was created.
   * @return created
  **/
  @ApiModelProperty(value = "When the share was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public FileShare accessed(Integer accessed) {
    this.accessed = accessed;
    return this;
  }

   /**
   * Number of times that the share has been accessed.
   * @return accessed
  **/
  @ApiModelProperty(value = "Number of times that the share has been accessed.")
  public Integer getAccessed() {
    return accessed;
  }

  public void setAccessed(Integer accessed) {
    this.accessed = accessed;
  }

  public FileShare lastAccessed(DateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
    return this;
  }

   /**
   * Last time the share was accessed
   * @return lastAccessed
  **/
  @ApiModelProperty(value = "Last time the share was accessed")
  public DateTime getLastAccessed() {
    return lastAccessed;
  }

  public void setLastAccessed(DateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
  }

  public FileShare ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The owner.
   * @return ownerId
  **/
  @ApiModelProperty(value = "The owner.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public FileShare password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Optional share password.
   * @return password
  **/
  @ApiModelProperty(value = "Optional share password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FileShare sentToEmails(List<String> sentToEmails) {
    this.sentToEmails = sentToEmails;
    return this;
  }

  public FileShare addSentToEmailsItem(String sentToEmailsItem) {
    if (this.sentToEmails == null) {
      this.sentToEmails = new ArrayList<String>();
    }
    this.sentToEmails.add(sentToEmailsItem);
    return this;
  }

   /**
   * Add addresses that the share have been mailed to.
   * @return sentToEmails
  **/
  @ApiModelProperty(value = "Add addresses that the share have been mailed to.")
  public List<String> getSentToEmails() {
    return sentToEmails;
  }

  public void setSentToEmails(List<String> sentToEmails) {
    this.sentToEmails = sentToEmails;
  }

  public FileShare accessLimit(Integer accessLimit) {
    this.accessLimit = accessLimit;
    return this;
  }

   /**
   * Limit the number of access.
   * @return accessLimit
  **/
  @ApiModelProperty(value = "Limit the number of access.")
  public Integer getAccessLimit() {
    return accessLimit;
  }

  public void setAccessLimit(Integer accessLimit) {
    this.accessLimit = accessLimit;
  }

  public FileShare accessUntil(DateTime accessUntil) {
    this.accessUntil = accessUntil;
    return this;
  }

   /**
   * Limit access to before this date.
   * @return accessUntil
  **/
  @ApiModelProperty(value = "Limit access to before this date.")
  public DateTime getAccessUntil() {
    return accessUntil;
  }

  public void setAccessUntil(DateTime accessUntil) {
    this.accessUntil = accessUntil;
  }

  public FileShare allowUpload(Boolean allowUpload) {
    this.allowUpload = allowUpload;
    return this;
  }

   /**
   * Allow upload in folder.
   * @return allowUpload
  **/
  @ApiModelProperty(value = "Allow upload in folder.")
  public Boolean isAllowUpload() {
    return allowUpload;
  }

  public void setAllowUpload(Boolean allowUpload) {
    this.allowUpload = allowUpload;
  }

  public FileShare uploadNotificationEmails(List<String> uploadNotificationEmails) {
    this.uploadNotificationEmails = uploadNotificationEmails;
    return this;
  }

  public FileShare addUploadNotificationEmailsItem(String uploadNotificationEmailsItem) {
    if (this.uploadNotificationEmails == null) {
      this.uploadNotificationEmails = new ArrayList<String>();
    }
    this.uploadNotificationEmails.add(uploadNotificationEmailsItem);
    return this;
  }

   /**
   * Send mail to the following email addresses when files have been uploaded. (Separate call needed to send the mail).
   * @return uploadNotificationEmails
  **/
  @ApiModelProperty(value = "Send mail to the following email addresses when files have been uploaded. (Separate call needed to send the mail).")
  public List<String> getUploadNotificationEmails() {
    return uploadNotificationEmails;
  }

  public void setUploadNotificationEmails(List<String> uploadNotificationEmails) {
    this.uploadNotificationEmails = uploadNotificationEmails;
  }

  public FileShare uploadHideContents(Boolean uploadHideContents) {
    this.uploadHideContents = uploadHideContents;
    return this;
  }

   /**
   * Hide the contents in the folder. (Allows upload, blocks download).
   * @return uploadHideContents
  **/
  @ApiModelProperty(value = "Hide the contents in the folder. (Allows upload, blocks download).")
  public Boolean isUploadHideContents() {
    return uploadHideContents;
  }

  public void setUploadHideContents(Boolean uploadHideContents) {
    this.uploadHideContents = uploadHideContents;
  }

  public FileShare mediaAllowDownload(Boolean mediaAllowDownload) {
    this.mediaAllowDownload = mediaAllowDownload;
    return this;
  }

   /**
   * Allow download of original image.
   * @return mediaAllowDownload
  **/
  @ApiModelProperty(value = "Allow download of original image.")
  public Boolean isMediaAllowDownload() {
    return mediaAllowDownload;
  }

  public void setMediaAllowDownload(Boolean mediaAllowDownload) {
    this.mediaAllowDownload = mediaAllowDownload;
  }

  public FileShare allowComments(Boolean allowComments) {
    this.allowComments = allowComments;
    return this;
  }

   /**
   * Shows Facebook comments on share page
   * @return allowComments
  **/
  @ApiModelProperty(value = "Shows Facebook comments on share page")
  public Boolean isAllowComments() {
    return allowComments;
  }

  public void setAllowComments(Boolean allowComments) {
    this.allowComments = allowComments;
  }

  public FileShare bankIDContacts(List<BankIDContact> bankIDContacts) {
    this.bankIDContacts = bankIDContacts;
    return this;
  }

  public FileShare addBankIDContactsItem(BankIDContact bankIDContactsItem) {
    if (this.bankIDContacts == null) {
      this.bankIDContacts = new ArrayList<BankIDContact>();
    }
    this.bankIDContacts.add(bankIDContactsItem);
    return this;
  }

   /**
   * List of receivers
   * @return bankIDContacts
  **/
  @ApiModelProperty(value = "List of receivers")
  public List<BankIDContact> getBankIDContacts() {
    return bankIDContacts;
  }

  public void setBankIDContacts(List<BankIDContact> bankIDContacts) {
    this.bankIDContacts = bankIDContacts;
  }

  public FileShare authMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
    return this;
  }

   /**
   * Share AuthMethod
   * @return authMethod
  **/
  @ApiModelProperty(value = "Share AuthMethod")
  public AuthMethodEnum getAuthMethod() {
    return authMethod;
  }

  public void setAuthMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileShare fileShare = (FileShare) o;
    return Objects.equals(this.url, fileShare.url) &&
        Objects.equals(this.pathFile, fileShare.pathFile) &&
        Objects.equals(this.id, fileShare.id) &&
        Objects.equals(this.created, fileShare.created) &&
        Objects.equals(this.accessed, fileShare.accessed) &&
        Objects.equals(this.lastAccessed, fileShare.lastAccessed) &&
        Objects.equals(this.ownerId, fileShare.ownerId) &&
        Objects.equals(this.password, fileShare.password) &&
        Objects.equals(this.sentToEmails, fileShare.sentToEmails) &&
        Objects.equals(this.accessLimit, fileShare.accessLimit) &&
        Objects.equals(this.accessUntil, fileShare.accessUntil) &&
        Objects.equals(this.allowUpload, fileShare.allowUpload) &&
        Objects.equals(this.uploadNotificationEmails, fileShare.uploadNotificationEmails) &&
        Objects.equals(this.uploadHideContents, fileShare.uploadHideContents) &&
        Objects.equals(this.mediaAllowDownload, fileShare.mediaAllowDownload) &&
        Objects.equals(this.allowComments, fileShare.allowComments) &&
        Objects.equals(this.bankIDContacts, fileShare.bankIDContacts) &&
        Objects.equals(this.authMethod, fileShare.authMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, pathFile, id, created, accessed, lastAccessed, ownerId, password, sentToEmails, accessLimit, accessUntil, allowUpload, uploadNotificationEmails, uploadHideContents, mediaAllowDownload, allowComments, bankIDContacts, authMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileShare {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pathFile: ").append(toIndentedString(pathFile)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sentToEmails: ").append(toIndentedString(sentToEmails)).append("\n");
    sb.append("    accessLimit: ").append(toIndentedString(accessLimit)).append("\n");
    sb.append("    accessUntil: ").append(toIndentedString(accessUntil)).append("\n");
    sb.append("    allowUpload: ").append(toIndentedString(allowUpload)).append("\n");
    sb.append("    uploadNotificationEmails: ").append(toIndentedString(uploadNotificationEmails)).append("\n");
    sb.append("    uploadHideContents: ").append(toIndentedString(uploadHideContents)).append("\n");
    sb.append("    mediaAllowDownload: ").append(toIndentedString(mediaAllowDownload)).append("\n");
    sb.append("    allowComments: ").append(toIndentedString(allowComments)).append("\n");
    sb.append("    bankIDContacts: ").append(toIndentedString(bankIDContacts)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

