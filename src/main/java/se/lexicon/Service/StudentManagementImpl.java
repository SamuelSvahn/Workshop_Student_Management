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
import java.util.Optional;

@Component
public class StudentManagementImpl implements StudentManagement {

    @Autowired
    StudentDAO studentDAO;
    @Autowired
    UserInputService scanner;


    @Override
    public Student create() {
        System.out.println("Enter your person id:");
        int id = scanner.getInt();
        if (id == 0) throw new IllegalArgumentException("Id was null");

        System.out.println("Enter your name");
        String name = scanner.getString();
        if (name == null) throw new IllegalArgumentException("Name was null");

        Student student = new Student(id, name);

        return student;
    }

    @Override
    public Student save(Student student) {
        Student createdStudent = studentDAO.save(student);
        return createdStudent;
    }

    @Override
    public Student find(int id) {
        if (id == 0) throw new IllegalArgumentException("id was not valid");
        Student createdStudent = studentDAO.find(id);
        return createdStudent;
    }

    @Override
    public Student remove(int id) {
        if (id == 0) throw new IllegalArgumentException("Id was null");
        Student student = find(id);
        if (student == null) throw new IllegalArgumentException("Student does not exist");
        studentDAO.delete(id);
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student edit(Student student) {
        System.out.println("What id do you want to edit?");
        int firstId = scanner.getInt();
        if (firstId == 0) throw new IllegalArgumentException("Id was null");
        Student editedStudent = find(firstId);
        edit(editedStudent);

        return editedStudent;
    }
}
