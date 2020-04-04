package com.master.backend.service;

import com.master.backend.entities.MeetingRoom;

import java.util.Date;
import java.util.List;

public interface MeetingRoomService {
    List<MeetingRoom> findAvailableMeetingRooms();
}
