package com.develhope.redis_01.repositories.jpa;

import com.develhope.redis_01.entities.jpa.PlayerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepositoryJPA extends JpaRepository<PlayerJPA, Long> {
}
