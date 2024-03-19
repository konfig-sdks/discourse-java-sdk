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
 * UsersGetUserByUsernameResponseUserUserAuthTokensInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersGetUserByUsernameResponseUserUserAuthTokensInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CLIENT_IP = "client_ip";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP)
  private String clientIp;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private String browser;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_SEEN_AT = "seen_at";
  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  private String seenAt;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public UsersGetUserByUsernameResponseUserUserAuthTokensInner() {
  }

  public UsersGetUserByUsernameResponseUserUserAuthTokensInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner clientIp(String clientIp) {
    
    
    
    
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClientIp() {
    return clientIp;
  }


  public void setClientIp(String clientIp) {
    
    
    
    this.clientIp = clientIp;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner location(String location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    
    
    
    this.location = location;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner browser(String browser) {
    
    
    
    
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBrowser() {
    return browser;
  }


  public void setBrowser(String browser) {
    
    
    
    this.browser = browser;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner device(String device) {
    
    
    
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    
    
    
    this.device = device;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner os(String os) {
    
    
    
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    
    
    
    this.os = os;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner icon(String icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    
    
    
    this.icon = icon;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner seenAt(String seenAt) {
    
    
    
    
    this.seenAt = seenAt;
    return this;
  }

   /**
   * Get seenAt
   * @return seenAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSeenAt() {
    return seenAt;
  }


  public void setSeenAt(String seenAt) {
    
    
    
    this.seenAt = seenAt;
  }


  public UsersGetUserByUsernameResponseUserUserAuthTokensInner isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
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
   * @return the UsersGetUserByUsernameResponseUserUserAuthTokensInner instance itself
   */
  public UsersGetUserByUsernameResponseUserUserAuthTokensInner putAdditionalProperty(String key, Object value) {
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
    UsersGetUserByUsernameResponseUserUserAuthTokensInner usersGetUserByUsernameResponseUserUserAuthTokensInner = (UsersGetUserByUsernameResponseUserUserAuthTokensInner) o;
    return Objects.equals(this.id, usersGetUserByUsernameResponseUserUserAuthTokensInner.id) &&
        Objects.equals(this.clientIp, usersGetUserByUsernameResponseUserUserAuthTokensInner.clientIp) &&
        Objects.equals(this.location, usersGetUserByUsernameResponseUserUserAuthTokensInner.location) &&
        Objects.equals(this.browser, usersGetUserByUsernameResponseUserUserAuthTokensInner.browser) &&
        Objects.equals(this.device, usersGetUserByUsernameResponseUserUserAuthTokensInner.device) &&
        Objects.equals(this.os, usersGetUserByUsernameResponseUserUserAuthTokensInner.os) &&
        Objects.equals(this.icon, usersGetUserByUsernameResponseUserUserAuthTokensInner.icon) &&
        Objects.equals(this.createdAt, usersGetUserByUsernameResponseUserUserAuthTokensInner.createdAt) &&
        Objects.equals(this.seenAt, usersGetUserByUsernameResponseUserUserAuthTokensInner.seenAt) &&
        Objects.equals(this.isActive, usersGetUserByUsernameResponseUserUserAuthTokensInner.isActive)&&
        Objects.equals(this.additionalProperties, usersGetUserByUsernameResponseUserUserAuthTokensInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientIp, location, browser, device, os, icon, createdAt, seenAt, isActive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersGetUserByUsernameResponseUserUserAuthTokensInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("client_ip");
    openapiFields.add("location");
    openapiFields.add("browser");
    openapiFields.add("device");
    openapiFields.add("os");
    openapiFields.add("icon");
    openapiFields.add("created_at");
    openapiFields.add("seen_at");
    openapiFields.add("is_active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("client_ip");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("browser");
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("os");
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("seen_at");
    openapiRequiredFields.add("is_active");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersGetUserByUsernameResponseUserUserAuthTokensInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersGetUserByUsernameResponseUserUserAuthTokensInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersGetUserByUsernameResponseUserUserAuthTokensInner is not found in the empty JSON string", UsersGetUserByUsernameResponseUserUserAuthTokensInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersGetUserByUsernameResponseUserUserAuthTokensInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("client_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip").toString()));
      }
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("browser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser").toString()));
      }
      if (!jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if (!jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("seen_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seen_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seen_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersGetUserByUsernameResponseUserUserAuthTokensInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersGetUserByUsernameResponseUserUserAuthTokensInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersGetUserByUsernameResponseUserUserAuthTokensInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersGetUserByUsernameResponseUserUserAuthTokensInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersGetUserByUsernameResponseUserUserAuthTokensInner>() {
           @Override
           public void write(JsonWriter out, UsersGetUserByUsernameResponseUserUserAuthTokensInner value) throws IOException {
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
           public UsersGetUserByUsernameResponseUserUserAuthTokensInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersGetUserByUsernameResponseUserUserAuthTokensInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsersGetUserByUsernameResponseUserUserAuthTokensInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersGetUserByUsernameResponseUserUserAuthTokensInner
  * @throws IOException if the JSON string is invalid with respect to UsersGetUserByUsernameResponseUserUserAuthTokensInner
  */
  public static UsersGetUserByUsernameResponseUserUserAuthTokensInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersGetUserByUsernameResponseUserUserAuthTokensInner.class);
  }

 /**
  * Convert an instance of UsersGetUserByUsernameResponseUserUserAuthTokensInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
