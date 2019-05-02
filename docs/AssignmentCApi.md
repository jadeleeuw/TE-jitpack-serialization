# AssignmentCApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebshopOrder**](AssignmentCApi.md#getWebshopOrder) | **GET** /serialization/c | Get webshop order
[**verifyC**](AssignmentCApi.md#verifyC) | **POST** /serialization/c | verify assignment C


<a name="getWebshopOrder"></a>
# **getWebshopOrder**
> WebshopOrder getWebshopOrder()

Get webshop order

Gets the webshop order that needs to be processed for assignment C.

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
try {
    WebshopOrder result = apiInstance.getWebshopOrder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentCApi#getWebshopOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebshopOrder**](WebshopOrder.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyC"></a>
# **verifyC**
> SubmissionResult verifyC(administrationOrder)

verify assignment C

Verifies the administration order based on the webshop order for assignment C.

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
AdministrationOrder administrationOrder = new AdministrationOrder(); // AdministrationOrder | The administration order based on the given webshop order.
try {
    SubmissionResult result = apiInstance.verifyC(administrationOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentCApi#verifyC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **administrationOrder** | [**AdministrationOrder**](AdministrationOrder.md)| The administration order based on the given webshop order. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

