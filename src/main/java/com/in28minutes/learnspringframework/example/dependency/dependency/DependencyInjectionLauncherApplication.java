package com.in28minutes.learnspringframework.example.dependency.dependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {



    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
