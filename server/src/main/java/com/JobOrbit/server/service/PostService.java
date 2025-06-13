package com.JobOrbit.server.service;

import com.JobOrbit.server.dto.PostDTO;
import com.JobOrbit.server.model.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savePost(PostDTO postDTO);

    public List<PostModel> getAllPosts();
}
