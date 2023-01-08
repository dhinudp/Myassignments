package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is Deepika");

	}
	public void studentDept() {
		System.out.println("Student Department is EEE");

	}
	public void studentId() {
		System.out.println("This is my student ID");

	}
	public static void main(String[] args) {
		Student S = new Student();
		S.studentName();
		S.studentDept();
		S.studentId();
		S.deptName();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
	
	}

}
