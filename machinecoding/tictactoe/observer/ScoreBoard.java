package com.learn.spring.lld.machinecoding.tictactoe.observer;

import com.learn.spring.lld.machinecoding.tictactoe.entities.Game;
import com.learn.spring.lld.machinecoding.tictactoe.entities.Player;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ScoreBoard implements GameObserver{

    private final ConcurrentHashMap<String, Integer> scores;

    public ScoreBoard(){
        this.scores = new ConcurrentHashMap<>();
    }

    @Override
    public void update(Game game){
        Player winner = game.getWinner();
        if(winner != null){
            recordWin(winner);
            System.out.println("Scoreboard updated: " + winner.getName() + " wins!");
        }
    }

    public void recordWin(Player player) {
        scores.merge(player.getName(), 1, Integer::sum);
    }

    public int getScore(String playerName) {
        return scores.getOrDefault(playerName, 0);
    }

    public void printScoreboard() {
        System.out.println("\n===== SCOREBOARD =====");
        if (scores.isEmpty()) {
            System.out.println("No games played yet.");
        } else {
            scores.forEach((name, score) ->
                    System.out.println(name + ": " + score + " wins")
            );
        }
        System.out.println("======================\n");
    }
}
