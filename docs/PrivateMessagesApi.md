# PrivateMessagesApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTopicPostMessage**](PrivateMessagesApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message |
| [**listForUser**](PrivateMessagesApi.md#listForUser) | **GET** /topics/private-messages/{username}.json | Get a list of private messages for a user |
| [**listSentForUser**](PrivateMessagesApi.md#listSentForUser) | **GET** /topics/private-messages-sent/{username}.json | Get a list of private messages sent for a user |


<a name="createTopicPostMessage"></a>
# **createTopicPostMessage**
> PostsCreateTopicPostMessageResponse createTopicPostMessage().postsCreateTopicPostMessageRequest(postsCreateTopicPostMessageRequest).execute();

Creates a new topic, a new post, or a private message

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrivateMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String raw = "raw_example";
    String title = "title_example"; // Required if creating a new topic or new private message.
    Integer topicId = 56; // Required if creating a new post.
    Integer category = 56; // Optional if creating a new topic, and ignored if creating a new post.
    String targetRecipients = "targetRecipients_example"; // Required for private message, comma separated.
    String targetUsernames = "targetUsernames_example"; // Deprecated. Use target_recipients instead.
    String archetype = "archetype_example"; // Required for new private message.
    String createdAt = "createdAt_example";
    Integer replyToPostNumber = 56; // Optional, the post number to reply to inside a topic.
    String embedUrl = "embedUrl_example"; // Provide a URL from a remote system to associate a forum topic with that URL, typically for using Discourse as a comments system for an external blog.
    String externalId = "externalId_example"; // Provide an external_id from a remote system to associate a forum topic with that id.
    try {
      PostsCreateTopicPostMessageResponse result = client
              .privateMessages
              .createTopicPostMessage(raw)
              .title(title)
              .topicId(topicId)
              .category(category)
              .targetRecipients(targetRecipients)
              .targetUsernames(targetUsernames)
              .archetype(archetype)
              .createdAt(createdAt)
              .replyToPostNumber(replyToPostNumber)
              .embedUrl(embedUrl)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getUsername());
      System.out.println(result.getAvatarTemplate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getRaw());
      System.out.println(result.getCooked());
      System.out.println(result.getPostNumber());
      System.out.println(result.getPostType());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getReplyCount());
      System.out.println(result.getReplyToPostNumber());
      System.out.println(result.getQuoteCount());
      System.out.println(result.getIncomingLinkCount());
      System.out.println(result.getReads());
      System.out.println(result.getReadersCount());
      System.out.println(result.getScore());
      System.out.println(result.getYours());
      System.out.println(result.getTopicId());
      System.out.println(result.getTopicSlug());
      System.out.println(result.getDisplayUsername());
      System.out.println(result.getPrimaryGroupName());
      System.out.println(result.getFlairName());
      System.out.println(result.getFlairUrl());
      System.out.println(result.getFlairBgColor());
      System.out.println(result.getFlairColor());
      System.out.println(result.getFlairGroupId());
      System.out.println(result.getCanEdit());
      System.out.println(result.getCanDelete());
      System.out.println(result.getCanRecover());
      System.out.println(result.getCanSeeHiddenPost());
      System.out.println(result.getCanWiki());
      System.out.println(result.getUserTitle());
      System.out.println(result.getBookmarked());
      System.out.println(result.getActionsSummary());
      System.out.println(result.getModerator());
      System.out.println(result.getAdmin());
      System.out.println(result.getStaff());
      System.out.println(result.getUserId());
      System.out.println(result.getDraftSequence());
      System.out.println(result.getHidden());
      System.out.println(result.getTrustLevel());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getUserDeleted());
      System.out.println(result.getEditReason());
      System.out.println(result.getCanViewEditHistory());
      System.out.println(result.getWiki());
      System.out.println(result.getReviewableId());
      System.out.println(result.getReviewableScoreCount());
      System.out.println(result.getReviewableScorePendingCount());
      System.out.println(result.getMentionedUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#createTopicPostMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsCreateTopicPostMessageResponse> response = client
              .privateMessages
              .createTopicPostMessage(raw)
              .title(title)
              .topicId(topicId)
              .category(category)
              .targetRecipients(targetRecipients)
              .targetUsernames(targetUsernames)
              .archetype(archetype)
              .createdAt(createdAt)
              .replyToPostNumber(replyToPostNumber)
              .embedUrl(embedUrl)
              .externalId(externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#createTopicPostMessage");
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
| **postsCreateTopicPostMessageRequest** | [**PostsCreateTopicPostMessageRequest**](PostsCreateTopicPostMessageRequest.md)|  | [optional] |

### Return type

[**PostsCreateTopicPostMessageResponse**](PostsCreateTopicPostMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | post created |  -  |

<a name="listForUser"></a>
# **listForUser**
> PrivateMessagesListForUserResponse listForUser(username).execute();

Get a list of private messages for a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrivateMessagesApi;
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
      PrivateMessagesListForUserResponse result = client
              .privateMessages
              .listForUser(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getPrimaryGroups());
      System.out.println(result.getTopicList());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#listForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrivateMessagesListForUserResponse> response = client
              .privateMessages
              .listForUser(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#listForUser");
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

[**PrivateMessagesListForUserResponse**](PrivateMessagesListForUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | private messages |  -  |

<a name="listSentForUser"></a>
# **listSentForUser**
> PrivateMessagesListSentForUserResponse listSentForUser(username).execute();

Get a list of private messages sent for a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrivateMessagesApi;
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
      PrivateMessagesListSentForUserResponse result = client
              .privateMessages
              .listSentForUser(username)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getPrimaryGroups());
      System.out.println(result.getTopicList());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#listSentForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrivateMessagesListSentForUserResponse> response = client
              .privateMessages
              .listSentForUser(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrivateMessagesApi#listSentForUser");
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

[**PrivateMessagesListSentForUserResponse**](PrivateMessagesListSentForUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | private messages |  -  |

