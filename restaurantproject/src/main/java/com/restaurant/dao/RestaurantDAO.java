package com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restaurant.entities.Restaurant;

public interface RestaurantDAO extends JpaRepository<Restaurant, Integer >{
	
	@Query("Select r from Restaurant r where r.name= :name" )
	Restaurant findByName(@Param("name") String name);

}
