package com.patterns.patterns.abstractFactory.factories;

import com.patterns.patterns.abstractFactory.ShoeFactory;
import com.patterns.patterns.abstractFactory.models.Sandal;
import com.patterns.patterns.abstractFactory.models.Sneaker;
import com.patterns.patterns.abstractFactory.models.adidas.AdidasSandal;
import com.patterns.patterns.abstractFactory.models.adidas.AdidasSneaker;
import org.springframework.stereotype.Component;

@Component(value="adidasFactory")
public class AdidasFactory implements ShoeFactory {

    @Override
    public Sneaker makeSneaker() {
        return new AdidasSneaker();
    }

    @Override
    public Sandal makeSandal() {
        return new AdidasSandal();
    }

}
