package io.zipcoder.persistenceapp.models;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Employee manager;

    public Department() {
        this("department name", null);
    }

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Department(Long id, String name, Employee manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long department_id) {
        this.id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
