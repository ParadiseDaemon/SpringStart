package com.gmw.skype.bean;

public class User {
	private String username;
	private String sex;
	private Integer age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", age=" + age + "]";
	}
}
