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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TopicsGetSingleTopicResponseDetailsParticipantsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TopicsGetSingleTopicResponseDetailsParticipantsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AVATAR_TEMPLATE = "avatar_template";
  @SerializedName(SERIALIZED_NAME_AVATAR_TEMPLATE)
  private String avatarTemplate;

  public static final String SERIALIZED_NAME_POST_COUNT = "post_count";
  @SerializedName(SERIALIZED_NAME_POST_COUNT)
  private Integer postCount;

  public static final String SERIALIZED_NAME_PRIMARY_GROUP_NAME = "primary_group_name";
  @SerializedName(SERIALIZED_NAME_PRIMARY_GROUP_NAME)
  private Object primaryGroupName = null;

  public static final String SERIALIZED_NAME_FLAIR_NAME = "flair_name";
  @SerializedName(SERIALIZED_NAME_FLAIR_NAME)
  private Object flairName = null;

  public static final String SERIALIZED_NAME_FLAIR_URL = "flair_url";
  @SerializedName(SERIALIZED_NAME_FLAIR_URL)
  private Object flairUrl = null;

  public static final String SERIALIZED_NAME_FLAIR_COLOR = "flair_color";
  @SerializedName(SERIALIZED_NAME_FLAIR_COLOR)
  private Object flairColor = null;

  public static final String SERIALIZED_NAME_FLAIR_BG_COLOR = "flair_bg_color";
  @SerializedName(SERIALIZED_NAME_FLAIR_BG_COLOR)
  private Object flairBgColor = null;

  public static final String SERIALIZED_NAME_FLAIR_GROUP_ID = "flair_group_id";
  @SerializedName(SERIALIZED_NAME_FLAIR_GROUP_ID)
  private Object flairGroupId = null;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_MODERATOR = "moderator";
  @SerializedName(SERIALIZED_NAME_MODERATOR)
  private Boolean moderator;

  public static final String SERIALIZED_NAME_TRUST_LEVEL = "trust_level";
  @SerializedName(SERIALIZED_NAME_TRUST_LEVEL)
  private Integer trustLevel;

  public TopicsGetSingleTopicResponseDetailsParticipantsInner() {
  }

  public TopicsGetSingleTopicResponseDetailsParticipantsInner id(Integer id) {
    
    
    
    
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


  public TopicsGetSingleTopicResponseDetailsParticipantsInner username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner avatarTemplate(String avatarTemplate) {
    
    
    
    
    this.avatarTemplate = avatarTemplate;
    return this;
  }

   /**
   * Get avatarTemplate
   * @return avatarTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAvatarTemplate() {
    return avatarTemplate;
  }


  public void setAvatarTemplate(String avatarTemplate) {
    
    
    
    this.avatarTemplate = avatarTemplate;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner postCount(Integer postCount) {
    
    
    
    
    this.postCount = postCount;
    return this;
  }

   /**
   * Get postCount
   * @return postCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPostCount() {
    return postCount;
  }


  public void setPostCount(Integer postCount) {
    
    
    
    this.postCount = postCount;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner primaryGroupName(Object primaryGroupName) {
    
    
    
    
    this.primaryGroupName = primaryGroupName;
    return this;
  }

   /**
   * Get primaryGroupName
   * @return primaryGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getPrimaryGroupName() {
    return primaryGroupName;
  }


  public void setPrimaryGroupName(Object primaryGroupName) {
    
    
    
    this.primaryGroupName = primaryGroupName;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner flairName(Object flairName) {
    
    
    
    
    this.flairName = flairName;
    return this;
  }

   /**
   * Get flairName
   * @return flairName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFlairName() {
    return flairName;
  }


  public void setFlairName(Object flairName) {
    
    
    
    this.flairName = flairName;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner flairUrl(Object flairUrl) {
    
    
    
    
    this.flairUrl = flairUrl;
    return this;
  }

   /**
   * Get flairUrl
   * @return flairUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFlairUrl() {
    return flairUrl;
  }


  public void setFlairUrl(Object flairUrl) {
    
    
    
    this.flairUrl = flairUrl;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner flairColor(Object flairColor) {
    
    
    
    
    this.flairColor = flairColor;
    return this;
  }

   /**
   * Get flairColor
   * @return flairColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFlairColor() {
    return flairColor;
  }


  public void setFlairColor(Object flairColor) {
    
    
    
    this.flairColor = flairColor;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner flairBgColor(Object flairBgColor) {
    
    
    
    
    this.flairBgColor = flairBgColor;
    return this;
  }

   /**
   * Get flairBgColor
   * @return flairBgColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFlairBgColor() {
    return flairBgColor;
  }


  public void setFlairBgColor(Object flairBgColor) {
    
    
    
    this.flairBgColor = flairBgColor;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner flairGroupId(Object flairGroupId) {
    
    
    
    
    this.flairGroupId = flairGroupId;
    return this;
  }

   /**
   * Get flairGroupId
   * @return flairGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFlairGroupId() {
    return flairGroupId;
  }


  public void setFlairGroupId(Object flairGroupId) {
    
    
    
    this.flairGroupId = flairGroupId;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner admin(Boolean admin) {
    
    
    
    
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAdmin() {
    return admin;
  }


  public void setAdmin(Boolean admin) {
    
    
    
    this.admin = admin;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner moderator(Boolean moderator) {
    
    
    
    
    this.moderator = moderator;
    return this;
  }

   /**
   * Get moderator
   * @return moderator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getModerator() {
    return moderator;
  }


  public void setModerator(Boolean moderator) {
    
    
    
    this.moderator = moderator;
  }


  public TopicsGetSingleTopicResponseDetailsParticipantsInner trustLevel(Integer trustLevel) {
    
    
    
    
    this.trustLevel = trustLevel;
    return this;
  }

   /**
   * Get trustLevel
   * @return trustLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTrustLevel() {
    return trustLevel;
  }


  public void setTrustLevel(Integer trustLevel) {
    
    
    
    this.trustLevel = trustLevel;
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
   * @return the TopicsGetSingleTopicResponseDetailsParticipantsInner instance itself
   */
  public TopicsGetSingleTopicResponseDetailsParticipantsInner putAdditionalProperty(String key, Object value) {
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
    TopicsGetSingleTopicResponseDetailsParticipantsInner topicsGetSingleTopicResponseDetailsParticipantsInner = (TopicsGetSingleTopicResponseDetailsParticipantsInner) o;
    return Objects.equals(this.id, topicsGetSingleTopicResponseDetailsParticipantsInner.id) &&
        Objects.equals(this.username, topicsGetSingleTopicResponseDetailsParticipantsInner.username) &&
        Objects.equals(this.name, topicsGetSingleTopicResponseDetailsParticipantsInner.name) &&
        Objects.equals(this.avatarTemplate, topicsGetSingleTopicResponseDetailsParticipantsInner.avatarTemplate) &&
        Objects.equals(this.postCount, topicsGetSingleTopicResponseDetailsParticipantsInner.postCount) &&
        Objects.equals(this.primaryGroupName, topicsGetSingleTopicResponseDetailsParticipantsInner.primaryGroupName) &&
        Objects.equals(this.flairName, topicsGetSingleTopicResponseDetailsParticipantsInner.flairName) &&
        Objects.equals(this.flairUrl, topicsGetSingleTopicResponseDetailsParticipantsInner.flairUrl) &&
        Objects.equals(this.flairColor, topicsGetSingleTopicResponseDetailsParticipantsInner.flairColor) &&
        Objects.equals(this.flairBgColor, topicsGetSingleTopicResponseDetailsParticipantsInner.flairBgColor) &&
        Objects.equals(this.flairGroupId, topicsGetSingleTopicResponseDetailsParticipantsInner.flairGroupId) &&
        Objects.equals(this.admin, topicsGetSingleTopicResponseDetailsParticipantsInner.admin) &&
        Objects.equals(this.moderator, topicsGetSingleTopicResponseDetailsParticipantsInner.moderator) &&
        Objects.equals(this.trustLevel, topicsGetSingleTopicResponseDetailsParticipantsInner.trustLevel)&&
        Objects.equals(this.additionalProperties, topicsGetSingleTopicResponseDetailsParticipantsInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, avatarTemplate, postCount, primaryGroupName, flairName, flairUrl, flairColor, flairBgColor, flairGroupId, admin, moderator, trustLevel, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicsGetSingleTopicResponseDetailsParticipantsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarTemplate: ").append(toIndentedString(avatarTemplate)).append("\n");
    sb.append("    postCount: ").append(toIndentedString(postCount)).append("\n");
    sb.append("    primaryGroupName: ").append(toIndentedString(primaryGroupName)).append("\n");
    sb.append("    flairName: ").append(toIndentedString(flairName)).append("\n");
    sb.append("    flairUrl: ").append(toIndentedString(flairUrl)).append("\n");
    sb.append("    flairColor: ").append(toIndentedString(flairColor)).append("\n");
    sb.append("    flairBgColor: ").append(toIndentedString(flairBgColor)).append("\n");
    sb.append("    flairGroupId: ").append(toIndentedString(flairGroupId)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    moderator: ").append(toIndentedString(moderator)).append("\n");
    sb.append("    trustLevel: ").append(toIndentedString(trustLevel)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("name");
    openapiFields.add("avatar_template");
    openapiFields.add("post_count");
    openapiFields.add("primary_group_name");
    openapiFields.add("flair_name");
    openapiFields.add("flair_url");
    openapiFields.add("flair_color");
    openapiFields.add("flair_bg_color");
    openapiFields.add("flair_group_id");
    openapiFields.add("admin");
    openapiFields.add("moderator");
    openapiFields.add("trust_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("avatar_template");
    openapiRequiredFields.add("post_count");
    openapiRequiredFields.add("primary_group_name");
    openapiRequiredFields.add("flair_name");
    openapiRequiredFields.add("flair_url");
    openapiRequiredFields.add("flair_color");
    openapiRequiredFields.add("flair_bg_color");
    openapiRequiredFields.add("admin");
    openapiRequiredFields.add("moderator");
    openapiRequiredFields.add("trust_level");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TopicsGetSingleTopicResponseDetailsParticipantsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TopicsGetSingleTopicResponseDetailsParticipantsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopicsGetSingleTopicResponseDetailsParticipantsInner is not found in the empty JSON string", TopicsGetSingleTopicResponseDetailsParticipantsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TopicsGetSingleTopicResponseDetailsParticipantsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("avatar_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopicsGetSingleTopicResponseDetailsParticipantsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopicsGetSingleTopicResponseDetailsParticipantsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopicsGetSingleTopicResponseDetailsParticipantsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopicsGetSingleTopicResponseDetailsParticipantsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopicsGetSingleTopicResponseDetailsParticipantsInner>() {
           @Override
           public void write(JsonWriter out, TopicsGetSingleTopicResponseDetailsParticipantsInner value) throws IOException {
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
           public TopicsGetSingleTopicResponseDetailsParticipantsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TopicsGetSingleTopicResponseDetailsParticipantsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TopicsGetSingleTopicResponseDetailsParticipantsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TopicsGetSingleTopicResponseDetailsParticipantsInner
  * @throws IOException if the JSON string is invalid with respect to TopicsGetSingleTopicResponseDetailsParticipantsInner
  */
  public static TopicsGetSingleTopicResponseDetailsParticipantsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopicsGetSingleTopicResponseDetailsParticipantsInner.class);
  }

 /**
  * Convert an instance of TopicsGetSingleTopicResponseDetailsParticipantsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

