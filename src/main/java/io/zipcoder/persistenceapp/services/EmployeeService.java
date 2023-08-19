package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Iterable<Employee> findAll(){
        return repository.findAll();
    }

    public Employee findById(Long id){
        return repository.findById(id).get();
    }

    public Employee create(Employee employee){
        return repository.save(employee);
    }

    public Employee update(Long id, Employee employee){
        Employee original = repository.findById(id).get();
        // update all the fields one by one, not changing the ID at ALL
        original.setFirstName(employee.getFirstName());
        original.setLastName(employee.getLastName());
        original.setTitle(employee.getTitle());
        original.setPhoneNumber(employee.getPhoneNumber());
        original.setHireDate(employee.getHireDate());
        original.setManager(employee.getManager());
        original.setDepartmentNumber(employee.getDepartmentNumber());
        // now save that into the database
        return repository.save(original);
    }

    public boolean delete(Long id){
        Employee original = repository.findById(id).get();
        if(original != null) {
            repository.delete(original);
        }
        // might need to change this in the future? not sure
        return original != null;
    }
}
