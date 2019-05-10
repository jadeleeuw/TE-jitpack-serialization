# WebstoreApi

All URIs are relative to *https://jeansthesis.nl:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomer**](WebstoreApi.md#getCustomer) | **GET** /webstore/customer/{customerId} | Get customer by ID
[**getOrderRequest**](WebstoreApi.md#getOrderRequest) | **GET** /webstore/orders/requests/assignment_b | Get order request


<a name="getCustomer"></a>
# **getCustomer**
> Customer getCustomer(customerId)

Get customer by ID

Gets all the information about the customer with the specified ID.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WebstoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WebstoreApi apiInstance = new WebstoreApi();
String customerId = "customerId_example"; // String | The id of the customer.
try {
    Customer result = apiInstance.getCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebstoreApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer. |

### Return type

[**Customer**](Customer.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderRequest"></a>
# **getOrderRequest**
> OrderRequest getOrderRequest()

Get order request

Gets the order request that needs to be assembled for assignment B.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WebstoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WebstoreApi apiInstance = new WebstoreApi();
try {
    OrderRequest result = apiInstance.getOrderRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebstoreApi#getOrderRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderRequest**](OrderRequest.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

