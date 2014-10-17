package com.freight.model;

import java.math.*;
import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="c_inventory_v")
public class CInventoryV extends EntityBase {
	private static final long serialVersionUID = 1L;
	private BigDecimal amount;
	private Integer cInventoryID;
	private Integer cOrderID;
	private Integer cOrderLineID;
	private String commentOrder;
	private String commentReceipt;
	private String consigneeAddr;
	private Integer consigneeBpartnerID;
	private String consigneeName;
	private String consigneePhone;
	private Integer consignorBpartnerID;
	private String consignorOrgName;
	private String consignorName;
	private String consignorPhone;
	private String dateOrdered;
	private Integer departOrgID;
	private String departOrgName;
	private Integer destOrgID;
	private String destOrgName;
	private String goodsName;
	private String goodsPackage;
	private Integer inventoryStatus;
	private String orderCd;
	private Integer ownerOrgID;
	private String ownerOrgName;
	private BigDecimal totalCharge;
	private BigDecimal volume;
	private BigDecimal weight;

	public CInventoryV() {
	}

	public CInventoryV(Integer cInventoryID) {
		this.cInventoryID = cInventoryID;
	}

	@Basic
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Id
	@Column(name="c_inventory_id", columnDefinition="INT")
	public Integer getCInventoryID() {
		return cInventoryID;
	}

	public void setCInventoryID(Integer cInventoryID) {
		this.cInventoryID = cInventoryID;
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
	@Column(name="c_order_line_id", columnDefinition="INT")
	public Integer getCOrderLineID() {
		return cOrderLineID;
	}

	public void setCOrderLineID(Integer cOrderLineID) {
		this.cOrderLineID = cOrderLineID;
	}

	@Basic
	@Column(name="comment_order")
	public String getCommentOrder() {
		return commentOrder;
	}

	public void setCommentOrder(String commentOrder) {
		this.commentOrder = commentOrder;
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
	@Column(name="consignee_addr", length=80)
	public String getConsigneeAddr() {
		return consigneeAddr;
	}

	public void setConsigneeAddr(String consigneeAddr) {
		this.consigneeAddr = consigneeAddr;
	}

	@Basic
	@Column(name="consignee_bpartner_id", columnDefinition="INT")
	public Integer getConsigneeBpartnerID() {
		return consigneeBpartnerID;
	}

	public void setConsigneeBpartnerID(Integer consigneeBpartnerID) {
		this.consigneeBpartnerID = consigneeBpartnerID;
	}

	@Basic
	@Column(name="consignee_name", length=60)
	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	@Basic
	@Column(name="consignee_phone", length=20)
	public String getConsigneePhone() {
		return consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	@Basic
	@Column(name="consignor_bpartner_id", columnDefinition="INT")
	public Integer getConsignorBpartnerID() {
		return consignorBpartnerID;
	}

	public void setConsignorBpartnerID(Integer consignorBpartnerID) {
		this.consignorBpartnerID = consignorBpartnerID;
	}
	
	@Basic
	@Column(name="consignor_org_name", length=60)
	public String getConsignorOrgName() {
		return consignorOrgName;
	}

	public void setConsignorOrgName(String consignorOrgName) {
		this.consignorOrgName = consignorOrgName;
	}

	@Basic
	@Column(name="consignor_name", length=60)
	public String getConsignorName() {
		return consignorName;
	}

	public void setConsignorName(String consignorName) {
		this.consignorName = consignorName;
	}

	@Basic
	@Column(name="consignor_phone", length=20)
	public String getConsignorPhone() {
		return consignorPhone;
	}

	public void setConsignorPhone(String consignorPhone) {
		this.consignorPhone = consignorPhone;
	}

	@Basic
	@Column(name="date_ordered")
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
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
	@Column(name="depart_org_name", length=60)
	public String getDepartOrgName() {
		return departOrgName;
	}

	public void setDepartOrgName(String departOrgName) {
		this.departOrgName = departOrgName;
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
	@Column(name="dest_org_name", length=60)
	public String getDestOrgName() {
		return destOrgName;
	}

	public void setDestOrgName(String destOrgName) {
		this.destOrgName = destOrgName;
	}

	@Basic
	@Column(name="goods_name", length=45)
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Basic
	@Column(name="goods_package", length=20)
	public String getGoodsPackage() {
		return goodsPackage;
	}

	public void setGoodsPackage(String goodsPackage) {
		this.goodsPackage = goodsPackage;
	}

	@Basic
	@Column(name="inventory_status", columnDefinition="INT", nullable=false)
	public Integer getInventoryStatus() {
		return inventoryStatus;
	}

	public void setInventoryStatus(Integer inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	@Basic
	@Column(name="order_cd", length=20)
	public String getOrderCd() {
		return orderCd;
	}

	public void setOrderCd(String orderCd) {
		this.orderCd = orderCd;
	}

	@Basic
	@Column(name="owner_org_id", columnDefinition="INT")
	public Integer getOwnerOrgID() {
		return ownerOrgID;
	}

	public void setOwnerOrgID(Integer ownerOrgId) {
		this.ownerOrgID = ownerOrgId;
	}

	@Basic
	@Column(name="owner_org_name", length=60)
	public String getOwnerOrgName() {
		return ownerOrgName;
	}

	public void setOwnerOrgName(String ownerOrgName) {
		this.ownerOrgName = ownerOrgName;
	}

	@Basic
	@Column(name="total_charge")
	public BigDecimal getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}

	@Basic
	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Basic
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
}