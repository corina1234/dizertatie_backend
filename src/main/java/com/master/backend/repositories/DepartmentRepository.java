package com.master.backend.repositories;

import com.master.backend.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "departments", path = "department")
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findAllByNameContaining(String name);

    Department findByCode(String code);
}
