# openapi-java-client

Serialization API
- API version: 1.0
  - Build date: 2019-04-25T16:28:59.613360+02:00[Europe/Amsterdam]

All endpoints related to the serialization assignment.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import sdk.serialization.*;
import sdk.serialization.auth.*;
import sdk.serialization.model.*;
import sdk.serialization.api.AssignmentAApi;

import java.io.File;
import java.util.*;

public class AssignmentAApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/serialization*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssignmentAApi* | [**verifyA1**](docs/AssignmentAApi.md#verifyA1) | **POST** /a/1 | verify assignment A1
*AssignmentAApi* | [**verifyA2**](docs/AssignmentAApi.md#verifyA2) | **POST** /a/2 | verify assignment A2
*AssignmentAApi* | [**verifyA3**](docs/AssignmentAApi.md#verifyA3) | **POST** /a/3 | verify assignment A3
*AssignmentBApi* | [**getCustomer**](docs/AssignmentBApi.md#getCustomer) | **GET** /customer/{customerId} | Get customer
*AssignmentBApi* | [**getShipmentRequest**](docs/AssignmentBApi.md#getShipmentRequest) | **GET** /b | Get shipment request
*AssignmentBApi* | [**verifyB**](docs/AssignmentBApi.md#verifyB) | **POST** /b | verify assignment B
*AssignmentCApi* | [**getWebshopOrder**](docs/AssignmentCApi.md#getWebshopOrder) | **GET** /c | Get webshop order
*AssignmentCApi* | [**verifyC**](docs/AssignmentCApi.md#verifyC) | **POST** /c | verify assignment C


## Documentation for Models

 - [AdministrationOrder](docs/AdministrationOrder.md)
 - [CPU](docs/CPU.md)
 - [Cooling](docs/Cooling.md)
 - [Customer](docs/Customer.md)
 - [CustomerOrder](docs/CustomerOrder.md)
 - [CustomerOrderRequest](docs/CustomerOrderRequest.md)
 - [GPU](docs/GPU.md)
 - [ModelCase](docs/ModelCase.md)
 - [PC](docs/PC.md)
 - [PCOrder](docs/PCOrder.md)
 - [PSU](docs/PSU.md)
 - [Sale](docs/Sale.md)
 - [Shipment](docs/Shipment.md)
 - [ShipmentRequest](docs/ShipmentRequest.md)
 - [Storage](docs/Storage.md)
 - [SubmissionResult](docs/SubmissionResult.md)
 - [WebshopOrder](docs/WebshopOrder.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### idKey

- **Type**: API key
- **API key parameter name**: x-id-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



