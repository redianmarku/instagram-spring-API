package com.tnp.instagram_backend.service;


import com.tnp.instagram_backend.model.Post;
import com.tnp.instagram_backend.model.User;
import com.tnp.instagram_backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post, User user) {
        post.setUser(user);
        return postRepository.save(post);
    }

    public List<Post> getPostsByUser(User user) {
        return postRepository.findByUserIdOrderByCreatedAtDesc(user.getId());
    }
}