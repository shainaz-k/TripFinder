package com.TripFinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.TripFinder.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("FROM Customer c WHERE c.mobileNumber=?1")
    public Customer findCustomerByMobile(String mobileNumber);

}
