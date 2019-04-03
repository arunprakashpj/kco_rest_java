/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.order_management.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.order_management.model.OrderManagementShippingInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderManagementUpdateShippingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T10:02:16.667Z")
public class OrderManagementUpdateShippingInfo {
  @JsonProperty("shipping_info")
  private List<OrderManagementShippingInfo> shippingInfo = new ArrayList<OrderManagementShippingInfo>();

  public OrderManagementUpdateShippingInfo shippingInfo(List<OrderManagementShippingInfo> shippingInfo) {
    this.shippingInfo = shippingInfo;
    return this;
  }

  public OrderManagementUpdateShippingInfo addShippingInfoItem(OrderManagementShippingInfo shippingInfoItem) {
    this.shippingInfo.add(shippingInfoItem);
    return this;
  }

   /**
   * New shipping info. Maximum: 500 items.
   * @return shippingInfo
  **/
  @ApiModelProperty(required = true, value = "New shipping info. Maximum: 500 items.")
  public List<OrderManagementShippingInfo> getShippingInfo() {
    return shippingInfo;
  }

  public void setShippingInfo(List<OrderManagementShippingInfo> shippingInfo) {
    this.shippingInfo = shippingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderManagementUpdateShippingInfo updateShippingInfo = (OrderManagementUpdateShippingInfo) o;
    return Objects.equals(this.shippingInfo, updateShippingInfo.shippingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderManagementUpdateShippingInfo {\n");
    
    sb.append("    shippingInfo: ").append(toIndentedString(shippingInfo)).append("\n");
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

