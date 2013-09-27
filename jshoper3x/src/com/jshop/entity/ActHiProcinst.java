package com.jshop.entity;

// Generated 2013-9-26 20:43:23 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ActHiProcinst generated by hbm2java
 */
@Entity
@Table(name = "act_hi_procinst", catalog = "jshoper3", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "PROC_DEF_ID_", "BUSINESS_KEY_" }),
		@UniqueConstraint(columnNames = "PROC_INST_ID_") })
public class ActHiProcinst implements java.io.Serializable {

	private String id;
	private String procInstId;
	private String businessKey;
	private String procDefId;
	private Date startTime;
	private Date endTime;
	private Long duration;
	private String startUserId;
	private String startActId;
	private String endActId;
	private String superProcessInstanceId;
	private String deleteReason;

	public ActHiProcinst() {
	}

	public ActHiProcinst(String id, String procInstId, String procDefId,
			Date startTime) {
		this.id = id;
		this.procInstId = procInstId;
		this.procDefId = procDefId;
		this.startTime = startTime;
	}

	public ActHiProcinst(String id, String procInstId, String businessKey,
			String procDefId, Date startTime, Date endTime, Long duration,
			String startUserId, String startActId, String endActId,
			String superProcessInstanceId, String deleteReason) {
		this.id = id;
		this.procInstId = procInstId;
		this.businessKey = businessKey;
		this.procDefId = procDefId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.startUserId = startUserId;
		this.startActId = startActId;
		this.endActId = endActId;
		this.superProcessInstanceId = superProcessInstanceId;
		this.deleteReason = deleteReason;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PROC_INST_ID_", unique = true, nullable = false, length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "BUSINESS_KEY_")
	public String getBusinessKey() {
		return this.businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	@Column(name = "PROC_DEF_ID_", nullable = false, length = 64)
	public String getProcDefId() {
		return this.procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_TIME_", nullable = false, length = 0)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_TIME_", length = 0)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "DURATION_")
	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	@Column(name = "START_USER_ID_")
	public String getStartUserId() {
		return this.startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	@Column(name = "START_ACT_ID_")
	public String getStartActId() {
		return this.startActId;
	}

	public void setStartActId(String startActId) {
		this.startActId = startActId;
	}

	@Column(name = "END_ACT_ID_")
	public String getEndActId() {
		return this.endActId;
	}

	public void setEndActId(String endActId) {
		this.endActId = endActId;
	}

	@Column(name = "SUPER_PROCESS_INSTANCE_ID_", length = 64)
	public String getSuperProcessInstanceId() {
		return this.superProcessInstanceId;
	}

	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}

	@Column(name = "DELETE_REASON_", length = 4000)
	public String getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

}
