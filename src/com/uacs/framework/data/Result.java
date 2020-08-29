package com.uacs.framework.data;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {
	
	private double amount = 0.00;	
	
	private boolean state = false;
	private String merchantID="";
	private String userId=""; 
	private String msgCode = "";
	private String msgDesc = "";
	private String Keyst = "";	
	private String keyString = "";
	private long keyResult = 0;
	private String loginID = ""; //Login  ID
	private String phNo = "";
	private String sessionID = "";
	private String parentID = "";

	private ArrayList<Long> longResult = new ArrayList<Long>();
	private ArrayList<String> stringResult = new ArrayList<String>();
	
	
    public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getKeyst() {
		return Keyst;
	}

	public void setKeyst(String keyst) {
		Keyst = keyst;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	private long[] key;
	
	public long[] getKey() {
		return key;
	}

	public void setKey(long[] key) {
		this.key = key;
	}


	public Result() {
		clearProperties();
	}

	

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	
	public long getKeyResult() {
		return keyResult;
	}

	public void setKeyResult(long keyResult) {
		this.keyResult = keyResult;
	}

	public ArrayList<Long> getLongResult() {
		return longResult;
	}

	public void setLongResult(ArrayList<Long> longResult) {
		this.longResult = longResult;
	}

	public ArrayList<String> getStringResult() {
		return stringResult;
	}

	public void setStringResult(ArrayList<String> stringResult) {
		this.stringResult = stringResult;
	}

	
	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	private void clearProperties() {
		state = false;
		merchantID ="";
		userId = "";
		msgCode = "";
		msgDesc = "";
		keyResult=0;
	
		longResult = new ArrayList<Long>();
		stringResult = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Result [amount=" + amount + ", Keyst=" + Keyst + ", state=" + state + ", merchantID=" + merchantID
				+ ", userId=" + userId + ", msgCode=" + msgCode + ", msgDesc=" + msgDesc + ", keyString=" + keyString
				+ ", keyResult=" + keyResult + ", loginID=" + loginID + ", phNo=" + phNo + ", sessionID=" + sessionID
				+ ", longResult=" + longResult + ", stringResult=" + stringResult + ", key=" + Arrays.toString(key)
				+ "]";
	}
	
	
}
