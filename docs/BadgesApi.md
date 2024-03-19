# BadgesApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBadge**](BadgesApi.md#createBadge) | **POST** /admin/badges.json | Create badge |
| [**deleteByIdJson**](BadgesApi.md#deleteByIdJson) | **DELETE** /admin/badges/{id}.json | Delete badge |
| [**list**](BadgesApi.md#list) | **GET** /admin/badges.json | List badges |
| [**listUserBadges**](BadgesApi.md#listUserBadges) | **GET** /user-badges/{username}.json | List badges for a user |
| [**updateBadgeByIdJson**](BadgesApi.md#updateBadgeByIdJson) | **PUT** /admin/badges/{id}.json | Update badge |


<a name="createBadge"></a>
# **createBadge**
> BadgesCreateBadgeResponse createBadge().badgesCreateBadgeRequest(badgesCreateBadgeRequest).execute();

Create badge

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String name = "name_example"; // The name for the new badge.
    Integer badgeTypeId = 56; // The ID for the badge type. 1 for Gold, 2 for Silver, 3 for Bronze.
    try {
      BadgesCreateBadgeResponse result = client
              .badges
              .createBadge(name, badgeTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBadgeTypes());
      System.out.println(result.getBadge());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#createBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BadgesCreateBadgeResponse> response = client
              .badges
              .createBadge(name, badgeTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#createBadge");
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
| **badgesCreateBadgeRequest** | [**BadgesCreateBadgeRequest**](BadgesCreateBadgeRequest.md)|  | [optional] |

### Return type

[**BadgesCreateBadgeResponse**](BadgesCreateBadgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="deleteByIdJson"></a>
# **deleteByIdJson**
> deleteByIdJson(id).execute();

Delete badge

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    try {
      client
              .badges
              .deleteByIdJson(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#deleteByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .badges
              .deleteByIdJson(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#deleteByIdJson");
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
| **id** | **Integer**|  | |

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
> BadgesListResponse list().execute();

List badges

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    try {
      BadgesListResponse result = client
              .badges
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getBadges());
      System.out.println(result.getBadgeTypes());
      System.out.println(result.getBadgeGroupings());
      System.out.println(result.getAdminBadges());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BadgesListResponse> response = client
              .badges
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#list");
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

[**BadgesListResponse**](BadgesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="listUserBadges"></a>
# **listUserBadges**
> BadgesListUserBadgesResponse listUserBadges(username).execute();

List badges for a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String username = "username_example";
    try {
      BadgesListUserBadgesResponse result = client
              .badges
              .listUserBadges(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getBadges());
      System.out.println(result.getBadgeTypes());
      System.out.println(result.getGrantedBies());
      System.out.println(result.getUserBadges());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#listUserBadges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BadgesListUserBadgesResponse> response = client
              .badges
              .listUserBadges(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#listUserBadges");
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
| **username** | **String**|  | |

### Return type

[**BadgesListUserBadgesResponse**](BadgesListUserBadgesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="updateBadgeByIdJson"></a>
# **updateBadgeByIdJson**
> BadgesUpdateBadgeByIdJsonResponse updateBadgeByIdJson(id).badgesUpdateBadgeByIdJsonRequest(badgesUpdateBadgeByIdJsonRequest).execute();

Update badge

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String name = "name_example"; // The name for the new badge.
    Integer badgeTypeId = 56; // The ID for the badge type. 1 for Gold, 2 for Silver, 3 for Bronze.
    Integer id = 56;
    try {
      BadgesUpdateBadgeByIdJsonResponse result = client
              .badges
              .updateBadgeByIdJson(name, badgeTypeId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getBadgeTypes());
      System.out.println(result.getBadge());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateBadgeByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BadgesUpdateBadgeByIdJsonResponse> response = client
              .badges
              .updateBadgeByIdJson(name, badgeTypeId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateBadgeByIdJson");
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
| **id** | **Integer**|  | |
| **badgesUpdateBadgeByIdJsonRequest** | [**BadgesUpdateBadgeByIdJsonRequest**](BadgesUpdateBadgeByIdJsonRequest.md)|  | [optional] |

### Return type

[**BadgesUpdateBadgeByIdJsonResponse**](BadgesUpdateBadgeByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

