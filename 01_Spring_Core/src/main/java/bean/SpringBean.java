package bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
//Bean Scope (singleton and prototype)
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean object created");
    }
    public void printMessage() {
        System.out.println("SpringBean printMessage");
    }
}
