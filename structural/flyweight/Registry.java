package com.assignment.question;
import java.util.*;
public class Registry implements FlyweightRegistry{
    private Map<GraphicType, GraphicIntrinsicState> register = new HashMap<>();

    public void addFlyweight(GraphicIntrinsicState flyweight){
        register.putIfAbsent(flyweight.getType(), flyweight);
    }

    public GraphicIntrinsicState getFlyweight(GraphicType graphicType){
        return register.get(graphicType);
    }
}
