package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.StockUpdate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-21T13:46:39.597167+02:00[Europe/Amsterdam]")
public class OptionalAssignmentCApi {
    private ApiClient apiClient;

    public OptionalAssignmentCApi() {
        this(new ApiClient());
    }

    @Autowired
    public OptionalAssignmentCApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * verify assignment C
     * Verifies the stock update based on the stock request for assignment C.
     * <p><b>200</b> - The correctness of the submitted solution.
     * <p><b>400</b> - The submitted JSON could not be parsed correctly.
     * @param stockUpdate The stock update based on the given stock request.
     * @return SubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<SubmissionResult> verifyC(StockUpdate stockUpdate) throws HttpClientErrorException {
        Object postBody = stockUpdate;
        
        // verify the required parameter 'stockUpdate' is set
        if (stockUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stockUpdate' when calling verifyC");
        }
        
        String path = UriComponentsBuilder.fromPath("/optional/serialization/c").build().toUriString();
        
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
