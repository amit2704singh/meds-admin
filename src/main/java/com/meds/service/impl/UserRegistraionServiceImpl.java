package com.meds.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meds.model.User;
import com.meds.repository.RegistrationReoisitiry;
import com.meds.admin.service.UserRegistrationService;

@Service
public class UserRegistraionServiceImpl implements UserRegistrationService {

	@Autowired
	private RegistrationReoisitiry registrationReoisitiry;

	@Override
	public void registerUser(User user) {

		registrationReoisitiry.save(user);

	}

}
