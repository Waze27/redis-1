package com.develhope.redis_01.repositories.redis;

import com.develhope.redis_01.entities.redis.UserRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRedis extends CrudRepository<UserRedis, Long> {
}
