package com.develhope.redis_01.repositories.redis;

import com.develhope.redis_01.entities.redis.PlayerRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepositoryRedis extends CrudRepository<PlayerRedis, Long> {
}
