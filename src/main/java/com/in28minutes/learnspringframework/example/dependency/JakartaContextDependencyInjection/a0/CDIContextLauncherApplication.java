package com.in28minutes.learnspringframework.example.dependency.JakartaContextDependencyInjection.a0;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named
class BusinessService{
    private DataServices dataService;

    public DataServices getDataService() {
        return dataService;
    }

    //@Autowired
    @Inject
    public void setDataService(DataServices dataService) {
        System.out.println("Setter Injection Performed!");
        this.dataService = dataService;
    }
}

//@Component
@Named
class DataServices{

}


@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessService.class).getDataService());

    }
}
