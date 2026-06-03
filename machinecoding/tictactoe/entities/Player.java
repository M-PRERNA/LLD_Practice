package com.learn.spring.lld.machinecoding.tictactoe.entities;
import com.learn.spring.lld.machinecoding.tictactoe.enums.Symbol;

public class Player {
    private final String name;
    private final Symbol symbol;

    public Player (String name, Symbol symbol){
        if(symbol == Symbol.EMPTY){
            throw new IllegalArgumentException("Player cannot have empty ");
        }
        this.name = name;
        this.symbol = symbol;
    }

    public String getName(){
        return this.name;
    }

    public Symbol getSymbol(){
        return this.symbol;
    }

    @Override
    public String toString(){
        return name + " (" + symbol.getDisplayChar() + ") ";
    }

}
