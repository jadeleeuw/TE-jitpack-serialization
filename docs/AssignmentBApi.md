# AssignmentBApi

All URIs are relative to *https://jeansthesis.nl:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyB**](AssignmentBApi.md#verifyB) | **POST** /serialization/b | verify assignment B


<a name="verifyB"></a>
# **verifyB**
> SubmissionResult verifyB(assembledOrder)

verify assignment B

Verifies the assembled order based on the order request for assignment B.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.AssignmentBApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

AssignmentBApi apiInstance = new AssignmentBApi();
AssembledOrder assembledOrder = new AssembledOrder(); // AssembledOrder | The assembled order based on the given order request.
try {
    SubmissionResult result = apiInstance.verifyB(assembledOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentBApi#verifyB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assembledOrder** | [**AssembledOrder**](AssembledOrder.md)| The assembled order based on the given order request. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

