package com.master.backend.projection;

import com.master.backend.entities.Employee;
import com.master.backend.entities.MeetingRoom;
import com.master.backend.entities.Office;
import com.master.backend.entities.OfficesRoom;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "officeDetails", types = { Office.class })
public interface OfficeDetails {
    public long getId();
    public String getName();
    public EmployeeList getEmployee();
    public String getX();
    public String getY();
    public String getWidth();
    public String getHeight();
}
