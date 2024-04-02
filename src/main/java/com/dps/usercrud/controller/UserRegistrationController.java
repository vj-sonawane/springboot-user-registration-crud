package com.dps.usercrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.dps.usercrud.model.request.UserDetailsRequest;
import com.dps.usercrud.model.response.UserDetailsResponse;
import com.dps.usercrud.service.UserRegistrationService;

import jakarta.validation.Valid;
import lombok.NoArgsConstructor;

@Controller
@NoArgsConstructor
public class UserRegistrationController implements UserRegistrationAPI {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@Override
	public ResponseEntity<List<UserDetailsResponse>> getAllUsers() {
		List<UserDetailsResponse> allUsers = userRegistrationService.getAllUsers();
		return ResponseEntity.ok(allUsers);
	}

	@Override
	public ResponseEntity<Void> saveUser(@Valid UserDetailsRequest userDetailsRequest) {
		userRegistrationService.saveUser(userDetailsRequest);
		return ResponseEntity.ok(null);
	}

	@Override
	public ResponseEntity<List<UserDetailsResponse>> deleteUser(Integer userid) {
		userRegistrationService.deleteUser(userid);
		List<UserDetailsResponse> users = userRegistrationService.getAllUsers();
		return ResponseEntity.ok(users);
	}

	@Override
	public ResponseEntity<Void> updateUser(Integer userid, @Valid UserDetailsRequest userDetailsRequest) {
		userRegistrationService.updateUser(userid, userDetailsRequest);
		return ResponseEntity.ok(null);
	}

	@Override
	public ResponseEntity<List<UserDetailsResponse>> getUserByCity(String city) {
		List<UserDetailsResponse> users = userRegistrationService.getUserByCity(city);
		return ResponseEntity.ok(users);
	}

	@Override
	public ResponseEntity<List<UserDetailsResponse>> findByCityAndGenderPositionalBind(String city, String gender) {
		List<UserDetailsResponse> users = userRegistrationService.findByCityAndGenderPositionalBind(city,gender);
		return ResponseEntity.ok(users);
	}
}
