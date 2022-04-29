package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.entities.Restaurant;
import com.restaurant.exception.RestaurantNotFoundException;
import com.restaurant.dao.RestaurantDAO;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantDAO restaurantDao;
	
	@Override
	public List<Restaurant> getRestaurants() {
	return restaurantDao.findAll();
	}
	@Override
	public Restaurant getRestaurantByName(String name) throws RestaurantNotFoundException {
		// TODO Auto-generated method stub
		Restaurant restaurant;

		if (restaurantDao.findByName(name)!=null) {
					restaurant=restaurantDao.findByName(name);
				}
		else
		{
			throw new RestaurantNotFoundException();
		}
				return restaurant;
			}
	
}
