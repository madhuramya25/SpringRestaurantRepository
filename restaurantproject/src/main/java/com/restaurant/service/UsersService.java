package com.restaurant.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.restaurant.entities.Restaurant;
import com.restaurant.entities.Users;
import com.restaurant.exception.UserNotFoundException;

@Service
public interface UsersService {
	
	public List<Users> getUsers();
	public Users getUsersById(int user_id);
	public Users addUser(Users users);
    public Users updateUser(Users users);
    public void deleteUserById(int user_id);
    public Users getUserByEmail(String email) throws UserNotFoundException;
    //public List<Restaurant> getRestaurant();
    //public Users registerUser(Users user);


}
