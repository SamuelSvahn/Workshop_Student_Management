package se.lexicon.data_access.impl;


import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentDAOImpl implements StudentDAO {

    List<Student> students = new ArrayList<>();


    @Override
    public Student save(Student student) {
        if (student == null) throw new IllegalArgumentException("Student was not valid");
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        if (id == 0) throw new IllegalArgumentException("Id was null");
        for (Student student : students) {
            if (student.getId() != 0 && student.getId() == id)
                return student;
        }
        return null;
    }


    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        Student student = find(id);
        if (student == null) throw new IllegalArgumentException("Student does not exist");
        students.remove(student);

    }
}
