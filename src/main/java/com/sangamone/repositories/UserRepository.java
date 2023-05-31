package com.sangamone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


	

}
