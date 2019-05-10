# WarehouseApi

All URIs are relative to *https://jeansthesis.nl:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assemblePC**](WarehouseApi.md#assemblePC) | **POST** /warehouse/assemble | Assemble PC parts into a PC.
[**getCPUs**](WarehouseApi.md#getCPUs) | **GET** /warehouse/cpus | Returns all CPUs
[**getCases**](WarehouseApi.md#getCases) | **GET** /warehouse/cases | Returns all cases
[**getCatalog**](WarehouseApi.md#getCatalog) | **GET** /warehouse/catalog | Returns a catalog containing all parts divided in categories
[**getCooling**](WarehouseApi.md#getCooling) | **GET** /warehouse/cooling | Returns all cooling possibilities
[**getGPUs**](WarehouseApi.md#getGPUs) | **GET** /warehouse/gpus | Returns all GPUs
[**getPSUs**](WarehouseApi.md#getPSUs) | **GET** /warehouse/psus | Returns all PSUs
[**getPartslist**](WarehouseApi.md#getPartslist) | **GET** /warehouse/partslist | Returns all parts in the warehouse in one list
[**getProduct**](WarehouseApi.md#getProduct) | **GET** /warehouse/product/{productId} | Get product/part by ID
[**getStockRequest**](WarehouseApi.md#getStockRequest) | **GET** /warehouse/stock/requests/assignment_c | Get stock request
[**getStorage**](WarehouseApi.md#getStorage) | **GET** /warehouse/storage | Returns all storage possibilities


<a name="assemblePC"></a>
# **assemblePC**
> PC assemblePC(pcPart)

Assemble PC parts into a PC.

Assembles the given PC parts into a PC and returns the constructed PC.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
List<PCPart> pcPart = Arrays.asList(null); // List<PCPart> | The parts that should be used in the PC.
try {
    PC result = apiInstance.assemblePC(pcPart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#assemblePC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pcPart** | [**List&lt;PCPart&gt;**](List.md)| The parts that should be used in the PC. |

### Return type

[**PC**](PC.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCPUs"></a>
# **getCPUs**
> List&lt;CPU&gt; getCPUs()

Returns all CPUs

Returns an array of all CPU objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<CPU> result = apiInstance.getCPUs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getCPUs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CPU&gt;**](CPU.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCases"></a>
# **getCases**
> List&lt;ModelCase&gt; getCases()

Returns all cases

Returns an array of all case objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<ModelCase> result = apiInstance.getCases();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getCases");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModelCase&gt;**](ModelCase.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalog"></a>
# **getCatalog**
> Catalog getCatalog()

Returns a catalog containing all parts divided in categories

Returns a catalog containing all parts divided in their respective categories.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    Catalog result = apiInstance.getCatalog();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getCatalog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Catalog**](Catalog.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCooling"></a>
# **getCooling**
> List&lt;Cooling&gt; getCooling()

Returns all cooling possibilities

Returns an array of all cooling objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<Cooling> result = apiInstance.getCooling();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getCooling");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Cooling&gt;**](Cooling.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGPUs"></a>
# **getGPUs**
> List&lt;GPU&gt; getGPUs()

Returns all GPUs

Returns an array of all GPU objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<GPU> result = apiInstance.getGPUs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getGPUs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GPU&gt;**](GPU.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPSUs"></a>
# **getPSUs**
> List&lt;PSU&gt; getPSUs()

Returns all PSUs

Returns an array of all PSU objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<PSU> result = apiInstance.getPSUs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getPSUs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PSU&gt;**](PSU.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPartslist"></a>
# **getPartslist**
> List&lt;PCPart&gt; getPartslist()

Returns all parts in the warehouse in one list

Returns all parts in the warehouse as a single list, without division in categories

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<PCPart> result = apiInstance.getPartslist();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getPartslist");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PCPart&gt;**](PCPart.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProduct"></a>
# **getProduct**
> PCPart getProduct(productId)

Get product/part by ID

Gets all the information about the product with the specified ID.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
String productId = "productId_example"; // String | The id of the product.
try {
    PCPart result = apiInstance.getProduct(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product. |

### Return type

[**PCPart**](PCPart.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStockRequest"></a>
# **getStockRequest**
> StockRequest getStockRequest()

Get stock request

Gets the stock request that needs to be processed for assignment C.

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    StockRequest result = apiInstance.getStockRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getStockRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StockRequest**](StockRequest.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorage"></a>
# **getStorage**
> List&lt;Storage&gt; getStorage()

Returns all storage possibilities

Returns an array of all storage objects in the warehouse

### Example
```java
// Import classes:
//import sdk.serialization.ApiClient;
//import sdk.serialization.ApiException;
//import sdk.serialization.Configuration;
//import sdk.serialization.auth.*;
//import sdk.serialization.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
try {
    List<Storage> result = apiInstance.getStorage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getStorage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Storage&gt;**](Storage.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

