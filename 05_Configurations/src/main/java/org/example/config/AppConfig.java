package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
@Import({AppConfig1.class, AppConfig2.class})
@ImportResource("classpath:hibernate.cfg.xml")
//@ImportResource("file:C:/config/hibernate.cfg.xml")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig object Created");
    }
}

//multiple configurations - better to use enhance the separation of concerns
//DB Bean - DBConfig
//Security Bean - SecurityConfig
//Business Logic Bean - BSConfig