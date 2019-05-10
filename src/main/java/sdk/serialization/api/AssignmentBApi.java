package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.AssembledOrder;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-10T17:06:50.964221+02:00[Europe/Amsterdam]")
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
     * verify assignment B
     * Verifies the assembled order based on the order request for assignment B.
     * <p><b>200</b> - The correctness of the submitted solution.
     * <p><b>400</b> - The submitted JSON could not be parsed correctly.
     * @param assembledOrder The assembled order based on the given order request.
     * @return SubmissionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<SubmissionResult> verifyB(AssembledOrder assembledOrder) throws HttpClientErrorException {
        Object postBody = assembledOrder;
        
        // verify the required parameter 'assembledOrder' is set
        if (assembledOrder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assembledOrder' when calling verifyB");
        }
        
        String path = UriComponentsBuilder.fromPath("/serialization/b").build().toUriString();
        
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
