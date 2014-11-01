package com.freight.model;

import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_payment_allocate")
public class CPaymentAllocate extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer amount;
	private Integer cAllocationLineID;
	private Integer cInvoiceID;
	private Integer cPaymentAllocateID;
	private Integer cPaymentID;
	private String created;
	private Integer createdBy;
	private Integer discountAmt;
	private Integer invoiceAmt;
	private String updated;
	private Integer updatedBy;
	private Integer writeoffAmt;

	public CPaymentAllocate() {
	}

	public CPaymentAllocate(Integer cPaymentAllocateID) {
		this.cPaymentAllocateID = cPaymentAllocateID;
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
	@Column(nullable=false)
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Basic
	@Column(name="c_allocation_line_id", columnDefinition="INT", nullable=false)
	public Integer getCAllocationLineID() {
		return cAllocationLineID;
	}

	public void setCAllocationLineID(Integer cAllocationLineID) {
		this.cAllocationLineID = cAllocationLineID;
	}

	@Basic
	@Column(name="c_invoice_id", columnDefinition="INT", nullable=false)
	public Integer getCInvoiceID() {
		return cInvoiceID;
	}

	public void setCInvoiceID(Integer cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
	}

	@Id
	@Column(name="c_payment_allocate_id", columnDefinition="INT")
	public Integer getCPaymentAllocateID() {
		return cPaymentAllocateID;
	}

	public void setCPaymentAllocateID(Integer cPaymentAllocateID) {
		this.cPaymentAllocateID = cPaymentAllocateID;
	}

	@Basic
	@Column(name="c_payment_id", columnDefinition="INT", nullable=false)
	public Integer getCPaymentID() {
		return cPaymentID;
	}

	public void setCPaymentID(Integer cPaymentID) {
		this.cPaymentID = cPaymentID;
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
	@Column(name="discount_amt", nullable=false)
	public Integer getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(Integer discountAmt) {
		this.discountAmt = discountAmt;
	}

	@Basic
	@Column(name="invoice_amt")
	public Integer getInvoiceAmt() {
		return invoiceAmt;
	}

	public void setInvoiceAmt(Integer invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
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
	@Column(name="writeoff_amt", nullable=false)
	public Integer getWriteoffAmt() {
		return writeoffAmt;
	}

	public void setWriteoffAmt(Integer writeoffAmt) {
		this.writeoffAmt = writeoffAmt;
	}
}