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
import com.konfigthis.client.model.BadgesListUserBadgesResponse;
import java.util.Set;
import com.konfigthis.client.model.UsersActivateUserResponse;
import com.konfigthis.client.model.UsersAnonymizeByIdJsonResponse;
import com.konfigthis.client.model.UsersChangePasswordActionRequest;
import com.konfigthis.client.model.UsersCreateUserRequest;
import com.konfigthis.client.model.UsersCreateUserResponse;
import com.konfigthis.client.model.UsersDeactivateUserResponse;
import com.konfigthis.client.model.UsersDeleteUserByIdJsonRequest;
import com.konfigthis.client.model.UsersDeleteUserByIdJsonResponse;
import com.konfigthis.client.model.UsersGetEmailsResponse;
import com.konfigthis.client.model.UsersGetIdentityProviderExternalIdResponse;
import com.konfigthis.client.model.UsersGetListOfUsersResponseInner;
import com.konfigthis.client.model.UsersGetUserByExternalIdResponse;
import com.konfigthis.client.model.UsersGetUserByIdJsonResponse;
import com.konfigthis.client.model.UsersGetUserByUsernameResponse;
import com.konfigthis.client.model.UsersListPublicUserResponse;
import com.konfigthis.client.model.UsersListUserActionsResponse;
import com.konfigthis.client.model.UsersLogOutUserActionResponse;
import com.konfigthis.client.model.UsersRefreshGravatarPostResponse;
import com.konfigthis.client.model.UsersSendPasswordResetEmailRequest;
import com.konfigthis.client.model.UsersSendPasswordResetEmailResponse;
import com.konfigthis.client.model.UsersSilenceByIdRequest;
import com.konfigthis.client.model.UsersSilenceByIdResponse;
import com.konfigthis.client.model.UsersSuspendByIdJsonRequest;
import com.konfigthis.client.model.UsersSuspendByIdJsonResponse;
import com.konfigthis.client.model.UsersUpdateAvatarRequest;
import com.konfigthis.client.model.UsersUpdateAvatarResponse;
import com.konfigthis.client.model.UsersUpdateEmailPreferencesRequest;
import com.konfigthis.client.model.UsersUpdatePreferencesJsonRequest;
import com.konfigthis.client.model.UsersUpdateUserDetailsRequest;
import com.konfigthis.client.model.UsersUpdateUserDetailsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * Activate a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateUserTest() throws ApiException {
        Integer id = null;
        UsersActivateUserResponse response = api.activateUser(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Anonymize a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void anonymizeByIdJsonTest() throws ApiException {
        Integer id = null;
        UsersAnonymizeByIdJsonResponse response = api.anonymizeByIdJson(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Change password
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePasswordActionTest() throws ApiException {
        String username = null;
        String password = null;
        String token = null;
        api.changePasswordAction(username, password, token)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        String name = null;
        String email = null;
        String password = null;
        String username = null;
        String apiKey = null;
        String apiUsername = null;
        Boolean active = null;
        Boolean approved = null;
        Boolean userFields1 = null;
        Object externalIds = null;
        UsersCreateUserResponse response = api.createUser(name, email, password, username, apiKey, apiUsername)
                .active(active)
                .approved(approved)
                .userFields1(userFields1)
                .externalIds(externalIds)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivate a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateUserTest() throws ApiException {
        Integer id = null;
        UsersDeactivateUserResponse response = api.deactivateUser(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserByIdJsonTest() throws ApiException {
        Integer id = null;
        Boolean deletePosts = null;
        Boolean blockEmail = null;
        Boolean blockUrls = null;
        Boolean blockIp = null;
        UsersDeleteUserByIdJsonResponse response = api.deleteUserByIdJson(id)
                .deletePosts(deletePosts)
                .blockEmail(blockEmail)
                .blockUrls(blockUrls)
                .blockIp(blockIp)
                .execute();
        // TODO: test validations
    }

    /**
     * Get email addresses belonging to a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmailsTest() throws ApiException {
        String username = null;
        UsersGetEmailsResponse response = api.getEmails(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user by identity provider external ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdentityProviderExternalIdTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String provider = null;
        String externalId = null;
        UsersGetIdentityProviderExternalIdResponse response = api.getIdentityProviderExternalId(apiKey, apiUsername, provider, externalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListOfUsersTest() throws ApiException {
        String flag = null;
        String order = null;
        String asc = null;
        Integer page = null;
        Boolean showEmails = null;
        Boolean stats = null;
        String email = null;
        String ip = null;
        Set<UsersGetListOfUsersResponseInner> response = api.getListOfUsers(flag)
                .order(order)
                .asc(asc)
                .page(page)
                .showEmails(showEmails)
                .stats(stats)
                .email(email)
                .ip(ip)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user by external_id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByExternalIdTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String externalId = null;
        UsersGetUserByExternalIdResponse response = api.getUserByExternalId(apiKey, apiUsername, externalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdJsonTest() throws ApiException {
        Integer id = null;
        UsersGetUserByIdJsonResponse response = api.getUserByIdJson(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single user by username
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByUsernameTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String username = null;
        UsersGetUserByUsernameResponse response = api.getUserByUsername(apiKey, apiUsername, username)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a public list of users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPublicUserTest() throws ApiException {
        String period = null;
        String order = null;
        String asc = null;
        Integer page = null;
        UsersListPublicUserResponse response = api.listPublicUser(period, order)
                .asc(asc)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of user actions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserActionsTest() throws ApiException {
        Integer offset = null;
        String username = null;
        String filter = null;
        UsersListUserActionsResponse response = api.listUserActions(offset, username, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * List badges for a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserBadgesTest() throws ApiException {
        String username = null;
        BadgesListUserBadgesResponse response = api.listUserBadges(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Log a user out
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logOutUserActionTest() throws ApiException {
        Integer id = null;
        UsersLogOutUserActionResponse response = api.logOutUserAction(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Refresh gravatar
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshGravatarPostTest() throws ApiException {
        String username = null;
        UsersRefreshGravatarPostResponse response = api.refreshGravatarPost(username)
                .execute();
        // TODO: test validations
    }

    /**
     * Send password reset email
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendPasswordResetEmailTest() throws ApiException {
        String login = null;
        UsersSendPasswordResetEmailResponse response = api.sendPasswordResetEmail(login)
                .execute();
        // TODO: test validations
    }

    /**
     * Silence a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void silenceByIdTest() throws ApiException {
        Integer id = null;
        String silencedTill = null;
        String reason = null;
        String message = null;
        String postAction = null;
        UsersSilenceByIdResponse response = api.silenceById(id)
                .silencedTill(silencedTill)
                .reason(reason)
                .message(message)
                .postAction(postAction)
                .execute();
        // TODO: test validations
    }

    /**
     * Suspend a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void suspendByIdJsonTest() throws ApiException {
        String suspendUntil = null;
        String reason = null;
        Integer id = null;
        String message = null;
        String postAction = null;
        UsersSuspendByIdJsonResponse response = api.suspendByIdJson(suspendUntil, reason, id)
                .message(message)
                .postAction(postAction)
                .execute();
        // TODO: test validations
    }

    /**
     * Update avatar
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAvatarTest() throws ApiException {
        Integer uploadId = null;
        String type = null;
        String username = null;
        UsersUpdateAvatarResponse response = api.updateAvatar(uploadId, type, username)
                .execute();
        // TODO: test validations
    }

    /**
     * Update email
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmailPreferencesTest() throws ApiException {
        String email = null;
        String username = null;
        api.updateEmailPreferences(email, username)
                .execute();
        // TODO: test validations
    }

    /**
     * Update username
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePreferencesJsonTest() throws ApiException {
        String newUsername = null;
        String username = null;
        api.updatePreferencesJson(newUsername, username)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserDetailsTest() throws ApiException {
        String apiKey = null;
        String apiUsername = null;
        String username = null;
        String name = null;
        Object externalIds = null;
        UsersUpdateUserDetailsResponse response = api.updateUserDetails(apiKey, apiUsername, username)
                .name(name)
                .externalIds(externalIds)
                .execute();
        // TODO: test validations
    }

}
