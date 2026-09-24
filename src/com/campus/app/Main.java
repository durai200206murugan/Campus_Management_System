package com.campus.app; 

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main
   {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //input from user
        System.out.println("Enter student id");
        int studenrid=sc.nextInt();
        System.out.println("Enter student name"); 
        String studentname=sc.next();
        System.out.println("Enter student age");
        int age=sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("Enter student department");
        String department=sc.next();
        System.out.println("number of subjects");
        int n=sc.nextInt();
        sc.nextLine(); // consume the newline character
        int[] marks=new int[n];
        System.out.println("Enter marks of"+n+"subjects");
        for(int i=0;i<n;i++){
            System.out.println("Enter marks of subject"+(i+1));
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        //constructing student object and displaying report card
        Student student=new Student(studenrid, studentname, age, department, marks);
        student.displaystudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
   }