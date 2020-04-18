package com.master.backend.projection;

import com.master.backend.entities.Booking;
import com.master.backend.entities.Employee;
import com.master.backend.entities.Floor;
import com.master.backend.entities.MeetingRoom;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "meetingRoomDetails", types = { MeetingRoom.class })
public interface MeetingRoomDetails {
    public long getId();
    public String getCodeId();
    public String getName();
    public Integer getMaxNoPersons();
    public Floor getFloor();
}
