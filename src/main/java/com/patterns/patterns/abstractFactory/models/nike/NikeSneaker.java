package com.patterns.patterns.abstractFactory.models.nike;

import com.patterns.patterns.abstractFactory.models.Sneaker;

public class NikeSneaker implements Sneaker {
    @Override
    public String infos() {
        return "NikeSneaker";
    }
}
