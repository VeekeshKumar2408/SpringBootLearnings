package com.in28minutes.learnspringframework;

public class DevClass {
    public static void main(String[] args) {
        System.out.println("DevClass");
        //Changes done for commit
    }

    /*
    @Component : Generic annotation applicable for any class.
      1. Base for all Spring Stereotype Annotation.
      2. Specialization of @Component:

          a. @Service: Indicate that an annotated class has the
                       business logic.
          b. @Controller: Indicates that an annotated class is a
                      "Controller"(e.g. a web controller) used to define
                      controller in your web applications and rest API.
          c. @Repository: Indicates that an annotated class is used to retrieve
                      and/or manipulate data in database.

      3. By using a specific annotation, you are giving more information to the
          framework about your intentions.
      4. Annotations and its description:

         a. @Configuration: Indicates that a class declares one or more @Bean methods
            and may be process by the Spring container to generate bean definitions.

         b. @ComponentScan: Defines specific packages to scan for components. If specific
            packages are not defined scanning will occur from the package of the class that declares
            this annotation.

         c. @Bean: Indicates that a method produces a bean to be managed by the Spring container.

         d. @Component: Indicates that an annotated class is a "component".

         e. @Primary: Indicates that a bean should be given preference when multiple candidates are qualified
            to autowire a single valued dependency.

         f. @Qualifier: Used on a field or parameter as a qualifier for candidate beans
            when autowiring.

         g. @Lazy: Indicates that a bean has to be lazily initialized. Absence of @lazy annotation will lead to
            eager initialization.

         h. @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE): Defines a bean to be a prototype- a new instance will
            be created every time you refer to the bean. Default scope is singleton- one instance per IOC container.

         i. @PostConstruct: Identifies the method that will be executed after dependency injection is done to perform any initialization.

         j. @PreDestroy: Identifies the method that will receive the callback notification to signal that the instance is in the process of
            being removed by the container. Typically, used to release the resources that it has been holding.

         k. @Named: It is a Jakarta Contexts & Dependency Injection(CDI) Annotation similar to Component.

         l. @Inject: It is a Jakarta Contexts & Dependency Injection(CDI) Annotation similar to Autowired.

     */
}
