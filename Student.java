package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{

	    @Id
	    private int roll;
	    private String name;
	    private int marks;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
	    
	    
}



