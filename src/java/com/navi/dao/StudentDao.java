package com.navi.dao;

import com.navi.interfaces.Dao;
import com.navi.pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StudentDao implements Dao<Student> {
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAll() { // Method returning the list of all the students
        return students;
    }

    @Override
    public void save(Student student) {  //Method adding the object to the Students list
        students.add(student);

    }

    @Override
    public void update(Student student, String[] params) {
        student.setFname(Objects.requireNonNull(params[0],"First-Name can not be null")); //Checking for first 0 parameter not to be null
        student.setName(Objects.requireNonNull(params[1],"Name can not be null.")); //checking the second 1 parameter not to be null.

        /*students.add(student);   //Updating the object to the list*/

    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }




}
