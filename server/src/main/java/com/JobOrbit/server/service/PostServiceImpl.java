package com.JobOrbit.server.service;

import com.JobOrbit.server.dao.PostDao;
import com.JobOrbit.server.dto.PostDTO;
import com.JobOrbit.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostDao postDao;

    @Override
    public PostModel savePost(PostDTO postDTO) {

        PostModel postModel = new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setDescription(postDTO.getDescription());
        postModel.setSalary(postDTO.getSalary());
        postModel.setType(postDTO.getType());
        postModel.setTechnology(postDTO.getTechnology());
        postModel.setExperience(postDTO.getExperience());

        return postDao.save(postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return postDao.findAll();
    }
}
