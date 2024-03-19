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
 * UploadsAbortMultipartUploadRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadsAbortMultipartUploadRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_UPLOAD_IDENTIFIER = "external_upload_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_UPLOAD_IDENTIFIER)
  private String externalUploadIdentifier;

  public UploadsAbortMultipartUploadRequest() {
  }

  public UploadsAbortMultipartUploadRequest externalUploadIdentifier(String externalUploadIdentifier) {
    
    
    
    
    this.externalUploadIdentifier = externalUploadIdentifier;
    return this;
  }

   /**
   * The identifier of the multipart upload in the external storage provider. This is the multipart upload_id in AWS S3.
   * @return externalUploadIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "84x83tmxy398t3y._Q_z8CoJYVr69bE6D7f8J6Oo0434QquLFoYdGVerWFx9X5HDEI_TP_95c34n853495x35345394.d.ghQ", required = true, value = "The identifier of the multipart upload in the external storage provider. This is the multipart upload_id in AWS S3.")

  public String getExternalUploadIdentifier() {
    return externalUploadIdentifier;
  }


  public void setExternalUploadIdentifier(String externalUploadIdentifier) {
    
    
    
    this.externalUploadIdentifier = externalUploadIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadsAbortMultipartUploadRequest uploadsAbortMultipartUploadRequest = (UploadsAbortMultipartUploadRequest) o;
    return Objects.equals(this.externalUploadIdentifier, uploadsAbortMultipartUploadRequest.externalUploadIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUploadIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadsAbortMultipartUploadRequest {\n");
    sb.append("    externalUploadIdentifier: ").append(toIndentedString(externalUploadIdentifier)).append("\n");
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
    openapiFields.add("external_upload_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_upload_identifier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadsAbortMultipartUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadsAbortMultipartUploadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadsAbortMultipartUploadRequest is not found in the empty JSON string", UploadsAbortMultipartUploadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadsAbortMultipartUploadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadsAbortMultipartUploadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadsAbortMultipartUploadRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("external_upload_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_upload_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_upload_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadsAbortMultipartUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadsAbortMultipartUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadsAbortMultipartUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadsAbortMultipartUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadsAbortMultipartUploadRequest>() {
           @Override
           public void write(JsonWriter out, UploadsAbortMultipartUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadsAbortMultipartUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadsAbortMultipartUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadsAbortMultipartUploadRequest
  * @throws IOException if the JSON string is invalid with respect to UploadsAbortMultipartUploadRequest
  */
  public static UploadsAbortMultipartUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadsAbortMultipartUploadRequest.class);
  }

 /**
  * Convert an instance of UploadsAbortMultipartUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
