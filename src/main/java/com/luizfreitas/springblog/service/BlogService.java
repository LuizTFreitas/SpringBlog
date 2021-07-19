package com.luizfreitas.springblog.service;

import com.luizfreitas.springblog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post finById(long id);
    Post save (Post post);
}
