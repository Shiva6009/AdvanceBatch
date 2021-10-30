package com.bridgelabz.model;

import javax.persistence.Entity;



import javax.persistence.Column;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity  
@Table  
public class Message {
	
	@Id  
	@Column
	private int msgid;
	
	@Column
	private String msg;
	
	
	public int getMsgid() {
		return msgid;
	}
	
	public void setMsgid(int msgid) {
		this.msgid = msgid;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	@Override
	public String toString() {
		return "Message [msgid=" + msgid + ", msg=" + msg + "]";
	}
}
