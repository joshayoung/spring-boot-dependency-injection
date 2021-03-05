package com.joshayoung.springbootdependencyinjection.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof com.joshayoung.springbootdependencyinjection.services.LifeCycleDemoBean){
            ((com.joshayoung.springbootdependencyinjection.services.LifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof com.joshayoung.springbootdependencyinjection.services.LifeCycleDemoBean){
            ((com.joshayoung.springbootdependencyinjection.services.LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}