package com.javatpoint.apachederbyexample.repository;

import org.springframework.data.repository.CrudRepository;
import com.javatpoint.apachederbyexample.model.UserRecord;  
   

public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
}    
