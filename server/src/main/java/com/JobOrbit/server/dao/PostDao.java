package com.JobOrbit.server.dao;

import com.JobOrbit.server.model.PostModel;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {


}
