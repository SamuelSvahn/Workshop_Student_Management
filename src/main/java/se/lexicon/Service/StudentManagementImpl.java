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
        if(id== 0) throw new IllegalArgumentException("Id was null");

        System.out.println("Enter your name");
        String name= scanner.getString();
        if(name == null) throw new IllegalArgumentException("Name was null");

        Student student =new Student(id,name);

        return student;
    }

    @Override
    public Student save(Student student) {
        Student createdStudent= studentDAO.save(student);
        return createdStudent;
    }

    @Override
    public Student find(int id) {
        System.out.println("Enter id of person you looking for:");
        int firstId= scanner.getInt();
        if(firstId== 0) throw new IllegalArgumentException("id was not valid");
        Student createdStudent= studentDAO.find(firstId);
        return createdStudent;
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
        System.out.println("What id do you want to edit?");


        return null;
    }
}
