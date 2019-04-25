package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.Customer;
import sdk.serialization.model.Shipment;
import sdk.serialization.model.ShipmentRequest;
import sdk.serialization.model.SubmissionResult;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-25T16:28:59.613360+02:00[Europe/Amsterdam]")
public class AssignmentBApi {
    private ApiClient apiClient;

    public AssignmentBApi() {
        this(new ApiClient());
    }

    @Autowired
    public AssignmentBApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get customer
     * Gets all the information about the customer with the specified ID.
     * <p><b>200</b> - All information about the customer.
     * <p><b>400</b> - The customer with the specified ID could not be found.
     * @param customerId The id of the customer.
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> getCustomer(String customerId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        String path = UriComponentsBuilder.fromPath("/customer/{customerId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Customer> returnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get shipment request
     * Gets the shipment request that needs to be handled for assignment B.
     * <p><b>200</b> - The shipment request that needs to be handled for assignment B.
     * @return ShipmentRequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<ShipmentRequest> getShipmentRequest() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/b").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<ShipmentRequest> returnType = new ParameterizedTypeReference<ShipmentRequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * verify assignment B
     * Verifies the shipment based on the shipment request for assignment B.
     * <p><b>200</b> - The correctness of the submitted solution.
     * <p><b>400</b> - The submitted JSON could not be parsed correctly.
     * @param shipment The shipment based on the given shipment request.
     * @return SubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<SubmissionResult> verifyB(Shipment shipment) throws HttpClientErrorException {
        Object postBody = shipment;
        
        // verify the required parameter 'shipment' is set
        if (shipment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipment' when calling verifyB");
        }
        
        String path = UriComponentsBuilder.fromPath("/b").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<SubmissionResult> returnType = new ParameterizedTypeReference<SubmissionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
