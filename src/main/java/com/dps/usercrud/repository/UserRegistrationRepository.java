package com.dps.usercrud.repository;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dps.usercrud.model.entity.UserDetails;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional
public interface UserRegistrationRepository extends JpaRepository<UserDetails, Integer>{

    //Named Parameter
    @Query(nativeQuery = true,
            value = "select * from userregistration.user_details ud where ud.user_city=:userCity")
    @Comment("This query retrieve the user details based on City")
    List<UserDetails> findUsersWithCity(@Param("userCity") String city);

    //Positional Parameter
    @Query(nativeQuery = true,
            value = "SELECT * FROM userregistration.user_details ud WHERE ud.user_city = ?1 AND ud.user_gender = ?2")
    List<UserDetails> findByCityAndGenderPositionalBind(String city, String gender);
}
