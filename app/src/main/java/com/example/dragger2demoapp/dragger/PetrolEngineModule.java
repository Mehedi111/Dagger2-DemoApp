package com.example.dragger2demoapp.dragger;

import com.example.dragger2demoapp.car.Engine;
import com.example.dragger2demoapp.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
