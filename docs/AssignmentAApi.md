# AssignmentAApi

All URIs are relative to *https://jeansthesis.nl:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyA1**](AssignmentAApi.md#verifyA1) | **POST** /serialization/a/1 | verify assignment A1
[**verifyA2**](AssignmentAApi.md#verifyA2) | **POST** /serialization/a/2 | verify assignment A2
[**verifyA3**](AssignmentAApi.md#verifyA3) | **POST** /serialization/a/3 | verify assignment A3


<a name="verifyA1"></a>
# **verifyA1**
> SubmissionResult verifyA1(requestBody)

verify assignment A1

Verifies assignment A1.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.AssignmentAApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

AssignmentAApi apiInstance = new AssignmentAApi();
List<String> requestBody = Arrays.asList(); // List<String> | The array of PSU identifiers.
try {
    SubmissionResult result = apiInstance.verifyA1(requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentAApi#verifyA1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**List&lt;String&gt;**](List.md)| The array of PSU identifiers. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyA2"></a>
# **verifyA2**
> SubmissionResult verifyA2(GPU)

verify assignment A2

Verifies assignment A2.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.AssignmentAApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

AssignmentAApi apiInstance = new AssignmentAApi();
GPU GPU = new GPU(); // GPU | The GPU object.
try {
    SubmissionResult result = apiInstance.verifyA2(GPU);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentAApi#verifyA2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GPU** | [**GPU**](GPU.md)| The GPU object. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyA3"></a>
# **verifyA3**
> SubmissionResult verifyA3(pcPart)

verify assignment A3

Verifies assignment A3.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.AssignmentAApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

AssignmentAApi apiInstance = new AssignmentAApi();
List<PCPart> pcPart = Arrays.asList(null); // List<PCPart> | The array of PC parts.
try {
    SubmissionResult result = apiInstance.verifyA3(pcPart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentAApi#verifyA3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pcPart** | [**List&lt;PCPart&gt;**](List.md)| The array of PC parts. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

