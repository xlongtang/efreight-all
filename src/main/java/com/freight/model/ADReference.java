package com.freight.model;

import java.util.List;

import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by: org.freight.AdempiereCustomizer
 */
@Entity
@Table(name = "ad_reference")
public class ADReference extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDReferenceID;
	private Boolean active;
	private String columnName;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private String updated;
	private Integer updatedBy;
	private Integer refType;
	private String refClass;
	private List<ADRefList> refLists;

	public ADReference() {
	}

	public ADReference(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(name = "ad_client_id", columnDefinition = "INT", nullable = false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name = "ad_org_id", columnDefinition = "INT", nullable = false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Id
	@Column(name = "ad_reference_id", columnDefinition = "INT")
	@TableGenerator(name = "PkGen_108", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Reference", valueColumnName = "currentnextsys", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_108")
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(nullable = false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name = "column_name", length = 45)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Basic
	@Column(nullable = false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(name = "created_by", columnDefinition = "INT", nullable = false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(length = 100)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable = false, length = 45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(name = "updated_by", columnDefinition = "INT")
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(name = "ref_type", columnDefinition = "INT")
	public Integer getRefType() {
		return refType;
	}

	public void setRefType(Integer refType) {
		this.refType = refType;
	}

	@Basic
	@Column(name = "ref_class")
	public String getRefClass() {
		return refClass;
	}

	public void setRefClass(String refClass) {
		this.refClass = refClass;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reference")
	public List<ADRefList> getRefLists() {
		return refLists;
	}

	public void setRefLists(List<ADRefList> refLists) {
		this.refLists = refLists;
	}
	
	public ADRefList addRefList(ADRefList refList) {
		getRefLists().add(refList);
		refList.setReference(this);

		return refList;
	}

	public ADRefList removeADMenu(ADRefList refList) {
		getRefLists().remove(refList);
		refList.setReference(null);

		return refList;
	}
	
}