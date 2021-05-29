package Java.SpringOrmDao;

import Java.SpringOrmEntities.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EmployeeDao
{
    private HibernateTemplate hibernateTemplate;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public EmployeeDao() {
        super();
    }

    public EmployeeDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    /* Inserting Data Into The Database */
    @Transactional
    public int insert(Employee employee)
    {
        Integer emp = (Integer) this.hibernateTemplate.save(employee);
        return emp;
    }

    /* Select Single Record From Database */
    public Employee getSignleEmployee(int employeeId)
    {
        Employee singleEmployee = this.hibernateTemplate.get(Employee.class, employeeId);
        return singleEmployee;
    }

    /* Select Multiple Records From The Database */
    public List<Employee> getAllEmployees()
    {
        List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
        return employees;
    }

    /* Delete Employee Record From Database */
    @Transactional
    public int deleteEmployee(int employeeId)
    {
        Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
        if(employee != null)
        {
            this.hibernateTemplate.delete(employee);
        }
        return 1;
    }

    /* Update Employee Record Into Database */
    @Transactional
    public int editEmployee(int employeeId) throws IOException {
        Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
        if(employee != null)
        {
            employee.setEmpId(employee.getEmpId());
            System.out.println("Enter New Employee Name : ");
            employee.setEmpName(reader.readLine());
            System.out.println("Enter New Employee Address : ");
            employee.setEmpAddress(reader.readLine());
            System.out.println("Enter New Employee Salary : ");
            employee.setEmpSalary(Double.parseDouble(reader.readLine()));
            this.hibernateTemplate.update(employee);
        }
        return 1;
    }
}
