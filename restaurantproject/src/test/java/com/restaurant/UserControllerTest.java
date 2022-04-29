package com.restaurant;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.restaurant.dao.UsersDAO;
import com.restaurant.entities.Users;
import com.restaurant.service.UsersServiceImpl;


public class UserControllerTest {

@Mock
UsersDAO usersDAO;

@InjectMocks
UsersServiceImpl usersService;


@Test
public  void getUsersTest()  {
	MockitoAnnotations.initMocks(this);
List<Users >list=new ArrayList<Users>();
	Users RECORD_1=new Users(4,"jagadish@gmail.com","jagadish@123","jaga","dish");
	Users RECORD_2=new Users(5,"harish@gmail.com","harish@123","harish","artham");
	list.add(RECORD_2);
	list.add(RECORD_1);
	when(usersDAO.findAll()).thenReturn(list);

	//test
	List<Users> uList = usersService.getUsers();

	assertEquals(2,uList.size());
	//verify(usersDAO, times(1)).findAll();
}

}
