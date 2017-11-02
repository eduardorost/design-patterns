package com.patterns.patterns.bridge.services;

import com.patterns.patterns.bridge.DrawAPI;

public class RedCircleService implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
