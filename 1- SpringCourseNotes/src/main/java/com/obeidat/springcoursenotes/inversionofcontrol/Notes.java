package com.obeidat.springcoursenotes.inversionofcontrol;

public class Notes {

    /*
        # Spring container (object factory) has two primary functions:
           1- Create and manage objects ( Inversion of Control ).
           2- Inject object's dependencies ( Dependency Injection ).
     */

    /*
        # There are three ways to configure the Spring container:
            1- XML configuration file ( legacy, but legacy apps still use this ).
            2- Java Annotations ( modern ).
            3- Java source code ( modern ).
     */

    /*
        # Spring container is generically known as ApplicationContext and it's has specialized implementation like:
            1- ClassPathXmlApplicationContext
            2- AnnotationConfigApplicationContext
            3- GenericWebApplicationContext
            4- Others ...
     */

    /*                                                      ### The Big Picture ###
        # [[ MyApp ]] will talk to <<< ===== >>> Spring [[ ObjectFactory ]] ======>>> [[ Configuration ]] that contain a pool of objects
     */

    /*
     *                                                     ## What is Inversion Of Control? ##
     *
     * Simply put, Inversion of Control, or IoC for short, is a process in which an object defines its dependencies without creating them.
     * This object delegates the job of constructing such dependencies to an IoC container.
     * ===> So the IoC is a class that responsible about making an instances from multiple bean classes
     */

    /*
    @Component
    public class Company {
        private Address address;

        public Company(Address address) {
            this.address = address;
        }

        // getter, setter and other properties
    }*/

    /*
    @Configuration
    @ComponentScan(basePackageClasses = Company.class)
    public class Config {
        @Bean
        public Address getAddress() {
            return new Address("High Street", 1000);
        }
    }*/

//    Since we defined beans in a configuration class, we'll need an instance of the AnnotationConfigApplicationContext class to build up a container:

    /*
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    Company company = context.getBean("company", Company.class);
    assertEquals("High Street", company.getAddress().getStreet());
    assertEquals(1000, company.getAddress().getNumber()); */

    // #########################################################################################################################################################################

    /*
                                                ##### What is Dependency Injection ####
        DEPENDENCY INJECTION: is a technique whereby one object (or static method) supplies the dependencies of another object.
        A dependency is an object that can be used (a service).


                                                     #### Injection Types ####
         - There are many types of injection with spring
         - We'll cover the two most common:
            1- Constructor injection.
            2- Setter injection.


                                        #### Development process of constructor injection ####
       1- Define the dependency interface and class.
       2- Create constructor in your class for injections.
       3- Configure the dependency injection in Spring config file.
     */
}
