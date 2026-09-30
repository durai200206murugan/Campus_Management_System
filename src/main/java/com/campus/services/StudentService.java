package com.campus.services;

import java.util.List;
import com.campus.dao.StudentDao;
import com.campus.model.Student;


public class StudentService {

    private final StudentDao studentDao;

    public  StudentService(){
        studentDao = new StudentDao();
    }
    //get student
    public List<Student> getStudents() {
        return studentDao.getAllStudents();
    }
    //get student by id
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    //add student
    public void addStudent(String name,String department,int age){
        studentDao.addStudent(new Student(name,department,age));
    }
    
    //update student
    public void updateStudent(int id,String name,String department,int age){
        studentDao.updateStudent(new Student(id,name,department,age));
    }
    
    //delete student
    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }
}