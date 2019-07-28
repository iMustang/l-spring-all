package s05withmybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * title: StudentTest
 * description:
 */
public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s05withmybatis/spring.xml");
        StudentDao studentDao = (StudentDao) ac.getBean("studentDaoImpl");

        Student student = new Student();
        student.setStudentName("Lucy");

        int j = studentDao.insertStudent(student);
        System.out.println("j = " + j );

        System.out.println("-----Display students------");
        List<Student> studentList = studentDao.selectAllStudents();
        for (Student value : studentList) System.out.println(value);
    }
}

