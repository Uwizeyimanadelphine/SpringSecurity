package com.springSecurity.repository;

import java.util.Optional;

import com.springSecurity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
     Optional<User> findByEmail(String email);
}
