package com.TripFinder.service;

import java.util.List;

import com.TripFinder.exceptions.CabException;
import com.TripFinder.exceptions.DriverException;
import com.TripFinder.exceptions.LogInException;
import com.TripFinder.model.Cab;
import com.TripFinder.model.Driver;

public interface CabService {

	public Cab registerCab(Cab cab)throws DriverException;
	
	public Cab updateCab(String Key,Integer cabId,Cab cab)throws DriverException,LogInException;
	
	public List<Cab> getAllCabs(String key) throws DriverException, LogInException;
	
	public Cab deleteCab(String Key,Integer cabId)throws DriverException,LogInException;
	
    public Driver viewDriverByCabId(String key, Integer cabId) throws CabException, LogInException;
	
}
