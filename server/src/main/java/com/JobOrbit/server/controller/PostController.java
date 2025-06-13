package com.JobOrbit.server.controller;

import com.JobOrbit.server.constants.ApiConstants;
import com.JobOrbit.server.dto.PostDTO;
import com.JobOrbit.server.model.PostModel;
import com.JobOrbit.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {


    final PostService postService;


    @PostMapping(ApiConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        log.info("Saving Post #####");

        return this.postService.savePost(postDTORequest);
    }

    @GetMapping(ApiConstants.GET_ALL_POST)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }


}
