package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestTable {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 int reqId;
	int userId;
	int mentorid;
	boolean status;
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMentorid() {
		return mentorid;
	}
	public void setMentorid(int mentorid) {
		this.mentorid = mentorid;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
