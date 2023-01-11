package se.lexicon.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.Service.StudentManagement;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentManagementImpl implements StudentManagement {

    @Autowired
    StudentDAO studentDAO;
    @Autowired
    UserInputService scanner;



    @Override
    public Student create() {
        System.out.println("Enter your person id:");
        int id= scanner.getInt();

        System.out.println("Enter your name");
        String name= scanner.getString();

        Student student =new Student(id,name);

        return student;
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
        return studentDAO.findAll();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
