package com.freight.model;

import java.math.*;

import javax.persistence.*;

import com.freight.common.EntityBase;
import com.freight.enums.InoutType;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_inout")
public class CInout extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cInoutID;
	private Integer cMoveID;
	private Integer cOrderID;
	private Integer cWarehouseID;
	private String comment;
	private String created;
	private Integer createdBy;
	private Integer handleMethod;
	private String inoutType;
	private Integer signedBpartnerID;
	private String signedType;
	private Integer signedUserID;
	private String timeInouted;
	private Integer totalAmount;
	private BigDecimal totalVolume;
	private BigDecimal totalWeight;
	private String updated;
	private Integer updatedBy;

	public CInout() {
	}

	public CInout(Integer cInoutID) {
		this.cInoutID = cInoutID;
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

	@Id
	@Column(name="c_inout_id", columnDefinition="INT")
	@TableGenerator(name = "PkGen_114", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Inout", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_114")
	public Integer getCInoutID() {
		return cInoutID;
	}

	public void setCInoutID(Integer cInoutID) {
		this.cInoutID = cInoutID;
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
	@Column(name="c_warehouse_id", columnDefinition="INT")
	public Integer getCWarehouseID() {
		return cWarehouseID;
	}

	public void setCWarehouseID(Integer cWarehouseID) {
		this.cWarehouseID = cWarehouseID;
	}

	@Basic
	@Column(length=60)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
	@Column(name="handle_method", columnDefinition="INT")
	public Integer getHandleMethod() {
		return handleMethod;
	}

	public void setHandleMethod(Integer handleMethod) {
		this.handleMethod = handleMethod;
	}

	@Basic
	@Column(name="inout_type", nullable=false, length=3)
	public String getInoutType() {
		return inoutType;
	}

	public void setInoutType(String inoutType) {
		this.inoutType = inoutType;
	}

	@Basic
	@Column(name="signed_bpartner_id", columnDefinition="INT")
	public Integer getSignedBpartnerID() {
		return signedBpartnerID;
	}

	public void setSignedBpartnerID(Integer signedBpartnerID) {
		this.signedBpartnerID = signedBpartnerID;
	}

	@Basic
	@Column(name="signed_type", length=3)
	public String getSignedType() {
		return signedType;
	}

	public void setSignedType(String signedType) {
		this.signedType = signedType;
	}

	@Basic
	@Column(name="signed_user_id", columnDefinition="INT")
	public Integer getSignedUserID() {
		return signedUserID;
	}

	public void setSignedUserID(Integer signedUserID) {
		this.signedUserID = signedUserID;
	}

	@Basic
	@Column(name="time_inouted", nullable=false)
	public String getTimeInouted() {
		return timeInouted;
	}

	public void setTimeInouted(String timeInouted) {
		this.timeInouted = timeInouted;
	}

	@Basic
	@Column(name="total_amount", columnDefinition="INT")
	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Basic
	@Column(name="total_volume")
	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(BigDecimal totalVolume) {
		this.totalVolume = totalVolume;
	}

	@Basic
	@Column(name="total_weight")
	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
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

	public void setInoutTypeEnum(InoutType type) {
		this.setInoutType(type.getValue());
	}
}