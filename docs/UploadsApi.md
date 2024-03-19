# UploadsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abortMultipartUpload**](UploadsApi.md#abortMultipartUpload) | **POST** /uploads/abort-multipart.json | Abort multipart upload |
| [**completeExternalUpload**](UploadsApi.md#completeExternalUpload) | **POST** /uploads/complete-external-upload.json | Completes a direct external upload |
| [**completeMultipartUpload**](UploadsApi.md#completeMultipartUpload) | **POST** /uploads/complete-multipart.json | Complete multipart upload |
| [**createMultipartExternalUpload**](UploadsApi.md#createMultipartExternalUpload) | **POST** /uploads/create-multipart.json | Creates a multipart external upload |
| [**createNewUpload**](UploadsApi.md#createNewUpload) | **POST** /uploads.json | Creates an upload |
| [**generatePresignedUrlsForMultipartParts**](UploadsApi.md#generatePresignedUrlsForMultipartParts) | **POST** /uploads/batch-presign-multipart-parts.json | Generates batches of presigned URLs for multipart parts |
| [**initiateDirectExternalUpload**](UploadsApi.md#initiateDirectExternalUpload) | **POST** /uploads/generate-presigned-put.json | Initiates a direct external upload |


<a name="abortMultipartUpload"></a>
# **abortMultipartUpload**
> UploadsAbortMultipartUploadResponse abortMultipartUpload().uploadsAbortMultipartUploadRequest(uploadsAbortMultipartUploadRequest).execute();

Abort multipart upload

This endpoint aborts the multipart upload initiated with /create-multipart. This should be used when cancelling the upload. It does not matter if parts were already uploaded into the external storage provider.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String externalUploadIdentifier = "externalUploadIdentifier_example"; // The identifier of the multipart upload in the external storage provider. This is the multipart upload_id in AWS S3.
    try {
      UploadsAbortMultipartUploadResponse result = client
              .uploads
              .abortMultipartUpload(externalUploadIdentifier)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#abortMultipartUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsAbortMultipartUploadResponse> response = client
              .uploads
              .abortMultipartUpload(externalUploadIdentifier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#abortMultipartUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsAbortMultipartUploadRequest** | [**UploadsAbortMultipartUploadRequest**](UploadsAbortMultipartUploadRequest.md)|  | [optional] |

### Return type

[**UploadsAbortMultipartUploadResponse**](UploadsAbortMultipartUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

<a name="completeExternalUpload"></a>
# **completeExternalUpload**
> UploadsCompleteExternalUploadResponse completeExternalUpload().uploadsCompleteExternalUploadRequest(uploadsCompleteExternalUploadRequest).execute();

Completes a direct external upload

Completes an external upload initialized with /get-presigned-put. The file will be moved from its temporary location in external storage to a final destination in the S3 bucket. An Upload record will also be created in the database in most cases.  If a sha1-checksum was provided in the initial request it will also be compared with the uploaded file in storage to make sure the same file was uploaded. The file size will be compared for the same reason.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String uniqueIdentifier = "uniqueIdentifier_example"; // The unique identifier returned in the original /generate-presigned-put request.
    String forPrivateMessage = "forPrivateMessage_example"; // Optionally set this to true if the upload is for a private message.
    String forSiteSetting = "forSiteSetting_example"; // Optionally set this to true if the upload is for a site setting.
    String pasted = "pasted_example"; // Optionally set this to true if the upload was pasted into the upload area. This will convert PNG files to JPEG.
    try {
      UploadsCompleteExternalUploadResponse result = client
              .uploads
              .completeExternalUpload(uniqueIdentifier)
              .forPrivateMessage(forPrivateMessage)
              .forSiteSetting(forSiteSetting)
              .pasted(pasted)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getThumbnailWidth());
      System.out.println(result.getThumbnailHeight());
      System.out.println(result.getExtension());
      System.out.println(result.getShortUrl());
      System.out.println(result.getShortPath());
      System.out.println(result.getRetainHours());
      System.out.println(result.getHumanFilesize());
      System.out.println(result.getDominantColor());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#completeExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsCompleteExternalUploadResponse> response = client
              .uploads
              .completeExternalUpload(uniqueIdentifier)
              .forPrivateMessage(forPrivateMessage)
              .forSiteSetting(forSiteSetting)
              .pasted(pasted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#completeExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsCompleteExternalUploadRequest** | [**UploadsCompleteExternalUploadRequest**](UploadsCompleteExternalUploadRequest.md)|  | [optional] |

### Return type

[**UploadsCompleteExternalUploadResponse**](UploadsCompleteExternalUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

<a name="completeMultipartUpload"></a>
# **completeMultipartUpload**
> UploadsCompleteMultipartUploadResponse completeMultipartUpload().uploadsCompleteMultipartUploadRequest(uploadsCompleteMultipartUploadRequest).execute();

Complete multipart upload

Completes the multipart upload in the external store, and copies the file from its temporary location to its final location in the store. All of the parts must have been uploaded to the external storage provider. An Upload record will be completed in most cases once the file is copied to its final location.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String uniqueIdentifier = "uniqueIdentifier_example"; // The unique identifier returned in the original /create-multipart request.
    List parts = new List(); // All of the part numbers and their corresponding ETags that have been uploaded must be provided.
    try {
      UploadsCompleteMultipartUploadResponse result = client
              .uploads
              .completeMultipartUpload(uniqueIdentifier, parts)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getThumbnailWidth());
      System.out.println(result.getThumbnailHeight());
      System.out.println(result.getExtension());
      System.out.println(result.getShortUrl());
      System.out.println(result.getShortPath());
      System.out.println(result.getRetainHours());
      System.out.println(result.getHumanFilesize());
      System.out.println(result.getDominantColor());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#completeMultipartUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsCompleteMultipartUploadResponse> response = client
              .uploads
              .completeMultipartUpload(uniqueIdentifier, parts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#completeMultipartUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsCompleteMultipartUploadRequest** | [**UploadsCompleteMultipartUploadRequest**](UploadsCompleteMultipartUploadRequest.md)|  | [optional] |

### Return type

[**UploadsCompleteMultipartUploadResponse**](UploadsCompleteMultipartUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

<a name="createMultipartExternalUpload"></a>
# **createMultipartExternalUpload**
> UploadsCreateMultipartExternalUploadResponse createMultipartExternalUpload().uploadsCreateMultipartExternalUploadRequest(uploadsCreateMultipartExternalUploadRequest).execute();

Creates a multipart external upload

Creates a multipart upload in the external storage provider, storing a temporary reference to the external upload similar to /get-presigned-put.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String uploadType = "avatar";
    String fileName = "fileName_example";
    Integer fileSize = 56; // File size should be represented in bytes.
    UploadsInitiateDirectExternalUploadRequestMetadata metadata = new UploadsInitiateDirectExternalUploadRequestMetadata();
    try {
      UploadsCreateMultipartExternalUploadResponse result = client
              .uploads
              .createMultipartExternalUpload(uploadType, fileName, fileSize)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
      System.out.println(result.getExternalUploadIdentifier());
      System.out.println(result.getUniqueIdentifier());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createMultipartExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsCreateMultipartExternalUploadResponse> response = client
              .uploads
              .createMultipartExternalUpload(uploadType, fileName, fileSize)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createMultipartExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsCreateMultipartExternalUploadRequest** | [**UploadsCreateMultipartExternalUploadRequest**](UploadsCreateMultipartExternalUploadRequest.md)|  | [optional] |

### Return type

[**UploadsCreateMultipartExternalUploadResponse**](UploadsCreateMultipartExternalUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

<a name="createNewUpload"></a>
# **createNewUpload**
> UploadsCreateNewUploadResponse createNewUpload(type).userId(userId).synchronous(synchronous)._file(_file).uploadsCreateNewUploadRequest(uploadsCreateNewUploadRequest).execute();

Creates an upload

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String type = "avatar";
    Integer userId = 56; // required if uploading an avatar
    Boolean synchronous = true; // Use this flag to return an id and url
    File _file = new File("/path/to/file");
    try {
      UploadsCreateNewUploadResponse result = client
              .uploads
              .createNewUpload(type)
              .userId(userId)
              .synchronous(synchronous)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getWidth());
      System.out.println(result.getHeight());
      System.out.println(result.getThumbnailWidth());
      System.out.println(result.getThumbnailHeight());
      System.out.println(result.getExtension());
      System.out.println(result.getShortUrl());
      System.out.println(result.getShortPath());
      System.out.println(result.getRetainHours());
      System.out.println(result.getHumanFilesize());
      System.out.println(result.getDominantColor());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createNewUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsCreateNewUploadResponse> response = client
              .uploads
              .createNewUpload(type)
              .userId(userId)
              .synchronous(synchronous)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createNewUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**|  | [enum: avatar, profile_background, card_background, custom_emoji, composer] |
| **userId** | **Integer**| required if uploading an avatar | [optional] |
| **synchronous** | **Boolean**| Use this flag to return an id and url | [optional] |
| **_file** | **File**|  | [optional] |
| **uploadsCreateNewUploadRequest** | [**UploadsCreateNewUploadRequest**](UploadsCreateNewUploadRequest.md)|  | [optional] |

### Return type

[**UploadsCreateNewUploadResponse**](UploadsCreateNewUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | file uploaded |  -  |

<a name="generatePresignedUrlsForMultipartParts"></a>
# **generatePresignedUrlsForMultipartParts**
> UploadsGeneratePresignedUrlsForMultipartPartsResponse generatePresignedUrlsForMultipartParts().uploadsGeneratePresignedUrlsForMultipartPartsRequest(uploadsGeneratePresignedUrlsForMultipartPartsRequest).execute();

Generates batches of presigned URLs for multipart parts

Multipart uploads are uploaded in chunks or parts to individual presigned URLs, similar to the one generated by /generate-presigned-put. The part numbers provided must be between 1 and 10000. The total number of parts will depend on the chunk size in bytes that you intend to use to upload each chunk. For example a 12MB file may have 2 5MB chunks and a final 2MB chunk, for part numbers 1, 2, and 3.  This endpoint will return a presigned URL for each part number provided, which you can then use to send PUT requests for the binary chunk corresponding to that part. When the part is uploaded, the provider should return an ETag for the part, and this should be stored along with the part number, because this is needed to complete the multipart upload.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    List partNumbers = new List(); // The part numbers to generate the presigned URLs for, must be between 1 and 10000.
    String uniqueIdentifier = "uniqueIdentifier_example"; // The unique identifier returned in the original /create-multipart request.
    try {
      UploadsGeneratePresignedUrlsForMultipartPartsResponse result = client
              .uploads
              .generatePresignedUrlsForMultipartParts(partNumbers, uniqueIdentifier)
              .execute();
      System.out.println(result);
      System.out.println(result.getPresignedUrls());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#generatePresignedUrlsForMultipartParts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsGeneratePresignedUrlsForMultipartPartsResponse> response = client
              .uploads
              .generatePresignedUrlsForMultipartParts(partNumbers, uniqueIdentifier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#generatePresignedUrlsForMultipartParts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsGeneratePresignedUrlsForMultipartPartsRequest** | [**UploadsGeneratePresignedUrlsForMultipartPartsRequest**](UploadsGeneratePresignedUrlsForMultipartPartsRequest.md)|  | [optional] |

### Return type

[**UploadsGeneratePresignedUrlsForMultipartPartsResponse**](UploadsGeneratePresignedUrlsForMultipartPartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

<a name="initiateDirectExternalUpload"></a>
# **initiateDirectExternalUpload**
> UploadsInitiateDirectExternalUploadResponse initiateDirectExternalUpload().uploadsInitiateDirectExternalUploadRequest(uploadsInitiateDirectExternalUploadRequest).execute();

Initiates a direct external upload

Direct external uploads bypass the usual method of creating uploads via the POST /uploads route, and upload directly to an external provider, which by default is S3. This route begins the process, and will return a unique identifier for the external upload as well as a presigned URL which is where the file binary blob should be uploaded to.  Once the upload is complete to the external service, you must call the POST /complete-external-upload route using the unique identifier returned by this route, which will create any required Upload record in the Discourse database and also move file from its temporary location to the final destination in the external storage service.  You must have the correct permissions and CORS settings configured in your external provider. We support AWS S3 as the default. See:  https://meta.discourse.org/t/-/210469#s3-multipart-direct-uploads-4.  An external file store must be set up and &#x60;enable_direct_s3_uploads&#x60; must be set to true for this endpoint to function.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String type = "avatar";
    String fileName = "fileName_example";
    Integer fileSize = 56; // File size should be represented in bytes.
    UploadsInitiateDirectExternalUploadRequestMetadata metadata = new UploadsInitiateDirectExternalUploadRequestMetadata();
    try {
      UploadsInitiateDirectExternalUploadResponse result = client
              .uploads
              .initiateDirectExternalUpload(type, fileName, fileSize)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
      System.out.println(result.getUrl());
      System.out.println(result.getSignedHeaders());
      System.out.println(result.getUniqueIdentifier());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#initiateDirectExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadsInitiateDirectExternalUploadResponse> response = client
              .uploads
              .initiateDirectExternalUpload(type, fileName, fileSize)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#initiateDirectExternalUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadsInitiateDirectExternalUploadRequest** | [**UploadsInitiateDirectExternalUploadRequest**](UploadsInitiateDirectExternalUploadRequest.md)|  | [optional] |

### Return type

[**UploadsInitiateDirectExternalUploadResponse**](UploadsInitiateDirectExternalUploadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | external upload initialized |  -  |

