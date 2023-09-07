package com.javaExSet3;

public class StudentMarks {
	    private int marks;

	    public StudentMarks(int marks) {
	        this.marks=marks;
	        // TODO: Assign 'marks' to the instance variable 'this.marks'
	    }
 public static void main(String [] args) {
	 StudentMarks student=new StudentMarks(85);
	 System.out.println(student.assignGrade());
 }
	    public char assignGrade() {
	        // TODO: Implement the method which assigns the grade based on marks.
	        // If marks are less than 0 or greater than 100, return 'X'
	        if(marks<0 || marks >100)
	        return 'X';
	        // If marks are greater than or equal to 90, return 'A'
	        if(marks>=90)
	        return 'A';
	        // If marks are greater than or equal to 80, return 'B'
	        if(marks>=80)
	        return 'B';
	        // If marks are greater than or equal to 70, return 'C'
	        if(marks>=70)
	        return 'C';
	        // If marks are greater than or equal to 60, return 'D'
	        if(marks>=60)
	        return 'D';
	        // If marks are greater than or equal to 50, return 'E'
	        if(marks>=50)
	        return 'E';
	        // If marks are less than 50, return 'F'
	        return 'F';
	    }
	}
