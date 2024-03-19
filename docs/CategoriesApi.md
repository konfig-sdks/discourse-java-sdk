# CategoriesApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCategoryRequest**](CategoriesApi.md#createCategoryRequest) | **POST** /categories.json | Creates a category |
| [**getCategoriesAndSubcategories**](CategoriesApi.md#getCategoriesAndSubcategories) | **GET** /site.json | Get site info |
| [**getCategoryByIdJson**](CategoriesApi.md#getCategoryByIdJson) | **GET** /c/{id}/show.json | Show category |
| [**list**](CategoriesApi.md#list) | **GET** /categories.json | Retrieves a list of categories |
| [**listTopics**](CategoriesApi.md#listTopics) | **GET** /c/{slug}/{id}.json | List topics |
| [**updateCategoryByIdJson**](CategoriesApi.md#updateCategoryByIdJson) | **PUT** /categories/{id}.json | Updates a category |


<a name="createCategoryRequest"></a>
# **createCategoryRequest**
> CategoriesCreateCategoryRequestResponse createCategoryRequest().categoriesCreateCategoryRequestRequest(categoriesCreateCategoryRequestRequest).execute();

Creates a category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String name = "name_example";
    String color = "color_example";
    String textColor = "textColor_example";
    Integer parentCategoryId = 56;
    Boolean allowBadges = true;
    String slug = "slug_example";
    Boolean topicFeaturedLinksAllowed = true;
    CategoriesCreateCategoryRequestRequestPermissions permissions = new CategoriesCreateCategoryRequestRequestPermissions();
    Integer searchPriority = 56;
    List<Object> formTemplateIds = Arrays.asList(null);
    try {
      CategoriesCreateCategoryRequestResponse result = client
              .categories
              .createCategoryRequest(name)
              .color(color)
              .textColor(textColor)
              .parentCategoryId(parentCategoryId)
              .allowBadges(allowBadges)
              .slug(slug)
              .topicFeaturedLinksAllowed(topicFeaturedLinksAllowed)
              .permissions(permissions)
              .searchPriority(searchPriority)
              .formTemplateIds(formTemplateIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategory());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#createCategoryRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoriesCreateCategoryRequestResponse> response = client
              .categories
              .createCategoryRequest(name)
              .color(color)
              .textColor(textColor)
              .parentCategoryId(parentCategoryId)
              .allowBadges(allowBadges)
              .slug(slug)
              .topicFeaturedLinksAllowed(topicFeaturedLinksAllowed)
              .permissions(permissions)
              .searchPriority(searchPriority)
              .formTemplateIds(formTemplateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#createCategoryRequest");
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
| **categoriesCreateCategoryRequestRequest** | [**CategoriesCreateCategoryRequestRequest**](CategoriesCreateCategoryRequestRequest.md)|  | [optional] |

### Return type

[**CategoriesCreateCategoryRequestResponse**](CategoriesCreateCategoryRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="getCategoriesAndSubcategories"></a>
# **getCategoriesAndSubcategories**
> SiteGetCategoriesAndSubcategoriesResponse getCategoriesAndSubcategories().execute();

Get site info

Can be used to fetch all categories and subcategories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    try {
      SiteGetCategoriesAndSubcategoriesResponse result = client
              .categories
              .getCategoriesAndSubcategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getDefaultArchetype());
      System.out.println(result.getNotificationTypes());
      System.out.println(result.getPostTypes());
      System.out.println(result.getTrustLevels());
      System.out.println(result.getUserTips());
      System.out.println(result.getGroups());
      System.out.println(result.getFilters());
      System.out.println(result.getPeriods());
      System.out.println(result.getTopMenuItems());
      System.out.println(result.getAnonymousTopMenuItems());
      System.out.println(result.getUncategorizedCategoryId());
      System.out.println(result.getUserFieldMaxLength());
      System.out.println(result.getPostActionTypes());
      System.out.println(result.getTopicFlagTypes());
      System.out.println(result.getCanCreateTag());
      System.out.println(result.getCanTagTopics());
      System.out.println(result.getCanTagPms());
      System.out.println(result.getTagsFilterRegexp());
      System.out.println(result.getTopTags());
      System.out.println(result.getWizardRequired());
      System.out.println(result.getCanAssociateGroups());
      System.out.println(result.getTopicFeaturedLinkAllowedCategoryIds());
      System.out.println(result.getUserThemes());
      System.out.println(result.getUserColorSchemes());
      System.out.println(result.getDefaultDarkColorScheme());
      System.out.println(result.getCensoredRegexp());
      System.out.println(result.getCustomEmojiTranslation());
      System.out.println(result.getWatchedWordsReplace());
      System.out.println(result.getWatchedWordsLink());
      System.out.println(result.getMarkdownAdditionalOptions());
      System.out.println(result.getHashtagConfigurations());
      System.out.println(result.getHashtagIcons());
      System.out.println(result.getDisplayedAboutPluginStatGroups());
      System.out.println(result.getCategories());
      System.out.println(result.getArchetypes());
      System.out.println(result.getUserFields());
      System.out.println(result.getAuthProviders());
      System.out.println(result.getWhispersAllowedGroupsNames());
      System.out.println(result.getDeniedEmojis());
      System.out.println(result.getNavigationMenuSiteTopTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoriesAndSubcategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SiteGetCategoriesAndSubcategoriesResponse> response = client
              .categories
              .getCategoriesAndSubcategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoriesAndSubcategories");
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

[**SiteGetCategoriesAndSubcategoriesResponse**](SiteGetCategoriesAndSubcategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="getCategoryByIdJson"></a>
# **getCategoryByIdJson**
> CategoriesGetCategoryByIdJsonResponse getCategoryByIdJson(id).execute();

Show category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
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
      CategoriesGetCategoryByIdJsonResponse result = client
              .categories
              .getCategoryByIdJson(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategory());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoryByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoriesGetCategoryByIdJsonResponse> response = client
              .categories
              .getCategoryByIdJson(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoryByIdJson");
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

[**CategoriesGetCategoryByIdJsonResponse**](CategoriesGetCategoryByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

<a name="list"></a>
# **list**
> CategoriesListResponse list().includeSubcategories(includeSubcategories).execute();

Retrieves a list of categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    Boolean includeSubcategories = true;
    try {
      CategoriesListResponse result = client
              .categories
              .list()
              .includeSubcategories(includeSubcategories)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryList());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoriesListResponse> response = client
              .categories
              .list()
              .includeSubcategories(includeSubcategories)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#list");
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
| **includeSubcategories** | **Boolean**|  | [optional] [enum: true] |

### Return type

[**CategoriesListResponse**](CategoriesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="listTopics"></a>
# **listTopics**
> CategoriesListTopicsResponse listTopics(slug, id).execute();

List topics

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String slug = "slug_example";
    Integer id = 56;
    try {
      CategoriesListTopicsResponse result = client
              .categories
              .listTopics(slug, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getPrimaryGroups());
      System.out.println(result.getTopicList());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#listTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoriesListTopicsResponse> response = client
              .categories
              .listTopics(slug, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#listTopics");
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
| **slug** | **String**|  | |
| **id** | **Integer**|  | |

### Return type

[**CategoriesListTopicsResponse**](CategoriesListTopicsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

<a name="updateCategoryByIdJson"></a>
# **updateCategoryByIdJson**
> CategoriesUpdateCategoryByIdJsonResponse updateCategoryByIdJson(id).categoriesUpdateCategoryByIdJsonRequest(categoriesUpdateCategoryByIdJsonRequest).execute();

Updates a category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Discourse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://discourse.example.com";
    Discourse client = new Discourse(configuration);
    String name = "name_example";
    Integer id = 56;
    String color = "color_example";
    String textColor = "textColor_example";
    Integer parentCategoryId = 56;
    Boolean allowBadges = true;
    String slug = "slug_example";
    Boolean topicFeaturedLinksAllowed = true;
    CategoriesUpdateCategoryByIdJsonRequestPermissions permissions = new CategoriesUpdateCategoryByIdJsonRequestPermissions();
    Integer searchPriority = 56;
    List<Object> formTemplateIds = Arrays.asList(null);
    try {
      CategoriesUpdateCategoryByIdJsonResponse result = client
              .categories
              .updateCategoryByIdJson(name, id)
              .color(color)
              .textColor(textColor)
              .parentCategoryId(parentCategoryId)
              .allowBadges(allowBadges)
              .slug(slug)
              .topicFeaturedLinksAllowed(topicFeaturedLinksAllowed)
              .permissions(permissions)
              .searchPriority(searchPriority)
              .formTemplateIds(formTemplateIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getCategory());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategoryByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoriesUpdateCategoryByIdJsonResponse> response = client
              .categories
              .updateCategoryByIdJson(name, id)
              .color(color)
              .textColor(textColor)
              .parentCategoryId(parentCategoryId)
              .allowBadges(allowBadges)
              .slug(slug)
              .topicFeaturedLinksAllowed(topicFeaturedLinksAllowed)
              .permissions(permissions)
              .searchPriority(searchPriority)
              .formTemplateIds(formTemplateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategoryByIdJson");
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
| **categoriesUpdateCategoryByIdJsonRequest** | [**CategoriesUpdateCategoryByIdJsonRequest**](CategoriesUpdateCategoryByIdJsonRequest.md)|  | [optional] |

### Return type

[**CategoriesUpdateCategoryByIdJsonResponse**](CategoriesUpdateCategoryByIdJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |

