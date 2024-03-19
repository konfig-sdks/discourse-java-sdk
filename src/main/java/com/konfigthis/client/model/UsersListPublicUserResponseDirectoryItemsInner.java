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
import com.konfigthis.client.model.UsersListPublicUserResponseDirectoryItemsInnerUser;
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
 * UsersListPublicUserResponseDirectoryItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersListPublicUserResponseDirectoryItemsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LIKES_RECEIVED = "likes_received";
  @SerializedName(SERIALIZED_NAME_LIKES_RECEIVED)
  private Integer likesReceived;

  public static final String SERIALIZED_NAME_LIKES_GIVEN = "likes_given";
  @SerializedName(SERIALIZED_NAME_LIKES_GIVEN)
  private Integer likesGiven;

  public static final String SERIALIZED_NAME_TOPICS_ENTERED = "topics_entered";
  @SerializedName(SERIALIZED_NAME_TOPICS_ENTERED)
  private Integer topicsEntered;

  public static final String SERIALIZED_NAME_TOPIC_COUNT = "topic_count";
  @SerializedName(SERIALIZED_NAME_TOPIC_COUNT)
  private Integer topicCount;

  public static final String SERIALIZED_NAME_POST_COUNT = "post_count";
  @SerializedName(SERIALIZED_NAME_POST_COUNT)
  private Integer postCount;

  public static final String SERIALIZED_NAME_POSTS_READ = "posts_read";
  @SerializedName(SERIALIZED_NAME_POSTS_READ)
  private Integer postsRead;

  public static final String SERIALIZED_NAME_DAYS_VISITED = "days_visited";
  @SerializedName(SERIALIZED_NAME_DAYS_VISITED)
  private Integer daysVisited;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UsersListPublicUserResponseDirectoryItemsInnerUser user;

  public UsersListPublicUserResponseDirectoryItemsInner() {
  }

  public UsersListPublicUserResponseDirectoryItemsInner id(Integer id) {
    
    
    
    
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


  public UsersListPublicUserResponseDirectoryItemsInner likesReceived(Integer likesReceived) {
    
    
    
    
    this.likesReceived = likesReceived;
    return this;
  }

   /**
   * Get likesReceived
   * @return likesReceived
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLikesReceived() {
    return likesReceived;
  }


  public void setLikesReceived(Integer likesReceived) {
    
    
    
    this.likesReceived = likesReceived;
  }


  public UsersListPublicUserResponseDirectoryItemsInner likesGiven(Integer likesGiven) {
    
    
    
    
    this.likesGiven = likesGiven;
    return this;
  }

   /**
   * Get likesGiven
   * @return likesGiven
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLikesGiven() {
    return likesGiven;
  }


  public void setLikesGiven(Integer likesGiven) {
    
    
    
    this.likesGiven = likesGiven;
  }


  public UsersListPublicUserResponseDirectoryItemsInner topicsEntered(Integer topicsEntered) {
    
    
    
    
    this.topicsEntered = topicsEntered;
    return this;
  }

   /**
   * Get topicsEntered
   * @return topicsEntered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTopicsEntered() {
    return topicsEntered;
  }


  public void setTopicsEntered(Integer topicsEntered) {
    
    
    
    this.topicsEntered = topicsEntered;
  }


  public UsersListPublicUserResponseDirectoryItemsInner topicCount(Integer topicCount) {
    
    
    
    
    this.topicCount = topicCount;
    return this;
  }

   /**
   * Get topicCount
   * @return topicCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTopicCount() {
    return topicCount;
  }


  public void setTopicCount(Integer topicCount) {
    
    
    
    this.topicCount = topicCount;
  }


  public UsersListPublicUserResponseDirectoryItemsInner postCount(Integer postCount) {
    
    
    
    
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


  public UsersListPublicUserResponseDirectoryItemsInner postsRead(Integer postsRead) {
    
    
    
    
    this.postsRead = postsRead;
    return this;
  }

   /**
   * Get postsRead
   * @return postsRead
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPostsRead() {
    return postsRead;
  }


  public void setPostsRead(Integer postsRead) {
    
    
    
    this.postsRead = postsRead;
  }


  public UsersListPublicUserResponseDirectoryItemsInner daysVisited(Integer daysVisited) {
    
    
    
    
    this.daysVisited = daysVisited;
    return this;
  }

   /**
   * Get daysVisited
   * @return daysVisited
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDaysVisited() {
    return daysVisited;
  }


  public void setDaysVisited(Integer daysVisited) {
    
    
    
    this.daysVisited = daysVisited;
  }


  public UsersListPublicUserResponseDirectoryItemsInner user(UsersListPublicUserResponseDirectoryItemsInnerUser user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UsersListPublicUserResponseDirectoryItemsInnerUser getUser() {
    return user;
  }


  public void setUser(UsersListPublicUserResponseDirectoryItemsInnerUser user) {
    
    
    
    this.user = user;
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
   * @return the UsersListPublicUserResponseDirectoryItemsInner instance itself
   */
  public UsersListPublicUserResponseDirectoryItemsInner putAdditionalProperty(String key, Object value) {
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
    UsersListPublicUserResponseDirectoryItemsInner usersListPublicUserResponseDirectoryItemsInner = (UsersListPublicUserResponseDirectoryItemsInner) o;
    return Objects.equals(this.id, usersListPublicUserResponseDirectoryItemsInner.id) &&
        Objects.equals(this.likesReceived, usersListPublicUserResponseDirectoryItemsInner.likesReceived) &&
        Objects.equals(this.likesGiven, usersListPublicUserResponseDirectoryItemsInner.likesGiven) &&
        Objects.equals(this.topicsEntered, usersListPublicUserResponseDirectoryItemsInner.topicsEntered) &&
        Objects.equals(this.topicCount, usersListPublicUserResponseDirectoryItemsInner.topicCount) &&
        Objects.equals(this.postCount, usersListPublicUserResponseDirectoryItemsInner.postCount) &&
        Objects.equals(this.postsRead, usersListPublicUserResponseDirectoryItemsInner.postsRead) &&
        Objects.equals(this.daysVisited, usersListPublicUserResponseDirectoryItemsInner.daysVisited) &&
        Objects.equals(this.user, usersListPublicUserResponseDirectoryItemsInner.user)&&
        Objects.equals(this.additionalProperties, usersListPublicUserResponseDirectoryItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, likesReceived, likesGiven, topicsEntered, topicCount, postCount, postsRead, daysVisited, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersListPublicUserResponseDirectoryItemsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    likesReceived: ").append(toIndentedString(likesReceived)).append("\n");
    sb.append("    likesGiven: ").append(toIndentedString(likesGiven)).append("\n");
    sb.append("    topicsEntered: ").append(toIndentedString(topicsEntered)).append("\n");
    sb.append("    topicCount: ").append(toIndentedString(topicCount)).append("\n");
    sb.append("    postCount: ").append(toIndentedString(postCount)).append("\n");
    sb.append("    postsRead: ").append(toIndentedString(postsRead)).append("\n");
    sb.append("    daysVisited: ").append(toIndentedString(daysVisited)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("likes_received");
    openapiFields.add("likes_given");
    openapiFields.add("topics_entered");
    openapiFields.add("topic_count");
    openapiFields.add("post_count");
    openapiFields.add("posts_read");
    openapiFields.add("days_visited");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("likes_received");
    openapiRequiredFields.add("likes_given");
    openapiRequiredFields.add("topics_entered");
    openapiRequiredFields.add("topic_count");
    openapiRequiredFields.add("post_count");
    openapiRequiredFields.add("posts_read");
    openapiRequiredFields.add("days_visited");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersListPublicUserResponseDirectoryItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersListPublicUserResponseDirectoryItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersListPublicUserResponseDirectoryItemsInner is not found in the empty JSON string", UsersListPublicUserResponseDirectoryItemsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersListPublicUserResponseDirectoryItemsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `user`
      UsersListPublicUserResponseDirectoryItemsInnerUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersListPublicUserResponseDirectoryItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersListPublicUserResponseDirectoryItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersListPublicUserResponseDirectoryItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersListPublicUserResponseDirectoryItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersListPublicUserResponseDirectoryItemsInner>() {
           @Override
           public void write(JsonWriter out, UsersListPublicUserResponseDirectoryItemsInner value) throws IOException {
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
           public UsersListPublicUserResponseDirectoryItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersListPublicUserResponseDirectoryItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsersListPublicUserResponseDirectoryItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersListPublicUserResponseDirectoryItemsInner
  * @throws IOException if the JSON string is invalid with respect to UsersListPublicUserResponseDirectoryItemsInner
  */
  public static UsersListPublicUserResponseDirectoryItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersListPublicUserResponseDirectoryItemsInner.class);
  }

 /**
  * Convert an instance of UsersListPublicUserResponseDirectoryItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

