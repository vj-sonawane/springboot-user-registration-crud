package com.dps.usercrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dps.usercrud.model.entity.UserDetails;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Transactional
public interface UserRegistrationRepository extends JpaRepository<UserDetails, Integer>{

    @Query(nativeQuery = true,
            value = "select * from userregistration.user_details ud where ud.user_city=:userCity")
    List<UserDetails> findUsersWithCity(@Param("userCity") String city);

}
