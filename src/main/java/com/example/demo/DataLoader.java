package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Dataloder running ...");
        Role user = new Role();
        user.setId(1);
        user.setRole("USER");
        roleRepository.save(user);

        Role admin = new Role();
        admin.setId(2);
        admin.setRole("ADMIN");
        roleRepository.save(admin);
    }
}
