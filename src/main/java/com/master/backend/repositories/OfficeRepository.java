package com.master.backend.repositories;

import com.master.backend.entities.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "offices", path = "office")
public interface OfficeRepository extends JpaRepository<Office, Long> {
}
