package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaints")
public class NewComplaint {

	@Id
	@Column(name = "compalint_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "problem")
	private String name;

	@Column(name = "flat_number")
	private String flatNumber;

	@Column(name = "issue_date")
	private String date;

	@Column(name = "complaint_status", columnDefinition = "varchar(30) DEFAULT 'raised'")
	private String status = "raised";

	@Column(name = "contact_Number")
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private RegisterData registerData;

	public NewComplaint() {

	}

	public NewComplaint(int id, String name, String flatNumber, String date, String status, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.flatNumber = flatNumber;
		this.date = date;
		this.status = status;
		this.phoneNumber = phoneNumber;
	}

	public NewComplaint(String name, String flatNumber, String date, String phoneNumber) {
		super();
		this.name = name;
		this.flatNumber = flatNumber;
		this.date = date;
		this.phoneNumber = phoneNumber;
	}

	public NewComplaint(String name, String flatNumber, String date, String phoneNumber, RegisterData registerData) {
		super();
		this.name = name;
		this.flatNumber = flatNumber;
		this.date = date;
		this.phoneNumber = phoneNumber;
		this.registerData = registerData;
	}

	public void setDefaultStatus() {

		if (this.status == null || this.status.isEmpty()) {
			this.status = "raised";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public RegisterData getRegisterData() {
		return registerData;
	}

	public void setRegisterData(RegisterData registerData) {
		this.registerData = registerData;
	}

	@Override
	public String toString() {
		return "NewComplaint [id=" + id + ", name=" + name + ", flatNumber=" + flatNumber + ", date=" + date
				+ ", status=" + status + ", phoneNumber=" + phoneNumber + "]";
	}

}
