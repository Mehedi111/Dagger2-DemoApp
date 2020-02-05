package com.example.dragger2demoapp.dragger;

import com.example.dragger2demoapp.car.DieselEngine;
import com.example.dragger2demoapp.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine bindEngine(DieselEngine engine){
        return engine;
    }


    @Provides
    int getHorsePower(){
        return horsePower;
    }


    ////WE CAN USE THIS ALSO

    /*
    *
    *  @Provides
    Engine bindEngine(int horsePower){
        return new DieselEngine(horsePower); ////THAN WE HAVE TO MAKE NOT @INJECT CONSTRUCTOR OF DIESEL ENGINE
    }
    *
    * */

}
