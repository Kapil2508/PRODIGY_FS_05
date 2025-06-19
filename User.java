package com.test.media.social.platform.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	@Id 
	@GeneratedValue
	  private Long id;
	  private String username;
	  private String email;
	  private String password;
	  private String profileImageUrl;
	  private String bio;

	  @ManyToMany
	  private Set<User> following;

	  @ManyToMany(mappedBy = "following")
	  private Set<User> followers;
	}

