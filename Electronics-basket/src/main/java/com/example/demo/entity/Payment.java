/*
 * package com.example.demo.entity; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.Id; import
 * javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "payment") public class Payment {
 * 
 * @Id
 * 
 * @Column(name = "payment_id") private Integer paymentId;
 * 
 * @OneToOne private ElectronicProductOrder IdOrder;
 * 
 * @Column(name = "payment_mode") private String paymentMode;
 * 
 * @Column(name = "card_number") private String cardNumber;
 * 
 * @Column(name = "card_holder_namr") private String cardHolderName;
 * 
 * @Column(name = "expiry_date") private String expiryDate;
 * 
 * @Column(name = "otp") private Integer OTP;
 * 
 * @Column(name = "payment_status") private String paymentStatus;
 * 
 * public Payment(Integer paymentId, ElectronicProductOrder order, String
 * paymentMode, String cardNumber, String cardHolderName, String expiryDate, int
 * oTP, String paymentStatus) { super(); this.paymentId = paymentId;
 * this.IdOrder = order; this.paymentMode = paymentMode; this.cardNumber =
 * cardNumber; this.cardHolderName = cardHolderName; this.expiryDate =
 * expiryDate; OTP = oTP; this.paymentStatus = paymentStatus; }
 * 
 * public Payment() { super(); }
 * 
 * public Integer getPaymentId() { return paymentId; }
 * 
 * public void setPaymentId(Integer paymentId) { this.paymentId = paymentId; }
 * 
 * public ElectronicProductOrder getOrder() { return IdOrder; }
 * 
 * public void setOrder(ElectronicProductOrder order) { this.IdOrder = order; }
 * 
 * public String getPaymentMode() { return paymentMode; }
 * 
 * public void setPaymentMode(String paymentMode) { this.paymentMode =
 * paymentMode; }
 * 
 * public String getCardNumber() { return cardNumber; }
 * 
 * public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber;
 * }
 * 
 * public String getCardHolderName() { return cardHolderName; }
 * 
 * public void setCardHolderName(String cardHolderName) { this.cardHolderName =
 * cardHolderName; }
 * 
 * public String getExpiryDate() { return expiryDate; }
 * 
 * public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate;
 * }
 * 
 * public Integer getOTP() { return OTP; }
 * 
 * public void setOTP(Integer oTP) { OTP = oTP; }
 * 
 * public String getPaymentStatus() { return paymentStatus; }
 * 
 * public void setPaymentStatus(String paymentStatus) { this.paymentStatus
 * =paymentStatus; }
 * 
 * @Override public String toString() { return "Payment [paymentId=" + paymentId
 * + ", order=" + IdOrder + ", paymentMode=" + paymentMode + ", cardNumber=" +
 * cardNumber + ", cardHolderName=" + cardHolderName + ", expiryDate=" +
 * expiryDate + ", OTP=" + OTP + ", paymentStatus=" + paymentStatus + "]"; }
 * 
 * }
 */