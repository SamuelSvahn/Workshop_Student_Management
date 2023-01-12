package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Service.StudentManagementImpl;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;


public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDAO studentDAO = context.getBean(StudentDAO.class);

        UserInputService userInputService =context.getBean(UserInputService.class);

        StudentManagementImpl studentManagement = context.getBean(StudentManagementImpl.class);

        Student createdStudent= studentManagement.create();
        System.out.println(studentManagement.save(createdStudent));


        System.out.println(studentManagement.find(1));


        studentManagement.remove(1);
        System.out.println(studentManagement.findAll());




    }
}
