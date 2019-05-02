# AssignmentBApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShipmentRequest**](AssignmentBApi.md#getShipmentRequest) | **GET** /serialization/b | Get shipment request
[**verifyB**](AssignmentBApi.md#verifyB) | **POST** /serialization/b | verify assignment B



## getShipmentRequest

> ShipmentRequest getShipmentRequest()

Get shipment request

Gets the shipment request that needs to be handled for assignment B.

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
try {
    ShipmentRequest result = apiInstance.getShipmentRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentBApi#getShipmentRequest");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ShipmentRequest**](ShipmentRequest.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## verifyB

> SubmissionResult verifyB(shipment)

verify assignment B

Verifies the shipment based on the shipment request for assignment B.

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
Shipment shipment = new Shipment(); // Shipment | The shipment based on the given shipment request.
try {
    SubmissionResult result = apiInstance.verifyB(shipment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssignmentBApi#verifyB");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipment** | [**Shipment**](Shipment.md)| The shipment based on the given shipment request. |

### Return type

[**SubmissionResult**](SubmissionResult.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

