<div align="left">

[![Visit Discourse](./header.png)](https://discourse.org)

# [Discourse](https://discourse.org)

This page contains the documentation on how to use Discourse through API calls.

> Note: For any endpoints not listed you can follow the
[reverse engineer the Discourse API](https://meta.discourse.org/t/-/20576)
guide to figure out how to use an API endpoint.

### Request Content-Type

The Content-Type for POST and PUT requests can be set to `application/x-www-form-urlencoded`,
`multipart/form-data`, or `application/json`.

### Endpoint Names and Response Content-Type

Most API endpoints provide the same content as their HTML counterparts. For example
the URL `/categories` serves a list of categories, the `/categories.json` API provides the
same information in JSON format.

Instead of sending API requests to `/categories.json` you may also send them to `/categories`
and add an `Accept: application/json` header to the request to get the JSON response.
Sending requests with the `Accept` header is necessary if you want to use URLs
for related endpoints returned by the API, such as pagination URLs.
These URLs are returned without the `.json` prefix so you need to add the header in
order to get the correct response format.

### Authentication

Some endpoints do not require any authentication, pretty much anything else will
require you to be authenticated.

To become authenticated you will need to create an API Key from the admin panel.

Once you have your API Key you can pass it in along with your API Username
as an HTTP header like this:

```
curl -X GET "http://127.0.0.1:3000/admin/users/list/active.json" \
-H "Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19" \
-H "Api-Username: system"
```

and this is how POST requests will look:

```
curl -X POST "http://127.0.0.1:3000/categories" \
-H "Content-Type: multipart/form-data;" \
-H "Api-Key: 714552c6148e1617aeab526d0606184b94a80ec048fc09894ff1a72b740c5f19" \
-H "Api-Username: system" \
-F "name=89853c20-4409-e91a-a8ea-f6cdff96aaaa" \
-F "color=49d9e9" \
-F "text_color=f0fcfd"
```

### Boolean values

If an endpoint accepts a boolean be sure to specify it as a lowercase
`true` or `false` value unless noted otherwise.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Discourse&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>discourse-java-sdk</artifactId>
  <version>latest</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:discourse-java-sdk:latest"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/discourse-java-sdk-latest.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
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
              .admin
              .activateUser(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#activateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersActivateUserResponse> response = client
              .admin
              .activateUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#activateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://discourse.example.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**activateUser**](docs/AdminApi.md#activateUser) | **PUT** /admin/users/{id}/activate.json | Activate a user
*AdminApi* | [**anonymizeByIdJson**](docs/AdminApi.md#anonymizeByIdJson) | **PUT** /admin/users/{id}/anonymize.json | Anonymize a user
*AdminApi* | [**deactivateUser**](docs/AdminApi.md#deactivateUser) | **PUT** /admin/users/{id}/deactivate.json | Deactivate a user
*AdminApi* | [**deleteUserByIdJson**](docs/AdminApi.md#deleteUserByIdJson) | **DELETE** /admin/users/{id}.json | Delete a user
*AdminApi* | [**getListOfUsers**](docs/AdminApi.md#getListOfUsers) | **GET** /admin/users/list/{flag}.json | Get a list of users
*AdminApi* | [**getUserByIdJson**](docs/AdminApi.md#getUserByIdJson) | **GET** /admin/users/{id}.json | Get a user by id
*AdminApi* | [**logOutUserAction**](docs/AdminApi.md#logOutUserAction) | **POST** /admin/users/{id}/log_out.json | Log a user out
*AdminApi* | [**refreshGravatarPost**](docs/AdminApi.md#refreshGravatarPost) | **POST** /user_avatar/{username}/refresh_gravatar.json | Refresh gravatar
*AdminApi* | [**silenceById**](docs/AdminApi.md#silenceById) | **PUT** /admin/users/{id}/silence.json | Silence a user
*AdminApi* | [**suspendByIdJson**](docs/AdminApi.md#suspendByIdJson) | **PUT** /admin/users/{id}/suspend.json | Suspend a user
*BackupsApi* | [**createBackupRequest**](docs/BackupsApi.md#createBackupRequest) | **POST** /admin/backups.json | Create backup
*BackupsApi* | [**downloadBackup**](docs/BackupsApi.md#downloadBackup) | **GET** /admin/backups/{filename} | Download backup
*BackupsApi* | [**list**](docs/BackupsApi.md#list) | **GET** /admin/backups.json | List backups
*BackupsApi* | [**sendDownloadBackupEmail**](docs/BackupsApi.md#sendDownloadBackupEmail) | **PUT** /admin/backups/{filename} | Send download backup email
*BadgesApi* | [**createBadge**](docs/BadgesApi.md#createBadge) | **POST** /admin/badges.json | Create badge
*BadgesApi* | [**deleteByIdJson**](docs/BadgesApi.md#deleteByIdJson) | **DELETE** /admin/badges/{id}.json | Delete badge
*BadgesApi* | [**list**](docs/BadgesApi.md#list) | **GET** /admin/badges.json | List badges
*BadgesApi* | [**listUserBadges**](docs/BadgesApi.md#listUserBadges) | **GET** /user-badges/{username}.json | List badges for a user
*BadgesApi* | [**updateBadgeByIdJson**](docs/BadgesApi.md#updateBadgeByIdJson) | **PUT** /admin/badges/{id}.json | Update badge
*CategoriesApi* | [**createCategoryRequest**](docs/CategoriesApi.md#createCategoryRequest) | **POST** /categories.json | Creates a category
*CategoriesApi* | [**getCategoriesAndSubcategories**](docs/CategoriesApi.md#getCategoriesAndSubcategories) | **GET** /site.json | Get site info
*CategoriesApi* | [**getCategoryByIdJson**](docs/CategoriesApi.md#getCategoryByIdJson) | **GET** /c/{id}/show.json | Show category
*CategoriesApi* | [**list**](docs/CategoriesApi.md#list) | **GET** /categories.json | Retrieves a list of categories
*CategoriesApi* | [**listTopics**](docs/CategoriesApi.md#listTopics) | **GET** /c/{slug}/{id}.json | List topics
*CategoriesApi* | [**updateCategoryByIdJson**](docs/CategoriesApi.md#updateCategoryByIdJson) | **PUT** /categories/{id}.json | Updates a category
*GroupsApi* | [**addMembersToGroup**](docs/GroupsApi.md#addMembersToGroup) | **PUT** /groups/{id}/members.json | Add group members
*GroupsApi* | [**createNewGroup**](docs/GroupsApi.md#createNewGroup) | **POST** /admin/groups.json | Create a group
*GroupsApi* | [**deleteGroupByIdJson**](docs/GroupsApi.md#deleteGroupByIdJson) | **DELETE** /admin/groups/{id}.json | Delete a group
*GroupsApi* | [**getGroupById**](docs/GroupsApi.md#getGroupById) | **GET** /groups/{id}.json | Get a group
*GroupsApi* | [**list**](docs/GroupsApi.md#list) | **GET** /groups.json | List groups
*GroupsApi* | [**listMembersJson**](docs/GroupsApi.md#listMembersJson) | **GET** /groups/{id}/members.json | List group members
*GroupsApi* | [**removeMembers**](docs/GroupsApi.md#removeMembers) | **DELETE** /groups/{id}/members.json | Remove group members
*GroupsApi* | [**updateGroupByIdJson**](docs/GroupsApi.md#updateGroupByIdJson) | **PUT** /groups/{id}.json | Update a group
*InvitesApi* | [**createInvite**](docs/InvitesApi.md#createInvite) | **POST** /invites.json | Create an invite
*InvitesApi* | [**createMultipleInvites**](docs/InvitesApi.md#createMultipleInvites) | **POST** /invites/create-multiple.json | Create multiple invites
*InvitesApi* | [**sendInviteToTopic**](docs/InvitesApi.md#sendInviteToTopic) | **POST** /t/{id}/invite.json | Invite to topic
*NotificationsApi* | [**getUserNotifications**](docs/NotificationsApi.md#getUserNotifications) | **GET** /notifications.json | Get the notifications that belong to the current user
*NotificationsApi* | [**markAsRead**](docs/NotificationsApi.md#markAsRead) | **PUT** /notifications/mark-read.json | Mark notifications as read
*PostsApi* | [**createTopicPostMessage**](docs/PostsApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message
*PostsApi* | [**deleteSinglePost**](docs/PostsApi.md#deleteSinglePost) | **DELETE** /posts/{id}.json | delete a single post
*PostsApi* | [**getSinglePostLikes**](docs/PostsApi.md#getSinglePostLikes) | **GET** /posts/{id}.json | Retrieve a single post
*PostsApi* | [**likePostAction**](docs/PostsApi.md#likePostAction) | **POST** /post_actions.json | Like a post and other actions
*PostsApi* | [**listLatestPostsAcrossTopics**](docs/PostsApi.md#listLatestPostsAcrossTopics) | **GET** /posts.json | List latest posts across topics
*PostsApi* | [**listRepliesToPost**](docs/PostsApi.md#listRepliesToPost) | **GET** /posts/{id}/replies.json | List replies to a post
*PostsApi* | [**lockPostAction**](docs/PostsApi.md#lockPostAction) | **PUT** /posts/{id}/locked.json | Lock a post from being edited
*PostsApi* | [**updateSinglePostJson**](docs/PostsApi.md#updateSinglePostJson) | **PUT** /posts/{id}.json | Update a single post
*PrivateMessagesApi* | [**createTopicPostMessage**](docs/PrivateMessagesApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message
*PrivateMessagesApi* | [**listForUser**](docs/PrivateMessagesApi.md#listForUser) | **GET** /topics/private-messages/{username}.json | Get a list of private messages for a user
*PrivateMessagesApi* | [**listSentForUser**](docs/PrivateMessagesApi.md#listSentForUser) | **GET** /topics/private-messages-sent/{username}.json | Get a list of private messages sent for a user
*SearchApi* | [**termResults**](docs/SearchApi.md#termResults) | **GET** /search.json | Search for a term
*SiteApi* | [**getCategoriesAndSubcategories**](docs/SiteApi.md#getCategoriesAndSubcategories) | **GET** /site.json | Get site info
*TagsApi* | [**createTagGroup**](docs/TagsApi.md#createTagGroup) | **POST** /tag_groups.json | Creates a tag group
*TagsApi* | [**getSingleTagGroup**](docs/TagsApi.md#getSingleTagGroup) | **GET** /tag_groups/{id}.json | Get a single tag group
*TagsApi* | [**getSpecificTag**](docs/TagsApi.md#getSpecificTag) | **GET** /tag/{name}.json | Get a specific tag
*TagsApi* | [**getTagGroups**](docs/TagsApi.md#getTagGroups) | **GET** /tag_groups.json | Get a list of tag groups
*TagsApi* | [**list**](docs/TagsApi.md#list) | **GET** /tags.json | Get a list of tags
*TagsApi* | [**updateTagGroup**](docs/TagsApi.md#updateTagGroup) | **PUT** /tag_groups/{id}.json | Update tag group
*TopicsApi* | [**createTopicPostMessage**](docs/TopicsApi.md#createTopicPostMessage) | **POST** /posts.json | Creates a new topic, a new post, or a private message
*TopicsApi* | [**createTopicTimer**](docs/TopicsApi.md#createTopicTimer) | **POST** /t/{id}/timer.json | Create topic timer
*TopicsApi* | [**getByExternalId**](docs/TopicsApi.md#getByExternalId) | **GET** /t/external_id/{external_id}.json | Get topic by external_id
*TopicsApi* | [**getLatestTopics**](docs/TopicsApi.md#getLatestTopics) | **GET** /latest.json | Get the latest topics
*TopicsApi* | [**getSingleTopic**](docs/TopicsApi.md#getSingleTopic) | **GET** /t/{id}.json | Get a single topic
*TopicsApi* | [**getSpecificPosts**](docs/TopicsApi.md#getSpecificPosts) | **GET** /t/{id}/posts.json | Get specific posts from a topic
*TopicsApi* | [**getTopTopicsByPeriod**](docs/TopicsApi.md#getTopTopicsByPeriod) | **GET** /top.json | Get the top topics filtered by period
*TopicsApi* | [**removeTopicById**](docs/TopicsApi.md#removeTopicById) | **DELETE** /t/{id}.json | Remove a topic
*TopicsApi* | [**sendInviteToTopic**](docs/TopicsApi.md#sendInviteToTopic) | **POST** /t/{id}/invite.json | Invite to topic
*TopicsApi* | [**setNotificationLevel**](docs/TopicsApi.md#setNotificationLevel) | **POST** /t/{id}/notifications.json | Set notification level
*TopicsApi* | [**updateBookmark**](docs/TopicsApi.md#updateBookmark) | **PUT** /t/{id}/bookmark.json | Bookmark topic
*TopicsApi* | [**updateStatusOfTopic**](docs/TopicsApi.md#updateStatusOfTopic) | **PUT** /t/{id}/status.json | Update the status of a topic
*TopicsApi* | [**updateTimestampJson**](docs/TopicsApi.md#updateTimestampJson) | **PUT** /t/{id}/change-timestamp.json | Update topic timestamp
*TopicsApi* | [**updateTopicByIdJson**](docs/TopicsApi.md#updateTopicByIdJson) | **PUT** /t/-/{id}.json | Update a topic
*UploadsApi* | [**abortMultipartUpload**](docs/UploadsApi.md#abortMultipartUpload) | **POST** /uploads/abort-multipart.json | Abort multipart upload
*UploadsApi* | [**completeExternalUpload**](docs/UploadsApi.md#completeExternalUpload) | **POST** /uploads/complete-external-upload.json | Completes a direct external upload
*UploadsApi* | [**completeMultipartUpload**](docs/UploadsApi.md#completeMultipartUpload) | **POST** /uploads/complete-multipart.json | Complete multipart upload
*UploadsApi* | [**createMultipartExternalUpload**](docs/UploadsApi.md#createMultipartExternalUpload) | **POST** /uploads/create-multipart.json | Creates a multipart external upload
*UploadsApi* | [**createNewUpload**](docs/UploadsApi.md#createNewUpload) | **POST** /uploads.json | Creates an upload
*UploadsApi* | [**generatePresignedUrlsForMultipartParts**](docs/UploadsApi.md#generatePresignedUrlsForMultipartParts) | **POST** /uploads/batch-presign-multipart-parts.json | Generates batches of presigned URLs for multipart parts
*UploadsApi* | [**initiateDirectExternalUpload**](docs/UploadsApi.md#initiateDirectExternalUpload) | **POST** /uploads/generate-presigned-put.json | Initiates a direct external upload
*UsersApi* | [**activateUser**](docs/UsersApi.md#activateUser) | **PUT** /admin/users/{id}/activate.json | Activate a user
*UsersApi* | [**anonymizeByIdJson**](docs/UsersApi.md#anonymizeByIdJson) | **PUT** /admin/users/{id}/anonymize.json | Anonymize a user
*UsersApi* | [**changePasswordAction**](docs/UsersApi.md#changePasswordAction) | **PUT** /users/password-reset/{token}.json | Change password
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users.json | Creates a user
*UsersApi* | [**deactivateUser**](docs/UsersApi.md#deactivateUser) | **PUT** /admin/users/{id}/deactivate.json | Deactivate a user
*UsersApi* | [**deleteUserByIdJson**](docs/UsersApi.md#deleteUserByIdJson) | **DELETE** /admin/users/{id}.json | Delete a user
*UsersApi* | [**getEmails**](docs/UsersApi.md#getEmails) | **GET** /u/{username}/emails.json | Get email addresses belonging to a user
*UsersApi* | [**getIdentityProviderExternalId**](docs/UsersApi.md#getIdentityProviderExternalId) | **GET** /u/by-external/{provider}/{external_id}.json | Get a user by identity provider external ID
*UsersApi* | [**getListOfUsers**](docs/UsersApi.md#getListOfUsers) | **GET** /admin/users/list/{flag}.json | Get a list of users
*UsersApi* | [**getUserByExternalId**](docs/UsersApi.md#getUserByExternalId) | **GET** /u/by-external/{external_id}.json | Get a user by external_id
*UsersApi* | [**getUserByIdJson**](docs/UsersApi.md#getUserByIdJson) | **GET** /admin/users/{id}.json | Get a user by id
*UsersApi* | [**getUserByUsername**](docs/UsersApi.md#getUserByUsername) | **GET** /u/{username}.json | Get a single user by username
*UsersApi* | [**listPublicUser**](docs/UsersApi.md#listPublicUser) | **GET** /directory_items.json | Get a public list of users
*UsersApi* | [**listUserActions**](docs/UsersApi.md#listUserActions) | **GET** /user_actions.json | Get a list of user actions
*UsersApi* | [**listUserBadges**](docs/UsersApi.md#listUserBadges) | **GET** /user-badges/{username}.json | List badges for a user
*UsersApi* | [**logOutUserAction**](docs/UsersApi.md#logOutUserAction) | **POST** /admin/users/{id}/log_out.json | Log a user out
*UsersApi* | [**refreshGravatarPost**](docs/UsersApi.md#refreshGravatarPost) | **POST** /user_avatar/{username}/refresh_gravatar.json | Refresh gravatar
*UsersApi* | [**sendPasswordResetEmail**](docs/UsersApi.md#sendPasswordResetEmail) | **POST** /session/forgot_password.json | Send password reset email
*UsersApi* | [**silenceById**](docs/UsersApi.md#silenceById) | **PUT** /admin/users/{id}/silence.json | Silence a user
*UsersApi* | [**suspendByIdJson**](docs/UsersApi.md#suspendByIdJson) | **PUT** /admin/users/{id}/suspend.json | Suspend a user
*UsersApi* | [**updateAvatar**](docs/UsersApi.md#updateAvatar) | **PUT** /u/{username}/preferences/avatar/pick.json | Update avatar
*UsersApi* | [**updateEmailPreferences**](docs/UsersApi.md#updateEmailPreferences) | **PUT** /u/{username}/preferences/email.json | Update email
*UsersApi* | [**updatePreferencesJson**](docs/UsersApi.md#updatePreferencesJson) | **PUT** /u/{username}/preferences/username.json | Update username
*UsersApi* | [**updateUserDetails**](docs/UsersApi.md#updateUserDetails) | **PUT** /u/{username}.json | Update a user


## Documentation for Models

 - [BackupsCreateBackupRequestRequest](docs/BackupsCreateBackupRequestRequest.md)
 - [BackupsCreateBackupRequestResponse](docs/BackupsCreateBackupRequestResponse.md)
 - [BackupsListResponseInner](docs/BackupsListResponseInner.md)
 - [BadgesCreateBadgeRequest](docs/BadgesCreateBadgeRequest.md)
 - [BadgesCreateBadgeResponse](docs/BadgesCreateBadgeResponse.md)
 - [BadgesCreateBadgeResponseBadge](docs/BadgesCreateBadgeResponseBadge.md)
 - [BadgesListResponse](docs/BadgesListResponse.md)
 - [BadgesListResponseAdminBadges](docs/BadgesListResponseAdminBadges.md)
 - [BadgesListResponseAdminBadgesTriggers](docs/BadgesListResponseAdminBadgesTriggers.md)
 - [BadgesListResponseBadgeGroupingsInner](docs/BadgesListResponseBadgeGroupingsInner.md)
 - [BadgesListResponseBadgeTypesInner](docs/BadgesListResponseBadgeTypesInner.md)
 - [BadgesListResponseBadgesInner](docs/BadgesListResponseBadgesInner.md)
 - [BadgesListUserBadgesResponse](docs/BadgesListUserBadgesResponse.md)
 - [BadgesListUserBadgesResponseBadgesInner](docs/BadgesListUserBadgesResponseBadgesInner.md)
 - [BadgesListUserBadgesResponseGrantedBiesInner](docs/BadgesListUserBadgesResponseGrantedBiesInner.md)
 - [BadgesListUserBadgesResponseUserBadgesInner](docs/BadgesListUserBadgesResponseUserBadgesInner.md)
 - [BadgesUpdateBadgeByIdJsonRequest](docs/BadgesUpdateBadgeByIdJsonRequest.md)
 - [BadgesUpdateBadgeByIdJsonResponse](docs/BadgesUpdateBadgeByIdJsonResponse.md)
 - [CategoriesCreateCategoryRequestRequest](docs/CategoriesCreateCategoryRequestRequest.md)
 - [CategoriesCreateCategoryRequestRequestPermissions](docs/CategoriesCreateCategoryRequestRequestPermissions.md)
 - [CategoriesCreateCategoryRequestResponse](docs/CategoriesCreateCategoryRequestResponse.md)
 - [CategoriesCreateCategoryRequestResponseCategory](docs/CategoriesCreateCategoryRequestResponseCategory.md)
 - [CategoriesCreateCategoryRequestResponseCategoryGroupPermissionsInner](docs/CategoriesCreateCategoryRequestResponseCategoryGroupPermissionsInner.md)
 - [CategoriesCreateCategoryRequestResponseCategoryRequiredTagGroupsInner](docs/CategoriesCreateCategoryRequestResponseCategoryRequiredTagGroupsInner.md)
 - [CategoriesGetCategoryByIdJsonResponse](docs/CategoriesGetCategoryByIdJsonResponse.md)
 - [CategoriesListResponse](docs/CategoriesListResponse.md)
 - [CategoriesListResponseCategoryList](docs/CategoriesListResponseCategoryList.md)
 - [CategoriesListResponseCategoryListCategoriesInner](docs/CategoriesListResponseCategoryListCategoriesInner.md)
 - [CategoriesListTopicsResponse](docs/CategoriesListTopicsResponse.md)
 - [CategoriesListTopicsResponseTopicList](docs/CategoriesListTopicsResponseTopicList.md)
 - [CategoriesListTopicsResponseTopicListTopicsInner](docs/CategoriesListTopicsResponseTopicListTopicsInner.md)
 - [CategoriesListTopicsResponseTopicListTopicsInnerPostersInner](docs/CategoriesListTopicsResponseTopicListTopicsInnerPostersInner.md)
 - [CategoriesListTopicsResponseUsersInner](docs/CategoriesListTopicsResponseUsersInner.md)
 - [CategoriesUpdateCategoryByIdJsonRequest](docs/CategoriesUpdateCategoryByIdJsonRequest.md)
 - [CategoriesUpdateCategoryByIdJsonRequestPermissions](docs/CategoriesUpdateCategoryByIdJsonRequestPermissions.md)
 - [CategoriesUpdateCategoryByIdJsonResponse](docs/CategoriesUpdateCategoryByIdJsonResponse.md)
 - [CategoriesUpdateCategoryByIdJsonResponseCategory](docs/CategoriesUpdateCategoryByIdJsonResponseCategory.md)
 - [GroupsAddMembersToGroupRequest](docs/GroupsAddMembersToGroupRequest.md)
 - [GroupsAddMembersToGroupResponse](docs/GroupsAddMembersToGroupResponse.md)
 - [GroupsCreateNewGroupRequest](docs/GroupsCreateNewGroupRequest.md)
 - [GroupsCreateNewGroupRequestGroup](docs/GroupsCreateNewGroupRequestGroup.md)
 - [GroupsCreateNewGroupResponse](docs/GroupsCreateNewGroupResponse.md)
 - [GroupsCreateNewGroupResponseBasicGroup](docs/GroupsCreateNewGroupResponseBasicGroup.md)
 - [GroupsDeleteGroupByIdJsonResponse](docs/GroupsDeleteGroupByIdJsonResponse.md)
 - [GroupsGetGroupByIdResponse](docs/GroupsGetGroupByIdResponse.md)
 - [GroupsGetGroupByIdResponseExtras](docs/GroupsGetGroupByIdResponseExtras.md)
 - [GroupsGetGroupByIdResponseGroup](docs/GroupsGetGroupByIdResponseGroup.md)
 - [GroupsListMembersJsonResponse](docs/GroupsListMembersJsonResponse.md)
 - [GroupsListMembersJsonResponseMembersInner](docs/GroupsListMembersJsonResponseMembersInner.md)
 - [GroupsListMembersJsonResponseMeta](docs/GroupsListMembersJsonResponseMeta.md)
 - [GroupsListResponse](docs/GroupsListResponse.md)
 - [GroupsListResponseExtras](docs/GroupsListResponseExtras.md)
 - [GroupsListResponseGroupsInner](docs/GroupsListResponseGroupsInner.md)
 - [GroupsRemoveMembersRequest](docs/GroupsRemoveMembersRequest.md)
 - [GroupsRemoveMembersResponse](docs/GroupsRemoveMembersResponse.md)
 - [GroupsUpdateGroupByIdJsonRequest](docs/GroupsUpdateGroupByIdJsonRequest.md)
 - [GroupsUpdateGroupByIdJsonResponse](docs/GroupsUpdateGroupByIdJsonResponse.md)
 - [InvitesCreateInviteRequest](docs/InvitesCreateInviteRequest.md)
 - [InvitesCreateInviteResponse](docs/InvitesCreateInviteResponse.md)
 - [InvitesCreateMultipleInvitesRequest](docs/InvitesCreateMultipleInvitesRequest.md)
 - [InvitesCreateMultipleInvitesResponse](docs/InvitesCreateMultipleInvitesResponse.md)
 - [NotificationsGetUserNotificationsResponse](docs/NotificationsGetUserNotificationsResponse.md)
 - [NotificationsGetUserNotificationsResponseNotificationsInner](docs/NotificationsGetUserNotificationsResponseNotificationsInner.md)
 - [NotificationsGetUserNotificationsResponseNotificationsInnerData](docs/NotificationsGetUserNotificationsResponseNotificationsInnerData.md)
 - [NotificationsMarkAsReadRequest](docs/NotificationsMarkAsReadRequest.md)
 - [NotificationsMarkAsReadResponse](docs/NotificationsMarkAsReadResponse.md)
 - [PostsCreateTopicPostMessageRequest](docs/PostsCreateTopicPostMessageRequest.md)
 - [PostsCreateTopicPostMessageResponse](docs/PostsCreateTopicPostMessageResponse.md)
 - [PostsCreateTopicPostMessageResponseActionsSummaryInner](docs/PostsCreateTopicPostMessageResponseActionsSummaryInner.md)
 - [PostsDeleteSinglePostRequest](docs/PostsDeleteSinglePostRequest.md)
 - [PostsGetSinglePostLikesResponse](docs/PostsGetSinglePostLikesResponse.md)
 - [PostsGetSinglePostLikesResponseActionsSummaryInner](docs/PostsGetSinglePostLikesResponseActionsSummaryInner.md)
 - [PostsLikePostActionRequest](docs/PostsLikePostActionRequest.md)
 - [PostsLikePostActionResponse](docs/PostsLikePostActionResponse.md)
 - [PostsLikePostActionResponseActionsSummaryInner](docs/PostsLikePostActionResponseActionsSummaryInner.md)
 - [PostsListLatestPostsAcrossTopicsResponse](docs/PostsListLatestPostsAcrossTopicsResponse.md)
 - [PostsListLatestPostsAcrossTopicsResponseLatestPostsInner](docs/PostsListLatestPostsAcrossTopicsResponseLatestPostsInner.md)
 - [PostsListLatestPostsAcrossTopicsResponseLatestPostsInnerActionsSummaryInner](docs/PostsListLatestPostsAcrossTopicsResponseLatestPostsInnerActionsSummaryInner.md)
 - [PostsListRepliesToPostResponseInner](docs/PostsListRepliesToPostResponseInner.md)
 - [PostsListRepliesToPostResponseInnerReplyToUser](docs/PostsListRepliesToPostResponseInnerReplyToUser.md)
 - [PostsLockPostActionRequest](docs/PostsLockPostActionRequest.md)
 - [PostsLockPostActionResponse](docs/PostsLockPostActionResponse.md)
 - [PostsUpdateSinglePostJsonRequest](docs/PostsUpdateSinglePostJsonRequest.md)
 - [PostsUpdateSinglePostJsonRequestPost](docs/PostsUpdateSinglePostJsonRequestPost.md)
 - [PostsUpdateSinglePostJsonResponse](docs/PostsUpdateSinglePostJsonResponse.md)
 - [PostsUpdateSinglePostJsonResponsePost](docs/PostsUpdateSinglePostJsonResponsePost.md)
 - [PrivateMessagesListForUserResponse](docs/PrivateMessagesListForUserResponse.md)
 - [PrivateMessagesListForUserResponseTopicList](docs/PrivateMessagesListForUserResponseTopicList.md)
 - [PrivateMessagesListForUserResponseTopicListTopicsInner](docs/PrivateMessagesListForUserResponseTopicListTopicsInner.md)
 - [PrivateMessagesListForUserResponseTopicListTopicsInnerParticipantsInner](docs/PrivateMessagesListForUserResponseTopicListTopicsInnerParticipantsInner.md)
 - [PrivateMessagesListForUserResponseTopicListTopicsInnerPostersInner](docs/PrivateMessagesListForUserResponseTopicListTopicsInnerPostersInner.md)
 - [PrivateMessagesListForUserResponseUsersInner](docs/PrivateMessagesListForUserResponseUsersInner.md)
 - [PrivateMessagesListSentForUserResponse](docs/PrivateMessagesListSentForUserResponse.md)
 - [PrivateMessagesListSentForUserResponseTopicList](docs/PrivateMessagesListSentForUserResponseTopicList.md)
 - [PrivateMessagesListSentForUserResponseTopicListTopicsInner](docs/PrivateMessagesListSentForUserResponseTopicListTopicsInner.md)
 - [PrivateMessagesListSentForUserResponseUsersInner](docs/PrivateMessagesListSentForUserResponseUsersInner.md)
 - [SearchTermResultsResponse](docs/SearchTermResultsResponse.md)
 - [SearchTermResultsResponseGroupedSearchResult](docs/SearchTermResultsResponseGroupedSearchResult.md)
 - [SearchTermResultsResponseGroupedSearchResultExtra](docs/SearchTermResultsResponseGroupedSearchResultExtra.md)
 - [SiteGetCategoriesAndSubcategoriesResponse](docs/SiteGetCategoriesAndSubcategoriesResponse.md)
 - [SiteGetCategoriesAndSubcategoriesResponseArchetypesInner](docs/SiteGetCategoriesAndSubcategoriesResponseArchetypesInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponseCategoriesInner](docs/SiteGetCategoriesAndSubcategoriesResponseCategoriesInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponseGroupsInner](docs/SiteGetCategoriesAndSubcategoriesResponseGroupsInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponseNotificationTypes](docs/SiteGetCategoriesAndSubcategoriesResponseNotificationTypes.md)
 - [SiteGetCategoriesAndSubcategoriesResponsePostActionTypesInner](docs/SiteGetCategoriesAndSubcategoriesResponsePostActionTypesInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponsePostTypes](docs/SiteGetCategoriesAndSubcategoriesResponsePostTypes.md)
 - [SiteGetCategoriesAndSubcategoriesResponseTrustLevels](docs/SiteGetCategoriesAndSubcategoriesResponseTrustLevels.md)
 - [SiteGetCategoriesAndSubcategoriesResponseUserColorSchemesInner](docs/SiteGetCategoriesAndSubcategoriesResponseUserColorSchemesInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponseUserThemesInner](docs/SiteGetCategoriesAndSubcategoriesResponseUserThemesInner.md)
 - [SiteGetCategoriesAndSubcategoriesResponseUserTips](docs/SiteGetCategoriesAndSubcategoriesResponseUserTips.md)
 - [TagsCreateTagGroupRequest](docs/TagsCreateTagGroupRequest.md)
 - [TagsCreateTagGroupResponse](docs/TagsCreateTagGroupResponse.md)
 - [TagsCreateTagGroupResponseTagGroup](docs/TagsCreateTagGroupResponseTagGroup.md)
 - [TagsGetSingleTagGroupResponse](docs/TagsGetSingleTagGroupResponse.md)
 - [TagsGetSingleTagGroupResponseTagGroup](docs/TagsGetSingleTagGroupResponseTagGroup.md)
 - [TagsGetSingleTagGroupResponseTagGroupPermissions](docs/TagsGetSingleTagGroupResponseTagGroupPermissions.md)
 - [TagsGetSpecificTagResponse](docs/TagsGetSpecificTagResponse.md)
 - [TagsGetSpecificTagResponseTopicList](docs/TagsGetSpecificTagResponseTopicList.md)
 - [TagsGetSpecificTagResponseTopicListTagsInner](docs/TagsGetSpecificTagResponseTopicListTagsInner.md)
 - [TagsGetSpecificTagResponseTopicListTopicsInner](docs/TagsGetSpecificTagResponseTopicListTopicsInner.md)
 - [TagsGetTagGroupsResponse](docs/TagsGetTagGroupsResponse.md)
 - [TagsGetTagGroupsResponseTagGroupsInner](docs/TagsGetTagGroupsResponseTagGroupsInner.md)
 - [TagsGetTagGroupsResponseTagGroupsInnerPermissions](docs/TagsGetTagGroupsResponseTagGroupsInnerPermissions.md)
 - [TagsListResponse](docs/TagsListResponse.md)
 - [TagsListResponseExtras](docs/TagsListResponseExtras.md)
 - [TagsListResponseTagsInner](docs/TagsListResponseTagsInner.md)
 - [TagsUpdateTagGroupRequest](docs/TagsUpdateTagGroupRequest.md)
 - [TagsUpdateTagGroupResponse](docs/TagsUpdateTagGroupResponse.md)
 - [TopicsCreateTopicTimerRequest](docs/TopicsCreateTopicTimerRequest.md)
 - [TopicsCreateTopicTimerResponse](docs/TopicsCreateTopicTimerResponse.md)
 - [TopicsGetLatestTopicsResponse](docs/TopicsGetLatestTopicsResponse.md)
 - [TopicsGetLatestTopicsResponseTopicList](docs/TopicsGetLatestTopicsResponseTopicList.md)
 - [TopicsGetLatestTopicsResponseTopicListTopicsInner](docs/TopicsGetLatestTopicsResponseTopicListTopicsInner.md)
 - [TopicsGetSingleTopicResponse](docs/TopicsGetSingleTopicResponse.md)
 - [TopicsGetSingleTopicResponseActionsSummaryInner](docs/TopicsGetSingleTopicResponseActionsSummaryInner.md)
 - [TopicsGetSingleTopicResponseDetails](docs/TopicsGetSingleTopicResponseDetails.md)
 - [TopicsGetSingleTopicResponseDetailsParticipantsInner](docs/TopicsGetSingleTopicResponseDetailsParticipantsInner.md)
 - [TopicsGetSingleTopicResponsePostStream](docs/TopicsGetSingleTopicResponsePostStream.md)
 - [TopicsGetSingleTopicResponsePostStreamPostsInner](docs/TopicsGetSingleTopicResponsePostStreamPostsInner.md)
 - [TopicsGetSingleTopicResponsePostStreamPostsInnerLinkCountsInner](docs/TopicsGetSingleTopicResponsePostStreamPostsInnerLinkCountsInner.md)
 - [TopicsGetSingleTopicResponseSuggestedTopicsInner](docs/TopicsGetSingleTopicResponseSuggestedTopicsInner.md)
 - [TopicsGetSingleTopicResponseSuggestedTopicsInnerPostersInner](docs/TopicsGetSingleTopicResponseSuggestedTopicsInnerPostersInner.md)
 - [TopicsGetSpecificPostsRequest](docs/TopicsGetSpecificPostsRequest.md)
 - [TopicsGetSpecificPostsResponse](docs/TopicsGetSpecificPostsResponse.md)
 - [TopicsGetSpecificPostsResponsePostStream](docs/TopicsGetSpecificPostsResponsePostStream.md)
 - [TopicsGetSpecificPostsResponsePostStreamPostsInner](docs/TopicsGetSpecificPostsResponsePostStreamPostsInner.md)
 - [TopicsGetTopTopicsByPeriodResponse](docs/TopicsGetTopTopicsByPeriodResponse.md)
 - [TopicsGetTopTopicsByPeriodResponseTopicList](docs/TopicsGetTopTopicsByPeriodResponseTopicList.md)
 - [TopicsGetTopTopicsByPeriodResponseTopicListTopicsInner](docs/TopicsGetTopTopicsByPeriodResponseTopicListTopicsInner.md)
 - [TopicsGetTopTopicsByPeriodResponseTopicListTopicsInnerPostersInner](docs/TopicsGetTopTopicsByPeriodResponseTopicListTopicsInnerPostersInner.md)
 - [TopicsSendInviteToTopicRequest](docs/TopicsSendInviteToTopicRequest.md)
 - [TopicsSendInviteToTopicResponse](docs/TopicsSendInviteToTopicResponse.md)
 - [TopicsSetNotificationLevelRequest](docs/TopicsSetNotificationLevelRequest.md)
 - [TopicsSetNotificationLevelResponse](docs/TopicsSetNotificationLevelResponse.md)
 - [TopicsUpdateStatusOfTopicRequest](docs/TopicsUpdateStatusOfTopicRequest.md)
 - [TopicsUpdateStatusOfTopicResponse](docs/TopicsUpdateStatusOfTopicResponse.md)
 - [TopicsUpdateTimestampJsonRequest](docs/TopicsUpdateTimestampJsonRequest.md)
 - [TopicsUpdateTimestampJsonResponse](docs/TopicsUpdateTimestampJsonResponse.md)
 - [TopicsUpdateTopicByIdJsonRequest](docs/TopicsUpdateTopicByIdJsonRequest.md)
 - [TopicsUpdateTopicByIdJsonRequestTopic](docs/TopicsUpdateTopicByIdJsonRequestTopic.md)
 - [TopicsUpdateTopicByIdJsonResponse](docs/TopicsUpdateTopicByIdJsonResponse.md)
 - [TopicsUpdateTopicByIdJsonResponseBasicTopic](docs/TopicsUpdateTopicByIdJsonResponseBasicTopic.md)
 - [UploadsAbortMultipartUploadRequest](docs/UploadsAbortMultipartUploadRequest.md)
 - [UploadsAbortMultipartUploadResponse](docs/UploadsAbortMultipartUploadResponse.md)
 - [UploadsCompleteExternalUploadRequest](docs/UploadsCompleteExternalUploadRequest.md)
 - [UploadsCompleteExternalUploadResponse](docs/UploadsCompleteExternalUploadResponse.md)
 - [UploadsCompleteMultipartUploadRequest](docs/UploadsCompleteMultipartUploadRequest.md)
 - [UploadsCompleteMultipartUploadResponse](docs/UploadsCompleteMultipartUploadResponse.md)
 - [UploadsCreateMultipartExternalUploadRequest](docs/UploadsCreateMultipartExternalUploadRequest.md)
 - [UploadsCreateMultipartExternalUploadResponse](docs/UploadsCreateMultipartExternalUploadResponse.md)
 - [UploadsCreateNewUploadRequest](docs/UploadsCreateNewUploadRequest.md)
 - [UploadsCreateNewUploadResponse](docs/UploadsCreateNewUploadResponse.md)
 - [UploadsGeneratePresignedUrlsForMultipartPartsRequest](docs/UploadsGeneratePresignedUrlsForMultipartPartsRequest.md)
 - [UploadsGeneratePresignedUrlsForMultipartPartsResponse](docs/UploadsGeneratePresignedUrlsForMultipartPartsResponse.md)
 - [UploadsInitiateDirectExternalUploadRequest](docs/UploadsInitiateDirectExternalUploadRequest.md)
 - [UploadsInitiateDirectExternalUploadRequestMetadata](docs/UploadsInitiateDirectExternalUploadRequestMetadata.md)
 - [UploadsInitiateDirectExternalUploadResponse](docs/UploadsInitiateDirectExternalUploadResponse.md)
 - [UsersActivateUserResponse](docs/UsersActivateUserResponse.md)
 - [UsersAnonymizeByIdJsonResponse](docs/UsersAnonymizeByIdJsonResponse.md)
 - [UsersChangePasswordActionRequest](docs/UsersChangePasswordActionRequest.md)
 - [UsersCreateUserRequest](docs/UsersCreateUserRequest.md)
 - [UsersCreateUserResponse](docs/UsersCreateUserResponse.md)
 - [UsersDeactivateUserResponse](docs/UsersDeactivateUserResponse.md)
 - [UsersDeleteUserByIdJsonRequest](docs/UsersDeleteUserByIdJsonRequest.md)
 - [UsersDeleteUserByIdJsonResponse](docs/UsersDeleteUserByIdJsonResponse.md)
 - [UsersGetEmailsResponse](docs/UsersGetEmailsResponse.md)
 - [UsersGetIdentityProviderExternalIdResponse](docs/UsersGetIdentityProviderExternalIdResponse.md)
 - [UsersGetListOfUsersResponseInner](docs/UsersGetListOfUsersResponseInner.md)
 - [UsersGetUserByExternalIdResponse](docs/UsersGetUserByExternalIdResponse.md)
 - [UsersGetUserByIdJsonResponse](docs/UsersGetUserByIdJsonResponse.md)
 - [UsersGetUserByIdJsonResponseApprovedBy](docs/UsersGetUserByIdJsonResponseApprovedBy.md)
 - [UsersGetUserByIdJsonResponseGroupsInner](docs/UsersGetUserByIdJsonResponseGroupsInner.md)
 - [UsersGetUserByIdJsonResponsePenaltyCounts](docs/UsersGetUserByIdJsonResponsePenaltyCounts.md)
 - [UsersGetUserByIdJsonResponseTl3Requirements](docs/UsersGetUserByIdJsonResponseTl3Requirements.md)
 - [UsersGetUserByIdJsonResponseTl3RequirementsPenaltyCounts](docs/UsersGetUserByIdJsonResponseTl3RequirementsPenaltyCounts.md)
 - [UsersGetUserByUsernameResponse](docs/UsersGetUserByUsernameResponse.md)
 - [UsersGetUserByUsernameResponseUser](docs/UsersGetUserByUsernameResponseUser.md)
 - [UsersGetUserByUsernameResponseUserCustomFields](docs/UsersGetUserByUsernameResponseUserCustomFields.md)
 - [UsersGetUserByUsernameResponseUserGroupUsersInner](docs/UsersGetUserByUsernameResponseUserGroupUsersInner.md)
 - [UsersGetUserByUsernameResponseUserGroupsInner](docs/UsersGetUserByUsernameResponseUserGroupsInner.md)
 - [UsersGetUserByUsernameResponseUserUserAuthTokensInner](docs/UsersGetUserByUsernameResponseUserUserAuthTokensInner.md)
 - [UsersGetUserByUsernameResponseUserUserFields](docs/UsersGetUserByUsernameResponseUserUserFields.md)
 - [UsersGetUserByUsernameResponseUserUserNotificationSchedule](docs/UsersGetUserByUsernameResponseUserUserNotificationSchedule.md)
 - [UsersGetUserByUsernameResponseUserUserOption](docs/UsersGetUserByUsernameResponseUserUserOption.md)
 - [UsersListPublicUserResponse](docs/UsersListPublicUserResponse.md)
 - [UsersListPublicUserResponseDirectoryItemsInner](docs/UsersListPublicUserResponseDirectoryItemsInner.md)
 - [UsersListPublicUserResponseDirectoryItemsInnerUser](docs/UsersListPublicUserResponseDirectoryItemsInnerUser.md)
 - [UsersListPublicUserResponseMeta](docs/UsersListPublicUserResponseMeta.md)
 - [UsersListUserActionsResponse](docs/UsersListUserActionsResponse.md)
 - [UsersListUserActionsResponseUserActionsInner](docs/UsersListUserActionsResponseUserActionsInner.md)
 - [UsersLogOutUserActionResponse](docs/UsersLogOutUserActionResponse.md)
 - [UsersRefreshGravatarPostResponse](docs/UsersRefreshGravatarPostResponse.md)
 - [UsersSendPasswordResetEmailRequest](docs/UsersSendPasswordResetEmailRequest.md)
 - [UsersSendPasswordResetEmailResponse](docs/UsersSendPasswordResetEmailResponse.md)
 - [UsersSilenceByIdRequest](docs/UsersSilenceByIdRequest.md)
 - [UsersSilenceByIdResponse](docs/UsersSilenceByIdResponse.md)
 - [UsersSilenceByIdResponseSilence](docs/UsersSilenceByIdResponseSilence.md)
 - [UsersSuspendByIdJsonRequest](docs/UsersSuspendByIdJsonRequest.md)
 - [UsersSuspendByIdJsonResponse](docs/UsersSuspendByIdJsonResponse.md)
 - [UsersSuspendByIdJsonResponseSuspension](docs/UsersSuspendByIdJsonResponseSuspension.md)
 - [UsersUpdateAvatarRequest](docs/UsersUpdateAvatarRequest.md)
 - [UsersUpdateAvatarResponse](docs/UsersUpdateAvatarResponse.md)
 - [UsersUpdateEmailPreferencesRequest](docs/UsersUpdateEmailPreferencesRequest.md)
 - [UsersUpdatePreferencesJsonRequest](docs/UsersUpdatePreferencesJsonRequest.md)
 - [UsersUpdateUserDetailsRequest](docs/UsersUpdateUserDetailsRequest.md)
 - [UsersUpdateUserDetailsResponse](docs/UsersUpdateUserDetailsResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
