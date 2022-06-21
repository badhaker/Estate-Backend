package com.estate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_details")
public class User extends BaseEntity{
	
	@Column(name ="user_name")
	private String name;
	@Column(name ="email")
	private String email;
	@Column(name ="mobile_number")
	private String mob;
	@Column(name ="city")
	private String city;
	@Column(name ="state")
	private String state;
	@Column(name ="pincode")
	private String pincode;
	@Column(name ="country")
	private String country;
	@Column(name ="password")
	private String password;

}
