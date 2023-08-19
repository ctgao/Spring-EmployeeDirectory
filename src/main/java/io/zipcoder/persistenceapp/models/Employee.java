package io.zipcoder.persistenceapp.models;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long employee_id;
    String first_name;
    String last_name;
    String title;
    String phone_number;
    String email;
    Date hire_date;
    Employee manager;
    Long department_number;

    public Employee() {
        this("first", "last", "title", "phone", "email", null, null, null);
    }

    public Employee(String first_name, String last_name, String title, String phone_number, String email, Date hire_date, Employee manager, Long department_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.phone_number = phone_number;
        this.email = email;
        this.hire_date = hire_date;
        this.manager = manager;
        this.department_number = department_number;
    }

    public Employee(Long employee_id, String first_name, String last_name, String title, String phone_number, String email, Date hire_date, Employee manager, Long department_number) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.phone_number = phone_number;
        this.email = email;
        this.hire_date = hire_date;
        this.manager = manager;
        this.department_number = department_number;
    }

    public Long getId() {
        return employee_id;
    }

    public void setId(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hire_date;
    }

    public void setHireDate(String hire_date) {
        this.hire_date = new Date(hire_date);
    }

    public void setHireDate(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Long getDepartmentNumber() {
        return department_number;
    }

    public void setDepartmentNumber(Long department_number) {
        this.department_number = department_number;
    }
}
