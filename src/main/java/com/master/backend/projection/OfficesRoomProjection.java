package com.master.backend.projection;

import com.master.backend.entities.*;
import com.master.backend.enums.OfficesRoomType;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "officesRoom", types = { OfficesRoom.class })
public interface OfficesRoomProjection {
    long getId();
    public String getName();
    public OfficesRoomType getType();
    public Floor getFloor();

}
