/*
 * Discourse API Documentation
 * This page contains the documentation on how to use Discourse through API calls.  > Note: For any endpoints not listed you can follow the [reverse engineer the Discourse API](https://meta.discourse.org/t/-/20576) guide to figure out how to use an API endpoint.  ### Request Content-Type  The Content-Type for POST and PUT requests can be set to `application/x-www-form-urlencoded`, `multipart/form-data`, or `application/json`.  ### Endpoint Names and Response Content-Type  Most API endpoints provide the same content as their HTML counterparts. For example the URL `/categories` serves a list of categories, the `/categories.json` API provides the same information in JSON format.  Instead of sending API requests to `/categories.json` you may also send them to `/categories` and add an `Accept: application/json` header to the request to get the JSON response. Sending requests with the `Accept` header is necessary if you want to use URLs for related endpoints returned by the API, such as pagination URLs. These URLs are returned without the `.json` prefix so you need to add the header in order to get the correct response format.  ### Authentication  Some endpoints do not require any authentication, pretty much anything else will require you to be authenticated.  To become authenticated you will need to create an API Key from the admin panel.  Once you have your API Key you can pass it in along with your API Username as an HTTP header like this:  ``` curl -X GET \"http://127.0.0.1:3000/admin/users/list/active.json\" \\ -H \"Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19\" \\ -H \"Api-Username: system\" ```  and this is how POST requests will look:  ``` curl -X POST \"http://127.0.0.1:3000/categories\" \\ -H \"Content-Type: multipart/form-data;\" \\ -H \"Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19\" \\ -H \"Api-Username: system\" \\ -F \"name=89853c20-4409-e91a-a8ea-f6cdff96aaaa\" \\ -F \"color=49d9e9\" \\ -F \"text_color=f0fcfd\" ```  ### Boolean values  If an endpoint accepts a boolean be sure to specify it as a lowercase `true` or `false` value unless noted otherwise. 
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UsersGetEmailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersGetEmailsResponse {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SECONDARY_EMAILS = "secondary_emails";
  @SerializedName(SERIALIZED_NAME_SECONDARY_EMAILS)
  private List<Object> secondaryEmails = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNCONFIRMED_EMAILS = "unconfirmed_emails";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_EMAILS)
  private List<Object> unconfirmedEmails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSOCIATED_ACCOUNTS = "associated_accounts";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_ACCOUNTS)
  private List<Object> associatedAccounts = new ArrayList<>();

  public UsersGetEmailsResponse() {
  }

  public UsersGetEmailsResponse email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public UsersGetEmailsResponse secondaryEmails(List<Object> secondaryEmails) {
    
    
    
    
    this.secondaryEmails = secondaryEmails;
    return this;
  }

  public UsersGetEmailsResponse addSecondaryEmailsItem(Object secondaryEmailsItem) {
    this.secondaryEmails.add(secondaryEmailsItem);
    return this;
  }

   /**
   * Get secondaryEmails
   * @return secondaryEmails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getSecondaryEmails() {
    return secondaryEmails;
  }


  public void setSecondaryEmails(List<Object> secondaryEmails) {
    
    
    
    this.secondaryEmails = secondaryEmails;
  }


  public UsersGetEmailsResponse unconfirmedEmails(List<Object> unconfirmedEmails) {
    
    
    
    
    this.unconfirmedEmails = unconfirmedEmails;
    return this;
  }

  public UsersGetEmailsResponse addUnconfirmedEmailsItem(Object unconfirmedEmailsItem) {
    this.unconfirmedEmails.add(unconfirmedEmailsItem);
    return this;
  }

   /**
   * Get unconfirmedEmails
   * @return unconfirmedEmails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getUnconfirmedEmails() {
    return unconfirmedEmails;
  }


  public void setUnconfirmedEmails(List<Object> unconfirmedEmails) {
    
    
    
    this.unconfirmedEmails = unconfirmedEmails;
  }


  public UsersGetEmailsResponse associatedAccounts(List<Object> associatedAccounts) {
    
    
    
    
    this.associatedAccounts = associatedAccounts;
    return this;
  }

  public UsersGetEmailsResponse addAssociatedAccountsItem(Object associatedAccountsItem) {
    this.associatedAccounts.add(associatedAccountsItem);
    return this;
  }

   /**
   * Get associatedAccounts
   * @return associatedAccounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getAssociatedAccounts() {
    return associatedAccounts;
  }


  public void setAssociatedAccounts(List<Object> associatedAccounts) {
    
    
    
    this.associatedAccounts = associatedAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersGetEmailsResponse usersGetEmailsResponse = (UsersGetEmailsResponse) o;
    return Objects.equals(this.email, usersGetEmailsResponse.email) &&
        Objects.equals(this.secondaryEmails, usersGetEmailsResponse.secondaryEmails) &&
        Objects.equals(this.unconfirmedEmails, usersGetEmailsResponse.unconfirmedEmails) &&
        Objects.equals(this.associatedAccounts, usersGetEmailsResponse.associatedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, secondaryEmails, unconfirmedEmails, associatedAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersGetEmailsResponse {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    secondaryEmails: ").append(toIndentedString(secondaryEmails)).append("\n");
    sb.append("    unconfirmedEmails: ").append(toIndentedString(unconfirmedEmails)).append("\n");
    sb.append("    associatedAccounts: ").append(toIndentedString(associatedAccounts)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("email");
    openapiFields.add("secondary_emails");
    openapiFields.add("unconfirmed_emails");
    openapiFields.add("associated_accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("secondary_emails");
    openapiRequiredFields.add("unconfirmed_emails");
    openapiRequiredFields.add("associated_accounts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersGetEmailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersGetEmailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersGetEmailsResponse is not found in the empty JSON string", UsersGetEmailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersGetEmailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersGetEmailsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersGetEmailsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("secondary_emails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("secondary_emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_emails` to be an array in the JSON string but got `%s`", jsonObj.get("secondary_emails").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("unconfirmed_emails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("unconfirmed_emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unconfirmed_emails` to be an array in the JSON string but got `%s`", jsonObj.get("unconfirmed_emails").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("associated_accounts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("associated_accounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associated_accounts` to be an array in the JSON string but got `%s`", jsonObj.get("associated_accounts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersGetEmailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersGetEmailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersGetEmailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersGetEmailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersGetEmailsResponse>() {
           @Override
           public void write(JsonWriter out, UsersGetEmailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersGetEmailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersGetEmailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersGetEmailsResponse
  * @throws IOException if the JSON string is invalid with respect to UsersGetEmailsResponse
  */
  public static UsersGetEmailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersGetEmailsResponse.class);
  }

 /**
  * Convert an instance of UsersGetEmailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
