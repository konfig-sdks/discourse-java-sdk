/*
 * Discourse API Documentation
 * This page contains the documentation on how to use Discourse through API calls.  > Note: For any endpoints not listed you can follow the [reverse engineer the Discourse API](https://meta.discourse.org/t/-/20576) guide to figure out how to use an API endpoint.  ### Request Content-Type  The Content-Type for POST and PUT requests can be set to `application/x-www-form-urlencoded`, `multipart/form-data`, or `application/json`.  ### Endpoint Names and Response Content-Type  Most API endpoints provide the same content as their HTML counterparts. For example the URL `/categories` serves a list of categories, the `/categories.json` API provides the same information in JSON format.  Instead of sending API requests to `/categories.json` you may also send them to `/categories` and add an `Accept: application/json` header to the request to get the JSON response. Sending requests with the `Accept` header is necessary if you want to use URLs for related endpoints returned by the API, such as pagination URLs. These URLs are returned without the `.json` prefix so you need to add the header in order to get the correct response format.  ### Authentication  Some endpoints do not require any authentication, pretty much anything else will require you to be authenticated.  To become authenticated you will need to create an API Key from the admin panel.  Once you have your API Key you can pass it in along with your API Username as an HTTP header like this:  ``` curl -X GET \"http://127.0.0.1:3000/admin/users/list/active.json\" \\ -H \"Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19\" \\ -H \"Api-Username: system\" ```  and this is how POST requests will look:  ``` curl -X POST \"http://127.0.0.1:3000/categories\" \\ -H \"Content-Type: multipart/form-data;\" \\ -H \"Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19\" \\ -H \"Api-Username: system\" \\ -F \"name=89853c20-4409-e91a-a8ea-f6cdff96aaaa\" \\ -F \"color=49d9e9\" \\ -F \"text_color=f0fcfd\" ```  ### Boolean values  If an endpoint accepts a boolean be sure to specify it as a lowercase `true` or `false` value unless noted otherwise. 
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.PostsCreateTopicPostMessageRequest;
import com.konfigthis.client.model.PostsCreateTopicPostMessageResponse;
import com.konfigthis.client.model.TopicsCreateTopicTimerRequest;
import com.konfigthis.client.model.TopicsCreateTopicTimerResponse;
import com.konfigthis.client.model.TopicsGetLatestTopicsResponse;
import com.konfigthis.client.model.TopicsGetSingleTopicResponse;
import com.konfigthis.client.model.TopicsGetSpecificPostsRequest;
import com.konfigthis.client.model.TopicsGetSpecificPostsResponse;
import com.konfigthis.client.model.TopicsGetTopTopicsByPeriodResponse;
import com.konfigthis.client.model.TopicsSendInviteToTopicRequest;
import com.konfigthis.client.model.TopicsSendInviteToTopicResponse;
import com.konfigthis.client.model.TopicsSetNotificationLevelRequest;
import com.konfigthis.client.model.TopicsSetNotificationLevelResponse;
import com.konfigthis.client.model.TopicsUpdateStatusOfTopicRequest;
import com.konfigthis.client.model.TopicsUpdateStatusOfTopicResponse;
import com.konfigthis.client.model.TopicsUpdateTimestampJsonRequest;
import com.konfigthis.client.model.TopicsUpdateTimestampJsonResponse;
import com.konfigthis.client.model.TopicsUpdateTopicByIdJsonRequest;
import com.konfigthis.client.model.TopicsUpdateTopicByIdJsonRequestTopic;
import com.konfigthis.client.model.TopicsUpdateTopicByIdJsonResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TopicsApi
 */
@Disabled
public class TopicsApiTest {

    private static TopicsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TopicsApi(apiClient);
    }

    /**
     * Creates a new topic, a new post, or a private message
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTopicPostMessageTest() throws ApiException {
        String raw = null;
        String title = null;
        Integer topicId = null;
        Integer category = null;
        String targetRecipients = null;
        String targetUsernames = null;
        String archetype = null;
        String createdAt = null;
        Integer replyToPostNumber = null;
        String embedUrl = null;
        String externalId = null;
        PostsCreateTopicPostMessageResponse response = api.createTopicPostMessage(raw)
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
        // TODO: test validations
    }

    /**
     * Create topic timer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTopicTimerTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        String time = null;
        String statusType = null;
        Boolean basedOnLastPost = null;
        Integer categoryId = null;
        TopicsCreateTopicTimerResponse response = api.createTopicTimer(apiKey, apiUsername, id)
                .time(time)
                .statusType(statusType)
                .basedOnLastPost(basedOnLastPost)
                .categoryId(categoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get topic by external_id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByExternalIdTest() throws ApiException {
        String externalId = null;
        api.getByExternalId(externalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the latest topics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLatestTopicsTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String order = null;
        String ascending = null;
        TopicsGetLatestTopicsResponse response = api.getLatestTopics(apiKey, apiUsername)
                .order(order)
                .ascending(ascending)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTopicTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        TopicsGetSingleTopicResponse response = api.getSingleTopic(apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get specific posts from a topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificPostsTest() throws ApiException {
        Integer postIds = null;
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        TopicsGetSpecificPostsResponse response = api.getSpecificPosts(postIds, apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the top topics filtered by period
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopTopicsByPeriodTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String period = null;
        TopicsGetTopTopicsByPeriodResponse response = api.getTopTopicsByPeriod(apiKey, apiUsername)
                .period(period)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTopicByIdTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        api.removeTopicById(apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Invite to topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendInviteToTopicTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        String user = null;
        String email = null;
        TopicsSendInviteToTopicResponse response = api.sendInviteToTopic(apiKey, apiUsername, id)
                .user(user)
                .email(email)
                .execute();
        // TODO: test validations
    }

    /**
     * Set notification level
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setNotificationLevelTest() throws ApiException {
        String notificationLevel = null;
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        TopicsSetNotificationLevelResponse response = api.setNotificationLevel(notificationLevel, apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Bookmark topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBookmarkTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        api.updateBookmark(apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update the status of a topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusOfTopicTest() throws ApiException {
        String status = null;
        String enabled = null;
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        String until = null;
        TopicsUpdateStatusOfTopicResponse response = api.updateStatusOfTopic(status, enabled, apiKey, apiUsername, id)
                .until(until)
                .execute();
        // TODO: test validations
    }

    /**
     * Update topic timestamp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTimestampJsonTest() throws ApiException {
        String timestamp = null;
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        TopicsUpdateTimestampJsonResponse response = api.updateTimestampJson(timestamp, apiKey, apiUsername, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a topic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTopicByIdJsonTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String id = null;
        TopicsUpdateTopicByIdJsonRequestTopic topic = null;
        TopicsUpdateTopicByIdJsonResponse response = api.updateTopicByIdJson(apiKey, apiUsername, id)
                .topic(topic)
                .execute();
        // TODO: test validations
    }

}
