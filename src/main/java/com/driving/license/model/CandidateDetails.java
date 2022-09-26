package com.driving.license.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidate")
public class CandidateDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "candidate-picode")
	private int pincode;
	
	//@Column(name = "candidate-candidateName")
	private  String candidateName;
	
	//@Column(name = "candidate-candidateAge")
	private int candidateAge;
	
	//@Column(name = "candidate-candidateDOB")
	private String candidateDOB;
	
	//@Column(name = "candidate-candidateLocation")
	private String candidateLocation;
	
	//@Column(name = "candidate-candidateSSC")
	private int candidateSSC;

	//@Column(name = "candidate-typeOfLicense")
	private String typeOfLicense;
	
	//non-parameterized constructor 
	public CandidateDetails() {
		
	}

	//Parameterized constructor
	public CandidateDetails(int pincode, String candidateName, int candidateAge, String candidateDOB,
			String candidateLocation, int candidateSSC, String typeOfLicense) {
		this.pincode = pincode;
		this.candidateName = candidateName;
		this.candidateAge = candidateAge;
		this.candidateDOB = candidateDOB;
		this.candidateLocation = candidateLocation;
		this.candidateSSC = candidateSSC;
		this.typeOfLicense = typeOfLicense;
	}

	//generating Setter and Getter methods
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getCandidateAge() {
		return candidateAge;
	}

	public void setCandidateAge(int candidateAge) {
		this.candidateAge = candidateAge;
	}

	public String getCandidateDOB() {
		return candidateDOB;
	}

	public void setCandidateDOB(String candidateDOB) {
		this.candidateDOB = candidateDOB;
	}

	public String getCandidateLocation() {
		return candidateLocation;
	}

	public void setCandidateLocation(String candidateLocation) {
		this.candidateLocation = candidateLocation;
	}

	public int getCandidateSSC() {
		return candidateSSC;
	}

	public void setCandidateSSC(int candidateSSC) {
		this.candidateSSC = candidateSSC;
	}

	public String getTypeOfLicense() {
		return typeOfLicense;
	}

	public void setTypeOfLicense(String typeOfLicense) {
		this.typeOfLicense = typeOfLicense;
	}

	//toString method
	@Override
	public String toString() {
		return "CandidateDetails [pincode=" + pincode + ", candidateName=" + candidateName + ", candidateAge="
				+ candidateAge + ", candidateDOB=" + candidateDOB + ", candidateLocation=" + candidateLocation
				+ ", candidateSSC=" + candidateSSC + ", typeOfLicense=" + typeOfLicense + "]";
	}
	

}
