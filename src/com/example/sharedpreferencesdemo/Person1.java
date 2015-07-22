package com.example.sharedpreferencesdemo;

import java.io.Serializable;

public class Person1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Person1() {
		super();
	}
	public Person1(String name, int age, float height, boolean isMarried,
			String id) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.isMarried = isMarried;
		this.id = id;
	}
	//String类型属性 姓名
	public String name;
	//int类型属性 年龄
	public int age;
	//float类型属性 身高
	public float height;
	//boolean类型属性 是否已婚
	public boolean isMarried;
	//String类型属性 证件号
	public String id;
	@Override
	public String toString() {
		return "name=" + name + ",\n age=" + age + ",\n height=" + height
				+ ",\n isMarried=" + isMarried + ",\n id=" + id + "\n";
	}
}
