package com.thanglt.simplegame;

import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.impl.AndroidGame;

public class BallStoryGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}