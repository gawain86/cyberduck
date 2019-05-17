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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Eventitem
 */
@ApiModel(description = "Eventitem")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class EventItem {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private DateTime date = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("event")
  private String event = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("fileId")
  private String fileId = null;

  @JsonProperty("data")
  private Map<String, String> data = null;

  public EventItem id(String id) {
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

  public EventItem date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date and time the item.
   * @return date
  **/
  @ApiModelProperty(value = "The date and time the item.")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public EventItem userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user.
   * @return userId
  **/
  @ApiModelProperty(value = "The user.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EventItem event(String event) {
    this.event = event;
    return this;
  }

   /**
   * The event.
   * @return event
  **/
  @ApiModelProperty(value = "The event.")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public EventItem filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The filename.
   * @return filename
  **/
  @ApiModelProperty(value = "The filename.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public EventItem fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * 
   * @return fileId
  **/
  @ApiModelProperty(value = "")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public EventItem data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public EventItem putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, String>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * 
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventItem eventItem = (EventItem) o;
    return Objects.equals(this.id, eventItem.id) &&
        Objects.equals(this.date, eventItem.date) &&
        Objects.equals(this.userId, eventItem.userId) &&
        Objects.equals(this.event, eventItem.event) &&
        Objects.equals(this.filename, eventItem.filename) &&
        Objects.equals(this.fileId, eventItem.fileId) &&
        Objects.equals(this.data, eventItem.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, userId, event, filename, fileId, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

