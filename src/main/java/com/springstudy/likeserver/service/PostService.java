package com.springstudy.likeserver.service;

import com.springstudy.likeserver.domain.Post;
import com.springstudy.likeserver.dto.LikeResponse;
import com.springstudy.likeserver.dto.PostResponse;
import com.springstudy.likeserver.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Transactional
    public PostResponse getPost(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글 없음"));
        return new PostResponse(post.getId(), post.getTitle(), post.getLikeCount());
    }

}
