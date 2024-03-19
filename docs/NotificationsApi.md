# NotificationsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserNotifications**](NotificationsApi.md#getUserNotifications) | **GET** /notifications.json | Get the notifications that belong to the current user |
| [**markAsRead**](NotificationsApi.md#markAsRead) | **PUT** /notifications/mark-read.json | Mark notifications as read |


<a name="getUserNotifications"></a>
# **getUserNotifications**
> NotificationsGetUserNotificationsResponse getUserNotifications().execute();

Get the notifications that belong to the current user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    try {
      NotificationsGetUserNotificationsResponse result = client
              .notifications
              .getUserNotifications()
              .execute();
      System.out.println(result);
      System.out.println(result.getNotifications());
      System.out.println(result.getTotalRowsNotifications());
      System.out.println(result.getSeenNotificationId());
      System.out.println(result.getLoadMoreNotifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getUserNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NotificationsGetUserNotificationsResponse> response = client
              .notifications
              .getUserNotifications()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getUserNotifications");
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

[**NotificationsGetUserNotificationsResponse**](NotificationsGetUserNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | notifications |  -  |

<a name="markAsRead"></a>
# **markAsRead**
> NotificationsMarkAsReadResponse markAsRead().notificationsMarkAsReadRequest(notificationsMarkAsReadRequest).execute();

Mark notifications as read

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56; // (optional) Leave off to mark all notifications as read
    try {
      NotificationsMarkAsReadResponse result = client
              .notifications
              .markAsRead()
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#markAsRead");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NotificationsMarkAsReadResponse> response = client
              .notifications
              .markAsRead()
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#markAsRead");
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
| **notificationsMarkAsReadRequest** | [**NotificationsMarkAsReadRequest**](NotificationsMarkAsReadRequest.md)|  | [optional] |

### Return type

[**NotificationsMarkAsReadResponse**](NotificationsMarkAsReadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | notifications marked read |  -  |

