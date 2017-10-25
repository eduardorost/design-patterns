package com.patterns.patterns.abstractFactory;

import com.patterns.patterns.abstractFactory.models.Sandal;
import com.patterns.patterns.abstractFactory.models.Sneaker;

public interface ShoeFactory {

    Sneaker makeSneaker();
    Sandal makeSandal();

}
