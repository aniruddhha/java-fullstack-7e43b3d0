package com.ani.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.ani.boot.entity.Car;

@PropertySource("other.properties")
@Service
public class CarService {
    
    @Value("${testing.accounts.ws}")
    private String website;

    @Value("${testing.accounts.mail}")
    private String mail;

    @Value("${server.port}")
    private Integer port;

    public void createNewCar(Long id, String make, String model) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println("Car Company Website: " + website);
        System.out.println("Car Company Email: " + mail);
        System.out.println("Car Company Port: " + port);

        System.out.println(car.toString());
    }
}
