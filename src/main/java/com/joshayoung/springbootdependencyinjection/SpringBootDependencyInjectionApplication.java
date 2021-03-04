package com.joshayoung.springbootdependencyinjection;

import com.joshayoung.springbootdependencyinjection.controllers.ConstructorInjectedController;
import com.joshayoung.springbootdependencyinjection.controllers.MyController;
import com.joshayoung.springbootdependencyinjection.controllers.PropertyInjectedController;
import com.joshayoung.springbootdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary BEAN");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("------- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
