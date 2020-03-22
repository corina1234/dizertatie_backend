package com.master.backend.repositories;

import com.master.backend.entities.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "floors", path = "floor")
public interface FloorRepository extends JpaRepository<Floor, Long> {
}
