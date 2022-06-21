package com.estate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity {

	@Column(name = "id", nullable = false, updatable = false, insertable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name = "created", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created;

	

	@Column(name = "updated")
	@UpdateTimestamp
	private Date updated ;
	
	@Column(name = "created_by", updatable = false)
	@CreatedBy
	private String createdBy;
	
	@Column(name = "updated_by", updatable = true)
	@LastModifiedBy
	private String updatedBy;
	
	@Column(name = "is_active",columnDefinition = "BOOLEAN")
	private Boolean active = true;


}
