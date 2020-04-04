package com.master.backend.repositories;

import com.master.backend.entities.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "meetingRooms", path = "meetingRoom")
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Long> {

    List<MeetingRoom> findAllByFloor_Id(long floorId);

    @Query("SELECT m FROM MeetingRoom m WHERE m.id IN (SELECT b.meetingRoom.id FROM Booking b WHERE b.bookedUntil < Now()) OR m.bookings IS EMPTY")
    List<MeetingRoom> findAvailableMeetingRooms();
}
