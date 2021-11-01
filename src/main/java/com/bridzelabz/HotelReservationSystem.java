package com.bridzelabz;
import java.util.ArrayList;
import java.util.List;
/**
 * Purpose  - To build a Hotel Reservation System
 * 
 */

public class HotelReservationSystem {
	List<Hotel> hotels = new ArrayList<>();
	/**
	 * This method is used to add hotel to the Hotel List
	 */
	public boolean addHotel(Hotel hotel) {
		return hotels.add(hotel);
	}


	public static void main(String[] args){

		HotelReservationSystem hotel = new HotelReservationSystem();
		hotel.addHotel(null);
	}
}

