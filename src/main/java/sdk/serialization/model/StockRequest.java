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
import sdk.serialization.model.Customer;
import sdk.serialization.model.PCPart;

/**
 * StockRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-21T13:46:39.597167+02:00[Europe/Amsterdam]")
public class StockRequest {
  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("pcParts")
  private List<PCPart> pcParts = null;

  public StockRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public StockRequest pcParts(List<PCPart> pcParts) {
    this.pcParts = pcParts;
    return this;
  }

  public StockRequest addPcPartsItem(PCPart pcPartsItem) {
    if (this.pcParts == null) {
      this.pcParts = new ArrayList<>();
    }
    this.pcParts.add(pcPartsItem);
    return this;
  }

   /**
   * Get pcParts
   * @return pcParts
  **/
  @ApiModelProperty(value = "")
  public List<PCPart> getPcParts() {
    return pcParts;
  }

  public void setPcParts(List<PCPart> pcParts) {
    this.pcParts = pcParts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockRequest stockRequest = (StockRequest) o;
    return Objects.equals(this.customer, stockRequest.customer) &&
        Objects.equals(this.pcParts, stockRequest.pcParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, pcParts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockRequest {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    pcParts: ").append(toIndentedString(pcParts)).append("\n");
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

