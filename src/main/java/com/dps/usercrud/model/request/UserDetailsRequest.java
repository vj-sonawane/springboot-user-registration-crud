package com.dps.usercrud.model.request;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsRequest {

	@JsonProperty("uid")
	@NotNull
	private Integer id;

	@JsonProperty("fname")
	@NotNull
	private String fname;

	@JsonProperty("lname")
	@NotNull
	private String lname;

	@JsonProperty("gender")
	@NotNull
	private String gender;

	@JsonProperty("email")
	@Email
	private String email;

	@JsonProperty("contact")
	@NotNull
	private BigInteger contact;

	@JsonProperty("addr")
	@NotNull
	private String address;

	@JsonProperty("city")
	@NotNull
	private String city;

	@JsonProperty("state")
	@NotNull
	private String state;

	@JsonProperty("pincode")
	@NotNull
	private Integer pin;

}
