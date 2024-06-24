package com.janhavi.app;

import com.janhavi.app.model.Alien;
import com.janhavi.app.model.Laptop;
import com.janhavi.app.services.LaptopServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        Alien alien = context.getBean(Alien.class);
        alien.code();
        System.out.println(alien.getAge());

        Laptop lap = context.getBean(Laptop.class);

        LaptopServices laptopServices = context.getBean(LaptopServices.class);
        laptopServices.laptopAdd(lap);
        System.out.println(laptopServices.isProgrammable(lap));
    }

}
