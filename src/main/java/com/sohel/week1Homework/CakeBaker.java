package com.sohel.week1Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting frost;

    @Autowired
    Syrup syrup;
    void bakeCake(){
        syrup.getSyrupType();
        frost.getFrostingType();
    }
}
