package com.example.WebRequests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}
