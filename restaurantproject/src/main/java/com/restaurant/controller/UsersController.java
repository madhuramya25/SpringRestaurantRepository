package com.restaurant.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entities.Restaurant;
import com.restaurant.entities.Users;
import com.restaurant.exception.RestaurantNotFoundException;
import com.restaurant.exception.UserNotFoundException;
import com.restaurant.service.UsersService;

@RestController
public class UsersController {

	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/user")
	public List<Users> getUsers(){
		return this.usersService.getUsers();
	}
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users users) {
		return this.usersService.updateUser(users);
	}
	@GetMapping("/users/{user_id}")
	public Users getUsersById(@PathVariable int user_id) {
		return this.usersService.getUsersById(user_id);
	}
	//@PostMapping("/users")
	//public Users addUser(@RequestBody Users users) {
		//return this.usersService.addUser(users);
	//}
	@DeleteMapping("/users/{user_id}")
	public void deleteUserById(@PathVariable int user_id) {
		 this.usersService.deleteUserById(user_id);
	}
	
	@RequestMapping(value = "/user/{email}", method = RequestMethod.PUT)
	   public ResponseEntity getByEmail(@PathVariable("email") String email, @RequestBody Users user) { 
	      
	      return new ResponseEntity(this.usersService.getUserByEmail(email),HttpStatus.OK);
	   }
	
}
