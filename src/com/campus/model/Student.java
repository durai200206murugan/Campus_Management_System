package com.campus.model;

public class Student{
    //Encapsulation -data hiding
    //instance variables
    private int studentid; 
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    //static variables
    static int StudentCount=0;

    //Default Constructor
    public Student(int Studentid,String Studentname,int age
    String department,int[] marks) {
        this.Studentid= Studentid;
        this.Studentname= Studentname;
        this.Age= Age;
        this.department= department;
        this.marks= marks;
        StudentCount++; 
    }
    //getters
    public int getstudentid(){
        return studentid;
    }
    public String getstudentname(){
        return Studentname;
    }
    public int getage(){
        return age;
    }
    public String getdepartment(){
        return department;
    }
    public int getmarks(){
        return marks;
    }
    //setters
    public void setstudentid( int studenid){
        this.studentid = Studentid;
    }
    public void setstudentname(int studentname){
        this.studentname = Studentname;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setdepartment(int department){
        this.department = department;
    }
    public void setmarks(int marks){
        this marks = marks;
    }
    //instance methods -belongs to object 
    public void displaysstudentInfo(){
        system.out.println("Student ID:"+studentid);
        system.out.println("Student Name:"+studentname);
        system.out.println("Age:"+age);
        system.out.println("Department:"+department);
    }
    
    public void displayStudentInfo(bolean showmarks){
        displayStudentInfo();

        if (showMarks) {
            System.out.println("Marks:"+ java.util.Array.tostring(marks));
        }
    }
    //static method-belongs to class,not to object
    public static void displaysStudentCount(){
        system.out.println("Total number of students:"+studentCount);
    }
 }
