package com.freight.model;

import java.math.*;
import java.util.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.acuity.AcuityCustomizer
 */
@Entity
@Table(name="c_vehicle")
public class CVehicle extends com.freight.common.EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer cOrgId;
	private Integer cVehicleId;
	private String comment;
	private String contractNo;
	private Date dateDepart;
	private Date datePromised;
	private Date dateScrap;
	private Date dateUsing;
	private BigDecimal depreciationCharge;
	private String driver;
	private String driverAddr;
	private Integer driverId;
	private String driverLicenceNo;
	private String driverPhone;
	private String engineNo;
	private Integer entrustMoveId;
	private String insuranceNo;
	private String licenseNo;
	private Date limited;
	private BigDecimal mileageCurrent;
	private BigDecimal mileageStart;
	private BigDecimal mileageTerminal;
	private String model;
	private String name;
	private BigDecimal oilConsumption;
	private String operationNo;
	private String owner;
	private String ownerAddr;
	private Integer ownerId;
	private String ownerPhone;
	private String plateNo;
	private BigDecimal tonnage;
	private String trailerPlateNo;

	public CVehicle() {
	}

	public CVehicle(Integer cVehicleId) {
		this.cVehicleId = cVehicleId;
	}

	@Basic
	@Column(name="c_org_id", columnDefinition="INT", nullable=false)
	public Integer getCOrgId() {
		return cOrgId;
	}

	public void setCOrgId(Integer cOrgId) {
		this.cOrgId = cOrgId;
	}

	@Id
	@Column(name="c_vehicle_id", columnDefinition="INT")
	@TableGenerator(name = "PkGen_117", table = "c_sequence", pkColumnName = "name", pkColumnValue = "C_Vehicle", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_117")
	public Integer getCVehicleId() {
		return cVehicleId;
	}

	public void setCVehicleId(Integer cVehicleId) {
		this.cVehicleId = cVehicleId;
	}

	@Basic
	@Column(length=100)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Basic
	@Column(name="contract_no", length=20)
	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	@Basic
	@Column(name="date_depart")
	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Basic
	@Column(name="date_promised")
	public Date getDatePromised() {
		return datePromised;
	}

	public void setDatePromised(Date datePromised) {
		this.datePromised = datePromised;
	}

	@Basic
	@Column(name="date_scrap")
	public Date getDateScrap() {
		return dateScrap;
	}

	public void setDateScrap(Date dateScrap) {
		this.dateScrap = dateScrap;
	}

	@Basic
	@Column(name="date_using")
	public Date getDateUsing() {
		return dateUsing;
	}

	public void setDateUsing(Date dateUsing) {
		this.dateUsing = dateUsing;
	}

	@Basic
	@Column(name="depreciation_charge")
	public BigDecimal getDepreciationCharge() {
		return depreciationCharge;
	}

	public void setDepreciationCharge(BigDecimal depreciationCharge) {
		this.depreciationCharge = depreciationCharge;
	}

	@Basic
	@Column(length=20)
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Basic
	@Column(name="driver_addr", length=80)
	public String getDriverAddr() {
		return driverAddr;
	}

	public void setDriverAddr(String driverAddr) {
		this.driverAddr = driverAddr;
	}

	@Basic
	@Column(name="driver_id", columnDefinition="INT")
	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Basic
	@Column(name="driver_licence_no", length=30)
	public String getDriverLicenceNo() {
		return driverLicenceNo;
	}

	public void setDriverLicenceNo(String driverLicenceNo) {
		this.driverLicenceNo = driverLicenceNo;
	}

	@Basic
	@Column(name="driver_phone", length=20)
	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	@Basic
	@Column(name="engine_no", length=20)
	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	@Basic
	@Column(name="entrust_move_id", columnDefinition="INT")
	public Integer getEntrustMoveId() {
		return entrustMoveId;
	}

	public void setEntrustMoveId(Integer entrustMoveId) {
		this.entrustMoveId = entrustMoveId;
	}

	@Basic
	@Column(name="insurance_no", length=30)
	public String getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	@Basic
	@Column(name="license_no", length=20)
	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Basic
	public Date getLimited() {
		return limited;
	}

	public void setLimited(Date limited) {
		this.limited = limited;
	}

	@Basic
	@Column(name="mileage_current")
	public BigDecimal getMileageCurrent() {
		return mileageCurrent;
	}

	public void setMileageCurrent(BigDecimal mileageCurrent) {
		this.mileageCurrent = mileageCurrent;
	}

	@Basic
	@Column(name="mileage_start")
	public BigDecimal getMileageStart() {
		return mileageStart;
	}

	public void setMileageStart(BigDecimal mileageStart) {
		this.mileageStart = mileageStart;
	}

	@Basic
	@Column(name="mileage_terminal")
	public BigDecimal getMileageTerminal() {
		return mileageTerminal;
	}

	public void setMileageTerminal(BigDecimal mileageTerminal) {
		this.mileageTerminal = mileageTerminal;
	}

	@Basic
	@Column(length=20)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Basic
	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="oil_consumption")
	public BigDecimal getOilConsumption() {
		return oilConsumption;
	}

	public void setOilConsumption(BigDecimal oilConsumption) {
		this.oilConsumption = oilConsumption;
	}

	@Basic
	@Column(name="operation_no", length=20)
	public String getOperationNo() {
		return operationNo;
	}

	public void setOperationNo(String operationNo) {
		this.operationNo = operationNo;
	}

	@Basic
	@Column(length=20)
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Basic
	@Column(name="owner_addr", length=50)
	public String getOwnerAddr() {
		return ownerAddr;
	}

	public void setOwnerAddr(String ownerAddr) {
		this.ownerAddr = ownerAddr;
	}

	@Basic
	@Column(name="owner_id", columnDefinition="INT")
	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Basic
	@Column(name="owner_phone", length=20)
	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	@Basic
	@Column(name="plate_no", length=20)
	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	@Basic
	public BigDecimal getTonnage() {
		return tonnage;
	}

	public void setTonnage(BigDecimal tonnage) {
		this.tonnage = tonnage;
	}

	@Basic
	@Column(name="trailer_plate_no", length=20)
	public String getTrailerPlateNo() {
		return trailerPlateNo;
	}

	public void setTrailerPlateNo(String trailerPlateNo) {
		this.trailerPlateNo = trailerPlateNo;
	}
}