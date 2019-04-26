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
import sdk.serialization.model.PC;

/**
 * CustomerOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-26T15:17:24.338706+02:00[Europe/Amsterdam]")
public class CustomerOrder {
  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("pcs")
  private List<PC> pcs = new ArrayList<>();

  public CustomerOrder customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public CustomerOrder pcs(List<PC> pcs) {
    this.pcs = pcs;
    return this;
  }

  public CustomerOrder addPcsItem(PC pcsItem) {
    this.pcs.add(pcsItem);
    return this;
  }

   /**
   * Get pcs
   * @return pcs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PC> getPcs() {
    return pcs;
  }

  public void setPcs(List<PC> pcs) {
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
    CustomerOrder customerOrder = (CustomerOrder) o;
    return Objects.equals(this.customer, customerOrder.customer) &&
        Objects.equals(this.pcs, customerOrder.pcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, pcs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrder {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

