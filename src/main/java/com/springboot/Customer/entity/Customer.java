package com.springboot.Customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Records")
	public class Customer {
		@Id
		@Column(name="id")
			@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@Column(name="name")
		private String name;

		@Column(name="age")
		private int age;

		@Column(name="gender")
		private String gender;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}


		}


