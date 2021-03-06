/*
 * Klarna Instant Shopping
 * The Instant Shopping API is serving two purposes:  to manage the orders as they result from the Instant Shopping purchase flow  to generate Instant Shopping Button keys necessary for setting up the Instant Shopping flow both onsite and offsite    The 'authorizations' endpoint is relevant to authorize the orders. The 'buttons' endpoint is relevant to manage the button setup options.   Note that as soon as a purchase initiated through Instant Shopping is authorized with Klarna, the order should be read and handled using the Order Management API.    Button Setup Options is the library for creating and maintaining Instant Shopping Button Keys.  The API is accessible through a few different URLS. There are different URLs for testing and for making live purchases as well as different URLs for depending on if you are based in Europe or in the U.S.  All interaction with Klarna's APIs must be done over HTTPS. To authenticate with Klarna you use your API Credentials and HTTP Basic auth.  The credentials consist of two elements:  Username - Consists of your Merchant ID (eid) - a unique number that identifies your e-store, combined with a random string.  Password - a string which is associated with your Merchant ID and is used to authorize use of Klarna's APIs  Note: The API credentials are separate from your Merchant ID, and it is possible to have several API credentials associated with the same Merchant ID.  The credentials should be sent as an authorization header for every request with the username and password.  You receive both your live and test credentials by contacting Klarna sales for your country.  If the credentials are missing or wrong Klarna will respond with 401 Unauthorized. You can read more about HTTP Basic auth in the Wikipedia article. The username and password the username:password in base64. [https://gist.github.com/brandonmwest/a2632d0a65088a20c00a](Examples)   You can read more about Klarna Data types at https://developers.klarna.com/api/#data-types, e.g. the date format is ISO 8601
 *
 * OpenAPI spec version: 1.0.0
 * Contact: instant.shopping.e@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.instant_shopping.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingShippingDeliveryDetailsV1CarrierProduct;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingShippingDeliveryDetailsV1Location;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingShippingDeliveryDetailsV1Timeslot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstantShoppingShippingDeliveryDetailsV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:47:29.611Z")
public class InstantShoppingShippingDeliveryDetailsV1 {
  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("location")
  private InstantShoppingShippingDeliveryDetailsV1Location location = null;

  @JsonProperty("timeslot")
  private InstantShoppingShippingDeliveryDetailsV1Timeslot timeslot = null;

  @JsonProperty("carrier_product")
  private InstantShoppingShippingDeliveryDetailsV1CarrierProduct carrierProduct = null;

  @JsonProperty("shipping_class")
  private String shippingClass = null;

  public InstantShoppingShippingDeliveryDetailsV1 carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The carrier name
   * @return carrier
  **/
  @ApiModelProperty(example = "AIRMEE", value = "The carrier name")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public InstantShoppingShippingDeliveryDetailsV1 location(InstantShoppingShippingDeliveryDetailsV1Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public InstantShoppingShippingDeliveryDetailsV1Location getLocation() {
    return location;
  }

  public void setLocation(InstantShoppingShippingDeliveryDetailsV1Location location) {
    this.location = location;
  }

  public InstantShoppingShippingDeliveryDetailsV1 timeslot(InstantShoppingShippingDeliveryDetailsV1Timeslot timeslot) {
    this.timeslot = timeslot;
    return this;
  }

   /**
   * Get timeslot
   * @return timeslot
  **/
  @ApiModelProperty(value = "")
  public InstantShoppingShippingDeliveryDetailsV1Timeslot getTimeslot() {
    return timeslot;
  }

  public void setTimeslot(InstantShoppingShippingDeliveryDetailsV1Timeslot timeslot) {
    this.timeslot = timeslot;
  }

  public InstantShoppingShippingDeliveryDetailsV1 carrierProduct(InstantShoppingShippingDeliveryDetailsV1CarrierProduct carrierProduct) {
    this.carrierProduct = carrierProduct;
    return this;
  }

   /**
   * Get carrierProduct
   * @return carrierProduct
  **/
  @ApiModelProperty(value = "")
  public InstantShoppingShippingDeliveryDetailsV1CarrierProduct getCarrierProduct() {
    return carrierProduct;
  }

  public void setCarrierProduct(InstantShoppingShippingDeliveryDetailsV1CarrierProduct carrierProduct) {
    this.carrierProduct = carrierProduct;
  }

  public InstantShoppingShippingDeliveryDetailsV1 shippingClass(String shippingClass) {
    this.shippingClass = shippingClass;
    return this;
  }

   /**
   * The shipping class
   * @return shippingClass
  **/
  @ApiModelProperty(example = "STANDARD", value = "The shipping class")
  public String getShippingClass() {
    return shippingClass;
  }

  public void setShippingClass(String shippingClass) {
    this.shippingClass = shippingClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingShippingDeliveryDetailsV1 shippingDeliveryDetailsV1 = (InstantShoppingShippingDeliveryDetailsV1) o;
    return Objects.equals(this.carrier, shippingDeliveryDetailsV1.carrier) &&
        Objects.equals(this.location, shippingDeliveryDetailsV1.location) &&
        Objects.equals(this.timeslot, shippingDeliveryDetailsV1.timeslot) &&
        Objects.equals(this.carrierProduct, shippingDeliveryDetailsV1.carrierProduct) &&
        Objects.equals(this.shippingClass, shippingDeliveryDetailsV1.shippingClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, location, timeslot, carrierProduct, shippingClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingShippingDeliveryDetailsV1 {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    timeslot: ").append(toIndentedString(timeslot)).append("\n");
    sb.append("    carrierProduct: ").append(toIndentedString(carrierProduct)).append("\n");
    sb.append("    shippingClass: ").append(toIndentedString(shippingClass)).append("\n");
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

