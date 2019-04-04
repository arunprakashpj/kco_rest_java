/*
 * Klarna Instant Shopping
 * The Instant Shopping API is serving two purposes:  to manage the orders as they result from the Instant Shopping purchase flow  to generate Instant Shopping Button keys necessary for setting up the Instant Shopping flow both onsite and offsite    The 'authorizations' endpoint is relevant to authorize the orders. The 'buttons' endpoint is relevant to manage the button setup options.   Note that as soon as a purchase initiated through Instant Shopping is authorized with Klarna, the order should be read and handled using the Order Management API.    Button Setup Options is the library for creating and maintaining Instant Shopping Button Keys.  The API is accessible through a few different URLS. There are different URLs for testing and for making live purchases as well as different URLs for depending on if you are based in Europe or in the U.S.  All interaction with Klarna's APIs must be done over HTTPS. To authenticate with Klarna you use your API Credentials and HTTP Basic auth.  The credentials consist of two elements:  Username - Consists of your Merchant ID (eid) - a unique number that identifies your e-store, combined with a random string.  Password - a string which is associated with your Merchant ID and is used to authorize use of Klarna's APIs  Note: The API credentials are separate from your Merchant ID, and it is possible to have several API credentials associated with the same Merchant ID.  The credentials should be sent as an authorization header for every request with the username and password.  You receive both your live and test credentials by contacting Klarna sales for your country.  If the credentials are missing or wrong Klarna will respond with 401 Unauthorized. You can read more about HTTP Basic auth in the Wikipedia article. The username and password the username:password in base64. [https://gist.github.com/brandonmwest/a2632d0a65088a20c00a](Examples)  
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
import com.klarna.rest.api.instant_shopping.model.InstantShoppingButtonSetupOptionsV1Attachment;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingButtonSetupOptionsV1MerchantUrls;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingOptionsV1;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingOrderLineV1;
import com.klarna.rest.api.instant_shopping.model.InstantShoppingShippingOptionV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ButtonSetupOptions defines the attributes for a button in Instant Shopping.
 */
@ApiModel(description = "ButtonSetupOptions defines the attributes for a button in Instant Shopping.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-04T11:30:13.537Z")
public class InstantShoppingButtonSetupOptionsV1 {
  @JsonProperty("button_key")
  private String buttonKey = null;

  @JsonProperty("disabled")
  private Boolean disabled = null;

  @JsonProperty("merchant_urls")
  private InstantShoppingButtonSetupOptionsV1MerchantUrls merchantUrls = null;

  @JsonProperty("purchase_currency")
  private String purchaseCurrency = null;

  @JsonProperty("purchase_country")
  private String purchaseCountry = null;

  @JsonProperty("billing_countries")
  private List<String> billingCountries = null;

  @JsonProperty("shipping_countries")
  private List<String> shippingCountries = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("order_amount")
  private Long orderAmount = null;

  @JsonProperty("order_tax_amount")
  private Long orderTaxAmount = null;

  @JsonProperty("merchant_reference1")
  private String merchantReference1 = null;

  @JsonProperty("merchant_reference2")
  private String merchantReference2 = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("options")
  private InstantShoppingOptionsV1 options = null;

  @JsonProperty("attachment")
  private InstantShoppingButtonSetupOptionsV1Attachment attachment = null;

  @JsonProperty("order_lines")
  private List<InstantShoppingOrderLineV1> orderLines = null;

  @JsonProperty("shipping_options")
  private List<InstantShoppingShippingOptionV1> shippingOptions = null;

  public InstantShoppingButtonSetupOptionsV1 buttonKey(String buttonKey) {
    this.buttonKey = buttonKey;
    return this;
  }

   /**
   * Identifier of the button key. Readonly value. Set by the server.
   * @return buttonKey
  **/
  @ApiModelProperty(value = "Identifier of the button key. Readonly value. Set by the server.")
  public String getButtonKey() {
    return buttonKey;
  }

  public void setButtonKey(String buttonKey) {
    this.buttonKey = buttonKey;
  }

  public InstantShoppingButtonSetupOptionsV1 disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Controls the visibility of an Instant Shopping button
   * @return disabled
  **/
  @ApiModelProperty(value = "Controls the visibility of an Instant Shopping button")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public InstantShoppingButtonSetupOptionsV1 merchantUrls(InstantShoppingButtonSetupOptionsV1MerchantUrls merchantUrls) {
    this.merchantUrls = merchantUrls;
    return this;
  }

   /**
   * Get merchantUrls
   * @return merchantUrls
  **/
  @ApiModelProperty(required = true, value = "")
  public InstantShoppingButtonSetupOptionsV1MerchantUrls getMerchantUrls() {
    return merchantUrls;
  }

