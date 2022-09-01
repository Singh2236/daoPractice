package com.navi.interfaces;

import java.util.List;

public interface Dao<T> {
    List<T> getAll(); // To See all the students in the list
    void save(T t);  //To add the new students
    void update(T t, String[] params); //To update the information of the new student
    void delete(T t); // To delete the information of the new student


}
