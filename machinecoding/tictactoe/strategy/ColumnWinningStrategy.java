package com.learn.spring.lld.machinecoding.tictactoe.strategy;

import com.learn.spring.lld.machinecoding.tictactoe.entities.Board;
import com.learn.spring.lld.machinecoding.tictactoe.enums.Symbol;

public class ColumnWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWin(Board board, int row, int col, Symbol symbol){
        int size = board.getSize();
        for (int r = 0; r < size; r++) {
            if (board.getCell(r, col).getSymbol() != symbol) {
                return false;
            }
        }
        return true;
    }
}
