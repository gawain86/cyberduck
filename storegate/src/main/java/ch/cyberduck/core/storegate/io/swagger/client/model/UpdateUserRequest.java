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

/**
 * A UpdateUserRequest request object
 */
@ApiModel(description = "A UpdateUserRequest request object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class UpdateUserRequest {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("reservedSpaceSize")
  private Long reservedSpaceSize = null;

  @JsonProperty("allowProductRegistration")
  private Boolean allowProductRegistration = null;

  /**
   * The Permission for Common root
   */
  public enum CommonRootPermissionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_99(99),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    CommonRootPermissionEnum(Integer value) {
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
    public static CommonRootPermissionEnum fromValue(String text) {
      for (CommonRootPermissionEnum b : CommonRootPermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("commonRootPermission")
  private CommonRootPermissionEnum commonRootPermission = null;

  public UpdateUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "The firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The LastName
   * @return lastName
  **/
  @ApiModelProperty(value = "The LastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The Email
   * @return email
  **/
  @ApiModelProperty(value = "The Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateUserRequest reservedSpaceSize(Long reservedSpaceSize) {
    this.reservedSpaceSize = reservedSpaceSize;
    return this;
  }

   /**
   * The ReservedSpaceSize
   * minimum: 0
   * @return reservedSpaceSize
  **/
  @ApiModelProperty(value = "The ReservedSpaceSize")
  public Long getReservedSpaceSize() {
    return reservedSpaceSize;
  }

  public void setReservedSpaceSize(Long reservedSpaceSize) {
    this.reservedSpaceSize = reservedSpaceSize;
  }

  public UpdateUserRequest allowProductRegistration(Boolean allowProductRegistration) {
    this.allowProductRegistration = allowProductRegistration;
    return this;
  }

   /**
   * The AllowProductRegistration
   * @return allowProductRegistration
  **/
  @ApiModelProperty(value = "The AllowProductRegistration")
  public Boolean isAllowProductRegistration() {
    return allowProductRegistration;
  }

  public void setAllowProductRegistration(Boolean allowProductRegistration) {
    this.allowProductRegistration = allowProductRegistration;
  }

  public UpdateUserRequest commonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
    return this;
  }

   /**
   * The Permission for Common root
   * @return commonRootPermission
  **/
  @ApiModelProperty(value = "The Permission for Common root")
  public CommonRootPermissionEnum getCommonRootPermission() {
    return commonRootPermission;
  }

  public void setCommonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.reservedSpaceSize, updateUserRequest.reservedSpaceSize) &&
        Objects.equals(this.allowProductRegistration, updateUserRequest.allowProductRegistration) &&
        Objects.equals(this.commonRootPermission, updateUserRequest.commonRootPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, reservedSpaceSize, allowProductRegistration, commonRootPermission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    reservedSpaceSize: ").append(toIndentedString(reservedSpaceSize)).append("\n");
    sb.append("    allowProductRegistration: ").append(toIndentedString(allowProductRegistration)).append("\n");
    sb.append("    commonRootPermission: ").append(toIndentedString(commonRootPermission)).append("\n");
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

