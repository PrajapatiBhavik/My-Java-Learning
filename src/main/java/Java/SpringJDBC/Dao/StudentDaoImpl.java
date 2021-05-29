package Java.SpringJDBC.Dao;

import Java.SpringJDBC.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl() {
        super();
    }

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String sql = "insert into student(studentId,studentName,studentCity) values(?,?,?)";
        int update = this.jdbcTemplate.update(sql, student.getStudentId(), student.getStudentName(), student.getStudentCity());
        return update;
    }

    @Override
    public int edit(Student student) {
        String sql = "update student set studentName = ?,studentCity = ? where studentId = ?";
        int update = this.jdbcTemplate.update(sql, student.getStudentName(), student.getStudentCity(),student.getStudentId());
        return update;
    }

    @Override
    public int delete(int studentId) {
        String sql = "delete from student where studentId = ?";
        int delete = this.jdbcTemplate.update(sql, studentId);
        return delete;
    }

    @Override
    public Student getSingleStudent(int studentId) {
        String sql = "select * from student where studentId = ?";
        RowMapper<Student> rowMapper = new RowMpperImpl();
        Student student = this.jdbcTemplate.queryForObject(sql, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getMultipleStudent() {
        String sql = "select * from student";
        List<Student> query = this.jdbcTemplate.query(sql, new RowMpperImpl());
        return query;
    }
}
