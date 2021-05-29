package Java.SpringJDBC;

import Java.SpringJDBC.Dao.StudentDao;
import Java.SpringJDBC.Dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JavaJdbcConfig {
    @Bean(name = {"dataSource"})
    public DataSource getDataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        return dataSource;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getJdbcTemplate()
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean(name = {"StudentDaoImpl"})
    public StudentDao getStudentDao()
    {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}
