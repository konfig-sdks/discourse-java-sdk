# GroupsApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMembersToGroup**](GroupsApi.md#addMembersToGroup) | **PUT** /groups/{id}/members.json | Add group members |
| [**createNewGroup**](GroupsApi.md#createNewGroup) | **POST** /admin/groups.json | Create a group |
| [**deleteGroupByIdJson**](GroupsApi.md#deleteGroupByIdJson) | **DELETE** /admin/groups/{id}.json | Delete a group |
| [**getGroupById**](GroupsApi.md#getGroupById) | **GET** /groups/{id}.json | Get a group |
| [**list**](GroupsApi.md#list) | **GET** /groups.json | List groups |
| [**listMembersJson**](GroupsApi.md#listMembersJson) | **GET** /groups/{id}/members.json | List group members |
| [**removeMembers**](GroupsApi.md#removeMembers) | **DELETE** /groups/{id}/members.json | Remove group members |
| [**updateGroupByIdJson**](GroupsApi.md#updateGroupByIdJson) | **PUT** /groups/{id}.json | Update a group |


<a name="addMembersToGroup"></a>
# **addMembersToGroup**
> GroupsAddMembersToGroupResponse addMembersToGroup(id).groupsAddMembersToGroupRequest(groupsAddMembersToGroupRequest).execute();

Add group members

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    String usernames = "usernames_example"; // comma separated list
    try {
      GroupsAddMembersToGroupResponse result = client
              .groups
              .addMembersToGroup(id)
              .usernames(usernames)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUsernames());
      System.out.println(result.getEmails());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addMembersToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsAddMembersToGroupResponse> response = client
              .groups
              .addMembersToGroup(id)
              .usernames(usernames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addMembersToGroup");
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
| **groupsAddMembersToGroupRequest** | [**GroupsAddMembersToGroupRequest**](GroupsAddMembersToGroupRequest.md)|  | [optional] |

### Return type

[**GroupsAddMembersToGroupResponse**](GroupsAddMembersToGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="createNewGroup"></a>
# **createNewGroup**
> GroupsCreateNewGroupResponse createNewGroup().groupsCreateNewGroupRequest(groupsCreateNewGroupRequest).execute();

Create a group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    GroupsCreateNewGroupRequestGroup group = new GroupsCreateNewGroupRequestGroup();
    try {
      GroupsCreateNewGroupResponse result = client
              .groups
              .createNewGroup(group)
              .execute();
      System.out.println(result);
      System.out.println(result.getBasicGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createNewGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsCreateNewGroupResponse> response = client
              .groups
              .createNewGroup(group)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createNewGroup");
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
| **groupsCreateNewGroupRequest** | [**GroupsCreateNewGroupRequest**](GroupsCreateNewGroupRequest.md)|  | [optional] |

### Return type

[**GroupsCreateNewGroupResponse**](GroupsCreateNewGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | group created |  -  |

<a name="deleteGroupByIdJson"></a>
# **deleteGroupByIdJson**
> GroupsDeleteGroupByIdJsonResponse deleteGroupByIdJson(id).execute();

Delete a group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
      GroupsDeleteGroupByIdJsonResponse result = client
              .groups
              .deleteGroupByIdJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsDeleteGroupByIdJsonResponse> response = client
              .groups
              .deleteGroupByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupByIdJson");
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

### Return type

[**GroupsDeleteGroupByIdJsonResponse**](GroupsDeleteGroupByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="getGroupById"></a>
# **getGroupById**
> GroupsGetGroupByIdResponse getGroupById(id).execute();

Get a group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String id = "name"; // Use group name instead of id
    try {
      GroupsGetGroupByIdResponse result = client
              .groups
              .getGroupById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroup());
      System.out.println(result.getExtras());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsGetGroupByIdResponse> response = client
              .groups
              .getGroupById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupById");
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
| **id** | **String**| Use group name instead of id | |

### Return type

[**GroupsGetGroupByIdResponse**](GroupsGetGroupByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="list"></a>
# **list**
> GroupsListResponse list().execute();

List groups

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    try {
      GroupsListResponse result = client
              .groups
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
      System.out.println(result.getExtras());
      System.out.println(result.getTotalRowsGroups());
      System.out.println(result.getLoadMoreGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsListResponse> response = client
              .groups
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupsListResponse**](GroupsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="listMembersJson"></a>
# **listMembersJson**
> GroupsListMembersJsonResponse listMembersJson(id).execute();

List group members

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String id = "name"; // Use group name instead of id
    try {
      GroupsListMembersJsonResponse result = client
              .groups
              .listMembersJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
      System.out.println(result.getOwners());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listMembersJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsListMembersJsonResponse> response = client
              .groups
              .listMembersJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listMembersJson");
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
| **id** | **String**| Use group name instead of id | |

### Return type

[**GroupsListMembersJsonResponse**](GroupsListMembersJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="removeMembers"></a>
# **removeMembers**
> GroupsRemoveMembersResponse removeMembers(id).groupsRemoveMembersRequest(groupsRemoveMembersRequest).execute();

Remove group members

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Integer id = 56;
    String usernames = "usernames_example"; // comma separated list
    try {
      GroupsRemoveMembersResponse result = client
              .groups
              .removeMembers(id)
              .usernames(usernames)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getUsernames());
      System.out.println(result.getSkippedUsernames());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsRemoveMembersResponse> response = client
              .groups
              .removeMembers(id)
              .usernames(usernames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeMembers");
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
| **groupsRemoveMembersRequest** | [**GroupsRemoveMembersRequest**](GroupsRemoveMembersRequest.md)|  | [optional] |

### Return type

[**GroupsRemoveMembersResponse**](GroupsRemoveMembersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="updateGroupByIdJson"></a>
# **updateGroupByIdJson**
> GroupsUpdateGroupByIdJsonResponse updateGroupByIdJson(id).groupsUpdateGroupByIdJsonRequest(groupsUpdateGroupByIdJsonRequest).execute();

Update a group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    GroupsCreateNewGroupRequestGroup group = new GroupsCreateNewGroupRequestGroup();
    Integer id = 56;
    try {
      GroupsUpdateGroupByIdJsonResponse result = client
              .groups
              .updateGroupByIdJson(group, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsUpdateGroupByIdJsonResponse> response = client
              .groups
              .updateGroupByIdJson(group, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupByIdJson");
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
| **groupsUpdateGroupByIdJsonRequest** | [**GroupsUpdateGroupByIdJsonRequest**](GroupsUpdateGroupByIdJsonRequest.md)|  | [optional] |

### Return type

[**GroupsUpdateGroupByIdJsonResponse**](GroupsUpdateGroupByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

