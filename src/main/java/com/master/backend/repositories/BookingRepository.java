package com.master.backend.repositories;

import com.master.backend.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "bookings", path = "booking")
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
