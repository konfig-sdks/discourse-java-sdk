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
 * BadgesListResponseAdminBadgesTriggers
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BadgesListResponseAdminBadgesTriggers {
  public static final String SERIALIZED_NAME_USER_CHANGE = "user_change";
  @SerializedName(SERIALIZED_NAME_USER_CHANGE)
  private Integer userChange;

  public static final String SERIALIZED_NAME_NONE = "none";
  @SerializedName(SERIALIZED_NAME_NONE)
  private Integer none;

  public static final String SERIALIZED_NAME_POST_REVISION = "post_revision";
  @SerializedName(SERIALIZED_NAME_POST_REVISION)
  private Integer postRevision;

  public static final String SERIALIZED_NAME_TRUST_LEVEL_CHANGE = "trust_level_change";
  @SerializedName(SERIALIZED_NAME_TRUST_LEVEL_CHANGE)
  private Integer trustLevelChange;

  public static final String SERIALIZED_NAME_POST_ACTION = "post_action";
  @SerializedName(SERIALIZED_NAME_POST_ACTION)
  private Integer postAction;

  public BadgesListResponseAdminBadgesTriggers() {
  }

  public BadgesListResponseAdminBadgesTriggers userChange(Integer userChange) {
    
    
    
    
    this.userChange = userChange;
    return this;
  }

   /**
   * Get userChange
   * @return userChange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUserChange() {
    return userChange;
  }


  public void setUserChange(Integer userChange) {
    
    
    
    this.userChange = userChange;
  }


  public BadgesListResponseAdminBadgesTriggers none(Integer none) {
    
    
    
    
    this.none = none;
    return this;
  }

   /**
   * Get none
   * @return none
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNone() {
    return none;
  }


  public void setNone(Integer none) {
    
    
    
    this.none = none;
  }


  public BadgesListResponseAdminBadgesTriggers postRevision(Integer postRevision) {
    
    
    
    
    this.postRevision = postRevision;
    return this;
  }

   /**
   * Get postRevision
   * @return postRevision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPostRevision() {
    return postRevision;
  }


  public void setPostRevision(Integer postRevision) {
    
    
    
    this.postRevision = postRevision;
  }


  public BadgesListResponseAdminBadgesTriggers trustLevelChange(Integer trustLevelChange) {
    
    
    
    
    this.trustLevelChange = trustLevelChange;
    return this;
  }

   /**
   * Get trustLevelChange
   * @return trustLevelChange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTrustLevelChange() {
    return trustLevelChange;
  }


  public void setTrustLevelChange(Integer trustLevelChange) {
    
    
    
    this.trustLevelChange = trustLevelChange;
  }


  public BadgesListResponseAdminBadgesTriggers postAction(Integer postAction) {
    
    
    
    
    this.postAction = postAction;
    return this;
  }

   /**
   * Get postAction
   * @return postAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPostAction() {
    return postAction;
  }


  public void setPostAction(Integer postAction) {
    
    
    
    this.postAction = postAction;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BadgesListResponseAdminBadgesTriggers instance itself
   */
  public BadgesListResponseAdminBadgesTriggers putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgesListResponseAdminBadgesTriggers badgesListResponseAdminBadgesTriggers = (BadgesListResponseAdminBadgesTriggers) o;
    return Objects.equals(this.userChange, badgesListResponseAdminBadgesTriggers.userChange) &&
        Objects.equals(this.none, badgesListResponseAdminBadgesTriggers.none) &&
        Objects.equals(this.postRevision, badgesListResponseAdminBadgesTriggers.postRevision) &&
        Objects.equals(this.trustLevelChange, badgesListResponseAdminBadgesTriggers.trustLevelChange) &&
        Objects.equals(this.postAction, badgesListResponseAdminBadgesTriggers.postAction)&&
        Objects.equals(this.additionalProperties, badgesListResponseAdminBadgesTriggers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userChange, none, postRevision, trustLevelChange, postAction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgesListResponseAdminBadgesTriggers {\n");
    sb.append("    userChange: ").append(toIndentedString(userChange)).append("\n");
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
    sb.append("    postRevision: ").append(toIndentedString(postRevision)).append("\n");
    sb.append("    trustLevelChange: ").append(toIndentedString(trustLevelChange)).append("\n");
    sb.append("    postAction: ").append(toIndentedString(postAction)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("user_change");
    openapiFields.add("none");
    openapiFields.add("post_revision");
    openapiFields.add("trust_level_change");
    openapiFields.add("post_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_change");
    openapiRequiredFields.add("none");
    openapiRequiredFields.add("post_revision");
    openapiRequiredFields.add("trust_level_change");
    openapiRequiredFields.add("post_action");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BadgesListResponseAdminBadgesTriggers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BadgesListResponseAdminBadgesTriggers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadgesListResponseAdminBadgesTriggers is not found in the empty JSON string", BadgesListResponseAdminBadgesTriggers.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BadgesListResponseAdminBadgesTriggers.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadgesListResponseAdminBadgesTriggers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadgesListResponseAdminBadgesTriggers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadgesListResponseAdminBadgesTriggers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadgesListResponseAdminBadgesTriggers.class));

       return (TypeAdapter<T>) new TypeAdapter<BadgesListResponseAdminBadgesTriggers>() {
           @Override
           public void write(JsonWriter out, BadgesListResponseAdminBadgesTriggers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BadgesListResponseAdminBadgesTriggers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BadgesListResponseAdminBadgesTriggers instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BadgesListResponseAdminBadgesTriggers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BadgesListResponseAdminBadgesTriggers
  * @throws IOException if the JSON string is invalid with respect to BadgesListResponseAdminBadgesTriggers
  */
  public static BadgesListResponseAdminBadgesTriggers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadgesListResponseAdminBadgesTriggers.class);
  }

 /**
  * Convert an instance of BadgesListResponseAdminBadgesTriggers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

