package com.vanshrajput.repo;

import com.vanshrajput.models.Likes;

import java.util.List;

public interface LikeRepo {
    List<Likes> getLikesFor(Long id);
}
