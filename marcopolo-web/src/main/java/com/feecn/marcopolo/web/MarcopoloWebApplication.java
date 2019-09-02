package com.feecn.marcopolo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author pczhangyu
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.feecn.marcopolo","com.feecn.marcopolo.collect"})
@EnableJpaRepositories(basePackages = "com.feecn.marcopolo.data.base.repository")
@EntityScan(basePackages = "com.feecn.marcopolo.data.base.entity")
@SpringBootApplication
public class MarcopoloWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarcopoloWebApplication.class, args);
    }

}
