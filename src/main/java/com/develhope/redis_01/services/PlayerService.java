package com.develhope.redis_01.services;

import com.develhope.redis_01.entities.jpa.PlayerJPA;
import com.develhope.redis_01.entities.redis.PlayerRedis;
import com.develhope.redis_01.repositories.jpa.PlayerRepositoryJPA;
import com.develhope.redis_01.repositories.redis.PlayerRepositoryRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepositoryJPA playerRepositoryJPA;

    @Autowired
    PlayerRepositoryRedis playerRepositoryRedis;

    public PlayerJPA create(PlayerJPA player) {
        if(player == null) return null;
        player.setId(null);
        return playerRepositoryJPA.save(player);
    }

    public List<PlayerJPA> readAll() {
        return playerRepositoryJPA.findAll();
    }

    public PlayerJPA update(Long id, PlayerJPA player) {
        player.setId(id);
        Optional<PlayerRedis> playerRedis = playerRepositoryRedis.findById(id);
        if(playerRedis.isPresent()) {
            playerRepositoryRedis.deleteById(id);
        }

        return player;
    }
    public void delete(Long id) {
        playerRepositoryJPA.deleteById(id);
        playerRepositoryRedis.deleteById(id);
    }
}
