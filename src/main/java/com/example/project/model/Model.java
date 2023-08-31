package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table

public class Model {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String carName;
private String carType;
private int owners;
private String currentname;
private long mobile;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public int getOwners() {
	return owners;
}
public void setOwners(int owners) {
	this.owners = owners;
}
public String getCurrentname() {
	return currentname;
}
public void setCurrentname(String currentname) {
	this.currentname = currentname;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Model(int id, String carName, String carType, int owners, String currentname, long mobile, String address) {
	super();
	this.id = id;
	this.carName = carName;
	this.carType = carType;
	this.owners = owners;
	this.currentname = currentname;
	this.mobile = mobile;
	this.address = address;
}
public Model() {
	super();
}
}
