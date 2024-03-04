package edu.neu.csye7374;

public class Address {
	private String street;
	private String city;
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	private String state;
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	public String getState() {
		return state;
	}
	public int getZipCode() {
		return zipCode;
	}
	private int zipCode;

}
