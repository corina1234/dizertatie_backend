package com.master.backend.service;

import com.google.api.client.util.DateTime;
import com.master.backend.entities.Booking;
import com.master.backend.projection.BookingGeneral;

import java.text.ParseException;
import java.util.List;

public interface BookingService {
    List<BookingGeneral> getBookingBusy(long roomId, String startDate, String endDate) throws ParseException;
    Booking createBooking(Booking booking);
}
