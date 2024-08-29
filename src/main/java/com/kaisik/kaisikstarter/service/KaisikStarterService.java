package com.kaisik.kaisikstarter.service;

import com.kaisik.kaisikstarter.config.KaisikStarterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

public class KaisikStarterService {

    private final KaisikStarterProperties properties;


    public KaisikStarterService(KaisikStarterProperties properties) {
        this.properties = properties;
    }

    public String getProperty(){
        return String.format("(c) %s %s", LocalDate.now().getYear(), properties.getAuthor());
    }

}
