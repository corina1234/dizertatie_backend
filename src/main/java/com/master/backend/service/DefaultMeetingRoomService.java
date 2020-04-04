package com.master.backend.service;

import com.master.backend.entities.MeetingRoom;
import com.master.backend.repositories.MeetingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DefaultMeetingRoomService implements MeetingRoomService {
    private MeetingRoomRepository meetingRoomRepository;

    //TODO refactor
    @Autowired
    public DefaultMeetingRoomService(MeetingRoomRepository meetingRoomRepository) {
        this.meetingRoomRepository = meetingRoomRepository;
    }

   @Override
    public List<MeetingRoom> findAvailableMeetingRooms(){
       Calendar calendar = Calendar.getInstance();
       Date currentDate = calendar.getTime();
       return null;
    //   return meetingRoomRepository.findAvailableMeetingRooms(currentDate);
    }
}
