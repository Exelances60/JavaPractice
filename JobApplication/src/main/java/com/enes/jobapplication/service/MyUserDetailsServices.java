package com.enes.jobapplication.service;

import com.enes.jobapplication.model.User;
import com.enes.jobapplication.model.UserPrincipal;
import com.enes.jobapplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServices implements UserDetailsService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("User 404");
        return new UserPrincipal(user);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
