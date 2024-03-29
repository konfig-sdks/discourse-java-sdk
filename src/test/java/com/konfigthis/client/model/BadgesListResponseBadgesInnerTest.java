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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for BadgesListResponseBadgesInner
 */
public class BadgesListResponseBadgesInnerTest {
    private final BadgesListResponseBadgesInner model = new BadgesListResponseBadgesInner();

    /**
     * Model tests for BadgesListResponseBadgesInner
     */
    @Test
    public void testBadgesListResponseBadgesInner() {
        // TODO: test BadgesListResponseBadgesInner
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
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
     * Test the property 'grantCount'
     */
    @Test
    public void grantCountTest() {
        // TODO: test grantCount
    }

    /**
     * Test the property 'allowTitle'
     */
    @Test
    public void allowTitleTest() {
        // TODO: test allowTitle
    }

    /**
     * Test the property 'multipleGrant'
     */
    @Test
    public void multipleGrantTest() {
        // TODO: test multipleGrant
    }

    /**
     * Test the property 'icon'
     */
    @Test
    public void iconTest() {
        // TODO: test icon
    }

    /**
     * Test the property 'imageUrl'
     */
    @Test
    public void imageUrlTest() {
        // TODO: test imageUrl
    }

    /**
     * Test the property 'listable'
     */
    @Test
    public void listableTest() {
        // TODO: test listable
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'badgeGroupingId'
     */
    @Test
    public void badgeGroupingIdTest() {
        // TODO: test badgeGroupingId
    }

    /**
     * Test the property 'system'
     */
    @Test
    public void systemTest() {
        // TODO: test system
    }

    /**
     * Test the property 'longDescription'
     */
    @Test
    public void longDescriptionTest() {
        // TODO: test longDescription
    }

    /**
     * Test the property 'slug'
     */
    @Test
    public void slugTest() {
        // TODO: test slug
    }

    /**
     * Test the property 'manuallyGrantable'
     */
    @Test
    public void manuallyGrantableTest() {
        // TODO: test manuallyGrantable
    }

    /**
     * Test the property 'query'
     */
    @Test
    public void queryTest() {
        // TODO: test query
    }

    /**
     * Test the property 'trigger'
     */
    @Test
    public void triggerTest() {
        // TODO: test trigger
    }

    /**
     * Test the property 'targetPosts'
     */
    @Test
    public void targetPostsTest() {
        // TODO: test targetPosts
    }

    /**
     * Test the property 'autoRevoke'
     */
    @Test
    public void autoRevokeTest() {
        // TODO: test autoRevoke
    }

    /**
     * Test the property 'showPosts'
     */
    @Test
    public void showPostsTest() {
        // TODO: test showPosts
    }

    /**
     * Test the property 'i18nName'
     */
    @Test
    public void i18nNameTest() {
        // TODO: test i18nName
    }

    /**
     * Test the property 'badgeTypeId'
     */
    @Test
    public void badgeTypeIdTest() {
        // TODO: test badgeTypeId
    }

}
