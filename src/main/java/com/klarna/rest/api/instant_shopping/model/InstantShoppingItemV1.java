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
import com.klarna.rest.api.instant_shopping.model.InstantShoppingProductAttributeV1;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingProductIdentifiersV1;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingShippingAttributesV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InstantShoppingItemV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:47:29.611Z")
public class InstantShoppingItemV1 {
  @JsonProperty("name")
  private String name = null;

  /**
   * The type of product variation. Choose between physical or digital.
   */
  public enum TypeEnum {
    DIGITAL("digital"),
    
    DISCOUNT("discount"),
    
    PHYSICAL("physical"),
    
    SALES_TAX("sales_tax"),
    
    SHIPPING_FEE("shipping_fee"),
    
    GIFT_CARD("gift_card"),
    
    STORE_CREDIT("store_credit"),
    
    SURCHARGE("surcharge");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("tax_rate")
  private Long taxRate = null;

  @JsonProperty("total_amount")
  private Long totalAmount = null;

  @JsonProperty("total_tax_amount")
  private Long totalTaxAmount = null;

  @JsonProperty("total_discount_amount")
  private Long totalDiscountAmount = null;

  @JsonProperty("unit_price")
  private Long unitPrice = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("product_url")
  private String productUrl = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("product_identifiers")
  private InstantShoppingProductIdentifiersV1 productIdentifiers = null;

  @JsonProperty("shipping_attributes")
  private InstantShoppingShippingAttributesV1 shippingAttributes = null;

  @JsonProperty("group_identifier")
  private String groupIdentifier = null;

  @JsonProperty("product_attributes")
  private List<InstantShoppingProductAttributeV1> productAttributes = new ArrayList<InstantShoppingProductAttributeV1>();

  public InstantShoppingItemV1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive product name.
   * @return name
  **/
  @ApiModelProperty(example = "Red T-Shirt", required = true, value = "Descriptive product name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstantShoppingItemV1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of product variation. Choose between physical or digital.
   * @return type
  **/
  @ApiModelProperty(example = "physical", required = true, value = "The type of product variation. Choose between physical or digital.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InstantShoppingItemV1 reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Article number, SKU or similar. Max length is 64 characters.
   * @return reference
  **/
  @ApiModelProperty(example = "19-402-USA", value = "Article number, SKU or similar. Max length is 64 characters.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public InstantShoppingItemV1 taxRate(Long taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Non-negative. In percent, two implicit decimals. I.e 2500 &#x3D; 25%.
   * minimum: 0
   * @return taxRate
  **/
  @ApiModelProperty(example = "1000", required = true, value = "Non-negative. In percent, two implicit decimals. I.e 2500 = 25%.")
  public Long getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Long taxRate) {
    this.taxRate = taxRate;
  }

  public InstantShoppingItemV1 totalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Includes tax and discount. Must match (quantity unit_price) - total_discount_amount within ±quantity. (max value: 100000000)
   * maximum: 100000000
   * @return totalAmount
  **/
  @ApiModelProperty(example = "50000", value = "Includes tax and discount. Must match (quantity unit_price) - total_discount_amount within ±quantity. (max value: 100000000)")
  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public InstantShoppingItemV1 totalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Must be within ±1 of total_amount - total_amount 10000 / (10000 + tax_rate). Negative when type is discount.
   * maximum: 100000000
   * @return totalTaxAmount
  **/
  @ApiModelProperty(example = "4545", required = true, value = "Must be within ±1 of total_amount - total_amount 10000 / (10000 + tax_rate). Negative when type is discount.")
  public Long getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Long totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public InstantShoppingItemV1 totalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Non-negative minor units. Includes tax.
   * minimum: 0
   * @return totalDiscountAmount
  **/
  @ApiModelProperty(example = "0", value = "Non-negative minor units. Includes tax.")
  public Long getTotalDiscountAmount() {
    return totalDiscountAmount;
  }

  public void setTotalDiscountAmount(Long totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }

  public InstantShoppingItemV1 unitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Minor units. Includes tax, excludes discount. (max value: 100000000)
   * maximum: 100000000
   * @return unitPrice
  **/
  @ApiModelProperty(example = "10000", required = true, value = "Minor units. Includes tax, excludes discount. (max value: 100000000)")
  public Long getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }

  public InstantShoppingItemV1 merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Pass through field. (max 255 characters)
   * @return merchantData
  **/
  @ApiModelProperty(example = "{\\\"marketplace_seller_info\\\":[{\\\"product_category\\\":\\\"Women's Fashion\\\",\\\"product_name\\\":\\\"Women Sweatshirt\\\"}]}", value = "Pass through field. (max 255 characters)")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public InstantShoppingItemV1 productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

   /**
   * URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters)
   * @return productUrl
  **/
  @ApiModelProperty(example = "https://www.example.com/products/f2a8d7e34", value = "URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters)")
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public InstantShoppingItemV1 imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL of the image of the product. Will be used to help consumers selecting between product variations
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://www.example.com/logo.png", value = "URL of the image of the product. Will be used to help consumers selecting between product variations")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public InstantShoppingItemV1 productIdentifiers(InstantShoppingProductIdentifiersV1 productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
    return this;
  }

