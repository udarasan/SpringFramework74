package org.example.config;

import org.example.bean.C;
import org.example.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    public AppConfig2() {
        System.out.println("AppConfig2 object Created");
    }
    @Bean
    public C c(){
        return new C();
    }
    @Bean
    public D d(){
        return new D();
    }
}
