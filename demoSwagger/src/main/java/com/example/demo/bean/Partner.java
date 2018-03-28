package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Partner的实体，----》",reference = "我是参考")
public class Partner {
	
	@ApiModelProperty(value = "partnerId",dataType = "String")
	private String partnerId;
	@ApiModelProperty(value = "userType",dataType = "String")
	private String userType;
	@ApiModelProperty(value = "loginAccount",dataType = "String")
	private String loginAccount;
	@ApiModelProperty(value = "password",dataType = "String")
	private String password;
	@ApiModelProperty(value = "name",dataType = "String")
	private String name;
	@ApiModelProperty(value = "mobile",dataType = "String")
	private String mobile;
	@ApiModelProperty(value = "email",dataType = "String")
	private String email;
	@ApiModelProperty(value = "idcard",dataType = "String")
	private String idcard;
	@ApiModelProperty(value = "companyName",dataType = "String")
	private String companyName;
	@ApiModelProperty(value = "companyAddress",dataType = "String")
	private String companyAddress;

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "User [partnerId=" + partnerId + ", userType=" + userType + ", loginAccount=" + loginAccount
				+ ", password=" + password + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", idcard="
				+ idcard + ", companyName=" + companyName + ", companyAddress=" + companyAddress + "]";
	}
}
