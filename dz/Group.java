package dz;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group {
	private Student[] students = new Student[10];
	private String name;

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group(Student[] students) {
		super();
		this.students = students;
	}

	public Group() {
		super();
	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length + 1; i++) {

			try {
				if (i >= students.length) {
					throw new TheGroupIsFullException("The Group Is Full");
				}

				if (students[i] == null) {
					students[i] = student;
					System.out.println("student was added");
					break;
				}
			} catch (TheGroupIsFullException e) {
				System.out.println(e.getMessage());

			}
		}
	}

	public void delStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getStudNumber() == (student.getStudNumber())) {
					students[i] = null;
					System.out.println("Student deleted");
					break;
				}
			}
		}
	}

	public Student search(String surename) {
		for (Student student : students) {
			if (student != null) {
				if (student.getSurname().equals(surename)) {
					return student;
				}
			}
		}
		return null;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Group [students=" + Arrays.toString(students) + ", name=" + name + "]";
	}

}