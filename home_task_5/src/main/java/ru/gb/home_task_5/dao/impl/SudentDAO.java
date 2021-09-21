package ru.gb.home_task_5.dao.impl;

import ru.gb.home_task_5.entity.Student;

import java.util.List;
import java.util.UUID;

public interface SudentDAO {
    void update(Student student);

    void save(Student student);

    void add(Student student);

    void delete(Student student);

    Student getStudent(UUID uuid);

    List<Student> getStudents();

    void close();
}
