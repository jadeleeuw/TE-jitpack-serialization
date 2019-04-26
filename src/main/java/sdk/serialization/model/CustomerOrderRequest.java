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
import sdk.serialization.model.PCOrder;

/**
 * CustomerOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-26T15:17:24.338706+02:00[Europe/Amsterdam]")
public class CustomerOrderRequest {
  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("pcs")
  private List<PCOrder> pcs = new ArrayList<>();

  public CustomerOrderRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomerOrderRequest pcs(List<PCOrder> pcs) {
    this.pcs = pcs;
    return this;
  }

  public CustomerOrderRequest addPcsItem(PCOrder pcsItem) {
    this.pcs.add(pcsItem);
    return this;
  }

   /**
   * Get pcs
   * @return pcs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PCOrder> getPcs() {
    return pcs;
  }

  public void setPcs(List<PCOrder> pcs) {
    this.pcs = pcs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerOrderRequest customerOrderRequest = (CustomerOrderRequest) o;
    return Objects.equals(this.customerId, customerOrderRequest.customerId) &&
        Objects.equals(this.pcs, customerOrderRequest.pcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, pcs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderRequest {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    pcs: ").append(toIndentedString(pcs)).append("\n");
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

