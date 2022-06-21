package com.estate.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usersignuprequest {
	
	public String name;
	private String email;
	private String mob;
	private String city;
	private String state;
	private String pincode;
	private String country;
	private String password;

}
