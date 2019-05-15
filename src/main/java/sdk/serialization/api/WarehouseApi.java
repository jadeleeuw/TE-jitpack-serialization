package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.CPU;
import sdk.serialization.model.Catalog;
import sdk.serialization.model.Cooling;
import sdk.serialization.model.GPU;
import sdk.serialization.model.PC;
import sdk.serialization.model.PCCase;
import sdk.serialization.model.PCPart;
import sdk.serialization.model.PSU;
import sdk.serialization.model.StockRequest;
import sdk.serialization.model.Storage;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-15T10:40:23.135848+02:00[Europe/Amsterdam]")
public class WarehouseApi {
    private ApiClient apiClient;

    public WarehouseApi() {
        this(new ApiClient());
    }

    @Autowired
    public WarehouseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Assemble PC parts into a PC.
     * Assembles the given PC parts into a PC and returns the constructed PC.
     * <p><b>200</b> - The constructed PC
     * <p><b>400</b> - Unable to assemble the PC. There was either a component missing or multiple components of the same category (with the exception of storage)
     * @param pcPart The parts that should be used in the PC.
     * @return PC
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PC> assemblePC(List<PCPart> pcPart) throws HttpClientErrorException {
        Object postBody = pcPart;
        
        // verify the required parameter 'pcPart' is set
        if (pcPart == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pcPart' when calling assemblePC");
        }
        
        String path = UriComponentsBuilder.fromPath("/warehouse/assemble").build().toUriString();
        
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

        ParameterizedTypeReference<PC> returnType = new ParameterizedTypeReference<PC>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all CPUs
     * Returns an array of all CPU objects in the warehouse
     * <p><b>200</b> - An array of all CPU objects
     * @return List&lt;CPU&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<CPU> getCPUs() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/cpus").build().toUriString();
        
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

        ParameterizedTypeReference<CPU> returnType = new ParameterizedTypeReference<CPU>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all PC cases
     * Returns an array of all pc case objects in the warehouse
     * <p><b>200</b> - An array of all case objects
     * @return List&lt;PCCase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<PCCase> getCases() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/cases").build().toUriString();
        
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

        ParameterizedTypeReference<PCCase> returnType = new ParameterizedTypeReference<PCCase>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a catalog containing all parts divided in categories
     * Returns a catalog containing all parts divided in their respective categories.
     * <p><b>200</b> - The catalog containing all parts divided in catagories
     * @return Catalog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Catalog> getCatalog() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/catalog").build().toUriString();
        
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

        ParameterizedTypeReference<Catalog> returnType = new ParameterizedTypeReference<Catalog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all cooling possibilities
     * Returns an array of all cooling objects in the warehouse
     * <p><b>200</b> - An array of all cooling objects
     * @return List&lt;Cooling&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Cooling> getCooling() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/cooling").build().toUriString();
        
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

        ParameterizedTypeReference<Cooling> returnType = new ParameterizedTypeReference<Cooling>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all GPUs
     * Returns an array of all GPU objects in the warehouse
     * <p><b>200</b> - An array of all GPU objects
     * @return List&lt;GPU&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GPU> getGPUs() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/gpus").build().toUriString();
        
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

        ParameterizedTypeReference<GPU> returnType = new ParameterizedTypeReference<GPU>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all PSUs
     * Returns an array of all PSU objects in the warehouse
     * <p><b>200</b> - An array of all PSU objects
     * @return List&lt;PSU&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<PSU> getPSUs() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/psus").build().toUriString();
        
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

        ParameterizedTypeReference<PSU> returnType = new ParameterizedTypeReference<PSU>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all parts in the warehouse in one list
     * Returns all parts in the warehouse as a single list, without division in categories
     * <p><b>200</b> - An array containing all parts in the warehouse
     * @return List&lt;PCPart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<PCPart> getPartslist() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/partslist").build().toUriString();
        
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

        ParameterizedTypeReference<PCPart> returnType = new ParameterizedTypeReference<PCPart>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get product/part by ID
     * Gets all the information about the product with the specified ID.
     * <p><b>200</b> - All information about the product
     * <p><b>400</b> - The product with the specified ID could not be found.
     * @param productId The id of the product.
     * @return PCPart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PCPart> getProduct(String productId) throws HttpClientErrorException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getProduct");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("productId", productId);
        String path = UriComponentsBuilder.fromPath("/warehouse/product/{productId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PCPart> returnType = new ParameterizedTypeReference<PCPart>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get stock request
     * Gets the stock request that needs to be processed for assignment C.
     * <p><b>200</b> - The stock request that needs to be processed for assignment C.
     * @return StockRequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<StockRequest> getStockRequest() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/stock/requests/assignment_c").build().toUriString();
        
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

        ParameterizedTypeReference<StockRequest> returnType = new ParameterizedTypeReference<StockRequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns all storage possibilities
     * Returns an array of all storage objects in the warehouse
     * <p><b>200</b> - An array of all storage objects
     * @return List&lt;Storage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Storage> getStorage() throws HttpClientErrorException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/warehouse/storage").build().toUriString();
        
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

        ParameterizedTypeReference<Storage> returnType = new ParameterizedTypeReference<Storage>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
