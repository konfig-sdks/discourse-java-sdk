# SiteApi

All URIs are relative to *https://discourse.example.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategoriesAndSubcategories**](SiteApi.md#getCategoriesAndSubcategories) | **GET** /site.json | Get site info |


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
import com.konfigthis.client.api.SiteApi;
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
              .site
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
      System.err.println("Exception when calling SiteApi#getCategoriesAndSubcategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SiteGetCategoriesAndSubcategoriesResponse> response = client
              .site
              .getCategoriesAndSubcategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SiteApi#getCategoriesAndSubcategories");
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

