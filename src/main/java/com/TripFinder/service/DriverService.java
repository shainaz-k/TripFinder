package com.TripFinder.service;

import java.util.List;

import com.TripFinder.exceptions.CabException;
import com.TripFinder.exceptions.DriverException;
import com.TripFinder.exceptions.LogInException;
import com.TripFinder.model.Cab;
import com.TripFinder.model.Driver;

public interface DriverService {

	public Driver registerDriver(Driver driver)throws DriverException;
	
	public Driver updateDriver(String key,Integer driverId,Driver driver)throws DriverException, LogInException;
	
	public Driver getDriverById(String key,Integer driverId)throws DriverException, LogInException;
	
	public Driver getDriverByName(String key, String userName)throws DriverException, LogInException;
	
	public Driver allocateCabToDriver(String key, Integer driverId, Integer cabId) throws DriverException, CabException, LogInException;
	
	public Cab viewCabByDriverId(String key, Integer DriverId) throws DriverException, LogInException;

	public List<Driver> getAllDriver(String key) throws DriverException, LogInException;

	public Driver deleteDriverById(String key, Integer driverId)throws DriverException, LogInException;

}
