package com.master.backend.config;
import com.master.backend.entities.*;
import com.master.backend.projection.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Employee.class, Department.class, Floor.class, Job.class, MeetingRoom.class, Office.class, OfficesRoom.class)
                .getProjectionConfiguration()
                .addProjection(DepartmentProjection.class)
                .addProjection(OfficesRoomDetails.class)
                .addProjection(OfficesRoomProjection.class)
                .addProjection(OfficeDropDown.class)
                .addProjection(EmployeeProjection.class);
    }
}
