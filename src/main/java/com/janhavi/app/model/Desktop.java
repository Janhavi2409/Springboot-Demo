package com.janhavi.app.model;

import com.janhavi.app.model.Computer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling in Desktop...");
    }
}
