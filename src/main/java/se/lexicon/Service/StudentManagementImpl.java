package se.lexicon.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.Service.StudentManagement;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.List;
@Component
public class StudentManagementImpl implements StudentManagement {

    @Autowired
    StudentDAO studentDAO;
    @Autowired
    UserInputService scanner;





    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
