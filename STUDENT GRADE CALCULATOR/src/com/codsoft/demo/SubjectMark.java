package com.codsoft.demo;

import java.util.Scanner;

public class SubjectMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double avg = 0;
		String grade;
		
		System.out.print("Enter a Number of Subject--->");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		for(int i=0; i<marks.length; i++) {
			System.out.print("Enter a mark Subject "+(i+1));
			marks[i] = sc.nextInt();
			
			if(marks[i]<0 || marks[i]>100) {
				throw new IllegalArgumentException("Enter marks between 1 to 100");
			}
			total += marks[i];
		}
		avg = (double)total/n;
		System.out.println(avg);
		
		if(avg>=90) {
			grade = "A+";
		}else if(avg>=80) {
			grade = "A";
		}else if(avg>=70) {
			grade = "B";
		}else if(avg>=60) {
			grade = "C";
		}else if(avg>=50) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("Student Result");
		System.out.println("Total Mark :"+total+"\nAverage Percentage :"+avg+"\nStudent Grade :"+grade);
	}
}
