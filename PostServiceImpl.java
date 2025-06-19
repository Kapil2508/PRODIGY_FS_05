package com.test.media.social.platform.pojo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.media.social.platform.model.Post;
import com.test.media.social.platform.model.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
    private PostRepo postRepository;

    public Post save(Post post) {
        post.setcreatedAt(LocalDateTime.now());
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + id));
    }
}

