package com.example.dragger2demoapp.dragger;

import com.example.dragger2demoapp.car.Rims;
import com.example.dragger2demoapp.car.Tires;
import com.example.dragger2demoapp.car.Wheels;

import dagger.Module;
import dagger.Provides;

/*
*
* IF ALL METHOD ARE STATIC THAN WE SHOULD MAKE MODULE ABSTRACT*/

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }


    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
