package com.enes.springsecdemo.dao;

import com.enes.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
