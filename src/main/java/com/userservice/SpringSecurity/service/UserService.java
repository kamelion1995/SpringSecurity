package com.userservice.SpringSecurity.service;

import com.userservice.SpringSecurity.domain.Role;
import com.userservice.SpringSecurity.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
