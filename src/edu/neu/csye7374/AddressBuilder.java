package edu.neu.csye7374;

public class AddressBuilder {
	private String street;
	private String city;
	public AddressBuilder setStreet(String street) {
		this.street = street;
		return this;
	}
	public AddressBuilder setCity(String city) {
		this.city = city;
		return this;
	}
	public AddressBuilder setState(String state) {
		this.state = state;
		return this;
	}
	private int zipCode;
	public AddressBuilder setZipcode(int zipCode) {
		this.zipCode = zipCode;
		return this;
	}
	private String state;

	public Address build()
	{	Address address = new Address();
		address.setCity(city);
		address.setState(state);
		address.setStreet(street);
		address.setZipCode(zipCode);
		return address;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", state=" + state
				+ "]";
	}
	

}
