package com.example.customer.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {
	@Id
	int id;
	String customer_name;
	int contact_no;
	String customer_address;
	String date_of_registration;
	int age;
	public Customer() {
	
	}
	public int getId() {
		return id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer(int id, String customer_name, int contact_no, String customer_address, String date_of_registration,
			int age) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.customer_address = customer_address;
		this.date_of_registration = date_of_registration;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customer_name=" + customer_name + ", contact_no=" + contact_no
				+ ", customer_address=" + customer_address + ", date_of_registration=" + date_of_registration + ", age="
				+ age + "]";
	}
	

}
