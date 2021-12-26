package com.example.demo.vo;

public class BaseResponse {
	
	private String rspCode;
	
	private String rspMsg;
	
	private Object rspBody;
	
	private String errorMsg;


	public String getRspCode() {
		return rspCode;
	}

	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}
	
	public String getRspMsg() {
		return rspMsg;
	}

	public void setRspMsg(String rspMsg) {
		this.rspMsg = rspMsg;
	}

	public Object getRspBody() {
		return rspBody;
	}

	public void setRspBody(Object rspBody) {
		this.rspBody = rspBody;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	

}