   /**
   * Additional information identifying an item
   * @return productIdentifiers
  **/
  @ApiModelProperty(value = "Additional information identifying an item")
  public InstantShoppingProductIdentifiersV1 getProductIdentifiers() {
    return productIdentifiers;
  }

  public void setProductIdentifiers(InstantShoppingProductIdentifiersV1 productIdentifiers) {
    this.productIdentifiers = productIdentifiers;
  }

  public InstantShoppingItemV1 shippingAttributes(InstantShoppingShippingAttributesV1 shippingAttributes) {
    this.shippingAttributes = shippingAttributes;
    return this;
  }

   /**
   * Shipping attributes of this item
   * @return shippingAttributes
  **/
  @ApiModelProperty(value = "Shipping attributes of this item")
  public InstantShoppingShippingAttributesV1 getShippingAttributes() {
    return shippingAttributes;
  }

  public void setShippingAttributes(InstantShoppingShippingAttributesV1 shippingAttributes) {
    this.shippingAttributes = shippingAttributes;
  }

  public InstantShoppingItemV1 groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * Must not include the character &#39;_&#39;. Unique identifier of the product that is described in multiple variations in this &#39;items&#39; list.
   * @return groupIdentifier
  **/
  @ApiModelProperty(required = true, value = "Must not include the character '_'. Unique identifier of the product that is described in multiple variations in this 'items' list.")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }

  public InstantShoppingItemV1 productAttributes(List<InstantShoppingProductAttributeV1> productAttributes) {
    this.productAttributes = productAttributes;
    return this;
  }

  public InstantShoppingItemV1 addProductAttributesItem(InstantShoppingProductAttributeV1 productAttributesItem) {
    this.productAttributes.add(productAttributesItem);
    return this;
  }

   /**
   * List of objects, each describe every possible product variation as a unique combination of product attributes, e.g. color, size, material.
   * @return productAttributes
  **/
  @ApiModelProperty(required = true, value = "List of objects, each describe every possible product variation as a unique combination of product attributes, e.g. color, size, material.")
  public List<InstantShoppingProductAttributeV1> getProductAttributes() {
    return productAttributes;
  }

  public void setProductAttributes(List<InstantShoppingProductAttributeV1> productAttributes) {
    this.productAttributes = productAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingItemV1 itemV1 = (InstantShoppingItemV1) o;
    return Objects.equals(this.name, itemV1.name) &&
        Objects.equals(this.type, itemV1.type) &&
        Objects.equals(this.reference, itemV1.reference) &&
        Objects.equals(this.taxRate, itemV1.taxRate) &&
        Objects.equals(this.totalAmount, itemV1.totalAmount) &&
        Objects.equals(this.totalTaxAmount, itemV1.totalTaxAmount) &&
        Objects.equals(this.totalDiscountAmount, itemV1.totalDiscountAmount) &&
        Objects.equals(this.unitPrice, itemV1.unitPrice) &&
        Objects.equals(this.merchantData, itemV1.merchantData) &&
        Objects.equals(this.productUrl, itemV1.productUrl) &&
        Objects.equals(this.imageUrl, itemV1.imageUrl) &&
        Objects.equals(this.productIdentifiers, itemV1.productIdentifiers) &&
        Objects.equals(this.shippingAttributes, itemV1.shippingAttributes) &&
        Objects.equals(this.groupIdentifier, itemV1.groupIdentifier) &&
        Objects.equals(this.productAttributes, itemV1.productAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, reference, taxRate, totalAmount, totalTaxAmount, totalDiscountAmount, unitPrice, merchantData, productUrl, imageUrl, productIdentifiers, shippingAttributes, groupIdentifier, productAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingItemV1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    productIdentifiers: ").append(toIndentedString(productIdentifiers)).append("\n");
    sb.append("    shippingAttributes: ").append(toIndentedString(shippingAttributes)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
    sb.append("    productAttributes: ").append(toIndentedString(productAttributes)).append("\n");
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

