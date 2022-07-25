package com.citius.jasper;

public class PatientDto {
	
	private int appointmentId;
	private String patientName;
	private String diagnosis;
	private String gender;
	private int patientAge;
	private int patientWeight;
	private int apDate;
	private String patientAddress;
	
	
	public PatientDto(){}
	
	
	public PatientDto(int appointmentId, String patientName, String diagnosis, String gender, int patientAge,
			int patientWeight, int apDate, String patientAddress) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.diagnosis = diagnosis;
		this.gender = gender;
		this.patientAge = patientAge;
		this.patientWeight = patientWeight;
		this.apDate = apDate;
		this.patientAddress = patientAddress;
	}
	public int getappointmentId() {
	return appointmentId;	
		
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public int getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(int patientWeight) {
		this.patientWeight = patientWeight;
	}
	public int getApDate() {
		return apDate;
	}
	public void setApDate(int apDate) {
		this.apDate = apDate;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	
		
	}

	
		

	}


