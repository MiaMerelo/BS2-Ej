package com.vogella.spring.di.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MySpringBeanWithDependency springBean = context.getBean(MySpringBeanWithDependency.class);
        springBean.run();
        context.close();
    }
}