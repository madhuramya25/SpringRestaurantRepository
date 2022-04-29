package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.restaurant.entities.Pricing;
import com.restaurant.entities.Restaurant;
import com.restaurant.exception.RestaurantNotFoundException;
//import com.restaurant.service.PricingService;
import com.restaurant.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	public Restaurant restaurant;	
	
	@RequestMapping("/home")
	public String home() {
		return "this is home page";
	}

	@GetMapping("/restaurant")
	public List<Restaurant> getRestaurants(){
		return this.restaurantService.getRestaurants();
	}
	
	@RequestMapping(value = "/restaurant/{name}", method = RequestMethod.PUT)
	   public ResponseEntity getByEmail(@PathVariable("name") String name, @RequestBody Restaurant restaurant) { 
	      
	      return new ResponseEntity(this.restaurantService.getRestaurantByName(name),HttpStatus.OK);
	   }
	}
	
