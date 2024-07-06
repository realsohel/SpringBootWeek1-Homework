package com.sohel.week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.env", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Cake is made with Strawberry frosting");
    }
}
