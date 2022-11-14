package com.develhope.redis_01.controller;

import com.develhope.redis_01.entities.jpa.PlayerJPA;
import com.develhope.redis_01.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @PostMapping("")
    public PlayerJPA createPlayer(@RequestBody PlayerJPA playerJPA) {
        return playerService.create(playerJPA);
    }

    @GetMapping()
    public List<PlayerJPA> readAll() {
        return playerService.readAll();
    }

    @PutMapping("/{id}")
    public PlayerJPA update(@PathVariable Long id, @RequestBody PlayerJPA user) {
        return playerService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        playerService.delete(id);
    }


}
