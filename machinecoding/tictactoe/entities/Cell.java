package com.learn.spring.lld.machinecoding.tictactoe.entities;
import com.learn.spring.lld.machinecoding.tictactoe.enums.Symbol;
public class Cell {
    private Symbol symbol;

    // constructor
    public Cell(){
        this.symbol = Symbol.EMPTY;
    }

    public Symbol getSymbol(){
        return this.symbol;
    }

    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }

    public boolean isEmpty(){
        return this.symbol == Symbol.EMPTY;
    }

}
