package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.Customer;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-02T16:01:11.088770+02:00[Europe/Amsterdam]")
public class WebstoreApi {
    private ApiClient apiClient;

    public WebstoreApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebstoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get customer by ID
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
        String path = UriComponentsBuilder.fromPath("/webstore/customer/{customerId}").buildAndExpand(uriVariables).toUriString();
        
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
}
