package com.cg.jspresume;

import java.util.Date;

public class Resume {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String highestQualification;
	private Date dob;
	private String[] hobbies;
	private String address;
	private String[] skills;
	private String email;
	private String website;
	private long contactNumber;
	private String summary;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
	public Resume(String firstName, String lastName, String gender, String highestQualification, Date dob,
			String[] hobbies, String address, String[] skills, String email, String website, long contactNumber,
			String summary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.contactNumber = contactNumber;
		this.summary = summary;
	}
	
	
	
	

}
