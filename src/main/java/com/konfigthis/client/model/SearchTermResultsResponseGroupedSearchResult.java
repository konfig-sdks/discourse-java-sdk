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
import com.konfigthis.client.model.SearchTermResultsResponseGroupedSearchResultExtra;
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
 * SearchTermResultsResponseGroupedSearchResult
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchTermResultsResponseGroupedSearchResult {
  public static final String SERIALIZED_NAME_MORE_POSTS = "more_posts";
  @SerializedName(SERIALIZED_NAME_MORE_POSTS)
  private Object morePosts = null;

  public static final String SERIALIZED_NAME_MORE_USERS = "more_users";
  @SerializedName(SERIALIZED_NAME_MORE_USERS)
  private Object moreUsers = null;

  public static final String SERIALIZED_NAME_MORE_CATEGORIES = "more_categories";
  @SerializedName(SERIALIZED_NAME_MORE_CATEGORIES)
  private Object moreCategories = null;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private String term;

  public static final String SERIALIZED_NAME_SEARCH_LOG_ID = "search_log_id";
  @SerializedName(SERIALIZED_NAME_SEARCH_LOG_ID)
  private Integer searchLogId;

  public static final String SERIALIZED_NAME_MORE_FULL_PAGE_RESULTS = "more_full_page_results";
  @SerializedName(SERIALIZED_NAME_MORE_FULL_PAGE_RESULTS)
  private Object moreFullPageResults = null;

  public static final String SERIALIZED_NAME_CAN_CREATE_TOPIC = "can_create_topic";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_TOPIC)
  private Boolean canCreateTopic;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Object error = null;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private SearchTermResultsResponseGroupedSearchResultExtra extra;

  public static final String SERIALIZED_NAME_POST_IDS = "post_ids";
  @SerializedName(SERIALIZED_NAME_POST_IDS)
  private List<Object> postIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Object> userIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<Object> categoryIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Object> tagIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_IDS = "group_ids";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<Object> groupIds = new ArrayList<>();

  public SearchTermResultsResponseGroupedSearchResult() {
  }

  public SearchTermResultsResponseGroupedSearchResult morePosts(Object morePosts) {
    
    
    
    
    this.morePosts = morePosts;
    return this;
  }

   /**
   * Get morePosts
   * @return morePosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getMorePosts() {
    return morePosts;
  }


  public void setMorePosts(Object morePosts) {
    
    
    
    this.morePosts = morePosts;
  }


  public SearchTermResultsResponseGroupedSearchResult moreUsers(Object moreUsers) {
    
    
    
    
    this.moreUsers = moreUsers;
    return this;
  }

   /**
   * Get moreUsers
   * @return moreUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getMoreUsers() {
    return moreUsers;
  }


  public void setMoreUsers(Object moreUsers) {
    
    
    
    this.moreUsers = moreUsers;
  }


  public SearchTermResultsResponseGroupedSearchResult moreCategories(Object moreCategories) {
    
    
    
    
    this.moreCategories = moreCategories;
    return this;
  }

   /**
   * Get moreCategories
   * @return moreCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getMoreCategories() {
    return moreCategories;
  }


  public void setMoreCategories(Object moreCategories) {
    
    
    
    this.moreCategories = moreCategories;
  }


  public SearchTermResultsResponseGroupedSearchResult term(String term) {
    
    
    
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTerm() {
    return term;
  }


  public void setTerm(String term) {
    
    
    
    this.term = term;
  }


  public SearchTermResultsResponseGroupedSearchResult searchLogId(Integer searchLogId) {
    
    
    
    
    this.searchLogId = searchLogId;
    return this;
  }

   /**
   * Get searchLogId
   * @return searchLogId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSearchLogId() {
    return searchLogId;
  }


  public void setSearchLogId(Integer searchLogId) {
    
    
    
    this.searchLogId = searchLogId;
  }


  public SearchTermResultsResponseGroupedSearchResult moreFullPageResults(Object moreFullPageResults) {
    
    
    
    
    this.moreFullPageResults = moreFullPageResults;
    return this;
  }

   /**
   * Get moreFullPageResults
   * @return moreFullPageResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getMoreFullPageResults() {
    return moreFullPageResults;
  }


  public void setMoreFullPageResults(Object moreFullPageResults) {
    
    
    
    this.moreFullPageResults = moreFullPageResults;
  }


  public SearchTermResultsResponseGroupedSearchResult canCreateTopic(Boolean canCreateTopic) {
    
    
    
    
    this.canCreateTopic = canCreateTopic;
    return this;
  }

   /**
   * Get canCreateTopic
   * @return canCreateTopic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanCreateTopic() {
    return canCreateTopic;
  }


  public void setCanCreateTopic(Boolean canCreateTopic) {
    
    
    
    this.canCreateTopic = canCreateTopic;
  }


  public SearchTermResultsResponseGroupedSearchResult error(Object error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getError() {
    return error;
  }


  public void setError(Object error) {
    
    
    
    this.error = error;
  }


  public SearchTermResultsResponseGroupedSearchResult extra(SearchTermResultsResponseGroupedSearchResultExtra extra) {
    
    
    
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchTermResultsResponseGroupedSearchResultExtra getExtra() {
    return extra;
  }


  public void setExtra(SearchTermResultsResponseGroupedSearchResultExtra extra) {
    
    
    
    this.extra = extra;
  }


  public SearchTermResultsResponseGroupedSearchResult postIds(List<Object> postIds) {
    
    
    
    
    this.postIds = postIds;
    return this;
  }

  public SearchTermResultsResponseGroupedSearchResult addPostIdsItem(Object postIdsItem) {
    this.postIds.add(postIdsItem);
    return this;
  }

   /**
   * Get postIds
   * @return postIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getPostIds() {
    return postIds;
  }


  public void setPostIds(List<Object> postIds) {
    
    
    
    this.postIds = postIds;
  }


  public SearchTermResultsResponseGroupedSearchResult userIds(List<Object> userIds) {
    
    
    
    
    this.userIds = userIds;
    return this;
  }

  public SearchTermResultsResponseGroupedSearchResult addUserIdsItem(Object userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Object> userIds) {
    
    
    
    this.userIds = userIds;
  }


  public SearchTermResultsResponseGroupedSearchResult categoryIds(List<Object> categoryIds) {
    
    
    
    
    this.categoryIds = categoryIds;
    return this;
  }

  public SearchTermResultsResponseGroupedSearchResult addCategoryIdsItem(Object categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<Object> categoryIds) {
    
    
    
    this.categoryIds = categoryIds;
  }


  public SearchTermResultsResponseGroupedSearchResult tagIds(List<Object> tagIds) {
    
    
    
    
    this.tagIds = tagIds;
    return this;
  }

  public SearchTermResultsResponseGroupedSearchResult addTagIdsItem(Object tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Object> tagIds) {
    
    
    
    this.tagIds = tagIds;
  }


  public SearchTermResultsResponseGroupedSearchResult groupIds(List<Object> groupIds) {
    
    
    
    
    this.groupIds = groupIds;
    return this;
  }

  public SearchTermResultsResponseGroupedSearchResult addGroupIdsItem(Object groupIdsItem) {
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(List<Object> groupIds) {
    
    
    
    this.groupIds = groupIds;
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
   * @return the SearchTermResultsResponseGroupedSearchResult instance itself
   */
  public SearchTermResultsResponseGroupedSearchResult putAdditionalProperty(String key, Object value) {
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
    SearchTermResultsResponseGroupedSearchResult searchTermResultsResponseGroupedSearchResult = (SearchTermResultsResponseGroupedSearchResult) o;
    return Objects.equals(this.morePosts, searchTermResultsResponseGroupedSearchResult.morePosts) &&
        Objects.equals(this.moreUsers, searchTermResultsResponseGroupedSearchResult.moreUsers) &&
        Objects.equals(this.moreCategories, searchTermResultsResponseGroupedSearchResult.moreCategories) &&
        Objects.equals(this.term, searchTermResultsResponseGroupedSearchResult.term) &&
        Objects.equals(this.searchLogId, searchTermResultsResponseGroupedSearchResult.searchLogId) &&
        Objects.equals(this.moreFullPageResults, searchTermResultsResponseGroupedSearchResult.moreFullPageResults) &&
        Objects.equals(this.canCreateTopic, searchTermResultsResponseGroupedSearchResult.canCreateTopic) &&
        Objects.equals(this.error, searchTermResultsResponseGroupedSearchResult.error) &&
        Objects.equals(this.extra, searchTermResultsResponseGroupedSearchResult.extra) &&
        Objects.equals(this.postIds, searchTermResultsResponseGroupedSearchResult.postIds) &&
        Objects.equals(this.userIds, searchTermResultsResponseGroupedSearchResult.userIds) &&
        Objects.equals(this.categoryIds, searchTermResultsResponseGroupedSearchResult.categoryIds) &&
        Objects.equals(this.tagIds, searchTermResultsResponseGroupedSearchResult.tagIds) &&
        Objects.equals(this.groupIds, searchTermResultsResponseGroupedSearchResult.groupIds)&&
        Objects.equals(this.additionalProperties, searchTermResultsResponseGroupedSearchResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(morePosts, moreUsers, moreCategories, term, searchLogId, moreFullPageResults, canCreateTopic, error, extra, postIds, userIds, categoryIds, tagIds, groupIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTermResultsResponseGroupedSearchResult {\n");
    sb.append("    morePosts: ").append(toIndentedString(morePosts)).append("\n");
    sb.append("    moreUsers: ").append(toIndentedString(moreUsers)).append("\n");
    sb.append("    moreCategories: ").append(toIndentedString(moreCategories)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    searchLogId: ").append(toIndentedString(searchLogId)).append("\n");
    sb.append("    moreFullPageResults: ").append(toIndentedString(moreFullPageResults)).append("\n");
    sb.append("    canCreateTopic: ").append(toIndentedString(canCreateTopic)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    postIds: ").append(toIndentedString(postIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
    openapiFields.add("more_posts");
    openapiFields.add("more_users");
    openapiFields.add("more_categories");
    openapiFields.add("term");
    openapiFields.add("search_log_id");
    openapiFields.add("more_full_page_results");
    openapiFields.add("can_create_topic");
    openapiFields.add("error");
    openapiFields.add("extra");
    openapiFields.add("post_ids");
    openapiFields.add("user_ids");
    openapiFields.add("category_ids");
    openapiFields.add("tag_ids");
    openapiFields.add("group_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("more_posts");
    openapiRequiredFields.add("more_users");
    openapiRequiredFields.add("more_categories");
    openapiRequiredFields.add("term");
    openapiRequiredFields.add("search_log_id");
    openapiRequiredFields.add("more_full_page_results");
    openapiRequiredFields.add("can_create_topic");
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("post_ids");
    openapiRequiredFields.add("user_ids");
    openapiRequiredFields.add("category_ids");
    openapiRequiredFields.add("tag_ids");
    openapiRequiredFields.add("group_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchTermResultsResponseGroupedSearchResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchTermResultsResponseGroupedSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchTermResultsResponseGroupedSearchResult is not found in the empty JSON string", SearchTermResultsResponseGroupedSearchResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchTermResultsResponseGroupedSearchResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("term").toString()));
      }
      // validate the optional field `extra`
      if (jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) {
        SearchTermResultsResponseGroupedSearchResultExtra.validateJsonObject(jsonObj.getAsJsonObject("extra"));
      }
      // ensure the required json array is present
      if (jsonObj.get("post_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("post_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `post_ids` to be an array in the JSON string but got `%s`", jsonObj.get("post_ids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("user_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("category_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("category_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_ids` to be an array in the JSON string but got `%s`", jsonObj.get("category_ids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tag_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tag_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_ids` to be an array in the JSON string but got `%s`", jsonObj.get("tag_ids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("group_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("group_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_ids` to be an array in the JSON string but got `%s`", jsonObj.get("group_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchTermResultsResponseGroupedSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchTermResultsResponseGroupedSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchTermResultsResponseGroupedSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchTermResultsResponseGroupedSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchTermResultsResponseGroupedSearchResult>() {
           @Override
           public void write(JsonWriter out, SearchTermResultsResponseGroupedSearchResult value) throws IOException {
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
           public SearchTermResultsResponseGroupedSearchResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchTermResultsResponseGroupedSearchResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchTermResultsResponseGroupedSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchTermResultsResponseGroupedSearchResult
  * @throws IOException if the JSON string is invalid with respect to SearchTermResultsResponseGroupedSearchResult
  */
  public static SearchTermResultsResponseGroupedSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchTermResultsResponseGroupedSearchResult.class);
  }

 /**
  * Convert an instance of SearchTermResultsResponseGroupedSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
