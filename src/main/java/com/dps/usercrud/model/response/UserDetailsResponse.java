package com.dps.usercrud.model.response;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsResponse {
	
	@JsonProperty("uid")
	private Integer id;
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("lname")
	private String lname;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("contact")
	private BigInteger contact;
			
	@JsonProperty("addr")
	private String address;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("state")
	private String state;	
	
	@JsonProperty("pincode")
	private Integer pin;

}
