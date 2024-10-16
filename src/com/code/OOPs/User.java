package com.code.OOPs;

public class User {
private String name;
private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
	
	@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + "]";
}
	public static void main(String[] args) {
		User user= new User();
		user.setName("Aasif");
		user.setAge("25");
		System.out.println(user);
	}
}
