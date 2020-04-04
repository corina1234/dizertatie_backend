package com.master.backend.controllers;

import com.master.backend.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestController
@RequestMapping("/meeting/")
public class MeetingRoomController {

    private MeetingRoomService meetingRoomService;

    @Autowired
    public MeetingRoomController(MeetingRoomService meetingRoomService) {
        this.meetingRoomService = meetingRoomService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rooms/available")
    public ResponseEntity<?> getMeetingRooms() {
        return ResponseEntity.ok(meetingRoomService.findAvailableMeetingRooms());
    }
}
