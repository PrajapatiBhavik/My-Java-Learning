package Java.SpringJDBC.Dao;

import Java.SpringJDBC.Student;

import java.util.List;

public interface StudentDao
{
    public int insert(Student student);
    public int edit(Student student);
    public int delete(int studentId);
    public Student getSingleStudent(int studentId);
    public List<Student> getMultipleStudent();
}
