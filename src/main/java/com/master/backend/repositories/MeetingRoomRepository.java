package com.master.backend.repositories;

import com.master.backend.entities.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "meetingRooms", path = "meetingRoom")
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Long> {

    List<MeetingRoom> findAllByFloor_Id(long floorId);
}
