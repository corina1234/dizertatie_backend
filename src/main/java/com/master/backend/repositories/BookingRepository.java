package com.master.backend.repositories;

import com.google.api.client.util.DateTime;
import com.master.backend.entities.Booking;
import com.master.backend.projection.BookingGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "bookings", path = "booking")
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("SELECT b FROM Booking b left join b.meetingRoom m WHERE m.id = :roomId and (b.bookedFrom between :startDate and :endDate or b.bookedUntil between :startDate and :endDate)")
    List<BookingGeneral> getBookingBusy(long roomId, Date startDate,  Date endDate);

    List<Booking> getBookingByEmployee_IdAndIsSavedGoogleFalse(long id);
}
