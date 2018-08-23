package com.carl.personal.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** Created by chenzhuo_m on 2018/6/13. */

public class Person {

	private Long id ;

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private Integer age ;

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private String name ;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private Long perId ;

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	private String perName ;

	public Long getPerId() {
		return perId;
	}
	public void setPerId(Long perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}

	@Override
	public String toString() {
		return "Person{" +"id=" + id +", age=" + age +", name='" + name + '\'' +'}';
	}
}
