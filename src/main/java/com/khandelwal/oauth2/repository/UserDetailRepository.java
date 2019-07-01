package com.khandelwal.oauth2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khandelwal.oauth2.model.User;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUsername(String name);
}
