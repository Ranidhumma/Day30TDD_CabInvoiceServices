package com.java;

public class InvoiceGenerator {
	/*
	 * Here we are creating Method for calculating Fare
	 */

	public double CalculateFare(double distance, int time) {
		int MINIMUM_COST_PER_KILOMETER = 10;
		int COST_PER_TIME = 1;
		int MINIMUM_FARE = 5;
		double totalfare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;

		if (totalfare < MINIMUM_FARE) {
			return MINIMUM_FARE;
		}
		return totalfare;
	}
	/*
	 * Here we are creating Method for calculating Fare for multiple rides
	 */

	public double calculateMultipleRidesFare(Ride[] rides) {
		double totalfare = 0;
		for (int i = 0; i < rides.length; i++) {
			totalfare += CalculateFare(rides[i].getDistance(), rides[i].getTime());
		}
		return totalfare;
	}

	public InvoiceSummary CalculateSummaryFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += CalculateFare(ride.getDistance(), ride.getTime());
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
