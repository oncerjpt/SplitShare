package com.vanshrajput.repo;

import com.vanshrajput.models.Post;

import java.util.List;

public interface PostRepo {
    List<Post> fetchPosts(String id);

    void save(Post post);

    List<Post> fetchPostsByAccounts(List<String> accountIds, int size, int i);
}
