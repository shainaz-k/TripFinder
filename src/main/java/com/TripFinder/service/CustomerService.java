package com.TripFinder.service;

import java.util.List;

import com.TripFinder.exceptions.CustomerException;
import com.TripFinder.exceptions.DriverException;
import com.TripFinder.exceptions.LogInException;
import com.TripFinder.model.Customer;
import com.TripFinder.model.TripBooking;

public interface CustomerService {

	public Customer insertCustomer(Customer customer);
	
	public Customer updateCustomer(String key, Customer customer, String mobileNumber) throws CustomerException, LogInException;
	
	public Customer deleteCustomer(String key, Integer customerId) throws CustomerException, LogInException;
	
	public List<Customer> getAllCustomer(String key) throws CustomerException, LogInException;
	
	public Customer viweCustomer(String key, Integer customerId) throws CustomerException, LogInException;

	TripBooking bookTrip(String key, Integer tripBookingId, Integer driverId) throws DriverException, LogInException;

}
