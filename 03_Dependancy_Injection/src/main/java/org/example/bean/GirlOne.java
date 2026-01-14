package org.example.bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GirlOne implements Agreement, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public GirlOne() {
        System.out.println("Girl : Object creation");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step 4: BeanFactory Aware");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Step 3 : BeanName Aware");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Step 7 : Disposable Bean");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step 6 : Initializing Bean");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Step 5 : ApplicationContext Aware");
    }

    @Override
    public void chat() {
        System.out.println("GirlOne : Chat...");
    }
}
