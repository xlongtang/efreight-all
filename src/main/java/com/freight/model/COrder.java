package com.freight.model;

import java.math.*;
import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_order")
public class COrder extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String additional;
	private Integer cOrderID;
	private BigDecimal chargeAdditional;
	private BigDecimal chargeDelivery;
	private BigDecimal chargeDock;
	private BigDecimal chargeInsurance;
	private BigDecimal chargePackage;
	private BigDecimal chargePickup;
	private BigDecimal chargeStore;
	private String clerkUserID;
	private String comment;
	private String commentReceipt;
	private Integer consigneeBPartnerID;
	private Integer consignorBPartnerID;
	private BigDecimal costAdditional;
	private BigDecimal costClaim;
	private BigDecimal costCommission;
	private BigDecimal costPaidCommission;
	private String created;
	private Integer createdBy;
	private String dateCommission;
	private String dateInvoice;
	private String dateOrdered;
	private String datePromise;
	private Integer destinationOrgID;
	private BigDecimal insuranceLimit;
	private BigDecimal invoiceCharge;
	private Integer invoiceCopies;
	private String invoiceNo;
	private BigDecimal invoiceQuota;
	private String invoiceReceiptor;
	private String orderCd;
	private Integer orderedOrgID;
	private BigDecimal paidConsignee;
	private BigDecimal paidConsignor;
	private BigDecimal paidMonthly;
	private BigDecimal paidReceipt;
	private Integer receiptCopies;
	private String salesrepUserID;
	private Integer shipperBpartnerID;
	private String updated;
	private Integer updatedBy;
	private BigDecimal totalCharge;
	private boolean pickup;
	private boolean delivery;

	public COrder() {
	}

	public COrder(Integer cOrderID) {
		this.cOrderID = cOrderID;
	}

	@Basic
	@Column(name="ad_client_id", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="ad_org_id", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(length=20)
	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	@Id
	@Column(name="c_order_id", columnDefinition="INT")
	@TableGenerator(name = "PkGen_121", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Order", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_121")
	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
	}

	@Basic
	@Column(name="charge_additional")
	public BigDecimal getChargeAdditional() {
		return chargeAdditional;
	}

	public void setChargeAdditional(BigDecimal chargeAdditional) {
		this.chargeAdditional = chargeAdditional;
	}

	@Basic
	@Column(name="charge_delivery")
	public BigDecimal getChargeDelivery() {
		return chargeDelivery;
	}

	public void setChargeDelivery(BigDecimal chargeDelivery) {
		this.chargeDelivery = chargeDelivery;
	}

	@Basic
	@Column(name="charge_dock")
	public BigDecimal getChargeDock() {
		return chargeDock;
	}

	public void setChargeDock(BigDecimal chargeDock) {
		this.chargeDock = chargeDock;
	}

	@Basic
	@Column(name="charge_insurance")
	public BigDecimal getChargeInsurance() {
		return chargeInsurance;
	}

	public void setChargeInsurance(BigDecimal chargeInsurance) {
		this.chargeInsurance = chargeInsurance;
	}

	@Basic
	@Column(name="charge_package")
	public BigDecimal getChargePackage() {
		return chargePackage;
	}

	public void setChargePackage(BigDecimal chargePackage) {
		this.chargePackage = chargePackage;
	}

	@Basic
	@Column(name="charge_pickup")
	public BigDecimal getChargePickup() {
		return chargePickup;
	}

	public void setChargePickup(BigDecimal chargePickup) {
		this.chargePickup = chargePickup;
	}

	@Basic
	@Column(name="charge_store")
	public BigDecimal getChargeStore() {
		return chargeStore;
	}

	public void setChargeStore(BigDecimal chargeStore) {
		this.chargeStore = chargeStore;
	}

	@Basic
	@Column(name="clerk_user_id", length=20)
	public String getClerkUserID() {
		return clerkUserID;
	}

	public void setClerkUserID(String clerkUserID) {
		this.clerkUserID = clerkUserID;
	}

	@Basic
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Basic
	@Column(name="comment_receipt", length=80)
	public String getCommentReceipt() {
		return commentReceipt;
	}

	public void setCommentReceipt(String commentReceipt) {
		this.commentReceipt = commentReceipt;
	}

	@Basic
	@Column(name="consignee_bpartner_id", columnDefinition="INT", nullable=false)
	public Integer getConsigneeBPartnerID() {
		return consigneeBPartnerID;
	}

	public void setConsigneeBPartnerID(Integer consigneeBpartnerID) {
		this.consigneeBPartnerID = consigneeBpartnerID;
	}

	@Basic
	@Column(name="consignor_bpartner_id", columnDefinition="INT", nullable=false)
	public Integer getConsignorBPartnerID() {
		return consignorBPartnerID;
	}

	public void setConsignorBPartnerID(Integer consignorBpartnerID) {
		this.consignorBPartnerID = consignorBpartnerID;
	}

	@Basic
	@Column(name="cost_additional")
	public BigDecimal getCostAdditional() {
		return costAdditional;
	}

	public void setCostAdditional(BigDecimal costAdditional) {
		this.costAdditional = costAdditional;
	}

	@Basic
	@Column(name="cost_claim")
	public BigDecimal getCostClaim() {
		return costClaim;
	}

	public void setCostClaim(BigDecimal costClaim) {
		this.costClaim = costClaim;
	}

	@Basic
	@Column(name="cost_commission")
	public BigDecimal getCostCommission() {
		return costCommission;
	}

	public void setCostCommission(BigDecimal costCommission) {
		this.costCommission = costCommission;
	}

	@Basic
	@Column(name="cost_paid_commission")
	public BigDecimal getCostPaidCommission() {
		return costPaidCommission;
	}

	public void setCostPaidCommission(BigDecimal costPaidCommission) {
		this.costPaidCommission = costPaidCommission;
	}

	@Basic
	@Column(nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(name="created_by", columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(name="date_commission")
	public String getDateCommission() {
		return dateCommission;
	}

	public void setDateCommission(String dateCommission) {
		this.dateCommission = dateCommission;
	}

	@Basic
	@Column(name="date_invoice")
	public String getDateInvoice() {
		return dateInvoice;
	}

	public void setDateInvoice(String dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	@Basic
	@Column(name="date_ordered", nullable=false)
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Basic
	@Column(name="date_promise", nullable=false)
	public String getDatePromise() {
		return datePromise;
	}

	public void setDatePromise(String datePromise) {
		this.datePromise = datePromise;
	}

	@Basic
	@Column(name="destination_org_id", columnDefinition="INT", nullable=false)
	public Integer getDestinationOrgID() {
		return destinationOrgID;
	}

	public void setDestinationOrgID(Integer destinationOrgID) {
		this.destinationOrgID = destinationOrgID;
	}

	@Basic
	@Column(name="insurance_limit")
	public BigDecimal getInsuranceLimit() {
		return insuranceLimit;
	}

	public void setInsuranceLimit(BigDecimal insuranceLimit) {
		this.insuranceLimit = insuranceLimit;
	}

	@Basic
	@Column(name="invoice_charge")
	public BigDecimal getInvoiceCharge() {
		return invoiceCharge;
	}

	public void setInvoiceCharge(BigDecimal invoiceCharge) {
		this.invoiceCharge = invoiceCharge;
	}

	@Basic
	@Column(name="invoice_copies", columnDefinition="INT")
	public Integer getInvoiceCopies() {
		return invoiceCopies;
	}

	public void setInvoiceCopies(Integer invoiceCopies) {
		this.invoiceCopies = invoiceCopies;
	}

	@Basic
	@Column(name="invoice_no", length=20)
	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Basic
	@Column(name="invoice_quota")
	public BigDecimal getInvoiceQuota() {
		return invoiceQuota;
	}

	public void setInvoiceQuota(BigDecimal invoiceQuota) {
		this.invoiceQuota = invoiceQuota;
	}

	@Basic
	@Column(name="invoice_receiptor", length=10)
	public String getInvoiceReceiptor() {
		return invoiceReceiptor;
	}

	public void setInvoiceReceiptor(String invoiceReceiptor) {
		this.invoiceReceiptor = invoiceReceiptor;
	}

	@Basic
	@Column(name="order_cd", nullable=false, length=20)
	public String getOrderCd() {
		return orderCd;
	}

	public void setOrderCd(String orderCd) {
		this.orderCd = orderCd;
	}

	@Basic
	@Column(name="ordered_org_id", columnDefinition="INT", nullable=false)
	public Integer getOrderedOrgID() {
		return orderedOrgID;
	}

	public void setOrderedOrgID(Integer orderedOrgID) {
		this.orderedOrgID = orderedOrgID;
	}

	@Basic
	@Column(name="paid_consignee")
	public BigDecimal getPaidConsignee() {
		return paidConsignee;
	}

	public void setPaidConsignee(BigDecimal paidConsignee) {
		this.paidConsignee = paidConsignee;
	}

	@Basic
	@Column(name="paid_consignor")
	public BigDecimal getPaidConsignor() {
		return paidConsignor;
	}

	public void setPaidConsignor(BigDecimal paidConsignor) {
		this.paidConsignor = paidConsignor;
	}

	@Basic
	@Column(name="paid_monthly")
	public BigDecimal getPaidMonthly() {
		return paidMonthly;
	}

	public void setPaidMonthly(BigDecimal paidMonthly) {
		this.paidMonthly = paidMonthly;
	}

	@Basic
	@Column(name="paid_receipt")
	public BigDecimal getPaidReceipt() {
		return paidReceipt;
	}

	public void setPaidReceipt(BigDecimal paidReceipt) {
		this.paidReceipt = paidReceipt;
	}

	@Basic
	@Column(name="receipt_copies", columnDefinition="INT")
	public Integer getReceiptCopies() {
		return receiptCopies;
	}

	public void setReceiptCopies(Integer receiptCopies) {
		this.receiptCopies = receiptCopies;
	}

	@Basic
	@Column(name="salesrep_user_id", length=20)
	public String getSalesrepUserID() {
		return salesrepUserID;
	}

	public void setSalesrepUserID(String salesrepUserID) {
		this.salesrepUserID = salesrepUserID;
	}

	@Basic
	@Column(name="shipper_bpartner_id", columnDefinition="INT")
	public Integer getShipperBpartnerID() {
		return shipperBpartnerID;
	}

	public void setShipperBpartnerID(Integer shipperBpartnerID) {
		this.shipperBpartnerID = shipperBpartnerID;
	}

	@Basic
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(name="updated_by", columnDefinition="INT")
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(name="total_charge")
	public BigDecimal getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}

	public boolean isPickup() {
		return pickup;
	}

	public void setPickup(boolean pickup) {
		this.pickup = pickup;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	
	
}