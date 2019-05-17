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
 * Update account info.
 */
@ApiModel(description = "Update account info.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:54:33.279+02:00")
public class UpdateAccountInfoRequest {
  @JsonProperty("socialSecurityNumber")
  private String socialSecurityNumber = null;

  @JsonProperty("newsletter")
  private Boolean newsletter = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("organizationNumber")
  private String organizationNumber = null;

  @JsonProperty("currentPassword")
  private String currentPassword = null;

  public UpdateAccountInfoRequest socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public UpdateAccountInfoRequest newsletter(Boolean newsletter) {
    this.newsletter = newsletter;
    return this;
  }

   /**
   * 
   * @return newsletter
  **/
  @ApiModelProperty(value = "")
  public Boolean isNewsletter() {
    return newsletter;
  }

  public void setNewsletter(Boolean newsletter) {
    this.newsletter = newsletter;
  }

  public UpdateAccountInfoRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The accounts e-mail address.
   * @return email
  **/
  @ApiModelProperty(value = "The accounts e-mail address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateAccountInfoRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The users name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The users name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateAccountInfoRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The users surname.
   * @return lastName
  **/
  @ApiModelProperty(value = "The users surname.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateAccountInfoRequest company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The users company.
   * @return company
  **/
  @ApiModelProperty(value = "The users company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UpdateAccountInfoRequest vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * VAT number
   * @return vatNumber
  **/
  @ApiModelProperty(value = "VAT number")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public UpdateAccountInfoRequest organizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
    return this;
  }

   /**
   * Organization Number
   * @return organizationNumber
  **/
  @ApiModelProperty(value = "Organization Number")
  public String getOrganizationNumber() {
    return organizationNumber;
  }

  public void setOrganizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
  }

  public UpdateAccountInfoRequest currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * 
   * @return currentPassword
  **/
  @ApiModelProperty(value = "")
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountInfoRequest updateAccountInfoRequest = (UpdateAccountInfoRequest) o;
    return Objects.equals(this.socialSecurityNumber, updateAccountInfoRequest.socialSecurityNumber) &&
        Objects.equals(this.newsletter, updateAccountInfoRequest.newsletter) &&
        Objects.equals(this.email, updateAccountInfoRequest.email) &&
        Objects.equals(this.firstName, updateAccountInfoRequest.firstName) &&
        Objects.equals(this.lastName, updateAccountInfoRequest.lastName) &&
        Objects.equals(this.company, updateAccountInfoRequest.company) &&
        Objects.equals(this.vatNumber, updateAccountInfoRequest.vatNumber) &&
        Objects.equals(this.organizationNumber, updateAccountInfoRequest.organizationNumber) &&
        Objects.equals(this.currentPassword, updateAccountInfoRequest.currentPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialSecurityNumber, newsletter, email, firstName, lastName, company, vatNumber, organizationNumber, currentPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountInfoRequest {\n");
    
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    newsletter: ").append(toIndentedString(newsletter)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    organizationNumber: ").append(toIndentedString(organizationNumber)).append("\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
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

