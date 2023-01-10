package se.lexicon.data_access.impl;


import org.springframework.stereotype.Component;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.data_access.impl.Sequencer.StudentSequencer;
import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class StudentDAOImpl implements StudentDAO {

    List<Student> students= new ArrayList<>();


    @Override
    public Student save(Student student) {
        if(student== null) throw new IllegalArgumentException("Student was not valid");
        int studentId= StudentSequencer.nextId();
        student.setId(studentId);
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        if(id == 0) throw new IllegalArgumentException("Id was null");

        return students.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
