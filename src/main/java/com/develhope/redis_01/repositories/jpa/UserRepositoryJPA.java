package com.develhope.redis_01.repositories.jpa;

import com.develhope.redis_01.entities.jpa.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends JpaRepository<UserJPA, Long> {
}
