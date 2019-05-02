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
import sdk.serialization.model.Caze;
import sdk.serialization.model.Cooling;
import sdk.serialization.model.GPU;
import sdk.serialization.model.PSU;
import sdk.serialization.model.Storage;

/**
 * Catalog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-02T13:57:43.349820+02:00[Europe/Amsterdam]")
public class Catalog {
  @JsonProperty("cases")
  private List<Caze> cases = new ArrayList<>();

  @JsonProperty("cooling")
  private List<Cooling> cooling = new ArrayList<>();

  @JsonProperty("cpus")
  private List<CPU> cpus = new ArrayList<>();

  @JsonProperty("gpus")
  private List<GPU> gpus = new ArrayList<>();

  @JsonProperty("psus")
  private List<PSU> psus = new ArrayList<>();

  @JsonProperty("storage")
  private List<Storage> storage = new ArrayList<>();

  public Catalog cases(List<Caze> cases) {
    this.cases = cases;
    return this;
  }

  public Catalog addCasesItem(Caze casesItem) {
    this.cases.add(casesItem);
    return this;
  }

   /**
   * Get cases
   * @return cases
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Caze> getCases() {
    return cases;
  }

  public void setCases(List<Caze> cases) {
    this.cases = cases;
  }

  public Catalog cooling(List<Cooling> cooling) {
    this.cooling = cooling;
    return this;
  }

  public Catalog addCoolingItem(Cooling coolingItem) {
    this.cooling.add(coolingItem);
    return this;
  }

   /**
   * Get cooling
   * @return cooling
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Cooling> getCooling() {
    return cooling;
  }

  public void setCooling(List<Cooling> cooling) {
    this.cooling = cooling;
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

  public Catalog storage(List<Storage> storage) {
    this.storage = storage;
    return this;
  }

  public Catalog addStorageItem(Storage storageItem) {
    this.storage.add(storageItem);
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Storage> getStorage() {
    return storage;
  }

  public void setStorage(List<Storage> storage) {
    this.storage = storage;
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
    return Objects.equals(this.cases, catalog.cases) &&
        Objects.equals(this.cooling, catalog.cooling) &&
        Objects.equals(this.cpus, catalog.cpus) &&
        Objects.equals(this.gpus, catalog.gpus) &&
        Objects.equals(this.psus, catalog.psus) &&
        Objects.equals(this.storage, catalog.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cases, cooling, cpus, gpus, psus, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    cooling: ").append(toIndentedString(cooling)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    gpus: ").append(toIndentedString(gpus)).append("\n");
    sb.append("    psus: ").append(toIndentedString(psus)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

