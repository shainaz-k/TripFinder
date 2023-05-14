package com.TripFinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TripFinder.model.Cab;

@Repository
public interface CabRepo extends JpaRepository<Cab, Integer> {

//	public List<Cab> findByAvailbilityStatus(Boolean avalibilityStatus);

}
