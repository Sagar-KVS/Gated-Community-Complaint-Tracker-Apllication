package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "register_data")
public class RegisterData {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@OneToMany(mappedBy = "registerData", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<NewComplaint> complaintsList;

	public RegisterData() {

	}

	public RegisterData(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public RegisterData(int id, String name, String email, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public RegisterData(String name, String email, String password, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public RegisterData(String name, String email, String password, List<NewComplaint> complaintsList) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.complaintsList = complaintsList;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<NewComplaint> getComplaintsList() {
		return complaintsList;
	}

	public void setComplaintsList(List<NewComplaint> complaintsList) {
		this.complaintsList = complaintsList;
	}

	@Override
	public String toString() {
		return "RegisterData [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + "]";
	}

}
