package com.example.dragger2demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dragger2demoapp.car.Car;
import com.example.dragger2demoapp.dragger.CarComponent;
import com.example.dragger2demoapp.dragger.DaggerCarComponent;
import com.example.dragger2demoapp.dragger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /////COMPONENT.CREATE() NOT WORKED IF ANY MODULE OF COMPONENT TAKE ANY PARAMETER IN CONSTRUCTOR.

      /*  CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();*/

        ////OR

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1500)
                .build();


        carComponent.inject(this);
        car.drive();
    }
}
