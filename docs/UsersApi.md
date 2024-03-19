# UsersApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUser**](UsersApi.md#activateUser) | **PUT** /admin/users/{id}/activate.json | Activate a user |
| [**anonymizeByIdJson**](UsersApi.md#anonymizeByIdJson) | **PUT** /admin/users/{id}/anonymize.json | Anonymize a user |
| [**changePasswordAction**](UsersApi.md#changePasswordAction) | **PUT** /users/password-reset/{token}.json | Change password |
| [**createUser**](UsersApi.md#createUser) | **POST** /users.json | Creates a user |
| [**deactivateUser**](UsersApi.md#deactivateUser) | **PUT** /admin/users/{id}/deactivate.json | Deactivate a user |
| [**deleteUserByIdJson**](UsersApi.md#deleteUserByIdJson) | **DELETE** /admin/users/{id}.json | Delete a user |
| [**getEmails**](UsersApi.md#getEmails) | **GET** /u/{username}/emails.json | Get email addresses belonging to a user |
| [**getIdentityProviderExternalId**](UsersApi.md#getIdentityProviderExternalId) | **GET** /u/by-external/{provider}/{external_id}.json | Get a user by identity provider external ID |
| [**getListOfUsers**](UsersApi.md#getListOfUsers) | **GET** /admin/users/list/{flag}.json | Get a list of users |
| [**getUserByExternalId**](UsersApi.md#getUserByExternalId) | **GET** /u/by-external/{external_id}.json | Get a user by external_id |
| [**getUserByIdJson**](UsersApi.md#getUserByIdJson) | **GET** /admin/users/{id}.json | Get a user by id |
| [**getUserByUsername**](UsersApi.md#getUserByUsername) | **GET** /u/{username}.json | Get a single user by username |
| [**listPublicUser**](UsersApi.md#listPublicUser) | **GET** /directory_items.json | Get a public list of users |
| [**listUserActions**](UsersApi.md#listUserActions) | **GET** /user_actions.json | Get a list of user actions |
| [**listUserBadges**](UsersApi.md#listUserBadges) | **GET** /user-badges/{username}.json | List badges for a user |
| [**logOutUserAction**](UsersApi.md#logOutUserAction) | **POST** /admin/users/{id}/log_out.json | Log a user out |
| [**refreshGravatarPost**](UsersApi.md#refreshGravatarPost) | **POST** /user_avatar/{username}/refresh_gravatar.json | Refresh gravatar |
| [**sendPasswordResetEmail**](UsersApi.md#sendPasswordResetEmail) | **POST** /session/forgot_password.json | Send password reset email |
| [**silenceById**](UsersApi.md#silenceById) | **PUT** /admin/users/{id}/silence.json | Silence a user |
| [**suspendByIdJson**](UsersApi.md#suspendByIdJson) | **PUT** /admin/users/{id}/suspend.json | Suspend a user |
| [**updateAvatar**](UsersApi.md#updateAvatar) | **PUT** /u/{username}/preferences/avatar/pick.json | Update avatar |
| [**updateEmailPreferences**](UsersApi.md#updateEmailPreferences) | **PUT** /u/{username}/preferences/email.json | Update email |
| [**updatePreferencesJson**](UsersApi.md#updatePreferencesJson) | **PUT** /u/{username}/preferences/username.json | Update username |
| [**updateUserDetails**](UsersApi.md#updateUserDetails) | **PUT** /u/{username}.json | Update a user |


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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .activateUser(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#activateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersActivateUserResponse> response = client
              .users
              .activateUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#activateUser");
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .anonymizeByIdJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUsername());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#anonymizeByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersAnonymizeByIdJsonResponse> response = client
              .users
              .anonymizeByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#anonymizeByIdJson");
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

<a name="changePasswordAction"></a>
# **changePasswordAction**
> changePasswordAction(token).usersChangePasswordActionRequest(usersChangePasswordActionRequest).execute();

Change password

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String username = "username_example";
    String password = "password_example";
    String token = "token_example";
    try {
      client
              .users
              .changePasswordAction(username, password, token)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#changePasswordAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .changePasswordAction(username, password, token)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#changePasswordAction");
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
| **token** | **String**|  | |
| **usersChangePasswordActionRequest** | [**UsersChangePasswordActionRequest**](UsersChangePasswordActionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="createUser"></a>
# **createUser**
> UsersCreateUserResponse createUser(apiKey, apiUsername).usersCreateUserRequest(usersCreateUserRequest).execute();

Creates a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String name = "name_example";
    String email = "email_example";
    String password = "password_example";
    String username = "username_example";
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    Boolean active = true; // This param requires an api key in the request header or it will be ignored
    Boolean approved = true;
    Boolean userFields1 = true;
    Object externalIds = null;
    try {
      UsersCreateUserResponse result = client
              .users
              .createUser(name, email, password, username, apiKey, apiUsername)
              .active(active)
              .approved(approved)
              .userFields1(userFields1)
              .externalIds(externalIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getActive());
      System.out.println(result.getMessage());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersCreateUserResponse> response = client
              .users
              .createUser(name, email, password, username, apiKey, apiUsername)
              .active(active)
              .approved(approved)
              .userFields1(userFields1)
              .externalIds(externalIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **apiKey** | **String**|  | |
| **apiUsername** | **String**|  | |
| **usersCreateUserRequest** | [**UsersCreateUserRequest**](UsersCreateUserRequest.md)|  | [optional] |

### Return type

[**UsersCreateUserResponse**](UsersCreateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user created |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .deactivateUser(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersDeactivateUserResponse> response = client
              .users
              .deactivateUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateUser");
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .deleteUserByIdJson(id)
              .deletePosts(deletePosts)
              .blockEmail(blockEmail)
              .blockUrls(blockUrls)
              .blockIp(blockIp)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUserByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersDeleteUserByIdJsonResponse> response = client
              .users
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
      System.err.println("Exception when calling UsersApi#deleteUserByIdJson");
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

<a name="getEmails"></a>
# **getEmails**
> UsersGetEmailsResponse getEmails(username).execute();

Get email addresses belonging to a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
      UsersGetEmailsResponse result = client
              .users
              .getEmails(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmail());
      System.out.println(result.getSecondaryEmails());
      System.out.println(result.getUnconfirmedEmails());
      System.out.println(result.getAssociatedAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetEmailsResponse> response = client
              .users
              .getEmails(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getEmails");
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

[**UsersGetEmailsResponse**](UsersGetEmailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="getIdentityProviderExternalId"></a>
# **getIdentityProviderExternalId**
> UsersGetIdentityProviderExternalIdResponse getIdentityProviderExternalId(apiKey, apiUsername, provider, externalId).execute();

Get a user by identity provider external ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String provider = "provider_example"; // Authentication provider name. Can be found in the provider callback URL: `/auth/{provider}/callback`
    String externalId = "externalId_example";
    try {
      UsersGetIdentityProviderExternalIdResponse result = client
              .users
              .getIdentityProviderExternalId(apiKey, apiUsername, provider, externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserBadges());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getIdentityProviderExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetIdentityProviderExternalIdResponse> response = client
              .users
              .getIdentityProviderExternalId(apiKey, apiUsername, provider, externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getIdentityProviderExternalId");
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
| **apiKey** | **String**|  | |
| **apiUsername** | **String**|  | |
| **provider** | **String**| Authentication provider name. Can be found in the provider callback URL: &#x60;/auth/{provider}/callback&#x60; | |
| **externalId** | **String**|  | |

### Return type

[**UsersGetIdentityProviderExternalIdResponse**](UsersGetIdentityProviderExternalIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user response |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
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
      System.err.println("Exception when calling UsersApi#getListOfUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Set<UsersGetListOfUsersResponseInner>> response = client
              .users
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
      System.err.println("Exception when calling UsersApi#getListOfUsers");
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

<a name="getUserByExternalId"></a>
# **getUserByExternalId**
> UsersGetUserByExternalIdResponse getUserByExternalId(apiKey, apiUsername, externalId).execute();

Get a user by external_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String externalId = "externalId_example";
    try {
      UsersGetUserByExternalIdResponse result = client
              .users
              .getUserByExternalId(apiKey, apiUsername, externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserBadges());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetUserByExternalIdResponse> response = client
              .users
              .getUserByExternalId(apiKey, apiUsername, externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByExternalId");
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
| **apiKey** | **String**|  | |
| **apiUsername** | **String**|  | |
| **externalId** | **String**|  | |

### Return type

[**UsersGetUserByExternalIdResponse**](UsersGetUserByExternalIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user response |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
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
      System.err.println("Exception when calling UsersApi#getUserByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetUserByIdJsonResponse> response = client
              .users
              .getUserByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByIdJson");
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

<a name="getUserByUsername"></a>
# **getUserByUsername**
> UsersGetUserByUsernameResponse getUserByUsername(apiKey, apiUsername, username).execute();

Get a single user by username

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String username = "username_example";
    try {
      UsersGetUserByUsernameResponse result = client
              .users
              .getUserByUsername(apiKey, apiUsername, username)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserBadges());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetUserByUsernameResponse> response = client
              .users
              .getUserByUsername(apiKey, apiUsername, username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByUsername");
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
| **apiKey** | **String**|  | |
| **apiUsername** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**UsersGetUserByUsernameResponse**](UsersGetUserByUsernameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user response |  -  |

<a name="listPublicUser"></a>
# **listPublicUser**
> UsersListPublicUserResponse listPublicUser(period, order).asc(asc).page(page).execute();

Get a public list of users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String period = "daily";
    String order = "likes_received";
    String asc = "true";
    Integer page = 56;
    try {
      UsersListPublicUserResponse result = client
              .users
              .listPublicUser(period, order)
              .asc(asc)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getDirectoryItems());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listPublicUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListPublicUserResponse> response = client
              .users
              .listPublicUser(period, order)
              .asc(asc)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listPublicUser");
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
| **period** | **String**|  | [enum: daily, weekly, monthly, quarterly, yearly, all] |
| **order** | **String**|  | [enum: likes_received, likes_given, topic_count, post_count, topics_entered, posts_read, days_visited] |
| **asc** | **String**|  | [optional] [enum: true] |
| **page** | **Integer**|  | [optional] |

### Return type

[**UsersListPublicUserResponse**](UsersListPublicUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | directory items response |  -  |

<a name="listUserActions"></a>
# **listUserActions**
> UsersListUserActionsResponse listUserActions(offset, username, filter).execute();

Get a list of user actions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer offset = 56;
    String username = "username_example";
    String filter = "filter_example";
    try {
      UsersListUserActionsResponse result = client
              .users
              .listUserActions(offset, username, filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserActions());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListUserActionsResponse> response = client
              .users
              .listUserActions(offset, username, filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserActions");
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
| **offset** | **Integer**|  | |
| **username** | **String**|  | |
| **filter** | **String**|  | |

### Return type

[**UsersListUserActionsResponse**](UsersListUserActionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .listUserBadges(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getBadges());
      System.out.println(result.getBadgeTypes());
      System.out.println(result.getGrantedBies());
      System.out.println(result.getUserBadges());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserBadges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BadgesListUserBadgesResponse> response = client
              .users
              .listUserBadges(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUserBadges");
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .logOutUserAction(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#logOutUserAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersLogOutUserActionResponse> response = client
              .users
              .logOutUserAction(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#logOutUserAction");
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .refreshGravatarPost(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getGravatarUploadId());
      System.out.println(result.getGravatarAvatarTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#refreshGravatarPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersRefreshGravatarPostResponse> response = client
              .users
              .refreshGravatarPost(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#refreshGravatarPost");
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

<a name="sendPasswordResetEmail"></a>
# **sendPasswordResetEmail**
> UsersSendPasswordResetEmailResponse sendPasswordResetEmail().usersSendPasswordResetEmailRequest(usersSendPasswordResetEmailRequest).execute();

Send password reset email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String login = "login_example";
    try {
      UsersSendPasswordResetEmailResponse result = client
              .users
              .sendPasswordResetEmail(login)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUserFound());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendPasswordResetEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSendPasswordResetEmailResponse> response = client
              .users
              .sendPasswordResetEmail(login)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendPasswordResetEmail");
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
| **usersSendPasswordResetEmailRequest** | [**UsersSendPasswordResetEmailRequest**](UsersSendPasswordResetEmailRequest.md)|  | [optional] |

### Return type

[**UsersSendPasswordResetEmailResponse**](UsersSendPasswordResetEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .silenceById(id)
              .silencedTill(silencedTill)
              .reason(reason)
              .message(message)
              .postAction(postAction)
              .execute();
      System.out.println(result);
      System.out.println(result.getSilence());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#silenceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSilenceByIdResponse> response = client
              .users
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
      System.err.println("Exception when calling UsersApi#silenceById");
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .suspendByIdJson(suspendUntil, reason, id)
              .message(message)
              .postAction(postAction)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuspension());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#suspendByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersSuspendByIdJsonResponse> response = client
              .users
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
      System.err.println("Exception when calling UsersApi#suspendByIdJson");
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

<a name="updateAvatar"></a>
# **updateAvatar**
> UsersUpdateAvatarResponse updateAvatar(username).usersUpdateAvatarRequest(usersUpdateAvatarRequest).execute();

Update avatar

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer uploadId = 56;
    String type = "uploaded";
    String username = "username_example";
    try {
      UsersUpdateAvatarResponse result = client
              .users
              .updateAvatar(uploadId, type, username)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateAvatar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersUpdateAvatarResponse> response = client
              .users
              .updateAvatar(uploadId, type, username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateAvatar");
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
| **usersUpdateAvatarRequest** | [**UsersUpdateAvatarRequest**](UsersUpdateAvatarRequest.md)|  | [optional] |

### Return type

[**UsersUpdateAvatarResponse**](UsersUpdateAvatarResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | avatar updated |  -  |

<a name="updateEmailPreferences"></a>
# **updateEmailPreferences**
> updateEmailPreferences(username).usersUpdateEmailPreferencesRequest(usersUpdateEmailPreferencesRequest).execute();

Update email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String email = "email_example";
    String username = "username_example";
    try {
      client
              .users
              .updateEmailPreferences(email, username)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateEmailPreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .updateEmailPreferences(email, username)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateEmailPreferences");
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
| **usersUpdateEmailPreferencesRequest** | [**UsersUpdateEmailPreferencesRequest**](UsersUpdateEmailPreferencesRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | email updated |  -  |

<a name="updatePreferencesJson"></a>
# **updatePreferencesJson**
> updatePreferencesJson(username).usersUpdatePreferencesJsonRequest(usersUpdatePreferencesJsonRequest).execute();

Update username

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String newUsername = "newUsername_example";
    String username = "username_example";
    try {
      client
              .users
              .updatePreferencesJson(newUsername, username)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updatePreferencesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .updatePreferencesJson(newUsername, username)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updatePreferencesJson");
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
| **usersUpdatePreferencesJsonRequest** | [**UsersUpdatePreferencesJsonRequest**](UsersUpdatePreferencesJsonRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | username updated |  -  |

<a name="updateUserDetails"></a>
# **updateUserDetails**
> UsersUpdateUserDetailsResponse updateUserDetails(apiKey, apiUsername, username).usersUpdateUserDetailsRequest(usersUpdateUserDetailsRequest).execute();

Update a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String username = "username_example";
    String name = "name_example";
    Object externalIds = null;
    try {
      UsersUpdateUserDetailsResponse result = client
              .users
              .updateUserDetails(apiKey, apiUsername, username)
              .name(name)
              .externalIds(externalIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersUpdateUserDetailsResponse> response = client
              .users
              .updateUserDetails(apiKey, apiUsername, username)
              .name(name)
              .externalIds(externalIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserDetails");
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
| **apiKey** | **String**|  | |
| **apiUsername** | **String**|  | |
| **username** | **String**|  | |
| **usersUpdateUserDetailsRequest** | [**UsersUpdateUserDetailsRequest**](UsersUpdateUserDetailsRequest.md)|  | [optional] |

### Return type

[**UsersUpdateUserDetailsResponse**](UsersUpdateUserDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | user updated |  -  |

