package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice;

import com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
