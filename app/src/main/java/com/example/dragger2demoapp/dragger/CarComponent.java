package com.example.dragger2demoapp.dragger;

import com.example.dragger2demoapp.MainActivity;
import com.example.dragger2demoapp.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("Engine capacity") int engCapacity);

        //// Dagger not binds instance of same Data type, fot achieve this we should provide @Named("Unique name")

        CarComponent build();
    }
}
