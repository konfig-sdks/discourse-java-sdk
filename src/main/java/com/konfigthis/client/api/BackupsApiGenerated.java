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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.BackupsCreateBackupRequestRequest;
import com.konfigthis.client.model.BackupsCreateBackupRequestResponse;
import com.konfigthis.client.model.BackupsListResponseInner;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BackupsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BackupsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BackupsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createBackupRequestCall(BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = backupsCreateBackupRequestRequest;

        // create path and map variables
        String localVarPath = "/admin/backups.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBackupRequestValidateBeforeCall(BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest, final ApiCallback _callback) throws ApiException {
        return createBackupRequestCall(backupsCreateBackupRequestRequest, _callback);

    }


    private ApiResponse<BackupsCreateBackupRequestResponse> createBackupRequestWithHttpInfo(BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest) throws ApiException {
        okhttp3.Call localVarCall = createBackupRequestValidateBeforeCall(backupsCreateBackupRequestRequest, null);
        Type localVarReturnType = new TypeToken<BackupsCreateBackupRequestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createBackupRequestAsync(BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest, final ApiCallback<BackupsCreateBackupRequestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBackupRequestValidateBeforeCall(backupsCreateBackupRequestRequest, _callback);
        Type localVarReturnType = new TypeToken<BackupsCreateBackupRequestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateBackupRequestRequestBuilder {
        private final Boolean withUploads;

        private CreateBackupRequestRequestBuilder(Boolean withUploads) {
            this.withUploads = withUploads;
        }

        /**
         * Build call for createBackupRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest = buildBodyParams();
            return createBackupRequestCall(backupsCreateBackupRequestRequest, _callback);
        }

        private BackupsCreateBackupRequestRequest buildBodyParams() {
            BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest = new BackupsCreateBackupRequestRequest();
            backupsCreateBackupRequestRequest.withUploads(this.withUploads);
            return backupsCreateBackupRequestRequest;
        }

        /**
         * Execute createBackupRequest request
         * @return BackupsCreateBackupRequestResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public BackupsCreateBackupRequestResponse execute() throws ApiException {
            BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest = buildBodyParams();
            ApiResponse<BackupsCreateBackupRequestResponse> localVarResp = createBackupRequestWithHttpInfo(backupsCreateBackupRequestRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createBackupRequest request with HTTP info returned
         * @return ApiResponse&lt;BackupsCreateBackupRequestResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BackupsCreateBackupRequestResponse> executeWithHttpInfo() throws ApiException {
            BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest = buildBodyParams();
            return createBackupRequestWithHttpInfo(backupsCreateBackupRequestRequest);
        }

        /**
         * Execute createBackupRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BackupsCreateBackupRequestResponse> _callback) throws ApiException {
            BackupsCreateBackupRequestRequest backupsCreateBackupRequestRequest = buildBodyParams();
            return createBackupRequestAsync(backupsCreateBackupRequestRequest, _callback);
        }
    }

    /**
     * Create backup
     * 
     * @return CreateBackupRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
     </table>
     */
    public CreateBackupRequestRequestBuilder createBackupRequest(Boolean withUploads) throws IllegalArgumentException {
        if (withUploads == null) throw new IllegalArgumentException("\"withUploads\" is required but got null");
        return new CreateBackupRequestRequestBuilder(withUploads);
    }
    private okhttp3.Call downloadBackupCall(String filename, String token, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/backups/{filename}"
            .replace("{" + "filename" + "}", localVarApiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadBackupValidateBeforeCall(String filename, String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling downloadBackup(Async)");
        }

        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling downloadBackup(Async)");
        }

        return downloadBackupCall(filename, token, _callback);

    }


    private ApiResponse<Void> downloadBackupWithHttpInfo(String filename, String token) throws ApiException {
        okhttp3.Call localVarCall = downloadBackupValidateBeforeCall(filename, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call downloadBackupAsync(String filename, String token, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadBackupValidateBeforeCall(filename, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DownloadBackupRequestBuilder {
        private final String filename;
        private final String token;

        private DownloadBackupRequestBuilder(String filename, String token) {
            this.filename = filename;
            this.token = token;
        }

        /**
         * Build call for downloadBackup
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return downloadBackupCall(filename, token, _callback);
        }


        /**
         * Execute downloadBackup request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            downloadBackupWithHttpInfo(filename, token);
        }

        /**
         * Execute downloadBackup request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return downloadBackupWithHttpInfo(filename, token);
        }

        /**
         * Execute downloadBackup request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return downloadBackupAsync(filename, token, _callback);
        }
    }

    /**
     * Download backup
     * 
     * @param filename  (required)
     * @param token  (required)
     * @return DownloadBackupRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
     </table>
     */
    public DownloadBackupRequestBuilder downloadBackup(String filename, String token) throws IllegalArgumentException {
        if (filename == null) throw new IllegalArgumentException("\"filename\" is required but got null");
            

        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new DownloadBackupRequestBuilder(filename, token);
    }
    private okhttp3.Call listCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/backups.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listCall(_callback);

    }


    private ApiResponse<Set<BackupsListResponseInner>> listWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Set<BackupsListResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(final ApiCallback<Set<BackupsListResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Set<BackupsListResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {

        private ListRequestBuilder() {
        }

        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(_callback);
        }


        /**
         * Execute list request
         * @return Set&lt;BackupsListResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public Set<BackupsListResponseInner> execute() throws ApiException {
            ApiResponse<Set<BackupsListResponseInner>> localVarResp = listWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;Set&lt;BackupsListResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Set<BackupsListResponseInner>> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo();
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Set<BackupsListResponseInner>> _callback) throws ApiException {
            return listAsync(_callback);
        }
    }

    /**
     * List backups
     * 
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
    private okhttp3.Call sendDownloadBackupEmailCall(String filename, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/backups/{filename}"
            .replace("{" + "filename" + "}", localVarApiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendDownloadBackupEmailValidateBeforeCall(String filename, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling sendDownloadBackupEmail(Async)");
        }

        return sendDownloadBackupEmailCall(filename, _callback);

    }


    private ApiResponse<Void> sendDownloadBackupEmailWithHttpInfo(String filename) throws ApiException {
        okhttp3.Call localVarCall = sendDownloadBackupEmailValidateBeforeCall(filename, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call sendDownloadBackupEmailAsync(String filename, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendDownloadBackupEmailValidateBeforeCall(filename, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class SendDownloadBackupEmailRequestBuilder {
        private final String filename;

        private SendDownloadBackupEmailRequestBuilder(String filename) {
            this.filename = filename;
        }

        /**
         * Build call for sendDownloadBackupEmail
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return sendDownloadBackupEmailCall(filename, _callback);
        }


        /**
         * Execute sendDownloadBackupEmail request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            sendDownloadBackupEmailWithHttpInfo(filename);
        }

        /**
         * Execute sendDownloadBackupEmail request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return sendDownloadBackupEmailWithHttpInfo(filename);
        }

        /**
         * Execute sendDownloadBackupEmail request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return sendDownloadBackupEmailAsync(filename, _callback);
        }
    }

    /**
     * Send download backup email
     * 
     * @param filename  (required)
     * @return SendDownloadBackupEmailRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success response </td><td>  -  </td></tr>
     </table>
     */
    public SendDownloadBackupEmailRequestBuilder sendDownloadBackupEmail(String filename) throws IllegalArgumentException {
        if (filename == null) throw new IllegalArgumentException("\"filename\" is required but got null");
            

        return new SendDownloadBackupEmailRequestBuilder(filename);
    }
}
