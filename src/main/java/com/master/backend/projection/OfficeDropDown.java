package com.master.backend.projection;

import com.master.backend.entities.Department;
import com.master.backend.entities.Office;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "officeDropDown", types = { Office.class })
public interface OfficeDropDown {
    public long getId();
    public String getName();
}
