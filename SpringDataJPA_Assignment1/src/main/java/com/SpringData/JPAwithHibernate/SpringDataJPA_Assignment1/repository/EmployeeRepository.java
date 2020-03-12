package com.SpringData.JPAwithHibernate.SpringDataJPA_Assignment1.repository;

import com.SpringData.JPAwithHibernate.SpringDataJPA_Assignment1.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String desc);

    List<Employee> findByAgeBetween(Integer age1,Integer age2);

    List<Employee> findAll(Pageable pageable);
}
