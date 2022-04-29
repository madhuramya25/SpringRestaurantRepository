package com.restaurant.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Booking;
import com.restaurant.entities.Users;



public interface BookingDAO extends JpaRepository< Booking , Integer > , CrudRepository<Booking,Integer> {
	
	@Query("Select u from Booking u where u.email= ?1" )
	List<Booking> findBookingByEmail(@Param("email") String email);
	
	
	@Query("Select b.first_name, b.last_name, f.restaurant_id,f.no_of_tables,f.email from Booking f,Users b where b.email=f.email")
	List<Object> getByEmailid(@Param("email") String email);
}
