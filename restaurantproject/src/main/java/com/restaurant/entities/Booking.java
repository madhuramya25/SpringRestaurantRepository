package com.restaurant.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int booking_id;
	int no_of_tables;
	int restaurant_id;
	String email;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="email")
	List<Restaurant> restaurants;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurant_id")
	List<Users> users;

	

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", no_of_tables=" + no_of_tables + ", restaurant_id="
				+ restaurant_id + ", email=" + email + ", restaurants=" + restaurants + ", users=" + users + "]";
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getNo_of_tables() {
		return no_of_tables;
	}

	public void setNo_of_tables(int no_of_tables) {
		this.no_of_tables = no_of_tables;
	}


		public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Booking(int booking_id, int no_of_tables, int restaurant_id, String email) {
		super();
		this.booking_id = booking_id;
		this.no_of_tables = no_of_tables;
		this.restaurant_id = restaurant_id;
		this.email=email;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
