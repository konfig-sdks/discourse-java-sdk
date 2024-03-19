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
import com.konfigthis.client.model.CategoriesListTopicsResponseUsersInner;
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
 * UsersSuspendByIdJsonResponseSuspension
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersSuspendByIdJsonResponseSuspension {
  public static final String SERIALIZED_NAME_SUSPEND_REASON = "suspend_reason";
  @SerializedName(SERIALIZED_NAME_SUSPEND_REASON)
  private String suspendReason;

  public static final String SERIALIZED_NAME_FULL_SUSPEND_REASON = "full_suspend_reason";
  @SerializedName(SERIALIZED_NAME_FULL_SUSPEND_REASON)
  private String fullSuspendReason;

  public static final String SERIALIZED_NAME_SUSPENDED_TILL = "suspended_till";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_TILL)
  private String suspendedTill;

  public static final String SERIALIZED_NAME_SUSPENDED_AT = "suspended_at";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_AT)
  private String suspendedAt;

  public static final String SERIALIZED_NAME_SUSPENDED_BY = "suspended_by";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_BY)
  private CategoriesListTopicsResponseUsersInner suspendedBy;

  public UsersSuspendByIdJsonResponseSuspension() {
  }

  public UsersSuspendByIdJsonResponseSuspension suspendReason(String suspendReason) {
    
    
    
    
    this.suspendReason = suspendReason;
    return this;
  }

   /**
   * Get suspendReason
   * @return suspendReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSuspendReason() {
    return suspendReason;
  }


  public void setSuspendReason(String suspendReason) {
    
    
    
    this.suspendReason = suspendReason;
  }


  public UsersSuspendByIdJsonResponseSuspension fullSuspendReason(String fullSuspendReason) {
    
    
    
    
    this.fullSuspendReason = fullSuspendReason;
    return this;
  }

   /**
   * Get fullSuspendReason
   * @return fullSuspendReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFullSuspendReason() {
    return fullSuspendReason;
  }


  public void setFullSuspendReason(String fullSuspendReason) {
    
    
    
    this.fullSuspendReason = fullSuspendReason;
  }


  public UsersSuspendByIdJsonResponseSuspension suspendedTill(String suspendedTill) {
    
    
    
    
    this.suspendedTill = suspendedTill;
    return this;
  }

   /**
   * Get suspendedTill
   * @return suspendedTill
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSuspendedTill() {
    return suspendedTill;
  }


  public void setSuspendedTill(String suspendedTill) {
    
    
    
    this.suspendedTill = suspendedTill;
  }


  public UsersSuspendByIdJsonResponseSuspension suspendedAt(String suspendedAt) {
    
    
    
    
    this.suspendedAt = suspendedAt;
    return this;
  }

   /**
   * Get suspendedAt
   * @return suspendedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSuspendedAt() {
    return suspendedAt;
  }


  public void setSuspendedAt(String suspendedAt) {
    
    
    
    this.suspendedAt = suspendedAt;
  }


  public UsersSuspendByIdJsonResponseSuspension suspendedBy(CategoriesListTopicsResponseUsersInner suspendedBy) {
    
    
    
    
    this.suspendedBy = suspendedBy;
    return this;
  }

   /**
   * Get suspendedBy
   * @return suspendedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CategoriesListTopicsResponseUsersInner getSuspendedBy() {
    return suspendedBy;
  }


  public void setSuspendedBy(CategoriesListTopicsResponseUsersInner suspendedBy) {
    
    
    
    this.suspendedBy = suspendedBy;
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
   * @return the UsersSuspendByIdJsonResponseSuspension instance itself
   */
  public UsersSuspendByIdJsonResponseSuspension putAdditionalProperty(String key, Object value) {
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
    UsersSuspendByIdJsonResponseSuspension usersSuspendByIdJsonResponseSuspension = (UsersSuspendByIdJsonResponseSuspension) o;
    return Objects.equals(this.suspendReason, usersSuspendByIdJsonResponseSuspension.suspendReason) &&
        Objects.equals(this.fullSuspendReason, usersSuspendByIdJsonResponseSuspension.fullSuspendReason) &&
        Objects.equals(this.suspendedTill, usersSuspendByIdJsonResponseSuspension.suspendedTill) &&
        Objects.equals(this.suspendedAt, usersSuspendByIdJsonResponseSuspension.suspendedAt) &&
        Objects.equals(this.suspendedBy, usersSuspendByIdJsonResponseSuspension.suspendedBy)&&
        Objects.equals(this.additionalProperties, usersSuspendByIdJsonResponseSuspension.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspendReason, fullSuspendReason, suspendedTill, suspendedAt, suspendedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSuspendByIdJsonResponseSuspension {\n");
    sb.append("    suspendReason: ").append(toIndentedString(suspendReason)).append("\n");
    sb.append("    fullSuspendReason: ").append(toIndentedString(fullSuspendReason)).append("\n");
    sb.append("    suspendedTill: ").append(toIndentedString(suspendedTill)).append("\n");
    sb.append("    suspendedAt: ").append(toIndentedString(suspendedAt)).append("\n");
    sb.append("    suspendedBy: ").append(toIndentedString(suspendedBy)).append("\n");
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
    openapiFields.add("suspend_reason");
    openapiFields.add("full_suspend_reason");
    openapiFields.add("suspended_till");
    openapiFields.add("suspended_at");
    openapiFields.add("suspended_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("suspend_reason");
    openapiRequiredFields.add("full_suspend_reason");
    openapiRequiredFields.add("suspended_till");
    openapiRequiredFields.add("suspended_at");
    openapiRequiredFields.add("suspended_by");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersSuspendByIdJsonResponseSuspension
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersSuspendByIdJsonResponseSuspension.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersSuspendByIdJsonResponseSuspension is not found in the empty JSON string", UsersSuspendByIdJsonResponseSuspension.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersSuspendByIdJsonResponseSuspension.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("suspend_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suspend_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suspend_reason").toString()));
      }
      if (!jsonObj.get("full_suspend_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_suspend_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_suspend_reason").toString()));
      }
      if (!jsonObj.get("suspended_till").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suspended_till` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suspended_till").toString()));
      }
      if (!jsonObj.get("suspended_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suspended_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suspended_at").toString()));
      }
      // validate the required field `suspended_by`
      CategoriesListTopicsResponseUsersInner.validateJsonObject(jsonObj.getAsJsonObject("suspended_by"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersSuspendByIdJsonResponseSuspension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersSuspendByIdJsonResponseSuspension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersSuspendByIdJsonResponseSuspension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersSuspendByIdJsonResponseSuspension.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersSuspendByIdJsonResponseSuspension>() {
           @Override
           public void write(JsonWriter out, UsersSuspendByIdJsonResponseSuspension value) throws IOException {
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
           public UsersSuspendByIdJsonResponseSuspension read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersSuspendByIdJsonResponseSuspension instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsersSuspendByIdJsonResponseSuspension given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersSuspendByIdJsonResponseSuspension
  * @throws IOException if the JSON string is invalid with respect to UsersSuspendByIdJsonResponseSuspension
  */
  public static UsersSuspendByIdJsonResponseSuspension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersSuspendByIdJsonResponseSuspension.class);
  }

 /**
  * Convert an instance of UsersSuspendByIdJsonResponseSuspension to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
