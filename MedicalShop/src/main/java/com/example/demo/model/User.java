package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_list_products")
	private List<Product> list_pr;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userId, String firstName, String lastName, String email, String username, String password,
			List<Product> list_pr) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.list_pr = list_pr;
	}
	public List<Product> getList_pr() {
		return list_pr;
	}
	public void setList_pr(List<Product> list_pr) {
		this.list_pr = list_pr;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
