package edu.neu.csye7374;

public class CustomerBuilder {
    private String name;
    private Address address;
    private String emailAddress;
    private Long phoneNo;
    
    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public CustomerBuilder setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public Customer build() {
    	 Customer customer = new Customer();
    	 customer.setAddress(address);
    	 customer.setName(name);
    	 customer.setPhoneNo(phoneNo);
    	 customer.setEmailAddress(emailAddress);
        return customer;
    }
}

