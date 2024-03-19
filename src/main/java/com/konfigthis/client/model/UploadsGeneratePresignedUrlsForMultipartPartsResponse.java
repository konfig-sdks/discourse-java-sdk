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
 * UploadsGeneratePresignedUrlsForMultipartPartsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadsGeneratePresignedUrlsForMultipartPartsResponse {
  public static final String SERIALIZED_NAME_PRESIGNED_URLS = "presigned_urls";
  @SerializedName(SERIALIZED_NAME_PRESIGNED_URLS)
  private Object presignedUrls;

  public UploadsGeneratePresignedUrlsForMultipartPartsResponse() {
  }

  public UploadsGeneratePresignedUrlsForMultipartPartsResponse presignedUrls(Object presignedUrls) {
    
    
    
    
    this.presignedUrls = presignedUrls;
    return this;
  }

   /**
   * The presigned URLs for each part number, which has the part numbers as keys.
   * @return presignedUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"1\":\"https://discourse-martin-uploads-test.s3.us-east-2.amazonaws.com/temp/uploads/default/123abc/123abc.jpg?partNumber=1&uploadId=123456abcd&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=test&X-Amz-Date=20211222T012336Z&X-Amz-Expires=600&X-Amz-SignedHeaders=host&X-Amz-Signature=abc123\"}", required = true, value = "The presigned URLs for each part number, which has the part numbers as keys.")

  public Object getPresignedUrls() {
    return presignedUrls;
  }


  public void setPresignedUrls(Object presignedUrls) {
    
    
    
    this.presignedUrls = presignedUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadsGeneratePresignedUrlsForMultipartPartsResponse uploadsGeneratePresignedUrlsForMultipartPartsResponse = (UploadsGeneratePresignedUrlsForMultipartPartsResponse) o;
    return Objects.equals(this.presignedUrls, uploadsGeneratePresignedUrlsForMultipartPartsResponse.presignedUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presignedUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadsGeneratePresignedUrlsForMultipartPartsResponse {\n");
    sb.append("    presignedUrls: ").append(toIndentedString(presignedUrls)).append("\n");
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
    openapiFields.add("presigned_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("presigned_urls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadsGeneratePresignedUrlsForMultipartPartsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadsGeneratePresignedUrlsForMultipartPartsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadsGeneratePresignedUrlsForMultipartPartsResponse is not found in the empty JSON string", UploadsGeneratePresignedUrlsForMultipartPartsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadsGeneratePresignedUrlsForMultipartPartsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadsGeneratePresignedUrlsForMultipartPartsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadsGeneratePresignedUrlsForMultipartPartsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadsGeneratePresignedUrlsForMultipartPartsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadsGeneratePresignedUrlsForMultipartPartsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadsGeneratePresignedUrlsForMultipartPartsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadsGeneratePresignedUrlsForMultipartPartsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadsGeneratePresignedUrlsForMultipartPartsResponse>() {
           @Override
           public void write(JsonWriter out, UploadsGeneratePresignedUrlsForMultipartPartsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadsGeneratePresignedUrlsForMultipartPartsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadsGeneratePresignedUrlsForMultipartPartsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadsGeneratePresignedUrlsForMultipartPartsResponse
  * @throws IOException if the JSON string is invalid with respect to UploadsGeneratePresignedUrlsForMultipartPartsResponse
  */
  public static UploadsGeneratePresignedUrlsForMultipartPartsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadsGeneratePresignedUrlsForMultipartPartsResponse.class);
  }

 /**
  * Convert an instance of UploadsGeneratePresignedUrlsForMultipartPartsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

