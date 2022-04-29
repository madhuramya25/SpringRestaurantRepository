package com.restaurant.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.restaurant.entities.Booking;
import com.restaurant.entities.Users;

@Service
public interface BookingService {
	
	public List<Booking> getBooking();
	public Booking getBookingById(int booking_id);
	public Booking addBooking(Booking booking);
	public void deleteBooking(int booking_id);
	public Booking updateBooking(Booking booking);
	public List<Booking> findBookingByEmail(String email);
	public List<Object> getByEmailid(String email);

}
