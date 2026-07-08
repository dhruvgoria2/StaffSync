package com.dhruvgoria006.gmail.configuration;
import com.dhruvgoria006.gmail.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dhruvgoria006.gmail.DB;

import com.dhruvgoria006.gmail.DevDB;


import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
