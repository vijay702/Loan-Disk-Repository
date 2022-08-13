package com.fastxpo.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "borrower")
public class BorrowerEntity {
	
	private Long borrowerId;
	
	private String firstname;
	private String lastname;
	private String businessName;
	private List<String> country;
	
	private String licenceKey;
	private String gender;
	private String title;
	private String Mobile;
	private String Email;
	private String Dob;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String landLinePhoneNumber;
	private String workingStatus;
	private String creditScore;
	private MultipartFile image;
	private String Descrption;
	public Long getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(Long borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public List<String> getCountry() {
		return country;
	}
	public void setCountry(List<String> country) {
		this.country = country;
	}
	public String getLicenceKey() {
		return licenceKey;
	}
	public void setLicenceKey(String licenceKey) {
		this.licenceKey = licenceKey;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getLandLinePhoneNumber() {
		return landLinePhoneNumber;
	}
	public void setLandLinePhoneNumber(String landLinePhoneNumber) {
		this.landLinePhoneNumber = landLinePhoneNumber;
	}
	public String getWorkingStatus() {
		return workingStatus;
	}
	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}
	public String getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getDescrption() {
		return Descrption;
	}
	public void setDescrption(String descrption) {
		Descrption = descrption;
	}
	@Override
	public String toString() {
		return "BorrowerEntity [borrowerId=" + borrowerId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", businessName=" + businessName + ", country=" + country + ", licenceKey=" + licenceKey + ", gender="
				+ gender + ", title=" + title + ", Mobile=" + Mobile + ", Email=" + Email + ", Dob=" + Dob
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", landLinePhoneNumber=" + landLinePhoneNumber + ", workingStatus=" + workingStatus + ", creditScore="
				+ creditScore + ", image=" + image + ", Descrption=" + Descrption + "]";
	}
	public BorrowerEntity(Long borrowerId, String firstname, String lastname, String businessName, List<String> country,
			String licenceKey, String gender, String title, String mobile, String email, String dob, String address,
			String city, String state, String zipCode, String landLinePhoneNumber, String workingStatus,
			String creditScore, MultipartFile image, String descrption) {
		super();
		this.borrowerId = borrowerId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.businessName = businessName;
		this.country = country;
		this.licenceKey = licenceKey;
		this.gender = gender;
		this.title = title;
		Mobile = mobile;
		Email = email;
		Dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.landLinePhoneNumber = landLinePhoneNumber;
		this.workingStatus = workingStatus;
		this.creditScore = creditScore;
		this.image = image;
		Descrption = descrption;
	}
	public BorrowerEntity() {
	
	}
	
	
	
	
	

}
