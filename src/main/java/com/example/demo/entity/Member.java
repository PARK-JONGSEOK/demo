package com.example.demo.entity;

import javax.persistence.*;

import lombok.Getter;

@Entity
@Getter
public class Member {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Department departMent;
}
