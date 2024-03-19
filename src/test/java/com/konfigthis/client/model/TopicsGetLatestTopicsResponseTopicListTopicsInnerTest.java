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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PrivateMessagesListForUserResponseTopicListTopicsInnerPostersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for TopicsGetLatestTopicsResponseTopicListTopicsInner
 */
public class TopicsGetLatestTopicsResponseTopicListTopicsInnerTest {
    private final TopicsGetLatestTopicsResponseTopicListTopicsInner model = new TopicsGetLatestTopicsResponseTopicListTopicsInner();

    /**
     * Model tests for TopicsGetLatestTopicsResponseTopicListTopicsInner
     */
    @Test
    public void testTopicsGetLatestTopicsResponseTopicListTopicsInner() {
        // TODO: test TopicsGetLatestTopicsResponseTopicListTopicsInner
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'fancyTitle'
     */
    @Test
    public void fancyTitleTest() {
        // TODO: test fancyTitle
    }

    /**
     * Test the property 'slug'
     */
    @Test
    public void slugTest() {
        // TODO: test slug
    }

    /**
     * Test the property 'postsCount'
     */
    @Test
    public void postsCountTest() {
        // TODO: test postsCount
    }

    /**
     * Test the property 'replyCount'
     */
    @Test
    public void replyCountTest() {
        // TODO: test replyCount
    }

    /**
     * Test the property 'highestPostNumber'
     */
    @Test
    public void highestPostNumberTest() {
        // TODO: test highestPostNumber
    }

    /**
     * Test the property 'imageUrl'
     */
    @Test
    public void imageUrlTest() {
        // TODO: test imageUrl
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'lastPostedAt'
     */
    @Test
    public void lastPostedAtTest() {
        // TODO: test lastPostedAt
    }

    /**
     * Test the property 'bumped'
     */
    @Test
    public void bumpedTest() {
        // TODO: test bumped
    }

    /**
     * Test the property 'bumpedAt'
     */
    @Test
    public void bumpedAtTest() {
        // TODO: test bumpedAt
    }

    /**
     * Test the property 'archetype'
     */
    @Test
    public void archetypeTest() {
        // TODO: test archetype
    }

    /**
     * Test the property 'unseen'
     */
    @Test
    public void unseenTest() {
        // TODO: test unseen
    }

    /**
     * Test the property 'lastReadPostNumber'
     */
    @Test
    public void lastReadPostNumberTest() {
        // TODO: test lastReadPostNumber
    }

    /**
     * Test the property 'unreadPosts'
     */
    @Test
    public void unreadPostsTest() {
        // TODO: test unreadPosts
    }

    /**
     * Test the property 'pinned'
     */
    @Test
    public void pinnedTest() {
        // TODO: test pinned
    }

    /**
     * Test the property 'unpinned'
     */
    @Test
    public void unpinnedTest() {
        // TODO: test unpinned
    }

    /**
     * Test the property 'visible'
     */
    @Test
    public void visibleTest() {
        // TODO: test visible
    }

    /**
     * Test the property 'closed'
     */
    @Test
    public void closedTest() {
        // TODO: test closed
    }

    /**
     * Test the property 'archived'
     */
    @Test
    public void archivedTest() {
        // TODO: test archived
    }

    /**
     * Test the property 'notificationLevel'
     */
    @Test
    public void notificationLevelTest() {
        // TODO: test notificationLevel
    }

    /**
     * Test the property 'bookmarked'
     */
    @Test
    public void bookmarkedTest() {
        // TODO: test bookmarked
    }

    /**
     * Test the property 'liked'
     */
    @Test
    public void likedTest() {
        // TODO: test liked
    }

    /**
     * Test the property 'views'
     */
    @Test
    public void viewsTest() {
        // TODO: test views
    }

    /**
     * Test the property 'likeCount'
     */
    @Test
    public void likeCountTest() {
        // TODO: test likeCount
    }

    /**
     * Test the property 'hasSummary'
     */
    @Test
    public void hasSummaryTest() {
        // TODO: test hasSummary
    }

    /**
     * Test the property 'lastPosterUsername'
     */
    @Test
    public void lastPosterUsernameTest() {
        // TODO: test lastPosterUsername
    }

    /**
     * Test the property 'categoryId'
     */
    @Test
    public void categoryIdTest() {
        // TODO: test categoryId
    }

    /**
     * Test the property 'opLikeCount'
     */
    @Test
    public void opLikeCountTest() {
        // TODO: test opLikeCount
    }

    /**
     * Test the property 'pinnedGlobally'
     */
    @Test
    public void pinnedGloballyTest() {
        // TODO: test pinnedGlobally
    }

    /**
     * Test the property 'featuredLink'
     */
    @Test
    public void featuredLinkTest() {
        // TODO: test featuredLink
    }

    /**
     * Test the property 'posters'
     */
    @Test
    public void postersTest() {
        // TODO: test posters
    }

}
