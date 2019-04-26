# WebstoreApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomer**](WebstoreApi.md#getCustomer) | **GET** /webstore/customer/{customerId} | Get customer by ID
[**getProduct**](WebstoreApi.md#getProduct) | **GET** /warehouse/{productId} | Get product/part by ID


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

<a name="getProduct"></a>
# **getProduct**
> Object getProduct(productId)

Get product/part by ID

Gets all the information about the product with the specified ID.

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
String productId = "productId_example"; // String | The id of the product.
try {
    Object result = apiInstance.getProduct(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebstoreApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product. |

### Return type

**Object**

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

