package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean   {
    @Autowired(required = false)
    public  SpringBean(@Value("udara-san") String name,@Value("22") int num) {
        System.out.println("SpringBean object created");
        System.out.println(name);
        System.out.println(num);
    }
    @Autowired(required = false)
    public SpringBean(@Value("34234V") String nic []) {
        System.out.println("SpringBean object created");
        System.out.println(nic);
    }
}
