package com.mystories.persistence.repo;

import com.mystories.persistence.model.Story;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StoryRepository extends MongoRepository<Story, String> {

    public Story findByTitle(String Title);
    public List<Story> findAll();


}
