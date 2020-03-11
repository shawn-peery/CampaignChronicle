package com.exitium.campaignchronicle.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exitium.campaignchronicle.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);
}
