package com.fastxpo.app.entity;

import java.util.List;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long borrowerId;
	
	private String firstname;
	private String lastname;
	private String businessName;

	private String country;
	
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
//	private MultipartFile image;
	private String Descrption;

	
	
	

}
