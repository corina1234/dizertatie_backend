package com.master.backend.repositories;

import com.master.backend.entities.Department;
import com.master.backend.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "employees", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findAllByNameContaining(String name, Pageable pageable);

    Page<Employee> findAllByDepartment_Id(long id, Pageable pageable);

    Page<Employee> findAllByNameContainingAndDepartment_Id(String name, long id, Pageable pageable);

    Employee findByEmail(String email);
}
