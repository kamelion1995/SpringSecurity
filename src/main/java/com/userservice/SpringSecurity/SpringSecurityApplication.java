package com.userservice.SpringSecurity;

import com.userservice.SpringSecurity.domain.Role;
import com.userservice.SpringSecurity.domain.User;
import com.userservice.SpringSecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {

			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"mame boteli","bouteli","password1",new ArrayList<>()));
			userService.saveUser(new User(null,"bandafall","banda","password2",new ArrayList<>()));
			userService.saveUser(new User(null,"saf","papi","password3",new ArrayList<>()));
			userService.saveUser(new User(null,"mhd","fall","password4",new ArrayList<>()));

          userService.addRoleToUser("bouteli","ROLE_USER");
			userService.addRoleToUser("bouteli","ROLE_MANAGER");
			userService.addRoleToUser("banda","ROLE_MANAGER");
			userService.addRoleToUser("papi","ROLE_ADMIN");
			userService.addRoleToUser("fall","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("fall","ROLE_ADMIN");
			userService.addRoleToUser("fall","ROLE_USER");


		};
	}

}
