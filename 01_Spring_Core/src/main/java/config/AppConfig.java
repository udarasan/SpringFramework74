package config;

import bean.MyConnection;
import bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "bean") // one package
//@ComponentScan(basePackages = {"lk.ijse.bean","lk.ijse.component"}) //multiple package
//@ComponentScan(basePackageClasses =  SpringBean.class)//one class
public class AppConfig {

    @Bean("ijse")
    //@Scope("prototype")
    //bean method
    MyConnection whyConnection(){
        return new MyConnection();
    }

}
