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
import sdk.serialization.model.PCPart;

/**
 * PSU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-21T13:46:39.597167+02:00[Europe/Amsterdam]")
public class PSU extends PCPart {
  @JsonProperty("wattage")
  private Integer wattage;

  public PSU wattage(Integer wattage) {
    this.wattage = wattage;
    return this;
  }

   /**
   * Get wattage
   * @return wattage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWattage() {
    return wattage;
  }

  public void setWattage(Integer wattage) {
    this.wattage = wattage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PSU PSU = (PSU) o;
    return Objects.equals(this.wattage, PSU.wattage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wattage, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PSU {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    wattage: ").append(toIndentedString(wattage)).append("\n");
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

