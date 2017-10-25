package com.patterns.patterns.abstractFactory.factories;

import com.patterns.patterns.abstractFactory.ShoeFactory;
import com.patterns.patterns.abstractFactory.models.nike.NikeSandal;
import com.patterns.patterns.abstractFactory.models.nike.NikeSneaker;
import com.patterns.patterns.abstractFactory.models.Sandal;
import com.patterns.patterns.abstractFactory.models.Sneaker;
import org.springframework.stereotype.Component;

@Component(value="nikeFactory")
public class NikeFactory implements ShoeFactory {

    @Override
    public Sneaker makeSneaker() {
        return new NikeSneaker();
    }

    @Override
    public Sandal makeSandal() {
        return new NikeSandal();
    }

}
