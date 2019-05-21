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

/**
 * PCBuildRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-21T13:46:39.597167+02:00[Europe/Amsterdam]")
public class PCBuildRequest {
  @JsonProperty("partIds")
  private List<String> partIds = new ArrayList<>();

  public PCBuildRequest partIds(List<String> partIds) {
    this.partIds = partIds;
    return this;
  }

  public PCBuildRequest addPartIdsItem(String partIdsItem) {
    this.partIds.add(partIdsItem);
    return this;
  }

   /**
   * Get partIds
   * @return partIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getPartIds() {
    return partIds;
  }

  public void setPartIds(List<String> partIds) {
    this.partIds = partIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PCBuildRequest pcBuildRequest = (PCBuildRequest) o;
    return Objects.equals(this.partIds, pcBuildRequest.partIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PCBuildRequest {\n");
    
    sb.append("    partIds: ").append(toIndentedString(partIds)).append("\n");
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

