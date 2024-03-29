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
 * GroupsRemoveMembersResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GroupsRemoveMembersResponse {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private String success;

  public static final String SERIALIZED_NAME_USERNAMES = "usernames";
  @SerializedName(SERIALIZED_NAME_USERNAMES)
  private List<Object> usernames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKIPPED_USERNAMES = "skipped_usernames";
  @SerializedName(SERIALIZED_NAME_SKIPPED_USERNAMES)
  private List<Object> skippedUsernames = new ArrayList<>();

  public GroupsRemoveMembersResponse() {
  }

  public GroupsRemoveMembersResponse success(String success) {
    
    
    
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSuccess() {
    return success;
  }


  public void setSuccess(String success) {
    
    
    
    this.success = success;
  }


  public GroupsRemoveMembersResponse usernames(List<Object> usernames) {
    
    
    
    
    this.usernames = usernames;
    return this;
  }

  public GroupsRemoveMembersResponse addUsernamesItem(Object usernamesItem) {
    this.usernames.add(usernamesItem);
    return this;
  }

   /**
   * Get usernames
   * @return usernames
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getUsernames() {
    return usernames;
  }


  public void setUsernames(List<Object> usernames) {
    
    
    
    this.usernames = usernames;
  }


  public GroupsRemoveMembersResponse skippedUsernames(List<Object> skippedUsernames) {
    
    
    
    
    this.skippedUsernames = skippedUsernames;
    return this;
  }

  public GroupsRemoveMembersResponse addSkippedUsernamesItem(Object skippedUsernamesItem) {
    this.skippedUsernames.add(skippedUsernamesItem);
    return this;
  }

   /**
   * Get skippedUsernames
   * @return skippedUsernames
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getSkippedUsernames() {
    return skippedUsernames;
  }


  public void setSkippedUsernames(List<Object> skippedUsernames) {
    
    
    
    this.skippedUsernames = skippedUsernames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsRemoveMembersResponse groupsRemoveMembersResponse = (GroupsRemoveMembersResponse) o;
    return Objects.equals(this.success, groupsRemoveMembersResponse.success) &&
        Objects.equals(this.usernames, groupsRemoveMembersResponse.usernames) &&
        Objects.equals(this.skippedUsernames, groupsRemoveMembersResponse.skippedUsernames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, usernames, skippedUsernames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsRemoveMembersResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
    sb.append("    skippedUsernames: ").append(toIndentedString(skippedUsernames)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("usernames");
    openapiFields.add("skipped_usernames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("usernames");
    openapiRequiredFields.add("skipped_usernames");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupsRemoveMembersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupsRemoveMembersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupsRemoveMembersResponse is not found in the empty JSON string", GroupsRemoveMembersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupsRemoveMembersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupsRemoveMembersResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupsRemoveMembersResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("success").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `success` to be a primitive type in the JSON string but got `%s`", jsonObj.get("success").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("usernames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("usernames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usernames` to be an array in the JSON string but got `%s`", jsonObj.get("usernames").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("skipped_usernames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("skipped_usernames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `skipped_usernames` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_usernames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupsRemoveMembersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupsRemoveMembersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupsRemoveMembersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupsRemoveMembersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupsRemoveMembersResponse>() {
           @Override
           public void write(JsonWriter out, GroupsRemoveMembersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupsRemoveMembersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupsRemoveMembersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupsRemoveMembersResponse
  * @throws IOException if the JSON string is invalid with respect to GroupsRemoveMembersResponse
  */
  public static GroupsRemoveMembersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupsRemoveMembersResponse.class);
  }

 /**
  * Convert an instance of GroupsRemoveMembersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

