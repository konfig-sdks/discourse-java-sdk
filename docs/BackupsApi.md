# BackupsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBackupRequest**](BackupsApi.md#createBackupRequest) | **POST** /admin/backups.json | Create backup |
| [**downloadBackup**](BackupsApi.md#downloadBackup) | **GET** /admin/backups/{filename} | Download backup |
| [**list**](BackupsApi.md#list) | **GET** /admin/backups.json | List backups |
| [**sendDownloadBackupEmail**](BackupsApi.md#sendDownloadBackupEmail) | **PUT** /admin/backups/{filename} | Send download backup email |


<a name="createBackupRequest"></a>
# **createBackupRequest**
> BackupsCreateBackupRequestResponse createBackupRequest().backupsCreateBackupRequestRequest(backupsCreateBackupRequestRequest).execute();

Create backup

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Boolean withUploads = true;
    try {
      BackupsCreateBackupRequestResponse result = client
              .backups
              .createBackupRequest(withUploads)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#createBackupRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackupsCreateBackupRequestResponse> response = client
              .backups
              .createBackupRequest(withUploads)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#createBackupRequest");
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
| **backupsCreateBackupRequestRequest** | [**BackupsCreateBackupRequestRequest**](BackupsCreateBackupRequestRequest.md)|  | [optional] |

### Return type

[**BackupsCreateBackupRequestResponse**](BackupsCreateBackupRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="downloadBackup"></a>
# **downloadBackup**
> downloadBackup(filename, token).execute();

Download backup

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String filename = "filename_example";
    String token = "token_example";
    try {
      client
              .backups
              .downloadBackup(filename, token)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#downloadBackup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .backups
              .downloadBackup(filename, token)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#downloadBackup");
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
| **filename** | **String**|  | |
| **token** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="list"></a>
# **list**
> Set&lt;BackupsListResponseInner&gt; list().execute();

List backups

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    try {
      Set<BackupsListResponseInner> result = client
              .backups
              .list()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Set<BackupsListResponseInner>> response = client
              .backups
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Set&lt;BackupsListResponseInner&gt;**](BackupsListResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="sendDownloadBackupEmail"></a>
# **sendDownloadBackupEmail**
> sendDownloadBackupEmail(filename).execute();

Send download backup email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String filename = "filename_example";
    try {
      client
              .backups
              .sendDownloadBackupEmail(filename)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#sendDownloadBackupEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .backups
              .sendDownloadBackupEmail(filename)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#sendDownloadBackupEmail");
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
| **filename** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