  public void setMerchantUrls(InstantShoppingButtonSetupOptionsV1MerchantUrls merchantUrls) {
    this.merchantUrls = merchantUrls;
  }

  public InstantShoppingButtonSetupOptionsV1 purchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
    return this;
  }

   /**
   * Get purchaseCurrency
   * @return purchaseCurrency
  **/
  @ApiModelProperty(example = "US", value = "")
  public String getPurchaseCurrency() {
    return purchaseCurrency;
  }

  public void setPurchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
  }

  public InstantShoppingButtonSetupOptionsV1 purchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
    return this;
  }

   /**
   * ISO 3166 alpha-2 purchase country
   * @return purchaseCountry
  **/
  @ApiModelProperty(value = "ISO 3166 alpha-2 purchase country")
  public String getPurchaseCountry() {
    return purchaseCountry;
  }

  public void setPurchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
  }

  public InstantShoppingButtonSetupOptionsV1 billingCountries(List<String> billingCountries) {
    this.billingCountries = billingCountries;
    return this;
  }

  public InstantShoppingButtonSetupOptionsV1 addBillingCountriesItem(String billingCountriesItem) {
    if (this.billingCountries == null) {
      this.billingCountries = new ArrayList<String>();
    }
    this.billingCountries.add(billingCountriesItem);
    return this;
  }

   /**
   * A list of countries (ISO 3166 alpha-2) to specify allowed billing countries.
   * @return billingCountries
  **/
  @ApiModelProperty(value = "A list of countries (ISO 3166 alpha-2) to specify allowed billing countries.")
  public List<String> getBillingCountries() {
    return billingCountries;
  }

  public void setBillingCountries(List<String> billingCountries) {
    this.billingCountries = billingCountries;
  }

  public InstantShoppingButtonSetupOptionsV1 shippingCountries(List<String> shippingCountries) {
    this.shippingCountries = shippingCountries;
    return this;
  }

  public InstantShoppingButtonSetupOptionsV1 addShippingCountriesItem(String shippingCountriesItem) {
    if (this.shippingCountries == null) {
      this.shippingCountries = new ArrayList<String>();
    }
    this.shippingCountries.add(shippingCountriesItem);
    return this;
  }

   /**
   * A list of countries (ISO 3166 alpha-2). Default is purchase_country only.
   * @return shippingCountries
  **/
  @ApiModelProperty(value = "A list of countries (ISO 3166 alpha-2). Default is purchase_country only.")
  public List<String> getShippingCountries() {
    return shippingCountries;
  }

  public void setShippingCountries(List<String> shippingCountries) {
    this.shippingCountries = shippingCountries;
  }

  public InstantShoppingButtonSetupOptionsV1 locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * RFC 1766 customer&#39;s locale.
   * @return locale
  **/
  @ApiModelProperty(value = "RFC 1766 customer's locale.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public InstantShoppingButtonSetupOptionsV1 orderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * minor units according to ISO 4217 - should be calculated if not already set and order_lines are given
   * @return orderAmount
  **/
  @ApiModelProperty(value = "minor units according to ISO 4217 - should be calculated if not already set and order_lines are given")
  public Long getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
  }

  public InstantShoppingButtonSetupOptionsV1 orderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
    return this;
  }

   /**
   * minor units according to ISO 4217 - should be calculated if not already set and order_lines are given
   * @return orderTaxAmount
  **/
  @ApiModelProperty(value = "minor units according to ISO 4217 - should be calculated if not already set and order_lines are given")
  public Long getOrderTaxAmount() {
    return orderTaxAmount;
  }

  public void setOrderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
  }

  public InstantShoppingButtonSetupOptionsV1 merchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
    return this;
  }

   /**
   * Used for storing merchant&#39;s internal order number or other reference
   * @return merchantReference1
  **/
  @ApiModelProperty(value = "Used for storing merchant's internal order number or other reference")
  public String getMerchantReference1() {
    return merchantReference1;
  }

  public void setMerchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
  }

  public InstantShoppingButtonSetupOptionsV1 merchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
    return this;
  }

   /**
   * Used for storing merchant&#39;s internal order number or other reference.
   * @return merchantReference2
  **/
  @ApiModelProperty(value = "Used for storing merchant's internal order number or other reference.")
  public String getMerchantReference2() {
    return merchantReference2;
  }

  public void setMerchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
  }

  public InstantShoppingButtonSetupOptionsV1 merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Pass through field (max 6000 characters).
   * @return merchantData
  **/
  @ApiModelProperty(value = "Pass through field (max 6000 characters).")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public InstantShoppingButtonSetupOptionsV1 options(InstantShoppingOptionsV1 options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public InstantShoppingOptionsV1 getOptions() {
    return options;
  }

  public void setOptions(InstantShoppingOptionsV1 options) {
    this.options = options;
  }

  public InstantShoppingButtonSetupOptionsV1 attachment(InstantShoppingButtonSetupOptionsV1Attachment attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @ApiModelProperty(value = "")
  public InstantShoppingButtonSetupOptionsV1Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(InstantShoppingButtonSetupOptionsV1Attachment attachment) {
    this.attachment = attachment;
  }

  public InstantShoppingButtonSetupOptionsV1 orderLines(List<InstantShoppingOrderLineV1> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public InstantShoppingButtonSetupOptionsV1 addOrderLinesItem(InstantShoppingOrderLineV1 orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<InstantShoppingOrderLineV1>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * The applicable order lines. Max 10000
   * @return orderLines
  **/
  @ApiModelProperty(value = "The applicable order lines. Max 10000")
  public List<InstantShoppingOrderLineV1> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<InstantShoppingOrderLineV1> orderLines) {
    this.orderLines = orderLines;
  }

  public InstantShoppingButtonSetupOptionsV1 shippingOptions(List<InstantShoppingShippingOptionV1> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public InstantShoppingButtonSetupOptionsV1 addShippingOptionsItem(InstantShoppingShippingOptionV1 shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<InstantShoppingShippingOptionV1>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

   /**
   * A list of shipping options available for this order.
   * @return shippingOptions
  **/
  @ApiModelProperty(value = "A list of shipping options available for this order.")
  public List<InstantShoppingShippingOptionV1> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<InstantShoppingShippingOptionV1> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantShoppingButtonSetupOptionsV1 buttonSetupOptionsV1 = (InstantShoppingButtonSetupOptionsV1) o;
    return Objects.equals(this.buttonKey, buttonSetupOptionsV1.buttonKey) &&
        Objects.equals(this.disabled, buttonSetupOptionsV1.disabled) &&
        Objects.equals(this.merchantUrls, buttonSetupOptionsV1.merchantUrls) &&
        Objects.equals(this.purchaseCurrency, buttonSetupOptionsV1.purchaseCurrency) &&
        Objects.equals(this.purchaseCountry, buttonSetupOptionsV1.purchaseCountry) &&
        Objects.equals(this.billingCountries, buttonSetupOptionsV1.billingCountries) &&
        Objects.equals(this.shippingCountries, buttonSetupOptionsV1.shippingCountries) &&
        Objects.equals(this.locale, buttonSetupOptionsV1.locale) &&
        Objects.equals(this.orderAmount, buttonSetupOptionsV1.orderAmount) &&
        Objects.equals(this.orderTaxAmount, buttonSetupOptionsV1.orderTaxAmount) &&
        Objects.equals(this.merchantReference1, buttonSetupOptionsV1.merchantReference1) &&
        Objects.equals(this.merchantReference2, buttonSetupOptionsV1.merchantReference2) &&
        Objects.equals(this.merchantData, buttonSetupOptionsV1.merchantData) &&
        Objects.equals(this.options, buttonSetupOptionsV1.options) &&
        Objects.equals(this.attachment, buttonSetupOptionsV1.attachment) &&
        Objects.equals(this.orderLines, buttonSetupOptionsV1.orderLines) &&
        Objects.equals(this.shippingOptions, buttonSetupOptionsV1.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonKey, disabled, merchantUrls, purchaseCurrency, purchaseCountry, billingCountries, shippingCountries, locale, orderAmount, orderTaxAmount, merchantReference1, merchantReference2, merchantData, options, attachment, orderLines, shippingOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantShoppingButtonSetupOptionsV1 {\n");
    
    sb.append("    buttonKey: ").append(toIndentedString(buttonKey)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    merchantUrls: ").append(toIndentedString(merchantUrls)).append("\n");
    sb.append("    purchaseCurrency: ").append(toIndentedString(purchaseCurrency)).append("\n");
    sb.append("    purchaseCountry: ").append(toIndentedString(purchaseCountry)).append("\n");
    sb.append("    billingCountries: ").append(toIndentedString(billingCountries)).append("\n");
    sb.append("    shippingCountries: ").append(toIndentedString(shippingCountries)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderTaxAmount: ").append(toIndentedString(orderTaxAmount)).append("\n");
    sb.append("    merchantReference1: ").append(toIndentedString(merchantReference1)).append("\n");
    sb.append("    merchantReference2: ").append(toIndentedString(merchantReference2)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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

