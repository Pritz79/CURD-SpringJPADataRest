package com.pritz.springboot.CurdDemo.DAO;

import com.pritz.springboot.CurdDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="pritz")
public interface EmployeeRepositary  extends JpaRepository<Employee,Integer> {


}
