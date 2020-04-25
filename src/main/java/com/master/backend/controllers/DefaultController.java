package com.master.backend.controllers;

import com.master.backend.entities.Booking;
import com.master.backend.entities.User;
import com.master.backend.repositories.BookingRepository;
import com.master.backend.repositories.UserRepository;
import com.master.backend.service.BookingService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class DefaultController {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/home")
    public String getHello(Model model){
        Optional<User> user = userRepository.findById(1L);
        List<Booking> bookings = user.isPresent() ? bookingRepository.getBookingByEmployee_IdAndIsSavedGoogleFalse(user.get().getUserLoggedInId()) : new ArrayList<>();
        model.addAttribute("rezervari", bookings);
        return "home";
    }

}
