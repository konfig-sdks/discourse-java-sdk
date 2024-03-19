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
import com.konfigthis.client.model.PostsCreateTopicPostMessageResponseActionsSummaryInner;
import com.konfigthis.client.model.TopicsGetSingleTopicResponsePostStreamPostsInnerLinkCountsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for TopicsGetSingleTopicResponsePostStreamPostsInner
 */
public class TopicsGetSingleTopicResponsePostStreamPostsInnerTest {
    private final TopicsGetSingleTopicResponsePostStreamPostsInner model = new TopicsGetSingleTopicResponsePostStreamPostsInner();

    /**
     * Model tests for TopicsGetSingleTopicResponsePostStreamPostsInner
     */
    @Test
    public void testTopicsGetSingleTopicResponsePostStreamPostsInner() {
        // TODO: test TopicsGetSingleTopicResponsePostStreamPostsInner
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'avatarTemplate'
     */
    @Test
    public void avatarTemplateTest() {
        // TODO: test avatarTemplate
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'cooked'
     */
    @Test
    public void cookedTest() {
        // TODO: test cooked
    }

    /**
     * Test the property 'postNumber'
     */
    @Test
    public void postNumberTest() {
        // TODO: test postNumber
    }

    /**
     * Test the property 'postType'
     */
    @Test
    public void postTypeTest() {
        // TODO: test postType
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'replyCount'
     */
    @Test
    public void replyCountTest() {
        // TODO: test replyCount
    }

    /**
     * Test the property 'replyToPostNumber'
     */
    @Test
    public void replyToPostNumberTest() {
        // TODO: test replyToPostNumber
    }

    /**
     * Test the property 'quoteCount'
     */
    @Test
    public void quoteCountTest() {
        // TODO: test quoteCount
    }

    /**
     * Test the property 'incomingLinkCount'
     */
    @Test
    public void incomingLinkCountTest() {
        // TODO: test incomingLinkCount
    }

    /**
     * Test the property 'reads'
     */
    @Test
    public void readsTest() {
        // TODO: test reads
    }

    /**
     * Test the property 'readersCount'
     */
    @Test
    public void readersCountTest() {
        // TODO: test readersCount
    }

    /**
     * Test the property 'score'
     */
    @Test
    public void scoreTest() {
        // TODO: test score
    }

    /**
     * Test the property 'yours'
     */
    @Test
    public void yoursTest() {
        // TODO: test yours
    }

    /**
     * Test the property 'topicId'
     */
    @Test
    public void topicIdTest() {
        // TODO: test topicId
    }

    /**
     * Test the property 'topicSlug'
     */
    @Test
    public void topicSlugTest() {
        // TODO: test topicSlug
    }

    /**
     * Test the property 'displayUsername'
     */
    @Test
    public void displayUsernameTest() {
        // TODO: test displayUsername
    }

    /**
     * Test the property 'primaryGroupName'
     */
    @Test
    public void primaryGroupNameTest() {
        // TODO: test primaryGroupName
    }

    /**
     * Test the property 'flairName'
     */
    @Test
    public void flairNameTest() {
        // TODO: test flairName
    }

    /**
     * Test the property 'flairUrl'
     */
    @Test
    public void flairUrlTest() {
        // TODO: test flairUrl
    }

    /**
     * Test the property 'flairBgColor'
     */
    @Test
    public void flairBgColorTest() {
        // TODO: test flairBgColor
    }

    /**
     * Test the property 'flairColor'
     */
    @Test
    public void flairColorTest() {
        // TODO: test flairColor
    }

    /**
     * Test the property 'canEdit'
     */
    @Test
    public void canEditTest() {
        // TODO: test canEdit
    }

    /**
     * Test the property 'canDelete'
     */
    @Test
    public void canDeleteTest() {
        // TODO: test canDelete
    }

    /**
     * Test the property 'canRecover'
     */
    @Test
    public void canRecoverTest() {
        // TODO: test canRecover
    }

    /**
     * Test the property 'canSeeHiddenPost'
     */
    @Test
    public void canSeeHiddenPostTest() {
        // TODO: test canSeeHiddenPost
    }

    /**
     * Test the property 'canWiki'
     */
    @Test
    public void canWikiTest() {
        // TODO: test canWiki
    }

    /**
     * Test the property 'linkCounts'
     */
    @Test
    public void linkCountsTest() {
        // TODO: test linkCounts
    }

    /**
     * Test the property 'read'
     */
    @Test
    public void readTest() {
        // TODO: test read
    }

    /**
     * Test the property 'userTitle'
     */
    @Test
    public void userTitleTest() {
        // TODO: test userTitle
    }

    /**
     * Test the property 'bookmarked'
     */
    @Test
    public void bookmarkedTest() {
        // TODO: test bookmarked
    }

    /**
     * Test the property 'actionsSummary'
     */
    @Test
    public void actionsSummaryTest() {
        // TODO: test actionsSummary
    }

    /**
     * Test the property 'moderator'
     */
    @Test
    public void moderatorTest() {
        // TODO: test moderator
    }

    /**
     * Test the property 'admin'
     */
    @Test
    public void adminTest() {
        // TODO: test admin
    }

    /**
     * Test the property 'staff'
     */
    @Test
    public void staffTest() {
        // TODO: test staff
    }

    /**
     * Test the property 'userId'
     */
    @Test
    public void userIdTest() {
        // TODO: test userId
    }

    /**
     * Test the property 'hidden'
     */
    @Test
    public void hiddenTest() {
        // TODO: test hidden
    }

    /**
     * Test the property 'trustLevel'
     */
    @Test
    public void trustLevelTest() {
        // TODO: test trustLevel
    }

    /**
     * Test the property 'deletedAt'
     */
    @Test
    public void deletedAtTest() {
        // TODO: test deletedAt
    }

    /**
     * Test the property 'userDeleted'
     */
    @Test
    public void userDeletedTest() {
        // TODO: test userDeleted
    }

    /**
     * Test the property 'editReason'
     */
    @Test
    public void editReasonTest() {
        // TODO: test editReason
    }

    /**
     * Test the property 'canViewEditHistory'
     */
    @Test
    public void canViewEditHistoryTest() {
        // TODO: test canViewEditHistory
    }

    /**
     * Test the property 'wiki'
     */
    @Test
    public void wikiTest() {
        // TODO: test wiki
    }

    /**
     * Test the property 'reviewableId'
     */
    @Test
    public void reviewableIdTest() {
        // TODO: test reviewableId
    }

    /**
     * Test the property 'reviewableScoreCount'
     */
    @Test
    public void reviewableScoreCountTest() {
        // TODO: test reviewableScoreCount
    }

    /**
     * Test the property 'reviewableScorePendingCount'
     */
    @Test
    public void reviewableScorePendingCountTest() {
        // TODO: test reviewableScorePendingCount
    }

}
