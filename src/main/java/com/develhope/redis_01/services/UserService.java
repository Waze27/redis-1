package com.develhope.redis_01.services;

import com.develhope.redis_01.entities.jpa.UserJPA;
import com.develhope.redis_01.entities.redis.UserRedis;
import com.develhope.redis_01.repositories.jpa.UserRepositoryJPA;
import com.develhope.redis_01.repositories.redis.UserRepositoryRedis;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepositoryJPA userRepositoryJPA;

    @Autowired
    UserRepositoryRedis userRepositoryRedis;

    public UserJPA create(UserJPA user) {
        if(user == null) return null;
        user.setId(null);
        return userRepositoryJPA.save(user);
    }

    public List<UserJPA> readAll() {
        return userRepositoryJPA.findAll();
    }

    public UserJPA update(Long id, UserJPA user) {
        user.setId(id);
        Optional<UserRedis> userRedis = userRepositoryRedis.findById(id);
        if(userRedis.isPresent()) {
            userRepositoryRedis.deleteById(id);
        }

        return user;
    }
    public void delete(Long id) {
        userRepositoryJPA.deleteById(id);
        userRepositoryRedis.deleteById(id);
    }
}
