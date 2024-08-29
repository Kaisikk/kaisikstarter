package com.kaisik.kaisikstarter.config;

import com.kaisik.kaisikstarter.service.KaisikStarterService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class KaisikStarterConfiguration {

    @Bean
    public KaisikStarterService genService(KaisikStarterProperties properties){
        return new KaisikStarterService(properties);
    }

}
