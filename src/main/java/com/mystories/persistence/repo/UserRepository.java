package com.mystories.persistence.repo;

import com.mystories.persistence.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    User findById(long id);
    User findByPassword(String password);
}
