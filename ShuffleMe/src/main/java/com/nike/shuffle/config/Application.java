package com.nike.shuffle.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.nike.shuffle.*")
@PropertySource(value={"classpath:application.${algo:random-shuffle}.properties"})
public class Application extends SpringBootServletInitializer {
	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
     
    
}
