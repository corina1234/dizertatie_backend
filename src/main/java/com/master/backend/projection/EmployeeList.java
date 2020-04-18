package com.master.backend.projection;

import com.master.backend.entities.Employee;
import com.master.backend.entities.Job;
import com.master.backend.entities.Office;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "employeeList", types = { Employee.class })
public interface EmployeeList {
    long getId();
    String getName();
    String getEmail();
    String getPhoneNumber();
    Date getDateOfEmployment();
    Job getJob();
}
