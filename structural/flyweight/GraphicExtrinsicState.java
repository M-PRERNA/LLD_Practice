package com.assignment.question;

@ExtrinsicState
public class GraphicExtrinsicState {
    private GraphicIntrinsicState graphicIntrinsicState;
    private int x, y;
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public GraphicIntrinsicState getGraphicIntrinsicState() {
        return graphicIntrinsicState
        ;
    }
}