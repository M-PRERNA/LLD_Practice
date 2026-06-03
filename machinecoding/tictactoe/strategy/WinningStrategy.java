package com.learn.spring.lld.machinecoding.tictactoe.strategy;

import com.learn.spring.lld.machinecoding.tictactoe.entities.Board;
import com.learn.spring.lld.machinecoding.tictactoe.enums.Symbol;

public interface WinningStrategy {
    public boolean checkWin(Board board, int row, int col, Symbol symbol);
}
