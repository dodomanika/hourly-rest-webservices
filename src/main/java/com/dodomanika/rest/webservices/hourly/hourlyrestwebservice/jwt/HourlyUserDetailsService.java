package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.jwt;

import com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.user.UserRepository;
import com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HourlyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> foundUser = userRepository.findByUsername(username);

        User user = foundUser
                .orElseThrow(
                        () -> new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username)));

        JwtUserDetails userDetails = new JwtUserDetails(user);

        return userDetails;
    }

}
