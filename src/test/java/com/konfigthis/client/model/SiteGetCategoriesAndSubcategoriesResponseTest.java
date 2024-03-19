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
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseArchetypesInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseCategoriesInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseGroupsInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseNotificationTypes;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponsePostActionTypesInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponsePostTypes;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseTrustLevels;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseUserColorSchemesInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseUserThemesInner;
import com.konfigthis.client.model.SiteGetCategoriesAndSubcategoriesResponseUserTips;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for SiteGetCategoriesAndSubcategoriesResponse
 */
public class SiteGetCategoriesAndSubcategoriesResponseTest {
    private final SiteGetCategoriesAndSubcategoriesResponse model = new SiteGetCategoriesAndSubcategoriesResponse();

    /**
     * Model tests for SiteGetCategoriesAndSubcategoriesResponse
     */
    @Test
    public void testSiteGetCategoriesAndSubcategoriesResponse() {
        // TODO: test SiteGetCategoriesAndSubcategoriesResponse
    }

    /**
     * Test the property 'defaultArchetype'
     */
    @Test
    public void defaultArchetypeTest() {
        // TODO: test defaultArchetype
    }

    /**
     * Test the property 'notificationTypes'
     */
    @Test
    public void notificationTypesTest() {
        // TODO: test notificationTypes
    }

    /**
     * Test the property 'postTypes'
     */
    @Test
    public void postTypesTest() {
        // TODO: test postTypes
    }

    /**
     * Test the property 'trustLevels'
     */
    @Test
    public void trustLevelsTest() {
        // TODO: test trustLevels
    }

    /**
     * Test the property 'userTips'
     */
    @Test
    public void userTipsTest() {
        // TODO: test userTips
    }

    /**
     * Test the property 'groups'
     */
    @Test
    public void groupsTest() {
        // TODO: test groups
    }

    /**
     * Test the property 'filters'
     */
    @Test
    public void filtersTest() {
        // TODO: test filters
    }

    /**
     * Test the property 'periods'
     */
    @Test
    public void periodsTest() {
        // TODO: test periods
    }

    /**
     * Test the property 'topMenuItems'
     */
    @Test
    public void topMenuItemsTest() {
        // TODO: test topMenuItems
    }

    /**
     * Test the property 'anonymousTopMenuItems'
     */
    @Test
    public void anonymousTopMenuItemsTest() {
        // TODO: test anonymousTopMenuItems
    }

    /**
     * Test the property 'uncategorizedCategoryId'
     */
    @Test
    public void uncategorizedCategoryIdTest() {
        // TODO: test uncategorizedCategoryId
    }

    /**
     * Test the property 'userFieldMaxLength'
     */
    @Test
    public void userFieldMaxLengthTest() {
        // TODO: test userFieldMaxLength
    }

    /**
     * Test the property 'postActionTypes'
     */
    @Test
    public void postActionTypesTest() {
        // TODO: test postActionTypes
    }

    /**
     * Test the property 'topicFlagTypes'
     */
    @Test
    public void topicFlagTypesTest() {
        // TODO: test topicFlagTypes
    }

    /**
     * Test the property 'canCreateTag'
     */
    @Test
    public void canCreateTagTest() {
        // TODO: test canCreateTag
    }

    /**
     * Test the property 'canTagTopics'
     */
    @Test
    public void canTagTopicsTest() {
        // TODO: test canTagTopics
    }

    /**
     * Test the property 'canTagPms'
     */
    @Test
    public void canTagPmsTest() {
        // TODO: test canTagPms
    }

    /**
     * Test the property 'tagsFilterRegexp'
     */
    @Test
    public void tagsFilterRegexpTest() {
        // TODO: test tagsFilterRegexp
    }

    /**
     * Test the property 'topTags'
     */
    @Test
    public void topTagsTest() {
        // TODO: test topTags
    }

    /**
     * Test the property 'wizardRequired'
     */
    @Test
    public void wizardRequiredTest() {
        // TODO: test wizardRequired
    }

    /**
     * Test the property 'canAssociateGroups'
     */
    @Test
    public void canAssociateGroupsTest() {
        // TODO: test canAssociateGroups
    }

    /**
     * Test the property 'topicFeaturedLinkAllowedCategoryIds'
     */
    @Test
    public void topicFeaturedLinkAllowedCategoryIdsTest() {
        // TODO: test topicFeaturedLinkAllowedCategoryIds
    }

    /**
     * Test the property 'userThemes'
     */
    @Test
    public void userThemesTest() {
        // TODO: test userThemes
    }

    /**
     * Test the property 'userColorSchemes'
     */
    @Test
    public void userColorSchemesTest() {
        // TODO: test userColorSchemes
    }

    /**
     * Test the property 'defaultDarkColorScheme'
     */
    @Test
    public void defaultDarkColorSchemeTest() {
        // TODO: test defaultDarkColorScheme
    }

    /**
     * Test the property 'censoredRegexp'
     */
    @Test
    public void censoredRegexpTest() {
        // TODO: test censoredRegexp
    }

    /**
     * Test the property 'customEmojiTranslation'
     */
    @Test
    public void customEmojiTranslationTest() {
        // TODO: test customEmojiTranslation
    }

    /**
     * Test the property 'watchedWordsReplace'
     */
    @Test
    public void watchedWordsReplaceTest() {
        // TODO: test watchedWordsReplace
    }

    /**
     * Test the property 'watchedWordsLink'
     */
    @Test
    public void watchedWordsLinkTest() {
        // TODO: test watchedWordsLink
    }

    /**
     * Test the property 'markdownAdditionalOptions'
     */
    @Test
    public void markdownAdditionalOptionsTest() {
        // TODO: test markdownAdditionalOptions
    }

    /**
     * Test the property 'hashtagConfigurations'
     */
    @Test
    public void hashtagConfigurationsTest() {
        // TODO: test hashtagConfigurations
    }

    /**
     * Test the property 'hashtagIcons'
     */
    @Test
    public void hashtagIconsTest() {
        // TODO: test hashtagIcons
    }

    /**
     * Test the property 'displayedAboutPluginStatGroups'
     */
    @Test
    public void displayedAboutPluginStatGroupsTest() {
        // TODO: test displayedAboutPluginStatGroups
    }

    /**
     * Test the property 'categories'
     */
    @Test
    public void categoriesTest() {
        // TODO: test categories
    }

    /**
     * Test the property 'archetypes'
     */
    @Test
    public void archetypesTest() {
        // TODO: test archetypes
    }

    /**
     * Test the property 'userFields'
     */
    @Test
    public void userFieldsTest() {
        // TODO: test userFields
    }

    /**
     * Test the property 'authProviders'
     */
    @Test
    public void authProvidersTest() {
        // TODO: test authProviders
    }

    /**
     * Test the property 'whispersAllowedGroupsNames'
     */
    @Test
    public void whispersAllowedGroupsNamesTest() {
        // TODO: test whispersAllowedGroupsNames
    }

    /**
     * Test the property 'deniedEmojis'
     */
    @Test
    public void deniedEmojisTest() {
        // TODO: test deniedEmojis
    }

    /**
     * Test the property 'navigationMenuSiteTopTags'
     */
    @Test
    public void navigationMenuSiteTopTagsTest() {
        // TODO: test navigationMenuSiteTopTags
    }

}
