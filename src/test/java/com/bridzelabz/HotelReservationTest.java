package com.bridzelabz;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	HotelReservationSystem hotelReservation = new HotelReservationSystem();

	@Test
	public void whenAddedHotel_ShouldReturn_AddedHotel() {
		boolean isValid1 = hotelReservation.addHotel( new Hotel("LakeWood",110));
		Assert.assertTrue(isValid1);
		boolean isValid2 = hotelReservation.addHotel( new Hotel("Bridgewood",160));
		Assert.assertTrue(isValid2);
		boolean isValid3 = hotelReservation.addHotel( new Hotel("Ridgewood",220));
		Assert.assertTrue(isValid3);
	}
}