package com.estate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.estate.Enums.Propertytype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "property_type")
public class Property extends BaseEntity {
	
	@Column(name ="property_area")
	private String propertyArea;
	
	@Column(name ="Room_Count")
	private String RoomCount;
	
	@Column(name="propert_type",nullable = false, length = 50, columnDefinition="ENUM('RESIDENTIAL', 'APPARTMENT', 'STUDIO') default 'APPARTMENT'")
    @Enumerated(EnumType.STRING)
	private Propertytype properttype;
	
	@Column(name ="location")
	private String location;
	
	@Column(name ="price")
	private String price;


}
