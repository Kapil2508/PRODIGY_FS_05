package com.test.media.social.platform.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {

	@Id 
	@GeneratedValue
	  private Long id;
	  private String caption;
	  private String imageUrl;
	  private String videoUrl;
	  private LocalDateTime createdAt;

	  @ManyToOne
	  private User createdBy;

	  @ManyToMany
	  private Set<User> likedBy;

	  @ElementCollection
	  private List<String> tags;

	  public LocalDateTime getcreatedAt() {
		  return createdAt;
	  }
	public void setcreatedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		this.createdAt = createdAt;
 	}
	public String getCaption() {
	    return caption;
	}

	public void setCaption(String caption) {
	    this.caption = caption;
	}

	public String getImageUrl() {
	    return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
	    this.imageUrl = imageUrl;
	}

	public String getVideoUrl() {
	    return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
	    this.videoUrl = videoUrl;
	}

	}

