package com.java;

public class InvoiceGenerator {

	public double CalculateFare(double distance, int time) {
		int MINIMUM_COST_PER_KILOMETER = 10;
		int COST_PER_TIME = 1;
		int MINIMUM_FARE = 5;
		double fare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;

		if (fare < MINIMUM_FARE) {
			return MINIMUM_FARE;
		}
		return fare;

	}
}
