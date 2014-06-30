package com.thanglt.simplegame;

import java.util.Random;

public class World {
    static final int WORLD_WIDTH = 20;
    static final int WORLD_HEIGHT = 26;
    static final int SCORE_INCREMENT = 10;
    static final float TICK_INITIAL = 0.05f;
    static final float TICK_DECREMENT = 0.005f;

    public Ball ball;
    
    public boolean gameOver = false;;
    public int score = 0;

    boolean fields[][] = new boolean[WORLD_WIDTH][WORLD_HEIGHT];
    Random random = new Random();
    float tickTime = 0;
    static float tick = TICK_INITIAL;

    public World() {
        ball = new Ball();
        //placeArtifact();
    }

    private void placeArtifact() {
        
        //artifact = new Actifact();
    }

    public void update(float deltaTime) {
        if (gameOver)
            return;

        tickTime += deltaTime;

        while (tickTime > tick) {
            tickTime -= tick;
            ball.advance();
            if (ball.checkCollided()) {
                gameOver = true;
                return;
            }

            
        }
    }
}
