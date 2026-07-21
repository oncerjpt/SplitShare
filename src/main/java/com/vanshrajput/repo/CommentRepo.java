package com.vanshrajput.repo;

import com.vanshrajput.models.Comments;

import java.util.List;
import java.util.TreeSet;

public interface CommentRepo {
    List<Comments> getCommentsFor(Long id);
}
