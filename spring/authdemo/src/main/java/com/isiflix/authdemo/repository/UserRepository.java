package com.isiflix.authdemo.repository;


import com.isiflix.authdemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByLogin(String login);
}