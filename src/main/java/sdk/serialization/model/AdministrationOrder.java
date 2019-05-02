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
import sdk.serialization.model.Sale;

/**
 * AdministrationOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-02T13:57:43.349820+02:00[Europe/Amsterdam]")
public class AdministrationOrder {
  @JsonProperty("sales")
  private List<Sale> sales = new ArrayList<>();

  public AdministrationOrder sales(List<Sale> sales) {
    this.sales = sales;
    return this;
  }

  public AdministrationOrder addSalesItem(Sale salesItem) {
    this.sales.add(salesItem);
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Sale> getSales() {
    return sales;
  }

  public void setSales(List<Sale> sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdministrationOrder administrationOrder = (AdministrationOrder) o;
    return Objects.equals(this.sales, administrationOrder.sales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdministrationOrder {\n");
    
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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

