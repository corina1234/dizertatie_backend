package com.master.backend.projection;

import com.master.backend.entities.Booking;
import com.master.backend.entities.Department;
import com.master.backend.entities.Employee;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "bookingGeneral", types = { Booking.class })
public interface BookingGeneral {
    public Employee getEmployee();
    public Date getBookedFrom();
    public Date getBookedUntil();
    public String getSubject();
}
