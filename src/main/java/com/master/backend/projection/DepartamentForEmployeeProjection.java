package com.master.backend.projection;

import com.master.backend.entities.Department;
import com.master.backend.entities.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "departmentEmployeeProjection", types = { Department.class })
public interface DepartamentForEmployeeProjection {
    public long getId();
    public String getName();
    public OfficesRoomProjection getOfficesRoom();
}
