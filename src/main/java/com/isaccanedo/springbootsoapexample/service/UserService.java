package com.isaccanedo.springbootsoapexample.service;

import org.springframework.stereotype.Service;

import com.isaccanedo.spring_boot_soap_example.User;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User isac = new User();
        isac.setName("Isac");
        isac.setEmpId(0001);
        isac.setSalary(15000);

        User canedo = new User();
        canedo.setName("Canedo");
        canedo.setEmpId(0002);
        canedo.setSalary(20000);
        
        User almeida = new User();
        almeida.setName("Almeida");
        almeida.setEmpId(0003);
        almeida.setSalary(30000);

        users.put(isac.getName(), isac);
        users.put(canedo.getName(), canedo);
        users.put(almeida.getName(), almeida);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
