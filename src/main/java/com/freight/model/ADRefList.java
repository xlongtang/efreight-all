package com.freight.model;

import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="ad_ref_list")
public class ADRefList extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDRefListID;
	private Integer aDReferenceID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String name;
	private String updated;
	private Integer updatedBy;
	private String value;

	public ADRefList() {
	}

	public ADRefList(Integer aDRefListID) {
		this.aDRefListID = aDRefListID;
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

	@Id
	@Column(name="ad_ref_list_id", columnDefinition="INT")
	@TableGenerator(name = "PkGen_107", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Ref_List", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_107")
	public Integer getADRefListID() {
		return aDRefListID;
	}

	public void setADRefListID(Integer aDRefListID) {
		this.aDRefListID = aDRefListID;
	}

	@Basic
	@Column(name="ad_reference_id", columnDefinition="INT", nullable=false)
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
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
	@Column(nullable=false, length=60)
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
	@Column(name="updated_by", columnDefinition="INT")
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}