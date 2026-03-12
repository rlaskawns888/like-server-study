package com.springstudy.likeserver.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private int likeCount;

    protected Post() {
    }

    public Post(String title, int likeCount) {
        this.title = title;
        this.likeCount = likeCount;
    }

    public void increaseLike() {
        this.likeCount += 1;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLikeCount() {
        return likeCount;
    }
}
