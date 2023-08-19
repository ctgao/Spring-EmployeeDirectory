package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping("/departments")
    public Department create(@RequestBody Department department){
        return service.create(department);
    }

    @GetMapping("/departments")
    public Iterable<Department> getAll(){
        return service.findAll();
    }

    @GetMapping("/departments/{id}")
    public Department getOne(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping("/departments/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department department){
        // WILL NOT MODIFY THE ID BTW
        return service.update(id, department);
    }

    @DeleteMapping("/departments/{id}")
    public Boolean delete(@PathVariable Long id){
        return service.delete(id);
    }
}
