package com.java;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTestServices {
	/*
	 * below are the test cases TDD for calculating fare and calculating fare for
	 * multiple rides
	 */

	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.CalculateFare(distance, time);
		Assert.assertEquals(25.00, fare, 0.0);
	}

	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.CalculateFare(distance, time);
		Assert.assertEquals(5.00, fare, 0.0);
	}

	@Test
	public void GivenMultipleRides_ShoudReturnTotalare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.00, 5), new Ride(0.1, 1) };
		double fare = invoiceGenerator.calculateMultipleRidesFare(rides);
		Assert.assertEquals(30, fare, 0.0);
	}
}
