# AdminApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUser**](AdminApi.md#activateUser) | **PUT** /admin/users/{id}/activate.json | Activate a user |
| [**anonymizeByIdJson**](AdminApi.md#anonymizeByIdJson) | **PUT** /admin/users/{id}/anonymize.json | Anonymize a user |
| [**deactivateUser**](AdminApi.md#deactivateUser) | **PUT** /admin/users/{id}/deactivate.json | Deactivate a user |
| [**deleteUserByIdJson**](AdminApi.md#deleteUserByIdJson) | **DELETE** /admin/users/{id}.json | Delete a user |
| [**getListOfUsers**](AdminApi.md#getListOfUsers) | **GET** /admin/users/list/{flag}.json | Get a list of users |
| [**getUserByIdJson**](AdminApi.md#getUserByIdJson) | **GET** /admin/users/{id}.json | Get a user by id |
| [**logOutUserAction**](AdminApi.md#logOutUserAction) | **POST** /admin/users/{id}/log_out.json | Log a user out |
| [**refreshGravatarPost**](AdminApi.md#refreshGravatarPost) | **POST** /user_avatar/{username}/refresh_gravatar.json | Refresh gravatar |
| [**silenceById**](AdminApi.md#silenceById) | **PUT** /admin/users/{id}/silence.json | Silence a user |
| [**suspendByIdJson**](AdminApi.md#suspendByIdJson) | **PUT** /admin/users/{id}/suspend.json | Suspend a user |


<a name="activateUser"></a>
# **activateUser**
> UsersActivateUserResponse activateUser(id).execute();

Activate a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersActivateUserResponse result = client
              .admin
              .activateUser(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#activateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersActivateUserResponse> response = client
              .admin
              .activateUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#activateUser");
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

[**UsersActivateUserResponse**](UsersActivateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="anonymizeByIdJson"></a>
# **anonymizeByIdJson**
> UsersAnonymizeByIdJsonResponse anonymizeByIdJson(id).execute();

Anonymize a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersAnonymizeByIdJsonResponse result = client
              .admin
              .anonymizeByIdJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUsername());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#anonymizeByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersAnonymizeByIdJsonResponse> response = client
              .admin
              .anonymizeByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#anonymizeByIdJson");
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

[**UsersAnonymizeByIdJsonResponse**](UsersAnonymizeByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="deactivateUser"></a>
# **deactivateUser**
> UsersDeactivateUserResponse deactivateUser(id).execute();

Deactivate a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersDeactivateUserResponse result = client
              .admin
              .deactivateUser(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deactivateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersDeactivateUserResponse> response = client
              .admin
              .deactivateUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deactivateUser");
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

[**UsersDeactivateUserResponse**](UsersDeactivateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="deleteUserByIdJson"></a>
# **deleteUserByIdJson**
> UsersDeleteUserByIdJsonResponse deleteUserByIdJson(id).usersDeleteUserByIdJsonRequest(usersDeleteUserByIdJsonRequest).execute();

Delete a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    Boolean deletePosts = true;
    Boolean blockEmail = true;
    Boolean blockUrls = true;
    Boolean blockIp = true;
    try {
      UsersDeleteUserByIdJsonResponse result = client
              .admin
              .deleteUserByIdJson(id)
              .deletePosts(deletePosts)
              .blockEmail(blockEmail)
              .blockUrls(blockUrls)
              .blockIp(blockIp)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deleteUserByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersDeleteUserByIdJsonResponse> response = client
              .admin
              .deleteUserByIdJson(id)
              .deletePosts(deletePosts)
              .blockEmail(blockEmail)
              .blockUrls(blockUrls)
              .blockIp(blockIp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#deleteUserByIdJson");
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
| **usersDeleteUserByIdJsonRequest** | [**UsersDeleteUserByIdJsonRequest**](UsersDeleteUserByIdJsonRequest.md)|  | [optional] |

### Return type

[**UsersDeleteUserByIdJsonResponse**](UsersDeleteUserByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="getListOfUsers"></a>
# **getListOfUsers**
> Set&lt;UsersGetListOfUsersResponseInner&gt; getListOfUsers(flag).order(order).asc(asc).page(page).showEmails(showEmails).stats(stats).email(email).ip(ip).execute();

Get a list of users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String flag = "active";
    String order = "created";
    String asc = "true";
    Integer page = 56;
    Boolean showEmails = true; // Include user email addresses in response. These requests will be logged in the staff action logs.
    Boolean stats = true; // Include user stats information
    String email = "email_example"; // Filter to the user with this email address
    String ip = "ip_example"; // Filter to users with this IP address
    try {
      Set<UsersGetListOfUsersResponseInner> result = client
              .admin
              .getListOfUsers(flag)
              .order(order)
              .asc(asc)
              .page(page)
              .showEmails(showEmails)
              .stats(stats)
              .email(email)
              .ip(ip)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getListOfUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Set<UsersGetListOfUsersResponseInner>> response = client
              .admin
              .getListOfUsers(flag)
              .order(order)
              .asc(asc)
              .page(page)
              .showEmails(showEmails)
              .stats(stats)
              .email(email)
              .ip(ip)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getListOfUsers");
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
| **flag** | **String**|  | [enum: active, new, staff, suspended, blocked, suspect] |
| **order** | **String**|  | [optional] [enum: created, last_emailed, seen, username, email, trust_level, days_visited, posts_read, topics_viewed, posts, read_time] |
| **asc** | **String**|  | [optional] [enum: true] |
| **page** | **Integer**|  | [optional] |
| **showEmails** | **Boolean**| Include user email addresses in response. These requests will be logged in the staff action logs. | [optional] |
| **stats** | **Boolean**| Include user stats information | [optional] |
| **email** | **String**| Filter to the user with this email address | [optional] |
| **ip** | **String**| Filter to users with this IP address | [optional] |

### Return type

[**Set&lt;UsersGetListOfUsersResponseInner&gt;**](UsersGetListOfUsersResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="getUserByIdJson"></a>
# **getUserByIdJson**
> UsersGetUserByIdJsonResponse getUserByIdJson(id).execute();

Get a user by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersGetUserByIdJsonResponse result = client
              .admin
              .getUserByIdJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getAvatarTemplate());
      System.out.println(result.getActive());
      System.out.println(result.getAdmin());
      System.out.println(result.getModerator());
      System.out.println(result.getLastSeenAt());
      System.out.println(result.getLastEmailedAt());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getLastSeenAge());
      System.out.println(result.getLastEmailedAge());
      System.out.println(result.getCreatedAtAge());
      System.out.println(result.getTrustLevel());
      System.out.println(result.getManualLockedTrustLevel());
      System.out.println(result.getTimeRead());
      System.out.println(result.getStaged());
      System.out.println(result.getDaysVisited());
      System.out.println(result.getPostsReadCount());
      System.out.println(result.getTopicsEntered());
      System.out.println(result.getPostCount());
      System.out.println(result.getAssociatedAccounts());
      System.out.println(result.getCanSendActivationEmail());
      System.out.println(result.getCanActivate());
      System.out.println(result.getCanDeactivate());
      System.out.println(result.getIpAddress());
      System.out.println(result.getRegistrationIpAddress());
      System.out.println(result.getCanGrantAdmin());
      System.out.println(result.getCanRevokeAdmin());
      System.out.println(result.getCanGrantModeration());
      System.out.println(result.getCanRevokeModeration());
      System.out.println(result.getCanImpersonate());
      System.out.println(result.getLikeCount());
      System.out.println(result.getLikeGivenCount());
      System.out.println(result.getTopicCount());
      System.out.println(result.getFlagsGivenCount());
      System.out.println(result.getFlagsReceivedCount());
      System.out.println(result.getPrivateTopicsCount());
      System.out.println(result.getCanDeleteAllPosts());
      System.out.println(result.getCanBeDeleted());
      System.out.println(result.getCanBeAnonymized());
      System.out.println(result.getCanBeMerged());
      System.out.println(result.getFullSuspendReason());
      System.out.println(result.getSilenceReason());
      System.out.println(result.getPostEditsCount());
      System.out.println(result.getPrimaryGroupId());
      System.out.println(result.getBadgeCount());
      System.out.println(result.getWarningsReceivedCount());
      System.out.println(result.getBounceScore());
      System.out.println(result.getResetBounceScoreAfter());
      System.out.println(result.getCanViewActionLogs());
      System.out.println(result.getCanDisableSecondFactor());
      System.out.println(result.getCanDeleteSsoRecord());
      System.out.println(result.getApiKeyCount());
      System.out.println(result.getSingleSignOnRecord());
      System.out.println(result.getApprovedBy());
      System.out.println(result.getSuspendedBy());
      System.out.println(result.getSilencedBy());
      System.out.println(result.getPenaltyCounts());
      System.out.println(result.getNextPenalty());
      System.out.println(result.getTl3Requirements());
      System.out.println(result.getGroups());
      System.out.println(result.getExternalIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getUserByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetUserByIdJsonResponse> response = client
              .admin
              .getUserByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getUserByIdJson");
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

[**UsersGetUserByIdJsonResponse**](UsersGetUserByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="logOutUserAction"></a>
# **logOutUserAction**
> UsersLogOutUserActionResponse logOutUserAction(id).execute();

Log a user out

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersLogOutUserActionResponse result = client
              .admin
              .logOutUserAction(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#logOutUserAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersLogOutUserActionResponse> response = client
              .admin
              .logOutUserAction(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#logOutUserAction");
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

[**UsersLogOutUserActionResponse**](UsersLogOutUserActionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="refreshGravatarPost"></a>
# **refreshGravatarPost**
> UsersRefreshGravatarPostResponse refreshGravatarPost(username).execute();

Refresh gravatar

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
      UsersRefreshGravatarPostResponse result = client
              .admin
              .refreshGravatarPost(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getGravatarUploadId());
      System.out.println(result.getGravatarAvatarTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#refreshGravatarPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersRefreshGravatarPostResponse> response = client
              .admin
              .refreshGravatarPost(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#refreshGravatarPost");
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

[**UsersRefreshGravatarPostResponse**](UsersRefreshGravatarPostResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="silenceById"></a>
# **silenceById**
> UsersSilenceByIdResponse silenceById(id).usersSilenceByIdRequest(usersSilenceByIdRequest).execute();

Silence a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    String silencedTill = "silencedTill_example";
    String reason = "reason_example";
    String message = "message_example"; // Will send an email with this message when present
    String postAction = "postAction_example";
    try {
      UsersSilenceByIdResponse result = client
              .admin
              .silenceById(id)
              .silencedTill(silencedTill)
              .reason(reason)
              .message(message)
              .postAction(postAction)
              .execute();
      System.out.println(result);
      System.out.println(result.getSilence());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#silenceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSilenceByIdResponse> response = client
              .admin
              .silenceById(id)
              .silencedTill(silencedTill)
              .reason(reason)
              .message(message)
              .postAction(postAction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#silenceById");
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
| **usersSilenceByIdRequest** | [**UsersSilenceByIdRequest**](UsersSilenceByIdRequest.md)|  | [optional] |

### Return type

[**UsersSilenceByIdResponse**](UsersSilenceByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="suspendByIdJson"></a>
# **suspendByIdJson**
> UsersSuspendByIdJsonResponse suspendByIdJson(id).usersSuspendByIdJsonRequest(usersSuspendByIdJsonRequest).execute();

Suspend a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String suspendUntil = "suspendUntil_example";
    String reason = "reason_example";
    Integer id = 56;
    String message = "message_example"; // Will send an email with this message when present
    String postAction = "postAction_example";
    try {
      UsersSuspendByIdJsonResponse result = client
              .admin
              .suspendByIdJson(suspendUntil, reason, id)
              .message(message)
              .postAction(postAction)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuspension());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#suspendByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSuspendByIdJsonResponse> response = client
              .admin
              .suspendByIdJson(suspendUntil, reason, id)
              .message(message)
              .postAction(postAction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#suspendByIdJson");
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
| **usersSuspendByIdJsonRequest** | [**UsersSuspendByIdJsonRequest**](UsersSuspendByIdJsonRequest.md)|  | [optional] |

### Return type

[**UsersSuspendByIdJsonResponse**](UsersSuspendByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

