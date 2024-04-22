package com.example.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.player.model.PlayerRowMapper;
import com.example.player.model.Player;
import java.util.*;
import com.example.player.repository.PlayerRepository;

@Service
public class PlayerH2Service implements PlayerRepository {

    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Player> getPlayers() {
        return (ArrayList<Player>) db.query("SELECT * FROM team", new PlayerRowMapper());
    }

    @Override
    public Player getPlayerById(int playerId) {
        return new Player(12, "prince", 24, "Bowler");
    }

    @Override
    public Player addPlayer(Player player) {
        return new Player(12, "prince", 24, "Bowler");

    }

    @Override
    public Player updatePlayer(int playerId, Player player) {
        return new Player(12, "prince", 24, "Bowler");

    }

    @Override
    public void deletePlayer(int playerId) {

    }
}