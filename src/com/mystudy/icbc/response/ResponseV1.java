package com.mystudy.icbc.response;

import com.mystudy.icbc.request.RequestXMLElement;

public abstract class ResponseV1 {
	@RequestXMLElement(name = "TransCode", parent = "pub")
	protected String transCode;
	
	@RequestXMLElement(name = "CIS", parent = "pub")
	protected String cis;
	
	@RequestXMLElement(name = "BankCode", parent = "pub")
	protected String bankCode;
	
	@RequestXMLElement(name = "ID", parent = "pub")
	protected String ID;
	
	@RequestXMLElement(name = "TranDate", parent = "pub")
	protected String tranDate;
	
	@RequestXMLElement(name = "TranTime", parent = "pub")
	protected String tranTime;
	
	@RequestXMLElement(name = "fSeqno", parent = "pub")
	protected String fSeqno;
	
	public String returnCode;
	
	public String returnMsg;
	
	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getCis() {
		return cis;
	}

	public void setCis(String cis) {
		this.cis = cis;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public String getfSeqno() {
		return fSeqno;
	}

	public void setfSeqno(String fSeqno) {
		this.fSeqno = fSeqno;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	
	abstract boolean isSuccess();
}
