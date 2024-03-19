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
import com.konfigthis.client.model.GroupsListResponseExtras;
import com.konfigthis.client.model.GroupsListResponseGroupsInner;
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
 * GroupsListResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GroupsListResponse {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupsListResponseGroupsInner> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private GroupsListResponseExtras extras;

  public static final String SERIALIZED_NAME_TOTAL_ROWS_GROUPS = "total_rows_groups";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS_GROUPS)
  private Integer totalRowsGroups;

  public static final String SERIALIZED_NAME_LOAD_MORE_GROUPS = "load_more_groups";
  @SerializedName(SERIALIZED_NAME_LOAD_MORE_GROUPS)
  private String loadMoreGroups;

  public GroupsListResponse() {
  }

  public GroupsListResponse groups(List<GroupsListResponseGroupsInner> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public GroupsListResponse addGroupsItem(GroupsListResponseGroupsInner groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<GroupsListResponseGroupsInner> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupsListResponseGroupsInner> groups) {
    
    
    
    this.groups = groups;
  }


  public GroupsListResponse extras(GroupsListResponseExtras extras) {
    
    
    
    
    this.extras = extras;
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupsListResponseExtras getExtras() {
    return extras;
  }


  public void setExtras(GroupsListResponseExtras extras) {
    
    
    
    this.extras = extras;
  }


  public GroupsListResponse totalRowsGroups(Integer totalRowsGroups) {
    
    
    
    
    this.totalRowsGroups = totalRowsGroups;
    return this;
  }

   /**
   * Get totalRowsGroups
   * @return totalRowsGroups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalRowsGroups() {
    return totalRowsGroups;
  }


  public void setTotalRowsGroups(Integer totalRowsGroups) {
    
    
    
    this.totalRowsGroups = totalRowsGroups;
  }


  public GroupsListResponse loadMoreGroups(String loadMoreGroups) {
    
    
    
    
    this.loadMoreGroups = loadMoreGroups;
    return this;
  }

   /**
   * Get loadMoreGroups
   * @return loadMoreGroups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLoadMoreGroups() {
    return loadMoreGroups;
  }


  public void setLoadMoreGroups(String loadMoreGroups) {
    
    
    
    this.loadMoreGroups = loadMoreGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsListResponse groupsListResponse = (GroupsListResponse) o;
    return Objects.equals(this.groups, groupsListResponse.groups) &&
        Objects.equals(this.extras, groupsListResponse.extras) &&
        Objects.equals(this.totalRowsGroups, groupsListResponse.totalRowsGroups) &&
        Objects.equals(this.loadMoreGroups, groupsListResponse.loadMoreGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, extras, totalRowsGroups, loadMoreGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsListResponse {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    totalRowsGroups: ").append(toIndentedString(totalRowsGroups)).append("\n");
    sb.append("    loadMoreGroups: ").append(toIndentedString(loadMoreGroups)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("extras");
    openapiFields.add("total_rows_groups");
    openapiFields.add("load_more_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groups");
    openapiRequiredFields.add("extras");
    openapiRequiredFields.add("total_rows_groups");
    openapiRequiredFields.add("load_more_groups");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupsListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupsListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupsListResponse is not found in the empty JSON string", GroupsListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupsListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupsListResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupsListResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }

      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
      // validate the required field `groups` (array)
      for (int i = 0; i < jsonArraygroups.size(); i++) {
        GroupsListResponseGroupsInner.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
      };
      // validate the required field `extras`
      GroupsListResponseExtras.validateJsonObject(jsonObj.getAsJsonObject("extras"));
      if (!jsonObj.get("load_more_groups").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `load_more_groups` to be a primitive type in the JSON string but got `%s`", jsonObj.get("load_more_groups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupsListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupsListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupsListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupsListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupsListResponse>() {
           @Override
           public void write(JsonWriter out, GroupsListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupsListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupsListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupsListResponse
  * @throws IOException if the JSON string is invalid with respect to GroupsListResponse
  */
  public static GroupsListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupsListResponse.class);
  }

 /**
  * Convert an instance of GroupsListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
