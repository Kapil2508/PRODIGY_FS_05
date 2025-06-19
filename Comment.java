package com.test.media.social.platform.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {

	@Id 
	@GeneratedValue
	  private Long id;
	  private String text;

	  @ManyToOne
	  private User user;

	  @ManyToOne
	  private Post post;

	  private LocalDateTime createdAt;
	}

