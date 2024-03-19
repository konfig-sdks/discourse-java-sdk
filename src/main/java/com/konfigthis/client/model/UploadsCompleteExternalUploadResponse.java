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
 * UploadsCompleteExternalUploadResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadsCompleteExternalUploadResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "original_filename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_FILESIZE = "filesize";
  @SerializedName(SERIALIZED_NAME_FILESIZE)
  private Integer filesize;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_THUMBNAIL_WIDTH = "thumbnail_width";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_WIDTH)
  private Integer thumbnailWidth;

  public static final String SERIALIZED_NAME_THUMBNAIL_HEIGHT = "thumbnail_height";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_HEIGHT)
  private Integer thumbnailHeight;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_SHORT_URL = "short_url";
  @SerializedName(SERIALIZED_NAME_SHORT_URL)
  private String shortUrl;

  public static final String SERIALIZED_NAME_SHORT_PATH = "short_path";
  @SerializedName(SERIALIZED_NAME_SHORT_PATH)
  private String shortPath;

  public static final String SERIALIZED_NAME_RETAIN_HOURS = "retain_hours";
  @SerializedName(SERIALIZED_NAME_RETAIN_HOURS)
  private Object retainHours = null;

  public static final String SERIALIZED_NAME_HUMAN_FILESIZE = "human_filesize";
  @SerializedName(SERIALIZED_NAME_HUMAN_FILESIZE)
  private String humanFilesize;

  public static final String SERIALIZED_NAME_DOMINANT_COLOR = "dominant_color";
  @SerializedName(SERIALIZED_NAME_DOMINANT_COLOR)
  private Object dominantColor = null;

  public UploadsCompleteExternalUploadResponse() {
  }

  public UploadsCompleteExternalUploadResponse id(Integer id) {
    
    
    
    
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


  public UploadsCompleteExternalUploadResponse url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public UploadsCompleteExternalUploadResponse originalFilename(String originalFilename) {
    
    
    
    
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * Get originalFilename
   * @return originalFilename
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOriginalFilename() {
    return originalFilename;
  }


  public void setOriginalFilename(String originalFilename) {
    
    
    
    this.originalFilename = originalFilename;
  }


  public UploadsCompleteExternalUploadResponse filesize(Integer filesize) {
    
    
    
    
    this.filesize = filesize;
    return this;
  }

   /**
   * Get filesize
   * @return filesize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getFilesize() {
    return filesize;
  }


  public void setFilesize(Integer filesize) {
    
    
    
    this.filesize = filesize;
  }


  public UploadsCompleteExternalUploadResponse width(Integer width) {
    
    
    
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    
    
    
    this.width = width;
  }


  public UploadsCompleteExternalUploadResponse height(Integer height) {
    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    
    
    
    this.height = height;
  }


  public UploadsCompleteExternalUploadResponse thumbnailWidth(Integer thumbnailWidth) {
    
    
    
    
    this.thumbnailWidth = thumbnailWidth;
    return this;
  }

   /**
   * Get thumbnailWidth
   * @return thumbnailWidth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getThumbnailWidth() {
    return thumbnailWidth;
  }


  public void setThumbnailWidth(Integer thumbnailWidth) {
    
    
    
    this.thumbnailWidth = thumbnailWidth;
  }


  public UploadsCompleteExternalUploadResponse thumbnailHeight(Integer thumbnailHeight) {
    
    
    
    
    this.thumbnailHeight = thumbnailHeight;
    return this;
  }

   /**
   * Get thumbnailHeight
   * @return thumbnailHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getThumbnailHeight() {
    return thumbnailHeight;
  }


  public void setThumbnailHeight(Integer thumbnailHeight) {
    
    
    
    this.thumbnailHeight = thumbnailHeight;
  }


  public UploadsCompleteExternalUploadResponse extension(String extension) {
    
    
    
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    
    
    
    this.extension = extension;
  }


  public UploadsCompleteExternalUploadResponse shortUrl(String shortUrl) {
    
    
    
    
    this.shortUrl = shortUrl;
    return this;
  }

   /**
   * Get shortUrl
   * @return shortUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getShortUrl() {
    return shortUrl;
  }


  public void setShortUrl(String shortUrl) {
    
    
    
    this.shortUrl = shortUrl;
  }


  public UploadsCompleteExternalUploadResponse shortPath(String shortPath) {
    
    
    
    
    this.shortPath = shortPath;
    return this;
  }

   /**
   * Get shortPath
   * @return shortPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getShortPath() {
    return shortPath;
  }


  public void setShortPath(String shortPath) {
    
    
    
    this.shortPath = shortPath;
  }


  public UploadsCompleteExternalUploadResponse retainHours(Object retainHours) {
    
    
    
    
    this.retainHours = retainHours;
    return this;
  }

   /**
   * Get retainHours
   * @return retainHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getRetainHours() {
    return retainHours;
  }


  public void setRetainHours(Object retainHours) {
    
    
    
    this.retainHours = retainHours;
  }


  public UploadsCompleteExternalUploadResponse humanFilesize(String humanFilesize) {
    
    
    
    
    this.humanFilesize = humanFilesize;
    return this;
  }

   /**
   * Get humanFilesize
   * @return humanFilesize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHumanFilesize() {
    return humanFilesize;
  }


  public void setHumanFilesize(String humanFilesize) {
    
    
    
    this.humanFilesize = humanFilesize;
  }


  public UploadsCompleteExternalUploadResponse dominantColor(Object dominantColor) {
    
    
    
    
    this.dominantColor = dominantColor;
    return this;
  }

   /**
   * Get dominantColor
   * @return dominantColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDominantColor() {
    return dominantColor;
  }


  public void setDominantColor(Object dominantColor) {
    
    
    
    this.dominantColor = dominantColor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadsCompleteExternalUploadResponse uploadsCompleteExternalUploadResponse = (UploadsCompleteExternalUploadResponse) o;
    return Objects.equals(this.id, uploadsCompleteExternalUploadResponse.id) &&
        Objects.equals(this.url, uploadsCompleteExternalUploadResponse.url) &&
        Objects.equals(this.originalFilename, uploadsCompleteExternalUploadResponse.originalFilename) &&
        Objects.equals(this.filesize, uploadsCompleteExternalUploadResponse.filesize) &&
        Objects.equals(this.width, uploadsCompleteExternalUploadResponse.width) &&
        Objects.equals(this.height, uploadsCompleteExternalUploadResponse.height) &&
        Objects.equals(this.thumbnailWidth, uploadsCompleteExternalUploadResponse.thumbnailWidth) &&
        Objects.equals(this.thumbnailHeight, uploadsCompleteExternalUploadResponse.thumbnailHeight) &&
        Objects.equals(this.extension, uploadsCompleteExternalUploadResponse.extension) &&
        Objects.equals(this.shortUrl, uploadsCompleteExternalUploadResponse.shortUrl) &&
        Objects.equals(this.shortPath, uploadsCompleteExternalUploadResponse.shortPath) &&
        Objects.equals(this.retainHours, uploadsCompleteExternalUploadResponse.retainHours) &&
        Objects.equals(this.humanFilesize, uploadsCompleteExternalUploadResponse.humanFilesize) &&
        Objects.equals(this.dominantColor, uploadsCompleteExternalUploadResponse.dominantColor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, originalFilename, filesize, width, height, thumbnailWidth, thumbnailHeight, extension, shortUrl, shortPath, retainHours, humanFilesize, dominantColor);
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
    sb.append("class UploadsCompleteExternalUploadResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    thumbnailWidth: ").append(toIndentedString(thumbnailWidth)).append("\n");
    sb.append("    thumbnailHeight: ").append(toIndentedString(thumbnailHeight)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    shortUrl: ").append(toIndentedString(shortUrl)).append("\n");
    sb.append("    shortPath: ").append(toIndentedString(shortPath)).append("\n");
    sb.append("    retainHours: ").append(toIndentedString(retainHours)).append("\n");
    sb.append("    humanFilesize: ").append(toIndentedString(humanFilesize)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("original_filename");
    openapiFields.add("filesize");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("thumbnail_width");
    openapiFields.add("thumbnail_height");
    openapiFields.add("extension");
    openapiFields.add("short_url");
    openapiFields.add("short_path");
    openapiFields.add("retain_hours");
    openapiFields.add("human_filesize");
    openapiFields.add("dominant_color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("original_filename");
    openapiRequiredFields.add("filesize");
    openapiRequiredFields.add("width");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("thumbnail_width");
    openapiRequiredFields.add("thumbnail_height");
    openapiRequiredFields.add("extension");
    openapiRequiredFields.add("short_url");
    openapiRequiredFields.add("short_path");
    openapiRequiredFields.add("retain_hours");
    openapiRequiredFields.add("human_filesize");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadsCompleteExternalUploadResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadsCompleteExternalUploadResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadsCompleteExternalUploadResponse is not found in the empty JSON string", UploadsCompleteExternalUploadResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadsCompleteExternalUploadResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadsCompleteExternalUploadResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadsCompleteExternalUploadResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("original_filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_filename").toString()));
      }
      if (!jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (!jsonObj.get("short_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_url").toString()));
      }
      if (!jsonObj.get("short_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_path").toString()));
      }
      if (!jsonObj.get("human_filesize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `human_filesize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("human_filesize").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadsCompleteExternalUploadResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadsCompleteExternalUploadResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadsCompleteExternalUploadResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadsCompleteExternalUploadResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadsCompleteExternalUploadResponse>() {
           @Override
           public void write(JsonWriter out, UploadsCompleteExternalUploadResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadsCompleteExternalUploadResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadsCompleteExternalUploadResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadsCompleteExternalUploadResponse
  * @throws IOException if the JSON string is invalid with respect to UploadsCompleteExternalUploadResponse
  */
  public static UploadsCompleteExternalUploadResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadsCompleteExternalUploadResponse.class);
  }

 /**
  * Convert an instance of UploadsCompleteExternalUploadResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

