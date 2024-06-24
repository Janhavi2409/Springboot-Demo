package com.janhavi.app.services;

import com.janhavi.app.repo.LaptopRepository;
import com.janhavi.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServices {
    @Autowired
    private LaptopRepository repo;

    public void laptopAdd(Laptop lap) {
        repo.save(lap);
    }

    public boolean isProgrammable(Laptop lap) {
        return true;
    }
}
