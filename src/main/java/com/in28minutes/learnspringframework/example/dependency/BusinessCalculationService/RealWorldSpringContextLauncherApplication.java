package com.in28minutes.learnspringframework.example.dependency.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan
public class RealWorldSpringContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println("Max value is : "+ context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
