package com.txdycmr.model;

public class User {
    private int id;
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User() {
	}

}
