package Java.SpringORM;

import Java.SpringOrmDao.EmployeeDao;
import Java.SpringOrmEntities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class TestSptingOrm
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springormconfig.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("*********** WELCOME TO SPRING ORM(hibernate) CRUD *****************");
            boolean loopVar = true;
            while (loopVar)
            {
                System.out.println("1 -> Add New Employee");
                System.out.println("2 -> Display All Employee");
                System.out.println("3 -> Display Specific Employee");
                System.out.println("4 -> Update Existing Employee");
                System.out.println("5 -> Delete Existing Employee");
                System.out.println("6 -> Exit");
                System.out.println("Enter Your Choice : ");
                int choice = Integer.parseInt(reader.readLine());
                switch (choice)
                {
                    case 1:
                        /* Add New Employee */
                        System.out.println("Enter Employee Name : ");
                        String employeeName = reader.readLine();
                        System.out.println("Enter Employee Address : ");
                        String employeeAddress = reader.readLine();
                        System.out.println("Enter Employee Salary : ");
                        double employeeSalary = Double.parseDouble(reader.readLine());

                        Employee employee = new Employee();
                        employee.setEmpSalary(employeeSalary);
                        employee.setEmpName(employeeName);
                        employee.setEmpAddress(employeeAddress);
                        int insert = employeeDao.insert(employee);
                        if(insert > 0)
                        {
                            System.out.println("Employee Added Successfully");
                        }
                        else
                        {
                            System.out.println("Not Added");
                        }
                        System.out.println("********************************************");
                        System.out.println();
                        break;
                    case 2:
                        /* All Employee Record */
                        List<Employee> allEmployees = employeeDao.getAllEmployees();
                        for (Employee employee1 : allEmployees)
                        {
                            System.out.println(employee1.toString());
                        }
                        System.out.println("********************************************");
                        System.out.println();
                        break;
                    case 3:
                        /* Display Specific Employee */
                        System.out.println("Enter Employee Id : ");
                        Employee signleEmployee = employeeDao.getSignleEmployee(Integer.parseInt(reader.readLine()));
                        System.out.println(signleEmployee.toString());
                        System.out.println("********************************************");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Enter Employee Id : ");
                        int employeeId =  Integer.parseInt(reader.readLine());
                        int editEmployee = employeeDao.editEmployee(employeeId);
                        if(editEmployee > 0)
                        {
                            System.out.println("Employee Updated Successfully");
                        }
                        else
                        {
                            System.out.println("Not Updated");
                        }
                        System.out.println("********************************************");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Enter Employee Id : ");
                        int deleteEmployee = employeeDao.deleteEmployee(Integer.parseInt(reader.readLine()));
                        if(deleteEmployee == 1)
                        {
                            System.out.println("Employee Deleted Successfully");
                        }
                        else
                        {
                            System.out.println("Not Successful");
                        }
                        System.out.println("********************************************");
                        System.out.println();
                        break;
                    case 6:
                        loopVar = false;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thank You!!");
    }
}
