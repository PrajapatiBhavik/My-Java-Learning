package Java.SpringOrmEntities;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column
    private String empName;

    @Column
    private double empSalary;

    @Column
    private String empAddress;


    public Employee(int empId, String empName, double empSalary, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
    }

    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
