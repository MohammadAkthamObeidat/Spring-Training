package com.AnnotationConfiguration.NoXML;

public class Notes {
    /**
     *                                                                  ### Java Configuration ###
     * - Instead of configure Spring container using XML.
     *
     * - We're going to to make Spring container configuration with just JAVA code. (NO XML)
     */

    /*
        # There are three ways to configure the Spring container:
            1- XML configuration file ( legacy, but legacy apps still use this ).
            2- Java Annotations with XML component scan ( modern ) .
            3- Java source code ( modern ) NO XML.
     */

    /**
     *                                                                  ### Development Process ###
     * 1. Create a Java class and annotate as @Configuration
     *      @Configuration
     *      public class SportConfig{
     *
     *      }
     *
     * 2. Add component scanning support: @ComponentScan (optional)
     *      @Configuration
     *      @ComponentScan("com.package. ...")
     *      public class SportConfig{
     *
     *      }
     *
     * 3. Read Spring Java configuration class
     *      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
     *
     * 4. Retrieve bean from Spring container
     *      Coach theCoach = context.getBean("tennisCoach", Coach.class);
     */


    /**
     *                              #### Development Process of defining Spring beans in Java config file (NO XML) ####
     *
     * 1. Define method to expose bean
     *      # This method name will be the bean ID that already registered by the Spring container.
     *      # NO COMPONENT SCAN used here, so we're going to define each bean individually in this config file
     *      @Configuration
     *      public class SportConfig{
     *          @Bean
     *          public Coach swimCoach(){
     *              SwimCoach mySwimCoach = new SwimCoach();
     *              return mySwimCoach;
     *          }
     *      }
     *
     * 2. Inject bean dependencies
     *       @Configuration
     *      public class SportConfig{
     *
     *          @Bean
     *          public FortuneService happyFortuneService(){
     *              HappyFortuneService myHappyFortuneService = new HappyFortuneService();
     *              return myHappyFortuneService;
     *         }
     *
     *          @Bean
     *          public Coach swimCoach(){
     *              // Injection of happyFortuneService in the SwimCoach bean.
     *              SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
     *              return mySwimCoach;
     *          }
     *      }
     * 3. Read Spring Java configuration class
     * 4. Retrieve bean from Spring container
     */


    /**
     *                                          ### Injecting Values From Properties File Development Process ###
     * 1. Create Properties file.
     *
     * 2. Load Properties file in Spring config file.
     *
     * 3. Reference values from properties file.
     */
}
