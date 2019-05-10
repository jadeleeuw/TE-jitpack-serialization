# AssignmentCApi

All URIs are relative to *https://jeansthesis.nl:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyC**](AssignmentCApi.md#verifyC) | **POST** /serialization/c | verify assignment C


<a name="verifyC"></a>
# **verifyC**
> SubmissionResult verifyC(stockUpdate)

verify assignment C

Verifies the stock update based on the stock request for assignment C.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.AssignmentCApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

AssignmentCApi apiInstance = new AssignmentCApi();
StockUpdate stockUpdate = new StockUpdate(); // StockUpdate | The stock update based on the given stock request.
try {
    SubmissionResult result = apiInstance.verifyC(stockUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentCApi#verifyC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockUpdate** | [**StockUpdate**](StockUpdate.md)| The stock update based on the given stock request. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

