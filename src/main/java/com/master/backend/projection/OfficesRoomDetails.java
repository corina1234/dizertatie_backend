package com.master.backend.projection;

import com.master.backend.entities.Department;
import com.master.backend.entities.Floor;
import com.master.backend.entities.Office;
import com.master.backend.entities.OfficesRoom;
import com.master.backend.enums.OfficesRoomType;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "officesRoomDetails", types = { OfficesRoom.class })
public interface OfficesRoomDetails {
    long getId();
    public String getName();
    public OfficesRoomType getType();
    public List<OfficeDetails> getOffices();
    public Department getDepartment();
    public String getCoordinates();
    public String getX();
    public String getY();
    public String getWidth() ;
    public String getHeight();
}
