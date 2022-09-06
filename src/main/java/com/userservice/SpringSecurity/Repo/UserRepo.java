package com.userservice.SpringSecurity.Repo;

import com.userservice.SpringSecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
