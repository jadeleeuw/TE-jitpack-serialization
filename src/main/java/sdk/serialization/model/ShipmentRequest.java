/*
 * Serialization API
 * All endpoints related to the serialization assignment.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sdk.serialization.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import sdk.serialization.model.CustomerOrderRequest;

/**
 * ShipmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-26T15:59:01.100196+02:00[Europe/Amsterdam]")
public class ShipmentRequest {
  @JsonProperty("orderRequests")
  private List<CustomerOrderRequest> orderRequests = new ArrayList<>();

  public ShipmentRequest orderRequests(List<CustomerOrderRequest> orderRequests) {
    this.orderRequests = orderRequests;
    return this;
  }

  public ShipmentRequest addOrderRequestsItem(CustomerOrderRequest orderRequestsItem) {
    this.orderRequests.add(orderRequestsItem);
    return this;
  }

   /**
   * Get orderRequests
   * @return orderRequests
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomerOrderRequest> getOrderRequests() {
    return orderRequests;
  }

  public void setOrderRequests(List<CustomerOrderRequest> orderRequests) {
    this.orderRequests = orderRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentRequest shipmentRequest = (ShipmentRequest) o;
    return Objects.equals(this.orderRequests, shipmentRequest.orderRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentRequest {\n");
    
    sb.append("    orderRequests: ").append(toIndentedString(orderRequests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

