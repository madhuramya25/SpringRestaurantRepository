package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.UsersDAO;
import com.restaurant.entities.Users;
import com.restaurant.exception.UserNotFoundException;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDAO userDAO;

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
	@Override
	public Users updateUser(Users users) {
		userDAO.save(users);
		return users;
	}

	@Override
	public Users getUsersById(int user_id) {
		return userDAO.getOne(user_id);
		
	}

	@Override
	public Users addUser(Users users) {
		userDAO.save(users);
		return users;
	}

	@Override
	public void deleteUserById(int user_id) {
		Users obj=userDAO.getOne( user_id);
				userDAO.delete(obj);
		
	}

	@Override
	public Users getUserByEmail(String email) throws UserNotFoundException {
		Users user;

if (userDAO.findByEmail(email)!=null) {
			user=userDAO.findByEmail(email);
		}
else
{
	throw new UserNotFoundException();
}

		return user;
	}

}
