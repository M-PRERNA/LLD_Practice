package com.learn.spring.lld.machinecoding.tictactoe.observer;

import com.learn.spring.lld.machinecoding.tictactoe.entities.Game;

public interface GameObserver {
    public void update(Game game);
}
