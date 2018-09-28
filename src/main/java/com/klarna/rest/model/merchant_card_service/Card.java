/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.model.merchant_card_service;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Card
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T09:37:02.201Z")
public class Card {
  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("card_id")
  private String cardId = null;

  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("pci_data")
  private String pciData = null;

  @JsonProperty("iv")
  private String iv = null;

  @JsonProperty("aes_key")
  private String aesKey = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("holder")
  private String holder = null;

  public Card reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Identifier to reference order line.
   * @return reference
  **/
  @ApiModelProperty(example = "yPGw6i4lR0GTcyxGpS3Q6Q==", value = "Identifier to reference order line.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Card cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Unique card identifier.
   * @return cardId
  **/
  @ApiModelProperty(example = "b846430c-3656-43a1-812e-2ccff4531b7d", value = "Unique card identifier.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public Card amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount available on the card. In minor units. The number of decimals are controlled by the currency.
   * @return amount
  **/
  @ApiModelProperty(example = "10000", value = "The total amount available on the card. In minor units. The number of decimals are controlled by the currency.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Card currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO 4217 code states which currency it is and how many decimals the amount has.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "The ISO 4217 code states which currency it is and how many decimals the amount has.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Card pciData(String pciData) {
    this.pciData = pciData;
    return this;
  }

   /**
   * Encrypted, PCI compliant card data.
   * @return pciData
  **/
  @ApiModelProperty(value = "Encrypted, PCI compliant card data.")
  public String getPciData() {
    return pciData;
  }

  public void setPciData(String pciData) {
    this.pciData = pciData;
  }

  public Card iv(String iv) {
    this.iv = iv;
    return this;
  }

   /**
   * Initialization vector for symmetric decryption with the AES key.
   * @return iv
  **/
  @ApiModelProperty(value = "Initialization vector for symmetric decryption with the AES key.")
  public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }

  public Card aesKey(String aesKey) {
    this.aesKey = aesKey;
    return this;
  }

   /**
   * The symmetric key complying the Advanced Encryption Standard.
   * @return aesKey
  **/
  @ApiModelProperty(value = "The symmetric key complying the Advanced Encryption Standard.")
  public String getAesKey() {
    return aesKey;
  }

  public void setAesKey(String aesKey) {
    this.aesKey = aesKey;
  }

  public Card brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the card.
   * @return brand
  **/
  @ApiModelProperty(example = "VISA", value = "The brand of the card.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Card holder(String holder) {
    this.holder = holder;
    return this;
  }

   /**
   * Card holder name on the card.
   * @return holder
  **/
  @ApiModelProperty(example = "Jane Doe", value = "Card holder name on the card.")
  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.reference, card.reference) &&
        Objects.equals(this.cardId, card.cardId) &&
        Objects.equals(this.amount, card.amount) &&
        Objects.equals(this.currency, card.currency) &&
        Objects.equals(this.pciData, card.pciData) &&
        Objects.equals(this.iv, card.iv) &&
        Objects.equals(this.aesKey, card.aesKey) &&
        Objects.equals(this.brand, card.brand) &&
        Objects.equals(this.holder, card.holder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, cardId, amount, currency, pciData, iv, aesKey, brand, holder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    pciData: ").append(toIndentedString(pciData)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    aesKey: ").append(toIndentedString(aesKey)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
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

