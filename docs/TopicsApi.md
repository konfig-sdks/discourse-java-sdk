# TopicsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTopicPostMessage**](TopicsApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message |
| [**createTopicTimer**](TopicsApi.md#createTopicTimer) | **POST** /t/{id}/timer.json | Create topic timer |
| [**getByExternalId**](TopicsApi.md#getByExternalId) | **GET** /t/external_id/{external_id}.json | Get topic by external_id |
| [**getLatestTopics**](TopicsApi.md#getLatestTopics) | **GET** /latest.json | Get the latest topics |
| [**getSingleTopic**](TopicsApi.md#getSingleTopic) | **GET** /t/{id}.json | Get a single topic |
| [**getSpecificPosts**](TopicsApi.md#getSpecificPosts) | **GET** /t/{id}/posts.json | Get specific posts from a topic |
| [**getTopTopicsByPeriod**](TopicsApi.md#getTopTopicsByPeriod) | **GET** /top.json | Get the top topics filtered by period |
| [**removeTopicById**](TopicsApi.md#removeTopicById) | **DELETE** /t/{id}.json | Remove a topic |
| [**sendInviteToTopic**](TopicsApi.md#sendInviteToTopic) | **POST** /t/{id}/invite.json | Invite to topic |
| [**setNotificationLevel**](TopicsApi.md#setNotificationLevel) | **POST** /t/{id}/notifications.json | Set notification level |
| [**updateBookmark**](TopicsApi.md#updateBookmark) | **PUT** /t/{id}/bookmark.json | Bookmark topic |
| [**updateStatusOfTopic**](TopicsApi.md#updateStatusOfTopic) | **PUT** /t/{id}/status.json | Update the status of a topic |
| [**updateTimestampJson**](TopicsApi.md#updateTimestampJson) | **PUT** /t/{id}/change-timestamp.json | Update topic timestamp |
| [**updateTopicByIdJson**](TopicsApi.md#updateTopicByIdJson) | **PUT** /t/-/{id}.json | Update a topic |


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
import com.konfigthis.client.api.TopicsApi;
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
              .topics
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
      System.err.println("Exception when calling TopicsApi#createTopicPostMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsCreateTopicPostMessageResponse> response = client
              .topics
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
      System.err.println("Exception when calling TopicsApi#createTopicPostMessage");
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

<a name="createTopicTimer"></a>
# **createTopicTimer**
> TopicsCreateTopicTimerResponse createTopicTimer(apiKey, apiUsername, id).topicsCreateTopicTimerRequest(topicsCreateTopicTimerRequest).execute();

Create topic timer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    String time = "time_example";
    String statusType = "statusType_example";
    Boolean basedOnLastPost = true;
    Integer categoryId = 56;
    try {
      TopicsCreateTopicTimerResponse result = client
              .topics
              .createTopicTimer(apiKey, apiUsername, id)
              .time(time)
              .statusType(statusType)
              .basedOnLastPost(basedOnLastPost)
              .categoryId(categoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getExecuteAt());
      System.out.println(result.getDuration());
      System.out.println(result.getBasedOnLastPost());
      System.out.println(result.getClosed());
      System.out.println(result.getCategoryId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#createTopicTimer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsCreateTopicTimerResponse> response = client
              .topics
              .createTopicTimer(apiKey, apiUsername, id)
              .time(time)
              .statusType(statusType)
              .basedOnLastPost(basedOnLastPost)
              .categoryId(categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#createTopicTimer");
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
| **topicsCreateTopicTimerRequest** | [**TopicsCreateTopicTimerRequest**](TopicsCreateTopicTimerRequest.md)|  | [optional] |

### Return type

[**TopicsCreateTopicTimerResponse**](TopicsCreateTopicTimerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

<a name="getByExternalId"></a>
# **getByExternalId**
> getByExternalId(externalId).execute();

Get topic by external_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String externalId = "externalId_example";
    try {
      client
              .topics
              .getByExternalId(externalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getByExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topics
              .getByExternalId(externalId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getByExternalId");
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
| **externalId** | **String**|  | |

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
| **0** | redirects to /t/{topic_id}.json |  -  |

<a name="getLatestTopics"></a>
# **getLatestTopics**
> TopicsGetLatestTopicsResponse getLatestTopics(apiKey, apiUsername).order(order).ascending(ascending).execute();

Get the latest topics

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    String order = "order_example"; // Enum: `default`, `created`, `activity`, `views`, `posts`, `category`, `likes`, `op_likes`, `posters`
    String ascending = "ascending_example"; // Defaults to `desc`, add `ascending=true` to sort asc
    try {
      TopicsGetLatestTopicsResponse result = client
              .topics
              .getLatestTopics(apiKey, apiUsername)
              .order(order)
              .ascending(ascending)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getPrimaryGroups());
      System.out.println(result.getTopicList());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getLatestTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsGetLatestTopicsResponse> response = client
              .topics
              .getLatestTopics(apiKey, apiUsername)
              .order(order)
              .ascending(ascending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getLatestTopics");
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
| **order** | **String**| Enum: &#x60;default&#x60;, &#x60;created&#x60;, &#x60;activity&#x60;, &#x60;views&#x60;, &#x60;posts&#x60;, &#x60;category&#x60;, &#x60;likes&#x60;, &#x60;op_likes&#x60;, &#x60;posters&#x60; | [optional] |
| **ascending** | **String**| Defaults to &#x60;desc&#x60;, add &#x60;ascending&#x3D;true&#x60; to sort asc | [optional] |

### Return type

[**TopicsGetLatestTopicsResponse**](TopicsGetLatestTopicsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

<a name="getSingleTopic"></a>
# **getSingleTopic**
> TopicsGetSingleTopicResponse getSingleTopic(apiKey, apiUsername, id).execute();

Get a single topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    try {
      TopicsGetSingleTopicResponse result = client
              .topics
              .getSingleTopic(apiKey, apiUsername, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getPostStream());
      System.out.println(result.getTimelineLookup());
      System.out.println(result.getSuggestedTopics());
      System.out.println(result.getTagsDescriptions());
      System.out.println(result.getId());
      System.out.println(result.getFancyTitle());
      System.out.println(result.getPostsCount());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getViews());
      System.out.println(result.getReplyCount());
      System.out.println(result.getLikeCount());
      System.out.println(result.getLastPostedAt());
      System.out.println(result.getVisible());
      System.out.println(result.getClosed());
      System.out.println(result.getArchived());
      System.out.println(result.getHasSummary());
      System.out.println(result.getArchetype());
      System.out.println(result.getSlug());
      System.out.println(result.getCategoryId());
      System.out.println(result.getWordCount());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getFeaturedLink());
      System.out.println(result.getPinnedGlobally());
      System.out.println(result.getPinnedAt());
      System.out.println(result.getPinnedUntil());
      System.out.println(result.getImageUrl());
      System.out.println(result.getSlowModeSeconds());
      System.out.println(result.getDraft());
      System.out.println(result.getDraftKey());
      System.out.println(result.getDraftSequence());
      System.out.println(result.getUnpinned());
      System.out.println(result.getPinned());
      System.out.println(result.getCurrentPostNumber());
      System.out.println(result.getHighestPostNumber());
      System.out.println(result.getDeletedBy());
      System.out.println(result.getHasDeleted());
      System.out.println(result.getActionsSummary());
      System.out.println(result.getChunkSize());
      System.out.println(result.getBookmarked());
      System.out.println(result.getBookmarks());
      System.out.println(result.getTopicTimer());
      System.out.println(result.getMessageBusLastId());
      System.out.println(result.getParticipantCount());
      System.out.println(result.getShowReadIndicator());
      System.out.println(result.getThumbnails());
      System.out.println(result.getSlowModeEnabledUntil());
      System.out.println(result.getSummarizable());
      System.out.println(result.getDetails());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getSingleTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsGetSingleTopicResponse> response = client
              .topics
              .getSingleTopic(apiKey, apiUsername, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getSingleTopic");
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

### Return type

[**TopicsGetSingleTopicResponse**](TopicsGetSingleTopicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | specific posts |  -  |

<a name="getSpecificPosts"></a>
# **getSpecificPosts**
> TopicsGetSpecificPostsResponse getSpecificPosts(apiKey, apiUsername, id).topicsGetSpecificPostsRequest(topicsGetSpecificPostsRequest).execute();

Get specific posts from a topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer postIds = 56;
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String id = "id_example";
    try {
      TopicsGetSpecificPostsResponse result = client
              .topics
              .getSpecificPosts(postIds, apiKey, apiUsername, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getPostStream());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getSpecificPosts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsGetSpecificPostsResponse> response = client
              .topics
              .getSpecificPosts(postIds, apiKey, apiUsername, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getSpecificPosts");
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
| **topicsGetSpecificPostsRequest** | [**TopicsGetSpecificPostsRequest**](TopicsGetSpecificPostsRequest.md)|  | [optional] |

### Return type

[**TopicsGetSpecificPostsResponse**](TopicsGetSpecificPostsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | specific posts |  -  |

<a name="getTopTopicsByPeriod"></a>
# **getTopTopicsByPeriod**
> TopicsGetTopTopicsByPeriodResponse getTopTopicsByPeriod(apiKey, apiUsername).period(period).execute();

Get the top topics filtered by period

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    String period = "period_example"; // Enum: `all`, `yearly`, `quarterly`, `monthly`, `weekly`, `daily`
    try {
      TopicsGetTopTopicsByPeriodResponse result = client
              .topics
              .getTopTopicsByPeriod(apiKey, apiUsername)
              .period(period)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getPrimaryGroups());
      System.out.println(result.getTopicList());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getTopTopicsByPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsGetTopTopicsByPeriodResponse> response = client
              .topics
              .getTopTopicsByPeriod(apiKey, apiUsername)
              .period(period)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#getTopTopicsByPeriod");
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
| **period** | **String**| Enum: &#x60;all&#x60;, &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, &#x60;weekly&#x60;, &#x60;daily&#x60; | [optional] |

### Return type

[**TopicsGetTopTopicsByPeriodResponse**](TopicsGetTopTopicsByPeriodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="removeTopicById"></a>
# **removeTopicById**
> removeTopicById(apiKey, apiUsername, id).execute();

Remove a topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    try {
      client
              .topics
              .removeTopicById(apiKey, apiUsername, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#removeTopicById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topics
              .removeTopicById(apiKey, apiUsername, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#removeTopicById");
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
| **200** | specific posts |  -  |

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
import com.konfigthis.client.api.TopicsApi;
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
              .topics
              .sendInviteToTopic(apiKey, apiUsername, id)
              .user(user)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#sendInviteToTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsSendInviteToTopicResponse> response = client
              .topics
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
      System.err.println("Exception when calling TopicsApi#sendInviteToTopic");
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

<a name="setNotificationLevel"></a>
# **setNotificationLevel**
> TopicsSetNotificationLevelResponse setNotificationLevel(apiKey, apiUsername, id).topicsSetNotificationLevelRequest(topicsSetNotificationLevelRequest).execute();

Set notification level

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String notificationLevel = "0";
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String id = "id_example";
    try {
      TopicsSetNotificationLevelResponse result = client
              .topics
              .setNotificationLevel(notificationLevel, apiKey, apiUsername, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#setNotificationLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsSetNotificationLevelResponse> response = client
              .topics
              .setNotificationLevel(notificationLevel, apiKey, apiUsername, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#setNotificationLevel");
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
| **topicsSetNotificationLevelRequest** | [**TopicsSetNotificationLevelRequest**](TopicsSetNotificationLevelRequest.md)|  | [optional] |

### Return type

[**TopicsSetNotificationLevelResponse**](TopicsSetNotificationLevelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

<a name="updateBookmark"></a>
# **updateBookmark**
> updateBookmark(apiKey, apiUsername, id).execute();

Bookmark topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    try {
      client
              .topics
              .updateBookmark(apiKey, apiUsername, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateBookmark");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topics
              .updateBookmark(apiKey, apiUsername, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateBookmark");
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
| **200** | topic updated |  -  |

<a name="updateStatusOfTopic"></a>
# **updateStatusOfTopic**
> TopicsUpdateStatusOfTopicResponse updateStatusOfTopic(apiKey, apiUsername, id).topicsUpdateStatusOfTopicRequest(topicsUpdateStatusOfTopicRequest).execute();

Update the status of a topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String status = "closed";
    String enabled = "true";
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String id = "id_example";
    String until = "until_example"; // Only required for `pinned` and `pinned_globally`
    try {
      TopicsUpdateStatusOfTopicResponse result = client
              .topics
              .updateStatusOfTopic(status, enabled, apiKey, apiUsername, id)
              .until(until)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getTopicStatusUpdate());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateStatusOfTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsUpdateStatusOfTopicResponse> response = client
              .topics
              .updateStatusOfTopic(status, enabled, apiKey, apiUsername, id)
              .until(until)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateStatusOfTopic");
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
| **topicsUpdateStatusOfTopicRequest** | [**TopicsUpdateStatusOfTopicRequest**](TopicsUpdateStatusOfTopicRequest.md)|  | [optional] |

### Return type

[**TopicsUpdateStatusOfTopicResponse**](TopicsUpdateStatusOfTopicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

<a name="updateTimestampJson"></a>
# **updateTimestampJson**
> TopicsUpdateTimestampJsonResponse updateTimestampJson(apiKey, apiUsername, id).topicsUpdateTimestampJsonRequest(topicsUpdateTimestampJsonRequest).execute();

Update topic timestamp

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String timestamp = "timestamp_example";
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String id = "id_example";
    try {
      TopicsUpdateTimestampJsonResponse result = client
              .topics
              .updateTimestampJson(timestamp, apiKey, apiUsername, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateTimestampJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsUpdateTimestampJsonResponse> response = client
              .topics
              .updateTimestampJson(timestamp, apiKey, apiUsername, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateTimestampJson");
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
| **topicsUpdateTimestampJsonRequest** | [**TopicsUpdateTimestampJsonRequest**](TopicsUpdateTimestampJsonRequest.md)|  | [optional] |

### Return type

[**TopicsUpdateTimestampJsonResponse**](TopicsUpdateTimestampJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

<a name="updateTopicByIdJson"></a>
# **updateTopicByIdJson**
> TopicsUpdateTopicByIdJsonResponse updateTopicByIdJson(apiKey, apiUsername, id).topicsUpdateTopicByIdJsonRequest(topicsUpdateTopicByIdJsonRequest).execute();

Update a topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopicsApi;
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
    TopicsUpdateTopicByIdJsonRequestTopic topic = new TopicsUpdateTopicByIdJsonRequestTopic();
    try {
      TopicsUpdateTopicByIdJsonResponse result = client
              .topics
              .updateTopicByIdJson(apiKey, apiUsername, id)
              .topic(topic)
              .execute();
      System.out.println(result);
      System.out.println(result.getBasicTopic());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateTopicByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopicsUpdateTopicByIdJsonResponse> response = client
              .topics
              .updateTopicByIdJson(apiKey, apiUsername, id)
              .topic(topic)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicsApi#updateTopicByIdJson");
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
| **topicsUpdateTopicByIdJsonRequest** | [**TopicsUpdateTopicByIdJsonRequest**](TopicsUpdateTopicByIdJsonRequest.md)|  | [optional] |

### Return type

[**TopicsUpdateTopicByIdJsonResponse**](TopicsUpdateTopicByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | topic updated |  -  |

