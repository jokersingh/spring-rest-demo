package com.barun.spring.springrestdemo.com.barun.spring.springrestdemo.model.com.barun.spring.springrestdemo.repo;

import com.barun.spring.springrestdemo.com.barun.spring.springrestdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employees",path="employees")
public interface EmployeeRepo extends PagingAndSortingRepository<Employee,Long>, CrudRepository<Employee,Long> {
    List<Employee> findByEmployeeName(@Param("employeeName") String employeeName);
}
