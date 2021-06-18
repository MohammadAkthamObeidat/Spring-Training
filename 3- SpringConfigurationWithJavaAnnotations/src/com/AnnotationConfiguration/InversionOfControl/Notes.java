package com.AnnotationConfiguration.InversionOfControl;

public class Notes {

    /**
     *                                                      ### What are JAVA annotations ###
     * - Special labels/markers added to java classes and methods.
     * - Provide meta-data about the class.
     * - Processed at compile time or run-time for special processing.
     */

    /**                                          ??? Why to use Spring configuration with annotations ???
     *
     * - XML configuration can be verbose (مطول).
     * - Configure your Spring beans with annotations.
     * - Annotations minimize the XML configuration.
     */

    /**                                                 ### Scanning for Component Classes ###
     *
     * - Spring will scan your application for special annotations, once I add annotation on a classes then Spring will actually scan the Java classes for those annotations
     *      when it finds a class that have a special Spring annotations on it it's will automatically register the beans in the container.
     */

    /**
     * ====> Development process:
     * 1- Enable component scanning in Spring configuration file.
     *      <beans>
     *          <!-- <context:component-scan base-package = "com.package" /> -->
     *          // Spring will scan this package: com.package and all its sub packages recursively, and identify the components that have annotation on it
     *              and it will automatically register them in the Spring container
     *      </beans>
     *
     * 2- Add the @Component annotations to your Java class.
     *      TODO:{ By adding @Component annotation the Spring will automatically register the bean in the beans container }
     *      @Component("thatSillyCoach") ===> TODO:[ thatSillyCoach ] is the bean id that we gonna to use
     *      public class TennisCoach implements Coach{
     *
     *          @Override
     *          public String getDailyWorkout(){
     *              return "Practice your backhand volley";
     *          }
     *      }
     *
     * 3- Retrieve bean from Spring container.
     *      TODO:Coach theCoach = context.getBean("thatSillyBean", TennisCoach.class);
     */

    /**
     * # Spring also supports Default Bean IDs:
     *      - Default bean id: the class name, make first letter lower-case.
     *
     *      Class Name : TennisCoach ====================> Bean ID: tennisCoach
     *
     *      - To use the default bean ID we just remove the name from @Component annotation when we define a component class.
     */
}
