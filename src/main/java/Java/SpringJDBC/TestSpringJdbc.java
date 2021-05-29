package Java.SpringJDBC;

import Java.SpringJDBC.Dao.StudentDao;
import Java.SpringJDBC.Dao.StudentDaoImpl;
import org.example.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestSpringJdbc
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcconfig.xml");
        JdbcTemplate jTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        /* Insert Query */  // INSERT QUERY
//        String sql = "insert into student(studentId,studentName,studentCity) values(?,?,?)";
//        int update = jTemplate.update(sql, 5, "Himanshu Prajapati", "Ahmedabad");
//        System.out.println(update + " Row Is Inserted Successfully");

        /* Insert into the Database Using interface or advance Level */ // INSERT QUERY
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("springJdbcconfig.xml");
//        StudentDao daoImpl = context1.getBean("StudentDaoImpl", StudentDao.class);
//
//        Student student = new Student();
//        student.setStudentId(6);
//        student.setStudentName("Pinkesh Parmar");
//        student.setStudentCity("Bharuch");
//
//        int insert = daoImpl.insert(student);
//        System.out.println("Number Of Student Added Is : "+insert);

        /* Update Student Using Interface Or Advance Level */ // UPDATE QUERY
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("springJdbcconfig.xml");
//        StudentDao daoImpl = context1.getBean("StudentDaoImpl", StudentDao.class);
//
//        Student student = new Student();
//        student.setStudentId(5);
//        student.setStudentName("Bhavu Prajapati");
//        student.setStudentCity("Ahmedabad");
//
//        int update = daoImpl.edit(student);
//        System.out.println("Number Of Student Updated Is : "+update);


        /* Delete Query Using Interface Or Advance Level */ // DELETE QUERY
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("springJdbcconfig.xml");
//        StudentDao daoImpl = context1.getBean("StudentDaoImpl", StudentDao.class);
//
//        int delete = daoImpl.delete(6);
//        System.out.println("Number Of Student Deleted Is : "+delete);

        /* Select Single Record Form The Database */ // SINGLE RECORD FETCHING

        System.out.println("--------------Using XMl File-----------------");

        ApplicationContext context1 = new ClassPathXmlApplicationContext("springJdbcconfig.xml");
        StudentDao daoImpl = context1.getBean("StudentDaoImpl", StudentDao.class);
        Student singleStudent = daoImpl.getSingleStudent(1);
        System.out.println(singleStudent.toString());

        /* Select Multiple Record From The Database */ // MULTIPLE RECORD FETCHING
        List<Student> multipleStudent = daoImpl.getMultipleStudent();
        for(Student student: multipleStudent)
        {
            System.out.println(student);
        }

        System.out.println("--------------Using Java Class Annotation File-----------------");

        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(JavaJdbcConfig.class);
        StudentDao daoImpl1 = configApplicationContext.getBean("StudentDaoImpl", StudentDao.class);
        List<Student> multipleStudent1 = daoImpl1.getMultipleStudent();

        for (Student student : multipleStudent1)
        {
            System.out.println(student);
        }
    }
}
