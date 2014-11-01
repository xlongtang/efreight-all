package com.freight.model;

import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_invoice_line")
public class CInvoiceLine extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cChargeID;
	private Integer cInvoiceID;
	private Integer cInvoiceLineID;
	private Integer cMoveID;
	private Integer cOrderID;
	private String created;
	private Integer createdBy;
	private Integer lineAmt;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;

	public CInvoiceLine() {
	}

	public CInvoiceLine(Integer cInvoiceLineID) {
		this.cInvoiceLineID = cInvoiceLineID;
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
	@Column(name="c_charge_id", columnDefinition="INT")
	public Integer getCChargeID() {
		return cChargeID;
	}

	public void setCChargeID(Integer cChargeID) {
		this.cChargeID = cChargeID;
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
	@Column(name="c_invoice_line_id", columnDefinition="INT")
	public Integer getCInvoiceLineID() {
		return cInvoiceLineID;
	}

	public void setCInvoiceLineID(Integer cInvoiceLineID) {
		this.cInvoiceLineID = cInvoiceLineID;
	}

	@Basic
	@Column(name="c_move_id", columnDefinition="INT")
	public Integer getCMoveID() {
		return cMoveID;
	}

	public void setCMoveID(Integer cMoveID) {
		this.cMoveID = cMoveID;
	}

	@Basic
	@Column(name="c_order_id", columnDefinition="INT")
	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
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
	@Column(name="line_amt", nullable=false)
	public Integer getLineAmt() {
		return lineAmt;
	}

	public void setLineAmt(Integer lineAmt) {
		this.lineAmt = lineAmt;
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
	@Column(name="user1_id", columnDefinition="INT")
	public Integer getUser1ID() {
		return user1ID;
	}

	public void setUser1ID(Integer user1ID) {
		this.user1ID = user1ID;
	}

	@Basic
	@Column(name="user2_id", columnDefinition="INT")
	public Integer getUser2ID() {
		return user2ID;
	}

	public void setUser2ID(Integer user2ID) {
		this.user2ID = user2ID;
	}
}