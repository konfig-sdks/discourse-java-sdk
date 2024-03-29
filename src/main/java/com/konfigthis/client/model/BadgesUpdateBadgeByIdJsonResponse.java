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
import com.konfigthis.client.model.BadgesCreateBadgeResponseBadge;
import com.konfigthis.client.model.BadgesListResponseBadgeTypesInner;
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
 * BadgesUpdateBadgeByIdJsonResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BadgesUpdateBadgeByIdJsonResponse {
  public static final String SERIALIZED_NAME_BADGE_TYPES = "badge_types";
  @SerializedName(SERIALIZED_NAME_BADGE_TYPES)
  private List<BadgesListResponseBadgeTypesInner> badgeTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_BADGE = "badge";
  @SerializedName(SERIALIZED_NAME_BADGE)
  private BadgesCreateBadgeResponseBadge badge;

  public BadgesUpdateBadgeByIdJsonResponse() {
  }

  public BadgesUpdateBadgeByIdJsonResponse badgeTypes(List<BadgesListResponseBadgeTypesInner> badgeTypes) {
    
    
    
    
    this.badgeTypes = badgeTypes;
    return this;
  }

  public BadgesUpdateBadgeByIdJsonResponse addBadgeTypesItem(BadgesListResponseBadgeTypesInner badgeTypesItem) {
    this.badgeTypes.add(badgeTypesItem);
    return this;
  }

   /**
   * Get badgeTypes
   * @return badgeTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BadgesListResponseBadgeTypesInner> getBadgeTypes() {
    return badgeTypes;
  }


  public void setBadgeTypes(List<BadgesListResponseBadgeTypesInner> badgeTypes) {
    
    
    
    this.badgeTypes = badgeTypes;
  }


  public BadgesUpdateBadgeByIdJsonResponse badge(BadgesCreateBadgeResponseBadge badge) {
    
    
    
    
    this.badge = badge;
    return this;
  }

   /**
   * Get badge
   * @return badge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BadgesCreateBadgeResponseBadge getBadge() {
    return badge;
  }


  public void setBadge(BadgesCreateBadgeResponseBadge badge) {
    
    
    
    this.badge = badge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgesUpdateBadgeByIdJsonResponse badgesUpdateBadgeByIdJsonResponse = (BadgesUpdateBadgeByIdJsonResponse) o;
    return Objects.equals(this.badgeTypes, badgesUpdateBadgeByIdJsonResponse.badgeTypes) &&
        Objects.equals(this.badge, badgesUpdateBadgeByIdJsonResponse.badge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeTypes, badge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgesUpdateBadgeByIdJsonResponse {\n");
    sb.append("    badgeTypes: ").append(toIndentedString(badgeTypes)).append("\n");
    sb.append("    badge: ").append(toIndentedString(badge)).append("\n");
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
    openapiFields.add("badge_types");
    openapiFields.add("badge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("badge_types");
    openapiRequiredFields.add("badge");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BadgesUpdateBadgeByIdJsonResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BadgesUpdateBadgeByIdJsonResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadgesUpdateBadgeByIdJsonResponse is not found in the empty JSON string", BadgesUpdateBadgeByIdJsonResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BadgesUpdateBadgeByIdJsonResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BadgesUpdateBadgeByIdJsonResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BadgesUpdateBadgeByIdJsonResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("badge_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `badge_types` to be an array in the JSON string but got `%s`", jsonObj.get("badge_types").toString()));
      }

      JsonArray jsonArraybadgeTypes = jsonObj.getAsJsonArray("badge_types");
      // validate the required field `badge_types` (array)
      for (int i = 0; i < jsonArraybadgeTypes.size(); i++) {
        BadgesListResponseBadgeTypesInner.validateJsonObject(jsonArraybadgeTypes.get(i).getAsJsonObject());
      };
      // validate the required field `badge`
      BadgesCreateBadgeResponseBadge.validateJsonObject(jsonObj.getAsJsonObject("badge"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadgesUpdateBadgeByIdJsonResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadgesUpdateBadgeByIdJsonResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadgesUpdateBadgeByIdJsonResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadgesUpdateBadgeByIdJsonResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BadgesUpdateBadgeByIdJsonResponse>() {
           @Override
           public void write(JsonWriter out, BadgesUpdateBadgeByIdJsonResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BadgesUpdateBadgeByIdJsonResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BadgesUpdateBadgeByIdJsonResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BadgesUpdateBadgeByIdJsonResponse
  * @throws IOException if the JSON string is invalid with respect to BadgesUpdateBadgeByIdJsonResponse
  */
  public static BadgesUpdateBadgeByIdJsonResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadgesUpdateBadgeByIdJsonResponse.class);
  }

 /**
  * Convert an instance of BadgesUpdateBadgeByIdJsonResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

