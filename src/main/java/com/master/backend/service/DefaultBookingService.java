package com.master.backend.service;

import com.master.backend.entities.Booking;
import com.master.backend.projection.BookingGeneral;
import com.master.backend.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class DefaultBookingService implements BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public DefaultBookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<BookingGeneral> getBookingBusy(long roomId, String startDate, String endDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        Date startDateConverted = simpleDateFormat.parse(startDate);
        Date endDateConverted = simpleDateFormat.parse(endDate);
        return bookingRepository.getBookingBusy(roomId,startDateConverted, endDateConverted);
    }

    @Override
    public Booking createBooking(Booking booking) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(booking.getBookedFrom());
        cal.add(Calendar.HOUR, -3);
        booking.setBookedFrom(cal.getTime());
        cal.setTime(booking.getBookedUntil());
        cal.add(Calendar.HOUR, -3);
        booking.setBookedUntil(cal.getTime());
        return bookingRepository.save(booking);
    }

}
