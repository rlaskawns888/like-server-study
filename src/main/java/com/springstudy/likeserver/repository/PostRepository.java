package com.springstudy.likeserver.repository;

import com.springstudy.likeserver.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
