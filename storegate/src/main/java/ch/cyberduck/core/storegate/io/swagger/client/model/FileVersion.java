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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A file version.
 */
@ApiModel(description = "A file version.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class FileVersion {
  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("uploadedBy")
  private String uploadedBy = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("modified")
  private DateTime modified = null;

  @JsonProperty("uploaded")
  private DateTime uploaded = null;

  @JsonProperty("accessed")
  private DateTime accessed = null;

  /**
   * Indicates the item type.
   */
  public enum FlagsEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_16(16),
    
    NUMBER_32(32),
    
    NUMBER_64(64),
    
    NUMBER_128(128);

    private Integer value;

    FlagsEnum(Integer value) {
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
    public static FlagsEnum fromValue(String text) {
      for (FlagsEnum b : FlagsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flags")
  private FlagsEnum flags = null;

  @JsonProperty("ownerId")
  private String ownerId = null;

  public FileVersion version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Indicates the file version.
   * @return version
  **/
  @ApiModelProperty(value = "Indicates the file version.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FileVersion uploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }

   /**
   * Uploaded by user
   * @return uploadedBy
  **/
  @ApiModelProperty(value = "Uploaded by user")
  public String getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  public FileVersion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item id.
   * @return id
  **/
  @ApiModelProperty(value = "The item id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item name.
   * @return name
  **/
  @ApiModelProperty(value = "The item name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileVersion size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The item size.
   * @return size
  **/
  @ApiModelProperty(value = "The item size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileVersion created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the item was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public FileVersion modified(DateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public DateTime getModified() {
    return modified;
  }

  public void setModified(DateTime modified) {
    this.modified = modified;
  }

  public FileVersion uploaded(DateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * The date and time the item was uploaded.
   * @return uploaded
  **/
  @ApiModelProperty(value = "The date and time the item was uploaded.")
  public DateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(DateTime uploaded) {
    this.uploaded = uploaded;
  }

  public FileVersion accessed(DateTime accessed) {
    this.accessed = accessed;
    return this;
  }

   /**
   * The date and time the item was last accessed.
   * @return accessed
  **/
  @ApiModelProperty(value = "The date and time the item was last accessed.")
  public DateTime getAccessed() {
    return accessed;
  }

  public void setAccessed(DateTime accessed) {
    this.accessed = accessed;
  }

  public FileVersion flags(FlagsEnum flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Indicates the item type.
   * @return flags
  **/
  @ApiModelProperty(value = "Indicates the item type.")
  public FlagsEnum getFlags() {
    return flags;
  }

  public void setFlags(FlagsEnum flags) {
    this.flags = flags;
  }

  public FileVersion ownerId(String ownerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersion fileVersion = (FileVersion) o;
    return Objects.equals(this.version, fileVersion.version) &&
        Objects.equals(this.uploadedBy, fileVersion.uploadedBy) &&
        Objects.equals(this.id, fileVersion.id) &&
        Objects.equals(this.name, fileVersion.name) &&
        Objects.equals(this.size, fileVersion.size) &&
        Objects.equals(this.created, fileVersion.created) &&
        Objects.equals(this.modified, fileVersion.modified) &&
        Objects.equals(this.uploaded, fileVersion.uploaded) &&
        Objects.equals(this.accessed, fileVersion.accessed) &&
        Objects.equals(this.flags, fileVersion.flags) &&
        Objects.equals(this.ownerId, fileVersion.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, uploadedBy, id, name, size, created, modified, uploaded, accessed, flags, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersion {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

