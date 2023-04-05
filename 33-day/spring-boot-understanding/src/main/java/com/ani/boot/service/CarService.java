package com.ani.boot.service;

import org.springframework.stereotype.Service;

import com.ani.boot.entity.Car;

@Service
public class CarService {
    
    public void createNewCar(Long id, String make, String model) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println(car.toString());
    }
}
