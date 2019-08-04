package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice;

import com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
