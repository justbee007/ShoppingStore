package edu.neu.csye7374;

public class Customer {
private String name;
private Address address;
public String getName() {
	return name;
}
public Address getAddress() {
	return address;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(Address address) {
	this.address = address;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
}
public Long getPhoneNo() {
	return phoneNo;
}
private String emailAddress;
private Long phoneNo;
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", emailAddress=" + emailAddress + ", phoneNo=" + phoneNo
			+ "]";
}

}
