package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		this();
		SectionID = sectionID;
		StudentID = studentID;
		this.EnrollmentID = EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	
	
}
