package com.test.media.social.platform.model;

import java.util.List;

public interface PostService {

	Post save(Post post);
    List<Post> findAll();
    Post findById(Long id);
}
