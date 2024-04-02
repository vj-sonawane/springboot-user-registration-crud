package com.dps.usercrud.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dps.usercrud.model.request.UserDetailsRequest;
import com.dps.usercrud.model.response.UserDetailsResponse;

import jakarta.validation.Valid;

/**
 * The interface UserRegistrartionAPI
 * 
 * @author VijayShree
 *
 */
public interface UserRegistrationAPI {

	/**
	 * The API is intended to fetch all the users
	 * 
	 * @return all users details
	 */
	@GetMapping(value = "/api/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<UserDetailsResponse>> getAllUsers();

	/**
	 * This API is intended to save the user
	 * 
	 * @param userDetailsRequest
	 * @return success message
	 */
	@PostMapping(value = "api/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Void> saveUser(@RequestBody @Valid UserDetailsRequest userDetailsRequest);

	/**
	 * This API is intended to delete the user
	 * 
	 * @param userid
	 * @return success message
	 */
	@DeleteMapping(value = "api/users/{user_id}")
	ResponseEntity<List<UserDetailsResponse>> deleteUser(@PathVariable("user_id") Integer userid);

	/**
	 * 
	 * @param userid
	 * @param userDetailsRequest
	 * @return success message
	 */
	@PutMapping(value = "api/user/{user_id}")
	ResponseEntity<Void> updateUser(@PathVariable("user_id") Integer userid,
			@RequestBody @Valid UserDetailsRequest userDetailsRequest);

	/**
	 * @Query annotation: Named Parameter
	 * @param city
	 * @return all users from mentioned city
	 */
	@GetMapping(value = "api/user/{city}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<UserDetailsResponse>> getUserByCity(@PathVariable("city") String city);

	/**
	 * @Query annotation: Positional Parameter
	 * @param city
	 * @param gender
	 * @return number of male or female users from mentioned city
	 */
	@GetMapping(value = "api/user/{city}/{gender}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<UserDetailsResponse>> findByCityAndGenderPositionalBind(@PathVariable("city") String city,
																				@PathVariable("gender")String gender);



}
