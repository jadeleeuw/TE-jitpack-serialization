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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import sdk.serialization.model.CPU;
import sdk.serialization.model.Caze;
import sdk.serialization.model.Cooling;
import sdk.serialization.model.GPU;
import sdk.serialization.model.PSU;
import sdk.serialization.model.Storage;

/**
 * PCPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-02T13:50:19.425903+02:00[Europe/Amsterdam]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "category", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Caze.class, name = "CASE"),
  @JsonSubTypes.Type(value = Cooling.class, name = "COOLING"),
  @JsonSubTypes.Type(value = CPU.class, name = "CPU"),
  @JsonSubTypes.Type(value = GPU.class, name = "GPU"),
  @JsonSubTypes.Type(value = PSU.class, name = "PSU"),
  @JsonSubTypes.Type(value = Storage.class, name = "STORAGE"),
})

public class PCPart {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PCPart {\n");
    
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

