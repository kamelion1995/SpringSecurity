package com.userservice.SpringSecurity.Repo;

import com.userservice.SpringSecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
