package io.zipcoder.persistenceapp.services;

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
        return repository.findOne(id);
    }

    public Employee create(Employee employee){
        return repository.save(employee);
    }

    public Employee update(Long id, Employee employee){
        Employee original = repository.findOne(id);
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
        repository.delete(id);
        // might need to change this in the future? not sure
        return true;
    }
}
