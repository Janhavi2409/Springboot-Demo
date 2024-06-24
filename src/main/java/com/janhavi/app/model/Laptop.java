package com.janhavi.app.model;

import com.janhavi.app.model.Computer;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling in Laptop...");
    }
}
