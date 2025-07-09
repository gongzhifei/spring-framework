package org.springframework.beans.testfixture.beans;

public class Level {

	private String name;

	private int level;

	public Level() {
		System.out.println("---------- Level 初始化 ----------");
	}

	public String getName() {
		System.out.println("Level.getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(String.format("Level.setName = %s",name));
		this.name = name;
	}

	public int getLevel() {
		System.out.println("Level.getLevel");
		return level;
	}

	public void setLevel(int level) {
		System.out.println(String.format("Level.setLevel = %s",level));
		this.level = level;
	}
}
