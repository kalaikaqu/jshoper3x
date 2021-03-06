package com.jshop.entity;

// Generated 2014-3-29 21:46:52 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MsgtextT generated by hbm2java
 */
@Entity
@Table(name = "msgtext_t", catalog = "jshoper3")
public class MsgtextT implements java.io.Serializable {

	private String msgtextid;
	private String text;
	private Date sendtime;

	public MsgtextT() {
	}

	public MsgtextT(String msgtextid, String text, Date sendtime) {
		this.msgtextid = msgtextid;
		this.text = text;
		this.sendtime = sendtime;
	}

	@Id
	@Column(name = "MSGTEXTID", unique = true, nullable = false, length = 20)
	public String getMsgtextid() {
		return this.msgtextid;
	}

	public void setMsgtextid(String msgtextid) {
		this.msgtextid = msgtextid;
	}

	@Column(name = "TEXT", nullable = false, length = 2000)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SENDTIME", nullable = false, length = 0)
	public Date getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

}
