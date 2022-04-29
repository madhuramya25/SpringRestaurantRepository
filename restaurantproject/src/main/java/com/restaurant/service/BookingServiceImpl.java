package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.BookingDAO;
import com.restaurant.entities.Booking;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingDAO bookingDao;
	
	//@PersistenceContext
    //private EntityManager entityManager;

	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return bookingDao.findAll();
	}
	@Override
	public Booking getBookingById(int booking_id) {
		
		// TODO Auto-generated method stub
		return bookingDao.getOne(booking_id);
	}

	@Override
	public Booking addBooking(Booking booking) {
		bookingDao.save(booking);
		// TODO Auto-generated method stub
		return booking;
	}

	@Override
	public void deleteBooking(int booking_id) {
		Booking obj=bookingDao.getOne(booking_id);
		bookingDao.delete(obj);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking updateBooking(Booking booking) {
		bookingDao.save(booking);
		
		// TODO Auto-generated method stub
		return booking;
	}
	@Override
	public List<Booking> findBookingByEmail(String email) {
		// TODO Auto-generated method stub
		return bookingDao.findBookingByEmail(email);
	}
	@Override
	public List<Object> getByEmailid(String email) {
		// TODO Auto-generated method stub
		return bookingDao.getByEmailid(email);
	}

    

}
