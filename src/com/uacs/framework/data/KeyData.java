package com.uacs.framework.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "KeyTable")
public class KeyData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "KeyTableSysKey")
	private long keyTableSysKey;

	@Column(name = "FK_MFIOrgSysKey")
	private long fK_MFIOrgSysKey;

	@Column(name = "ObjectName")
	private String objectName;

	@Column(name = "Prefix")
	private String prefix;

	@Column(name = "NoOfDigit")
	private int noOfDigit;

	@Column(name = "Surfix")
	private String srfix;

	@Column(name = "SequenceNo")
	private int sequenceNo;

	@Column(name = "KeyDataType")
	private int keyDataType;

	@Column(name = "T950")
	private String registrationDate;

	@Column(name = "T951")
	private String modifiedDate;

	@Column(name = "T952")
	private String modifiedby;

	@Column(name = "status")
	private int status;

	public KeyData() {
		super();
	}

	public long getKeyTableSysKey() {
		return this.keyTableSysKey;
	}

	public void setKeyTableSysKey(long keyTableSysKey) {
		this.keyTableSysKey = keyTableSysKey;
	}

	public long getfK_MFIOrgSysKey() {
		return this.fK_MFIOrgSysKey;
	}

	public void setfK_MFIOrgSysKey(long fK_MFIOrgSysKey) {
		this.fK_MFIOrgSysKey = fK_MFIOrgSysKey;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getNoOfDigit() {
		return this.noOfDigit;
	}

	public void setNoOfDigit(int noOfDigit) {
		this.noOfDigit = noOfDigit;
	}

	public String getSrfix() {
		return this.srfix;
	}

	public void setSrfix(String srfix) {
		this.srfix = srfix;
	}

	public int getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public int getKeyDataType() {
		return this.keyDataType;
	}

	public void setKeyDataType(int keyDataType) {
		this.keyDataType = keyDataType;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}