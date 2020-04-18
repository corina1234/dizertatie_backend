package com.master.backend.controllers;

import com.master.backend.entities.Booking;
import com.master.backend.projection.BookingGeneral;
import com.master.backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/busy/room")
    public ResponseEntity<?> getMeetingRooms(@RequestParam("roomId") long roomId, @RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate) {
        List<BookingGeneral> bookins = new ArrayList<>();
        try {
            bookins = bookingService.getBookingBusy(roomId, startDate, endDate);
        } catch(Exception e){

        }
        return ResponseEntity.ok(bookins);
    }

    @RequestMapping(method = RequestMethod.POST, value="/create")
    public ResponseEntity<?> createBooking(@RequestBody Booking booking){
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }
}
