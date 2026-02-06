package com.saumitra.subgen.backend.service;


import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String healthMessage(){
        return "SubGen Backend is Running!!!!";
    }
    public String helloMessage(){
        return "Hello From SubGen!!!!";
    }
}
