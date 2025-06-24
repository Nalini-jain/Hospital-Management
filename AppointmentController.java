package com.hospital.appointment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @GetMapping
    public String getAllAppointments() {
        return "List of appointments";
    }

    @PostMapping("/book")
    public String bookAppointment() {
        return "Appointment booked";
    }
}