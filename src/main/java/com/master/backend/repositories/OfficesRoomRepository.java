package com.master.backend.repositories;

import com.master.backend.entities.OfficesRoom;
import com.master.backend.enums.OfficesRoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "officesRooms", path = "officesRoom")
public interface OfficesRoomRepository extends JpaRepository<OfficesRoom, Long> {
    List<OfficesRoom> findAllByFloor_Id(long floorId);
    List<OfficesRoom> findAllByType(OfficesRoomType officesRoomType);

}
