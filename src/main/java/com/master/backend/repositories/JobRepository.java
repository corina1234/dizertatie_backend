package com.master.backend.repositories;

import com.master.backend.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "jobs", path = "job")
public interface JobRepository extends JpaRepository<Job, Long> {
}
