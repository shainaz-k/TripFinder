package com.TripFinder.repository;

import com.TripFinder.model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TripBookingRepo extends JpaRepository<TripBooking, Integer> {

    public List<TripBooking> findByFromDateTime(LocalDate fromDateTime);

    public List<TripBooking> findByFromDateTimeBetween(LocalDate fromDateTime, LocalDate toDateTime);
    
//    public List<TripBooking> findByCustomerId(Integer customer_id);

}
