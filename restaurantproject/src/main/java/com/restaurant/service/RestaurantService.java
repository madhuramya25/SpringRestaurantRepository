package com.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entities.Restaurant;
import com.restaurant.exception.RestaurantNotFoundException;

@Service
public interface RestaurantService {
	
	public List<Restaurant> getRestaurants();
	public Restaurant getRestaurantByName(String name) throws RestaurantNotFoundException;

}
