package com.dps.usercrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dps.usercrud.model.entity.UserDetails;

import jakarta.transaction.Transactional;

@Transactional
public interface UserRegistrationRepository extends JpaRepository<UserDetails, Integer>{

}
