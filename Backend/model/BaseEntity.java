package com.samilemir.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;

}