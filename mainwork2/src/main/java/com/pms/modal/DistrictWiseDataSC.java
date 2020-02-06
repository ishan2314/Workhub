package com.pms.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district_wise_data_sc")
public class DistrictWiseDataSC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private String id;
	
	
	@Column(name = "district_name")
	private String districtName;
	
	@Column(name = "district_lgd_code")
	private Long districtLgdCode;
	
	@Column(name = "state_lgd_code")
	private Long stateLgdCode;
	
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
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getStateLgdCode() {
		return stateLgdCode;
	}

	public void setStateLgdCode(Long stateLgdCode) {
		this.stateLgdCode = stateLgdCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Long getDistrictLgdCode() {
		return districtLgdCode;
	}

	public void setDistrictLgdCode(Long districtLgdCode) {
		this.districtLgdCode = districtLgdCode;
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

	 
	
}
