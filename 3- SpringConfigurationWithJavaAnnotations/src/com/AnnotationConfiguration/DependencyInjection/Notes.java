package com.AnnotationConfiguration.DependencyInjection;

public class Notes {

    /**                                                     ??? What is Spring AutoWiring ???
     *
     * - For dependency injection, Spring can use Autowiring annotation.
     * - Spring will look for a class that MATCHES the property.
     *      * Matches by type: they type could CLASS or INTERFACE.
     * - Once Spring find a match it will inject it automatically ... hence it is autowired.
     *
     */

    /**                                                     ### Autowiring Example ###
     *
     * - Injecting FortuneService into a Coach implementation
     * - Spring will scan @Components
     * - Any one implements FortuneService interface???
     * - If so, let's inject them. For example: HappyFortuneService
     */

    /**                                                     ### Autowiring Injection Types ###
     *
     * 1- Constructor Injection.
     * 2- Setter Injection.
     * 3- Field Injections.
     *
     */



    // ################################################################################################################################################


    /**
     *                                              ========> Constructor Injection - Development Process <========
     *
     * 1- Define the dependency Interface and Class.
     * 2- Create a constructor in your class for injections.
     * 3- Configure the dependency injection with @Autowired annotation.
     */
    /**
     * ## We said that the spring will automatically scan for the component that implements the interface in order to inject it into the constructor using
     *      @Autowired annotation, but if we have more than one component are implements the interface, what to do?
     *
     *      - Well, in this situation we need to be more specific in which component we're really need to inject by using
     *              @Qualifier("THE_COMPONENT_ID_WE_REALLY_NEED_TO_INJECT") before the parameter name in the constructor.
     *
     *              EX://
     *              TODO: private FortuneService myFortuneService;
     *              @Autowired
     *              public TennisCoach(@Qualifier("sadFortuneService") FortuneService myFortuneService) {
     *                  this.myFortuneService = myFortuneService;
     *              }
     */


    // ################################################################################################################################################


    /**
     *                                              ========> Setter Injection - Development Process <========
     *
     * # In setter injection, we basically inject our dependencies by calling setter methods on your class.
     */

    /**
     *
     * 1- Create setter method(s) in you class for injection.
     * 2- Configure the dependency injection with @Autowired annotation.
     */


    // ################################################################################################################################################

    /**
     *                                              ========> Fields Injection - Development Process <========
     *
     * # In field injection we can actually inject the dependencies by setting field values on your class directly (even private fields).
     * # This is happens behind the scene using JAVA technology called REFLECTION.
     */


    /**
     *
     * 1- Configure the dependency injection with @Autowired annotation.
     *      * Applied directly to the field.
     *      * No need to setter methods.
     */
}
