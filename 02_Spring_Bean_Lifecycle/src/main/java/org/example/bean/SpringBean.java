package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,InitializingBean,DisposableBean {
    public  SpringBean() {
        System.out.println("Step 1 : Instantiation");
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
}
