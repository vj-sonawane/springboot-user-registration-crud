package com.dps.usercrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.usercrud.model.entity.UserDetails;
import com.dps.usercrud.model.request.UserDetailsRequest;
import com.dps.usercrud.model.response.UserDetailsResponse;
import com.dps.usercrud.repository.UserRegistrationRepository;

import jakarta.validation.Valid;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository registrationRepository;

	@Override
	public List<UserDetailsResponse> getAllUsers() {
		final List<UserDetailsResponse> userResponses = new ArrayList<>();
		List<UserDetails> users = registrationRepository.findAll();
		users.forEach(user -> userResponses.add(UserDetailsResponse.builder().id(user.getId()).fname(user.getFname())
						.lname(user.getLname()).gender(user.getGender()).address(user.getAddress()).city(user.getCity())
						.contact(user.getContact()).email(user.getEmail()).pin(user.getPin()).state(user.getState())
						.build()));
		return userResponses;
	}

	@Override
	public void saveUser(@Valid UserDetailsRequest userDetailsRequest) {
		UserDetails userDetails = UserDetails.builder().id(userDetailsRequest.getId())
				.fname(userDetailsRequest.getFname()).lname(userDetailsRequest.getLname())
				.gender(userDetailsRequest.getGender()).address(userDetailsRequest.getAddress())
				.city(userDetailsRequest.getCity()).pin(userDetailsRequest.getPin())
				.state(userDetailsRequest.getState()).contact(userDetailsRequest.getContact())
				.email(userDetailsRequest.getEmail()).build();
		registrationRepository.save(userDetails);
	}

	@Override
	public void deleteUser(Integer userid) {
		registrationRepository.deleteById(userid);
	}

	@Override
	public void updateUser(Integer userid, @Valid UserDetailsRequest userDetailsRequest) {
		UserDetails updatedUser = UserDetails.builder().id(userid).fname(userDetailsRequest.getFname())
				.lname(userDetailsRequest.getLname()).address(userDetailsRequest.getAddress())
				.city(userDetailsRequest.getCity()).state(userDetailsRequest.getState())
				.gender(userDetailsRequest.getGender()).pin(userDetailsRequest.getPin())
				.contact(userDetailsRequest.getContact()).email(userDetailsRequest.getEmail()).build();
		registrationRepository.save(updatedUser);
	}

	@Override
	public List<UserDetailsResponse> getUserByCity(String city) {
		final List<UserDetailsResponse> userResponses = new ArrayList<>();
		List<UserDetails> users = registrationRepository.findUsersWithCity(city);
		users.forEach(user -> userResponses.add(UserDetailsResponse.builder().id(user.getId()).fname(user.getFname())
						.lname(user.getLname()).gender(user.getGender()).address(user.getAddress()).city(user.getCity())
						.contact(user.getContact()).email(user.getEmail()).pin(user.getPin()).state(user.getState())
						.build()));
		return userResponses;
	}
}

