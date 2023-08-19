package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee){
        return service.create(employee);
    }

    @GetMapping("/employees")
    public Iterable<Employee> getAll(){
        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getOne(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping("/employees/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee){
        // WILL NOT MODIFY THE ID BTW
        return service.update(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public Boolean delete(@PathVariable Long id){
        return service.delete(id);
    }
}
