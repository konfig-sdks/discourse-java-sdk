# InvitesApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvite**](InvitesApi.md#createInvite) | **POST** /invites.json | Create an invite |
| [**createMultipleInvites**](InvitesApi.md#createMultipleInvites) | **POST** /invites/create-multiple.json | Create multiple invites |
| [**sendInviteToTopic**](InvitesApi.md#sendInviteToTopic) | **POST** /t/{id}/invite.json | Invite to topic |


<a name="createInvite"></a>
# **createInvite**
> InvitesCreateInviteResponse createInvite(apiKey, apiUsername).invitesCreateInviteRequest(invitesCreateInviteRequest).execute();

Create an invite

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    String email = "email_example"; // required for email invites only
    Boolean skipEmail = false;
    String customMessage = "customMessage_example"; // optional, for email invites
    Integer maxRedemptionsAllowed = 1; // optional, for link invites
    Integer topicId = 56;
    String groupIds = "groupIds_example"; // Optional, either this or `group_names`. Comma separated list for multiple ids.
    String groupNames = "groupNames_example"; // Optional, either this or `group_ids`. Comma separated list for multiple names.
    String expiresAt = "expiresAt_example"; // optional, if not supplied, the invite_expiry_days site setting is used
    try {
      InvitesCreateInviteResponse result = client
              .invites
              .createInvite(apiKey, apiUsername)
              .email(email)
              .skipEmail(skipEmail)
              .customMessage(customMessage)
              .maxRedemptionsAllowed(maxRedemptionsAllowed)
              .topicId(topicId)
              .groupIds(groupIds)
              .groupNames(groupNames)
              .expiresAt(expiresAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getLink());
      System.out.println(result.getEmail());
      System.out.println(result.getEmailed());
      System.out.println(result.getCustomMessage());
      System.out.println(result.getTopics());
      System.out.println(result.getGroups());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getExpired());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#createInvite");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvitesCreateInviteResponse> response = client
              .invites
              .createInvite(apiKey, apiUsername)
              .email(email)
              .skipEmail(skipEmail)
              .customMessage(customMessage)
              .maxRedemptionsAllowed(maxRedemptionsAllowed)
              .topicId(topicId)
              .groupIds(groupIds)
              .groupNames(groupNames)
              .expiresAt(expiresAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#createInvite");
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
| **invitesCreateInviteRequest** | [**InvitesCreateInviteRequest**](InvitesCreateInviteRequest.md)|  | [optional] |

### Return type

[**InvitesCreateInviteResponse**](InvitesCreateInviteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="createMultipleInvites"></a>
# **createMultipleInvites**
> InvitesCreateMultipleInvitesResponse createMultipleInvites(apiKey, apiUsername).invitesCreateMultipleInvitesRequest(invitesCreateMultipleInvitesRequest).execute();

Create multiple invites

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    String email = "email_example"; // pass 1 email per invite to be generated. other properties will be shared by each invite.
    Boolean skipEmail = false;
    String customMessage = "customMessage_example"; // optional, for email invites
    Integer maxRedemptionsAllowed = 1; // optional, for link invites
    Integer topicId = 56;
    String groupIds = "groupIds_example"; // Optional, either this or `group_names`. Comma separated list for multiple ids.
    String groupNames = "groupNames_example"; // Optional, either this or `group_ids`. Comma separated list for multiple names.
    String expiresAt = "expiresAt_example"; // optional, if not supplied, the invite_expiry_days site setting is used
    try {
      InvitesCreateMultipleInvitesResponse result = client
              .invites
              .createMultipleInvites(apiKey, apiUsername)
              .email(email)
              .skipEmail(skipEmail)
              .customMessage(customMessage)
              .maxRedemptionsAllowed(maxRedemptionsAllowed)
              .topicId(topicId)
              .groupIds(groupIds)
              .groupNames(groupNames)
              .expiresAt(expiresAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getNumSuccessfullyCreatedInvitations());
      System.out.println(result.getNumFailedInvitations());
      System.out.println(result.getFailedInvitations());
      System.out.println(result.getSuccessfulInvitations());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#createMultipleInvites");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvitesCreateMultipleInvitesResponse> response = client
              .invites
              .createMultipleInvites(apiKey, apiUsername)
              .email(email)
              .skipEmail(skipEmail)
              .customMessage(customMessage)
              .maxRedemptionsAllowed(maxRedemptionsAllowed)
              .topicId(topicId)
              .groupIds(groupIds)
              .groupNames(groupNames)
              .expiresAt(expiresAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#createMultipleInvites");
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
| **invitesCreateMultipleInvitesRequest** | [**InvitesCreateMultipleInvitesRequest**](InvitesCreateMultipleInvitesRequest.md)|  | [optional] |

### Return type

[**InvitesCreateMultipleInvitesResponse**](InvitesCreateMultipleInvitesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="sendInviteToTopic"></a>
# **sendInviteToTopic**
> TopicsSendInviteToTopicResponse sendInviteToTopic(apiKey, apiUsername, id).topicsSendInviteToTopicRequest(topicsSendInviteToTopicRequest).execute();

Invite to topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    String id = "id_example";
    String user = "user_example";
    String email = "email_example";
    try {
      TopicsSendInviteToTopicResponse result = client
              .invites
              .sendInviteToTopic(apiKey, apiUsername, id)
              .user(user)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#sendInviteToTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsSendInviteToTopicResponse> response = client
              .invites
              .sendInviteToTopic(apiKey, apiUsername, id)
              .user(user)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#sendInviteToTopic");
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
| **id** | **String**|  | |
| **topicsSendInviteToTopicRequest** | [**TopicsSendInviteToTopicRequest**](TopicsSendInviteToTopicRequest.md)|  | [optional] |

### Return type

[**TopicsSendInviteToTopicResponse**](TopicsSendInviteToTopicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

