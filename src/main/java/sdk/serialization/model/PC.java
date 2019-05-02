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
 * PC
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-02T13:42:14.442064+02:00[Europe/Amsterdam]")
public class PC {
  @JsonProperty("caze")
  private Caze caze = null;

  @JsonProperty("cooling")
  private Cooling cooling = null;

  @JsonProperty("cpu")
  private CPU cpu = null;

  @JsonProperty("gpu")
  private GPU gpu = null;

  @JsonProperty("psu")
  private PSU psu = null;

  @JsonProperty("storage")
  private List<Storage> storage = new ArrayList<>();

  public PC caze(Caze caze) {
    this.caze = caze;
    return this;
  }

   /**
   * Get caze
   * @return caze
  **/
  @ApiModelProperty(required = true, value = "")
  public Caze getCaze() {
    return caze;
  }

  public void setCaze(Caze caze) {
    this.caze = caze;
  }

  public PC cooling(Cooling cooling) {
    this.cooling = cooling;
    return this;
  }

   /**
   * Get cooling
   * @return cooling
  **/
  @ApiModelProperty(required = true, value = "")
  public Cooling getCooling() {
    return cooling;
  }

  public void setCooling(Cooling cooling) {
    this.cooling = cooling;
  }

  public PC cpu(CPU cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @ApiModelProperty(required = true, value = "")
  public CPU getCpu() {
    return cpu;
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  public PC gpu(GPU gpu) {
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @ApiModelProperty(required = true, value = "")
  public GPU getGpu() {
    return gpu;
  }

  public void setGpu(GPU gpu) {
    this.gpu = gpu;
  }

  public PC psu(PSU psu) {
    this.psu = psu;
    return this;
  }

   /**
   * Get psu
   * @return psu
  **/
  @ApiModelProperty(required = true, value = "")
  public PSU getPsu() {
    return psu;
  }

  public void setPsu(PSU psu) {
    this.psu = psu;
  }

  public PC storage(List<Storage> storage) {
    this.storage = storage;
    return this;
  }

  public PC addStorageItem(Storage storageItem) {
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
    PC PC = (PC) o;
    return Objects.equals(this.caze, PC.caze) &&
        Objects.equals(this.cooling, PC.cooling) &&
        Objects.equals(this.cpu, PC.cpu) &&
        Objects.equals(this.gpu, PC.gpu) &&
        Objects.equals(this.psu, PC.psu) &&
        Objects.equals(this.storage, PC.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caze, cooling, cpu, gpu, psu, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PC {\n");
    
    sb.append("    caze: ").append(toIndentedString(caze)).append("\n");
    sb.append("    cooling: ").append(toIndentedString(cooling)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    psu: ").append(toIndentedString(psu)).append("\n");
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

