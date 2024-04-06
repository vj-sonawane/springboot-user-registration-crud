package com.dps.usercrud.model.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(
	name = "user_details",
	uniqueConstraints = {
	@UniqueConstraint(
			columnNames = {"user_email","user_phone_number"},
					name = "email_phone_number")					
	})
public class UserDetails {
	@Id
	@Column(nullable = false, name="user_id")
	private Integer id;
	
	@Column(nullable = false, name="user_first_name")
	private String fname;
	
	@Column(nullable = false, name="user_last_name")
	private String lname;
	
	@Column(nullable = false, name="user_gender")
	private String gender;
	
	@Column(nullable = false, name="user_address")
	private String address;
	
	@Column(nullable = false, name="user_city")
	private String city;
	
	@Column(nullable = false, name="user_state")
	private String state;
	
	@Column(nullable = false, name="user_city_pincode")
	private Integer pin;
	
	@Column(name="user_email")
	private String email;
	
	@Column(nullable = false, name="user_phone_number")
	private BigInteger contact;	
}
