package com.janhavi.app.repo;

import com.janhavi.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in repository");
    }
}
