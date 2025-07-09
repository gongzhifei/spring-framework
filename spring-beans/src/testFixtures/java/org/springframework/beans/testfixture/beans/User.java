package org.springframework.beans.testfixture.beans;

public class User {

	private String name;

	private Integer age;

	private Level level;

	public User() {
		System.out.println("---------- User 初始化 ----------");
	}

	public String getName() {
		System.out.println("User.getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(String.format("User.setName = %s", name));
		this.name = name;
	}

	public Integer getAge() {
		System.out.println("User.getAge");
		return age;
	}

	public void setAge(Integer age) {
		System.out.println(String.format("User.setAge = %s",age));
		this.age = age;
	}

	public Level getLevel() {
		System.out.println("User.getLevel");
		return level;
	}

	public void setLevel(Level level) {
		System.out.println(String.format("User.setLevel = %s",level));
		this.level = level;
	}
}
