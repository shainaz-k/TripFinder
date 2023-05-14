package com.TripFinder.repository;

import com.TripFinder.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	public Admin findByUserName(String userName);

	@Query("FROM Admin c WHERE c.mobileNumber=?1")
	public Admin findAdminByMobile(String mobileNumber);
	
}