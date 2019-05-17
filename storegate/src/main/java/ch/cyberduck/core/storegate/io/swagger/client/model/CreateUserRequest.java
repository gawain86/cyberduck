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
 * A CreateUser request object
 */
@ApiModel(description = "A CreateUser request object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class CreateUserRequest {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

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

  public CreateUserRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username
   * @return username
  **/
  @ApiModelProperty(value = "The username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateUserRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password
   * @return password
  **/
  @ApiModelProperty(value = "The password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserRequest firstName(String firstName) {
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

  public CreateUserRequest lastName(String lastName) {
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

  public CreateUserRequest email(String email) {
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

  public CreateUserRequest reservedSpaceSize(Long reservedSpaceSize) {
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

  public CreateUserRequest allowProductRegistration(Boolean allowProductRegistration) {
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

  public CreateUserRequest commonRootPermission(CommonRootPermissionEnum commonRootPermission) {
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
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.username, createUserRequest.username) &&
        Objects.equals(this.password, createUserRequest.password) &&
        Objects.equals(this.firstName, createUserRequest.firstName) &&
        Objects.equals(this.lastName, createUserRequest.lastName) &&
        Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.reservedSpaceSize, createUserRequest.reservedSpaceSize) &&
        Objects.equals(this.allowProductRegistration, createUserRequest.allowProductRegistration) &&
        Objects.equals(this.commonRootPermission, createUserRequest.commonRootPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, firstName, lastName, email, reservedSpaceSize, allowProductRegistration, commonRootPermission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

