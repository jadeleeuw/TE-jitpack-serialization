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
import sdk.serialization.model.CPU;
import sdk.serialization.model.GPU;
import sdk.serialization.model.PCCase;
import sdk.serialization.model.PSU;

/**
 * Catalog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-21T13:46:39.597167+02:00[Europe/Amsterdam]")
public class Catalog {
  @JsonProperty("pcCases")
  private List<PCCase> pcCases = new ArrayList<>();

  @JsonProperty("cpus")
  private List<CPU> cpus = new ArrayList<>();

  @JsonProperty("gpus")
  private List<GPU> gpus = new ArrayList<>();

  @JsonProperty("psus")
  private List<PSU> psus = new ArrayList<>();

  public Catalog pcCases(List<PCCase> pcCases) {
    this.pcCases = pcCases;
    return this;
  }

  public Catalog addPcCasesItem(PCCase pcCasesItem) {
    this.pcCases.add(pcCasesItem);
    return this;
  }

   /**
   * Get pcCases
   * @return pcCases
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PCCase> getPcCases() {
    return pcCases;
  }

  public void setPcCases(List<PCCase> pcCases) {
    this.pcCases = pcCases;
  }

  public Catalog cpus(List<CPU> cpus) {
    this.cpus = cpus;
    return this;
  }

  public Catalog addCpusItem(CPU cpusItem) {
    this.cpus.add(cpusItem);
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CPU> getCpus() {
    return cpus;
  }

  public void setCpus(List<CPU> cpus) {
    this.cpus = cpus;
  }

  public Catalog gpus(List<GPU> gpus) {
    this.gpus = gpus;
    return this;
  }

  public Catalog addGpusItem(GPU gpusItem) {
    this.gpus.add(gpusItem);
    return this;
  }

   /**
   * Get gpus
   * @return gpus
  **/
  @ApiModelProperty(required = true, value = "")
  public List<GPU> getGpus() {
    return gpus;
  }

  public void setGpus(List<GPU> gpus) {
    this.gpus = gpus;
  }

  public Catalog psus(List<PSU> psus) {
    this.psus = psus;
    return this;
  }

  public Catalog addPsusItem(PSU psusItem) {
    this.psus.add(psusItem);
    return this;
  }

   /**
   * Get psus
   * @return psus
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PSU> getPsus() {
    return psus;
  }

  public void setPsus(List<PSU> psus) {
    this.psus = psus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.pcCases, catalog.pcCases) &&
        Objects.equals(this.cpus, catalog.cpus) &&
        Objects.equals(this.gpus, catalog.gpus) &&
        Objects.equals(this.psus, catalog.psus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pcCases, cpus, gpus, psus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    pcCases: ").append(toIndentedString(pcCases)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    gpus: ").append(toIndentedString(gpus)).append("\n");
    sb.append("    psus: ").append(toIndentedString(psus)).append("\n");
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

