package com.pms.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_wise_data_sc")
public class StateWiseDataSC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name = "state_name")
	private String stateName;
	
	
	
	@Column(name="total_record")
	private Long totalRecord;
	
	@Column(name="total_record_male")
	private Long totalRecordMale;
	
	@Column(name="total_record_female")
	private Long totalRecordFemale;
	
	@Column(name="total_record_transgender")
	private Long totalRecordTransgender;
	
	@Column(name="total_record_fresh")
	private Long totalRecordFresh;
	
	@Column(name="total_record_renewal")
	private Long totalRecordRenewal;	
	
	@Column(name="total_scholarship")
	private Double totalScholarship;
	
	@Column(name="is_active")
	private Character isActive;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Long getTotalRecordMale() {
		return totalRecordMale;
	}

	public void setTotalRecordMale(Long totalRecordMale) {
		this.totalRecordMale = totalRecordMale;
	}

	public Long getTotalRecordFemale() {
		return totalRecordFemale;
	}

	public void setTotalRecordFemale(Long totalRecordFemale) {
		this.totalRecordFemale = totalRecordFemale;
	}

	public Long getTotalRecordFresh() {
		return totalRecordFresh;
	}

	public void setTotalRecordFresh(Long totalRecordFresh) {
		this.totalRecordFresh = totalRecordFresh;
	}

	public Long getTotalRecordRenewal() {
		return totalRecordRenewal;
	}

	public void setTotalRecordRenewal(Long totalRecordRenewal) {
		this.totalRecordRenewal = totalRecordRenewal;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	public Long getTotalRecordTransgender() {
		return totalRecordTransgender;
	}

	public void setTotalRecordTransgender(Long totalRecordTransgender) {
		this.totalRecordTransgender = totalRecordTransgender;
	}

	public Double getTotalScholarship() {
		return totalScholarship;
	}

	public void setTotalScholarship(Double totalScholarship) {
		this.totalScholarship = totalScholarship;
	}

	@Override
	public String toString() {
		return "StateWiseDataSC [id=" + id + ", stateName=" + stateName + ", totalRecord=" + totalRecord
				+ ", totalRecordMale=" + totalRecordMale + ", totalRecordFemale=" + totalRecordFemale
				+ ", totalRecordTransgender=" + totalRecordTransgender + ", totalRecordFresh=" + totalRecordFresh
				+ ", totalRecordRenewal=" + totalRecordRenewal + ", totalScholarship=" + totalScholarship
				+ ", isActive=" + isActive + "]";
	}

	 
	
}
