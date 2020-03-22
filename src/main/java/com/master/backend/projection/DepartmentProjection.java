package com.master.backend.projection;

import com.master.backend.entities.Department;
import com.master.backend.entities.Employee;
import com.master.backend.entities.Floor;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "departmentDetails", types = { Department.class })
public interface DepartmentProjection {
    public long getId();
    public String getName();
    public List<Employee> getEmployees();
    public Floor getFloor();
    public String getCode();
}
