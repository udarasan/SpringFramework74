package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // ----- Environment Variables ----- //

        //System Variables - OS related
/*        Map<String,String> systemVariables=System.getenv();
        for(String key:systemVariables.keySet()){
            System.out.println(key+":"+systemVariables.get(key));
        }*/

        //Java Properties - Java Language related
      /* Properties properties= System.getProperties();
        for (String key:properties.stringPropertyNames()){
            System.out.println(key+":"+properties.get(key));
        }*/

        //Resource bundles(.env,.properties,.yml,.yaml) - application related

        context.registerShutdownHook();
    }
}