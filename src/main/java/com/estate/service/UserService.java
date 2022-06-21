package com.estate.service;

import com.estate.request.Usersignuprequest;
import com.estate.response.CommonSuccessResponse;

public interface UserService {
	
	CommonSuccessResponse createCoustomer( Usersignuprequest usersignuprequest);

}
