package com.patterns.patterns.abstractFactory.models.adidas;

import com.patterns.patterns.abstractFactory.models.Sneaker;

public class AdidasSneaker implements Sneaker {
    @Override
    public String infos() {
        return "AdidasSneaker";
    }
}
