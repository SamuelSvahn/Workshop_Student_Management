package se.lexicon.data_access.impl;

import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDAOImpl implements StudentDAO {

    List<Student> students= new ArrayList<>();



    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
