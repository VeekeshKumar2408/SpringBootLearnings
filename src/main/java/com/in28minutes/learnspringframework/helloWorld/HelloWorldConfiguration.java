package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name , int age , Address address){};
record Address(String firstName , String city){};

@Configuration
public class HelloWorldConfiguration {


    @Bean
    public String name(){
        return "Veekesh";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi",20, new Address("Main Street","Utrect"));
        return person;
    }

    @Bean
    public Person person2MethodCall(){
        var person = new Person(name(),age(), address());
        return person;
    }

    @Bean
    public Person person2ParameterCall(String name , int age , Address address3 ){
        var person = new Person(name,age,address3);
        return person;
    }


    @Bean
    @Primary
    public Person person3ParameterCall(String name , int age , Address address ){
        var person = new Person(name,age,address);
        return person;
    }

    @Bean
    public Person person4ParameterCall(String name , int age , @Qualifier("address3qualifier") Address address ){
        var person = new Person(name,age,address);
        return person;
    }


    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Indira Nagar","Lucknow");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Motinagar","Hyderabad");
    }

}
