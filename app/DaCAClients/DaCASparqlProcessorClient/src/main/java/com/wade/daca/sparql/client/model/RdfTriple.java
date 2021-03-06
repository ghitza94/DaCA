/*
 * DaCASparqlProcessor
 * This is DaCA's Sparql Processor service.  You can find out more about     us at [https://github.com/catalin-vlas/DaCA](DaCA).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: aurelian.hreapca@info.uaic.ro
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wade.daca.sparql.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * RdfTriple
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-31T15:22:36.080Z")
public class RdfTriple {
  @SerializedName("subject")
  private String subject = null;

  @SerializedName("predicate")
  private String predicate = null;

  @SerializedName("object")
  private String object = null;

  public RdfTriple subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public RdfTriple predicate(String predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @ApiModelProperty(value = "")
  public String getPredicate() {
    return predicate;
  }

  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }

  public RdfTriple object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RdfTriple rdfTriple = (RdfTriple) o;
    return Objects.equals(this.subject, rdfTriple.subject) &&
        Objects.equals(this.predicate, rdfTriple.predicate) &&
        Objects.equals(this.object, rdfTriple.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, predicate, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RdfTriple {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

