package com.test.media.social.platform.pojo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.media.social.platform.model.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

}
