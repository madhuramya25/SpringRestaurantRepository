package com.restaurant.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entities.Booking;
import com.restaurant.service.BookingService;
@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@GetMapping("/booking")
	public List<Booking> getBooking(){
		return this.bookingService.getBooking();
	}
	
	@PostMapping("/bookings")
	public Booking addBooking(@RequestBody Booking booking) {
		return this.bookingService.addBooking(booking);
	}
	
	@GetMapping("/bookings/{booking_id}")
	public Booking getBookingById(@PathVariable int booking_id) {
		return this.bookingService.getBookingById(booking_id);
	}
	@DeleteMapping("/bookings/{booking_id}")
	public void deleteBooking(@PathVariable int booking_id)
	{
		 this.bookingService.deleteBooking(booking_id);
		
	}
	@PutMapping("/bookings")
	public Booking updateBooking(@RequestBody Booking booking)
	{
		return this.bookingService.updateBooking(booking);
	}
	@GetMapping("/booking/{email}")
	public List<Booking> findBookingByEmail(@PathVariable String email){
		return this.bookingService.findBookingByEmail(email);
	}
	@GetMapping("/book/{email}")
	public List getByEmailid(@PathVariable String email){
		return this.bookingService.getByEmailid(email);
	}
	

}
