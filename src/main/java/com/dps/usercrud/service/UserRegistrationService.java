package com.dps.usercrud.service;

import java.util.List;

import com.dps.usercrud.model.request.UserDetailsRequest;
import com.dps.usercrud.model.response.UserDetailsResponse;

import jakarta.validation.Valid;

public interface UserRegistrationService {

	public List<UserDetailsResponse> getAllUsers();

	public void saveUser(@Valid UserDetailsRequest userDetailsRequest);

	public void deleteUser(Integer userid);

	public void updateUser(Integer userid, @Valid UserDetailsRequest userDetailsRequest);

	public List<UserDetailsResponse> getUserByCity(String city);
}
