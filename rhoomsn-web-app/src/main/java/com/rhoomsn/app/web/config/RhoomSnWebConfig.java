package com.rhoomsn.app.web.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.rhoomsn.app.web")
@ComponentScan("com.rhoomsn.app.web")
@EntityScan("com.rhoomsn.app.web.entity")
@PropertySource(value = {"classpath:configuration/application.properties"})
@SpringBootApplication

public class RhoomSnWebConfig {
	
	//MAIN CLASS RUN
    public static void main(String[] args) {
        SpringApplication.run(RhoomSnWebConfig.class, args);
    }   
    
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager();
    }
    
    // Toto, Tata : : :
}
