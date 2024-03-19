# PostsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTopicPostMessage**](PostsApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message |
| [**deleteSinglePost**](PostsApi.md#deleteSinglePost) | **DELETE** /posts/{id}.json | delete a single post |
| [**getSinglePostLikes**](PostsApi.md#getSinglePostLikes) | **GET** /posts/{id}.json | Retrieve a single post |
| [**likePostAction**](PostsApi.md#likePostAction) | **POST** /post_actions.json | Like a post and other actions |
| [**listLatestPostsAcrossTopics**](PostsApi.md#listLatestPostsAcrossTopics) | **GET** /posts.json | List latest posts across topics |
| [**listRepliesToPost**](PostsApi.md#listRepliesToPost) | **GET** /posts/{id}/replies.json | List replies to a post |
| [**lockPostAction**](PostsApi.md#lockPostAction) | **PUT** /posts/{id}/locked.json | Lock a post from being edited |
| [**updateSinglePostJson**](PostsApi.md#updateSinglePostJson) | **PUT** /posts/{id}.json | Update a single post |


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
import com.konfigthis.client.api.PostsApi;
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
              .posts
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
      System.err.println("Exception when calling PostsApi#createTopicPostMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsCreateTopicPostMessageResponse> response = client
              .posts
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
      System.err.println("Exception when calling PostsApi#createTopicPostMessage");
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

<a name="deleteSinglePost"></a>
# **deleteSinglePost**
> deleteSinglePost(id).postsDeleteSinglePostRequest(postsDeleteSinglePostRequest).execute();

delete a single post

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    Boolean forceDestroy = true; // The `SiteSetting.can_permanently_delete` needs to be enabled first before this param can be used. Also this endpoint needs to be called first without `force_destroy` and then followed up with a second call 5 minutes later with `force_destroy` to permanently delete.
    try {
      client
              .posts
              .deleteSinglePost(id)
              .forceDestroy(forceDestroy)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#deleteSinglePost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .posts
              .deleteSinglePost(id)
              .forceDestroy(forceDestroy)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#deleteSinglePost");
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
| **postsDeleteSinglePostRequest** | [**PostsDeleteSinglePostRequest**](PostsDeleteSinglePostRequest.md)|  | [optional] |

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

<a name="getSinglePostLikes"></a>
# **getSinglePostLikes**
> PostsGetSinglePostLikesResponse getSinglePostLikes(id).execute();

Retrieve a single post

This endpoint can be used to get the number of likes on a post using the &#x60;actions_summary&#x60; property in the response. &#x60;actions_summary&#x60; responses with the id of &#x60;2&#x60; signify a &#x60;like&#x60;. If there are no &#x60;actions_summary&#x60; items with the id of &#x60;2&#x60;, that means there are 0 likes. Other ids likely refer to various different flag types. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String id = "id_example";
    try {
      PostsGetSinglePostLikesResponse result = client
              .posts
              .getSinglePostLikes(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getAvatarTemplate());
      System.out.println(result.getCreatedAt());
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
      System.out.println(result.getRaw());
      System.out.println(result.getActionsSummary());
      System.out.println(result.getModerator());
      System.out.println(result.getAdmin());
      System.out.println(result.getStaff());
      System.out.println(result.getUserId());
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
      System.out.println(result.getName());
      System.out.println(result.getDisplayUsername());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#getSinglePostLikes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsGetSinglePostLikesResponse> response = client
              .posts
              .getSinglePostLikes(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#getSinglePostLikes");
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
| **id** | **String**|  | |

### Return type

[**PostsGetSinglePostLikesResponse**](PostsGetSinglePostLikesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | single post |  -  |

<a name="likePostAction"></a>
# **likePostAction**
> PostsLikePostActionResponse likePostAction(apiKey, apiUsername).postsLikePostActionRequest(postsLikePostActionRequest).execute();

Like a post and other actions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    Integer postActionTypeId = 56;
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    Boolean flagTopic = true;
    try {
      PostsLikePostActionResponse result = client
              .posts
              .likePostAction(id, postActionTypeId, apiKey, apiUsername)
              .flagTopic(flagTopic)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getUsername());
      System.out.println(result.getAvatarTemplate());
      System.out.println(result.getCreatedAt());
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
      System.out.println(result.getCanEdit());
      System.out.println(result.getCanDelete());
      System.out.println(result.getCanRecover());
      System.out.println(result.getCanWiki());
      System.out.println(result.getUserTitle());
      System.out.println(result.getActionsSummary());
      System.out.println(result.getModerator());
      System.out.println(result.getAdmin());
      System.out.println(result.getStaff());
      System.out.println(result.getUserId());
      System.out.println(result.getHidden());
      System.out.println(result.getTrustLevel());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getUserDeleted());
      System.out.println(result.getEditReason());
      System.out.println(result.getCanViewEditHistory());
      System.out.println(result.getWiki());
      System.out.println(result.getNotice());
      System.out.println(result.getReviewableId());
      System.out.println(result.getReviewableScoreCount());
      System.out.println(result.getReviewableScorePendingCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#likePostAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsLikePostActionResponse> response = client
              .posts
              .likePostAction(id, postActionTypeId, apiKey, apiUsername)
              .flagTopic(flagTopic)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#likePostAction");
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
| **postsLikePostActionRequest** | [**PostsLikePostActionRequest**](PostsLikePostActionRequest.md)|  | [optional] |

### Return type

[**PostsLikePostActionResponse**](PostsLikePostActionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | post updated |  -  |

<a name="listLatestPostsAcrossTopics"></a>
# **listLatestPostsAcrossTopics**
> PostsListLatestPostsAcrossTopicsResponse listLatestPostsAcrossTopics(apiKey, apiUsername).before(before).execute();

List latest posts across topics

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
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
    String before = "before_example"; // Load posts with an id lower than this value. Useful for pagination.
    try {
      PostsListLatestPostsAcrossTopicsResponse result = client
              .posts
              .listLatestPostsAcrossTopics(apiKey, apiUsername)
              .before(before)
              .execute();
      System.out.println(result);
      System.out.println(result.getLatestPosts());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#listLatestPostsAcrossTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsListLatestPostsAcrossTopicsResponse> response = client
              .posts
              .listLatestPostsAcrossTopics(apiKey, apiUsername)
              .before(before)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#listLatestPostsAcrossTopics");
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
| **before** | **String**| Load posts with an id lower than this value. Useful for pagination. | [optional] |

### Return type

[**PostsListLatestPostsAcrossTopicsResponse**](PostsListLatestPostsAcrossTopicsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | latest posts |  -  |

<a name="listRepliesToPost"></a>
# **listRepliesToPost**
> Set&lt;PostsListRepliesToPostResponseInner&gt; listRepliesToPost(id).execute();

List replies to a post

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String id = "id_example";
    try {
      Set<PostsListRepliesToPostResponseInner> result = client
              .posts
              .listRepliesToPost(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#listRepliesToPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Set<PostsListRepliesToPostResponseInner>> response = client
              .posts
              .listRepliesToPost(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#listRepliesToPost");
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
| **id** | **String**|  | |

### Return type

[**Set&lt;PostsListRepliesToPostResponseInner&gt;**](PostsListRepliesToPostResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | post replies |  -  |

<a name="lockPostAction"></a>
# **lockPostAction**
> PostsLockPostActionResponse lockPostAction(apiKey, apiUsername, id).postsLockPostActionRequest(postsLockPostActionRequest).execute();

Lock a post from being edited

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String locked = "locked_example";
    String apiKey = "apiKey_example";
    String apiUsername = "apiUsername_example";
    String id = "id_example";
    try {
      PostsLockPostActionResponse result = client
              .posts
              .lockPostAction(locked, apiKey, apiUsername, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocked());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#lockPostAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsLockPostActionResponse> response = client
              .posts
              .lockPostAction(locked, apiKey, apiUsername, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#lockPostAction");
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
| **postsLockPostActionRequest** | [**PostsLockPostActionRequest**](PostsLockPostActionRequest.md)|  | [optional] |

### Return type

[**PostsLockPostActionResponse**](PostsLockPostActionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | post updated |  -  |

<a name="updateSinglePostJson"></a>
# **updateSinglePostJson**
> PostsUpdateSinglePostJsonResponse updateSinglePostJson(id).postsUpdateSinglePostJsonRequest(postsUpdateSinglePostJsonRequest).execute();

Update a single post

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String id = "id_example";
    PostsUpdateSinglePostJsonRequestPost post = new PostsUpdateSinglePostJsonRequestPost();
    try {
      PostsUpdateSinglePostJsonResponse result = client
              .posts
              .updateSinglePostJson(id)
              .post(post)
              .execute();
      System.out.println(result);
      System.out.println(result.getPost());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#updateSinglePostJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostsUpdateSinglePostJsonResponse> response = client
              .posts
              .updateSinglePostJson(id)
              .post(post)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#updateSinglePostJson");
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
| **id** | **String**|  | |
| **postsUpdateSinglePostJsonRequest** | [**PostsUpdateSinglePostJsonRequest**](PostsUpdateSinglePostJsonRequest.md)|  | [optional] |

### Return type

[**PostsUpdateSinglePostJsonResponse**](PostsUpdateSinglePostJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | post updated |  -  |

