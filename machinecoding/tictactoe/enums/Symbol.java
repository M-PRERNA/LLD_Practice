package com.learn.spring.lld.machinecoding.tictactoe.enums;

public enum Symbol {
    X('X'),
    O('O'),
    EMPTY('_');

    private final char displayChar;

    Symbol (char dispalyChar){
        this.displayChar = dispalyChar;
    }

    public char getDisplayChar(){
        return displayChar;
    }

}
