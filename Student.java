package com.springframework.applicationcontext.settertype1;

// Bean Class Or POJO Class
public class Student {

	// Declare

	private String name;
	private String address;
	private String age;

	// Use Getter & Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
