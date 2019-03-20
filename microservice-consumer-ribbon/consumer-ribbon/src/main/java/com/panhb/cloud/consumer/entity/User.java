package com.panhb.cloud.consumer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private Long id;
	private String userName;
	@JsonIgnore
	private String passWord;
	private Date createDate;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("id", id)
				.add("userName", userName)
				.add("passWord", passWord)
				.add("createDate", createDate)
				.toString();
	}
	
}
