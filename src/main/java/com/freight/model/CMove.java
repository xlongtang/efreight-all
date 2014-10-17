package com.freight.model;

import java.math.*;
import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_move")
public class CMove extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cMoveID;
	private Integer cOrderID;
	private Integer cVehicleID;
	private String contractNo;
	private String created;
	private Integer createdBy;
	private String datePromise;
	private Integer departOrgID;
	private Integer destOrgID;
	private Integer driverUserID;
	private Integer moveStatus;
	private String moveType;
	private String timeArrived;
	private String timeDeparted;
	private BigDecimal totalAmount;
	private BigDecimal totalFreight;
	private BigDecimal totalVolume;
	private BigDecimal totalWeight;
	private String updated;
	private Integer updatedBy;

	public CMove() {
	}

	public CMove(Integer cMoveID) {
		this.cMoveID = cMoveID;
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
	@Column(name="c_move_id", length=20)
	@TableGenerator(name = "PkGen_118", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Move", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_118")
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
	@Column(name="c_vehicle_id", columnDefinition="INT", nullable=false)
	public Integer getCVehicleID() {
		return cVehicleID;
	}

	public void setCVehicleID(Integer cVehicleID) {
		this.cVehicleID = cVehicleID;
	}

	@Basic
	@Column(name="contract_no", nullable=false, length=20)
	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
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
	@Column(name="date_promise")
	public String getDatePromise() {
		return datePromise;
	}

	public void setDatePromise(String datePromise) {
		this.datePromise = datePromise;
	}

	@Basic
	@Column(name="depart_org_id", columnDefinition="INT")
	public Integer getDepartOrgID() {
		return departOrgID;
	}

	public void setDepartOrgID(Integer departOrgID) {
		this.departOrgID = departOrgID;
	}

	@Basic
	@Column(name="dest_org_id", columnDefinition="INT")
	public Integer getDestOrgID() {
		return destOrgID;
	}

	public void setDestOrgID(Integer destOrgID) {
		this.destOrgID = destOrgID;
	}

	@Basic
	@Column(name="driver_user_id", columnDefinition="INT")
	public Integer getDriverUserID() {
		return driverUserID;
	}

	public void setDriverUserID(Integer driverUserID) {
		this.driverUserID = driverUserID;
	}

	@Basic
	@Column(name="move_status", columnDefinition="INT", nullable=false)
	public Integer getMoveStatus() {
		return moveStatus;
	}

	public void setMoveStatus(Integer moveStatus) {
		this.moveStatus = moveStatus;
	}

	@Basic
	@Column(name="move_type", nullable=false, length=2)
	public String getMoveType() {
		return moveType;
	}

	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}

	@Basic
	@Column(name="time_arrived")
	public String getTimeArrived() {
		return timeArrived;
	}

	public void setTimeArrived(String timeArrived) {
		this.timeArrived = timeArrived;
	}

	@Basic
	@Column(name="time_departed")
	public String getTimeDeparted() {
		return timeDeparted;
	}

	public void setTimeDeparted(String timeDeparted) {
		this.timeDeparted = timeDeparted;
	}

	@Basic
	@Column(name="total_amount", nullable=false)
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Basic
	@Column(name="total_freight", nullable=false)
	public BigDecimal getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(BigDecimal totalCharge) {
		this.totalFreight = totalCharge;
	}

	@Basic
	@Column(name="total_volume", nullable=false)
	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(BigDecimal totalVolume) {
		this.totalVolume = totalVolume;
	}

	@Basic
	@Column(name="total_weight", nullable=false)
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
}