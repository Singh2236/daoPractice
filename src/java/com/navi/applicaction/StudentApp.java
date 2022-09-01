package com.navi.applicaction;

import com.navi.dao.StudentDao;

import com.navi.pojo.Student;

import java.util.*;


public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentDao studentDao = new StudentDao();

        List<Student> studentList = studentDao.getAll(); //List of all the registered students
        studentList.forEach(Student -> System.out.println(Student.toString()));

        // functionality to add the students
        System.out.println("Adding the student: ");
        System.out.println("First name: ");
        String firstName = scanner.next();
        System.out.println("Last name:");
        String lastName = scanner.next();

        studentList.add(new Student(firstName,lastName));

        studentList.forEach(Student -> System.out.println(Student.toString()));


        // functionality to update the information of the students

        studentDao.update(studentList.get(0),new String[]{"Insan" , "Bano"});



        studentList.forEach(Student -> System.out.println(Student.toString()));

        // functionality to remove the information of the student

        studentList.remove(studentList.get(0));

        studentList.forEach(Student -> System.out.println(Student.toString()));





    }













}
