package com.thanglt.simplegame;

import java.util.ArrayList;
import java.util.List;

public class Ball {
    public static final int UP = 0;
    public static final int LEFT = 1;
    public static final int DOWN = 2;
    public static final int RIGHT = 3;
    public int x;
    public int y;
   
    public int direction;    
    
    public Ball() {        
        direction = UP;
        x=5;
        y=6;
    }
    
    public void turnLeft() {
        direction += 1;
        if(direction > RIGHT)
            direction = UP;
    }
    
    public void turnRight() {
        direction -= 1;
        if(direction < UP)
            direction = RIGHT;
    }
    
    
    
    public void advance() {
                
        if(direction == UP)
            y -= 1;
        if(direction == LEFT)
            x -= 1;
        if(direction == DOWN)
            y += 1;
        if(direction == RIGHT)
            x += 1;
        
        if(x < 0)
            x = World.WORLD_WIDTH-1;
        if(x > World.WORLD_WIDTH-1)
            x = 0;
        if(y < 0)
            y = World.WORLD_HEIGHT-1;
        if(y > World.WORLD_HEIGHT-1)
            y = 0;
    }
    
    public boolean checkCollided() {
        
        return false;
    }      
}
