package com.estate.serviceImpl;

import org.springframework.stereotype.Service;

import com.estate.entity.User;
import com.estate.request.Usersignuprequest;
import com.estate.response.CommonSuccessResponse;
import com.estate.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public CommonSuccessResponse createCoustomer(Usersignuprequest usersignuprequest) {
		User user = new User();
		
		user.builder().name(usersignuprequest.getName()).email(usersignuprequest.getEmail()).mob(usersignuprequest.getMob())
		.city(usersignuprequest.getCity()).state(usersignuprequest.getState()).pincode(usersignuprequest.getPincode())
		.country(usersignuprequest.getCountry()).password(usersignuprequest.getPassword()).build();
		
		return new CommonSuccessResponse(true);
	}

}
