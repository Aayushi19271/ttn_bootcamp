package com.SpringData.JPAwithHibernate.SpringDataJPA_Assignment1.controller;

import com.SpringData.JPAwithHibernate.SpringDataJPA_Assignment1.entity.Employee;
import com.SpringData.JPAwithHibernate.SpringDataJPA_Assignment1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    //ADD OPERATION
    @GetMapping("/create")
    public String addEmployee(){
        Employee employee = new Employee();
        employee.setName("Shashi");
        employee.setAge(40);
        employee.setLocation("Nagaland");
        employeeRepository.save(employee);
        return "Record Added";
    }

    //UPDATE OPERATION
    @GetMapping("/update")
    public String updateEmployee(){
        Optional<Employee> employee = employeeRepository.findById(3);
        if (employee.isPresent())
        {
            Employee employee1 = employee.get();
            employee1.setLocation("Chandigarh");
            employee1.setAge(22);
            employeeRepository.save(employee1);
            return "Record Updated";
        }
        else
            return "Record Not found";
    }

    //DELETE OPERATION
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent())
        {
            employeeRepository.deleteById(id);
            return "Record Deleted";
        }
        else
            return "Record Not found";
    }

    //READ OPERATION
    @GetMapping("/read")
    public List<Employee> readEmployee(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        return employeeList;
    }

    //COUNT OPERATION
    @GetMapping("/count")
    public String countEmployee(){
        Long count = employeeRepository.count();
        return "Total No. Of Records Are:" +count;
    }

    //FIND BY NAME OPERATION
    @GetMapping("/findByName/{name}")
    public List<Employee> findEmployeeByName(@PathVariable String name){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findByName(name);
        return employeeList;
    }


    //FIND BY NAME STARTING WITH 'A' OPERATION
    @GetMapping("/findByNameLike")
    public List<Employee> findEmployeeByNameLike(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findByNameLike("A%");
        return employeeList;
    }

    //FIND BY AGE BETWEEN 28 TO 32
    @GetMapping("/findByAgeBetween")
    public List<Employee> findEmployeeByAgeBetween(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findByAgeBetween(28,32);
        return employeeList;
    }

        //PAGING AND SORTING
    @GetMapping("/paging")
    public List<Employee> employeeAgePagable(){
        Pageable pageable = PageRequest.of(0,3, Sort.Direction.DESC,"age");
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll(pageable);
        return employeeList;
    }
}
