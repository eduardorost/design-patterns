package com.patterns.patterns.bridge.services;

import com.patterns.patterns.bridge.DrawAPI;

public class BlueCircleService implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
