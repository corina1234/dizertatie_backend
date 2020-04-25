package com.master.backend.repositories;

import com.master.backend.entities.OfficesRoom;
import com.master.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "officesRooms", path = "officesRoom")
public interface UserRepository extends JpaRepository<User, Long> {
}