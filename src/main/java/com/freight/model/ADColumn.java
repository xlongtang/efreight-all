package com.freight.model;

import javax.persistence.*;

import com.freight.common.EntityBase;

/**
 * Auto-generated by:
 * org.freight.AdempiereCustomizer
 */
@Entity
@Table(name="ad_column")
public class ADColumn extends EntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDColumnID;
	private Integer aDOrgID;
	private Integer aDReferenceID;
	private Integer aDReferenceValueID;
	private Integer aDTableID;
	private Boolean active;
	private Boolean autoComplete;
	private String columnName;
	private String created;
	private Integer createdBy;
	private String defaultValue;
	private Boolean encrypted;
	private Integer fieldLength;
	private Boolean identifier;
	private Boolean mandatory;
	private String name;
	private Boolean parent;
	private Boolean parimayKey;
	private String propertyName;
	private Boolean selectionColumn;
	private Integer seqNo;
	private Boolean updateable;
	private String updated;
	private Integer updatedBy;
	private String valueMax;
	private String valueMin;
	private String vformat;

	public ADColumn() {
	}

	public ADColumn(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	@Basic
	@Column(name="ad_client_id", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Id
	@Column(name="ad_column_id", columnDefinition="INT")
	@TableGenerator(name = "PkGen_104", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Column", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_104")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
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
	@Column(name="ad_reference_id", columnDefinition="INT", nullable=false)
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(name="ad_reference_value_id", columnDefinition="INT")
	public Integer getADReferenceValueID() {
		return aDReferenceValueID;
	}

	public void setADReferenceValueID(Integer aDReferenceValueID) {
		this.aDReferenceValueID = aDReferenceValueID;
	}

	@Basic
	@Column(name="ad_table_id", columnDefinition="INT", nullable=false)
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
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
	@Column(name="auto_complete", nullable=false)
	public Boolean isAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(Boolean autoComplete) {
		this.autoComplete = autoComplete;
	}

	@Basic
	@Column(name="column_name", nullable=false, length=40)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
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
	@Column(name="default_value", length=20)
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isEncrypted() {
		return encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	@Basic
	@Column(name="field_length", columnDefinition="INT", nullable=false)
	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIdentifier() {
		return identifier;
	}

	public void setIdentifier(Boolean identifier) {
		this.identifier = identifier;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isParent() {
		return parent;
	}

	public void setParent(Boolean parent) {
		this.parent = parent;
	}

	@Basic
	@Column(name="parimay_key", nullable=false)
	public Boolean isParimayKey() {
		return parimayKey;
	}

	public void setParimayKey(Boolean parimayKey) {
		this.parimayKey = parimayKey;
	}

	@Basic
	@Column(name="property_name", nullable=false, length=40)
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	@Basic
	@Column(name="selection_column", nullable=false)
	public Boolean isSelectionColumn() {
		return selectionColumn;
	}

	public void setSelectionColumn(Boolean selectionColumn) {
		this.selectionColumn = selectionColumn;
	}

	@Basic
	@Column(name="seq_no", columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isUpdateable() {
		return updateable;
	}

	public void setUpdateable(Boolean updateable) {
		this.updateable = updateable;
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
	@Column(name="value_max", length=20)
	public String getValueMax() {
		return valueMax;
	}

	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	@Basic
	@Column(name="value_min", length=20)
	public String getValueMin() {
		return valueMin;
	}

	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

	@Basic
	@Column(length=60)
	public String getVformat() {
		return vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}
}