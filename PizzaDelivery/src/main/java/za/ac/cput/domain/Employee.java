package za.ac.cput.domain;

import java.util.Objects;

/*
 * Employee.Java
 * Employee Entity
 * Author: Dawood Kamalie (220147760)
 * Date: 5 April 2023
 * */
public class Employee {
    private String empId;
    private String empName;
    private String empSurname;

    public Employee() {

    }
    public Employee(String empId, String empName, String empSurname){
        this.empId = empId;
        this.empName = empName;
        this.empSurname = empSurname;
    }

    private Employee(Builder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
    }
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }


    public static class Builder {
        private String empId;
        private String empName;
        private String empSurname;

        public Builder setEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder setEmpSurname(String empSurname) {
            this.empSurname = empSurname;
            return this;
        }

        public Builder copy(Employee employee){
            this.empId = employee.empId;
            this.empName = employee.empName;
            this.empSurname = employee.empSurname;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && empName == employee.empName &&  empSurname == employee.empSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empSurname);
    }

    @Override
    public String toString(){
        return "Employee{" +
                "Employee Id='" + empId + '\'' +
                ", Employee Name='" + empName + '\'' +
                ", Employee Surname='" + empSurname +
                '}';
    }
}