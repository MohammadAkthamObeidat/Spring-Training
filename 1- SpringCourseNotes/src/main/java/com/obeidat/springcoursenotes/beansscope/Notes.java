package com.obeidat.springcoursenotes.beansscope;

public class Notes {

    /*                                                           ### Bean Scope ###
    *
    * 1- Scope refers to the lifecycle of a bean.
    * 2- How long does the bean live.
    * 3- How many instances are created.
    * 4- How is the bean shared.
    *
    *  # The default scope of bean is Singleton.
    *
    *
    *                                                       ??? What is Singleton ???
    * Spring container creates only one instance of the bean, by default.
    * It's cached in memory.
    * All requests for the bean will return a SHARED reference to the SAME bean.
    * EX://
    *           CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
    *           CricketCoach alphaCoach = context.getBean("myCricketCoach", CricketCoach.class);
    *  Here we have two objects references points to the same area of memory or they point to the same bean.
    *
    * # The best use case for SINGLETON is for a stateless bean, where you don't need to maintain any state.
    *
    * This is how we can explicitly specify the scope of bean by put the SCOPE attribute in the bean, i.e.
    * <bean id="myFortune" class="com.inversionofcontrol.HappyFortuneService" scope="singleton" />
    * <bean id="myFortune" class="com.inversionofcontrol.HappyFortuneService" scope="prototype" />
    * */

    /*
     *                                                      ### Additional Spring Bean Scopes ###
     *
     * 1- SINGLETON: Create a single shared instance of the bean. Default scope.
     * 2- PROTOTYPE: Creates a new bean instance for each container request.
     * 3- REQUEST: Scoped to an HTTP web request. Only used for web apps.
     * 4- SESSION: Scoped to an HTTP web session. Only used for web apps.
     * 4- GLOBAL-SESSION: Scoped to a global HTTP web session. Only used for web apps.
     */

    /**
     *                                                          ### Bean lifecycle methods ###
     *
     * # So when the spring container first starts there are couple of things that happens:
     *      - Container starts ====> Bean Instantiated ====> Dependencies Injected ====> Internal Spring Processing ====> then Your Custom Initialization Code. ====||
     *                                                                                                                                                              ||
     *                                                                                                    Bean is ready for use / Container is shutdown <<<<========||
     *
     * # At the certain point the containers actually shutdown meaning your application shutdown like what context.close, then you also have a chance to call your
     *      custom destroy method, and that code will execute before the actual application is stopped or before the actual beans lifecycle is over
     *
     * ### Bean lifecycle methods / hooks:
     *  - You can add custom code during bean initialization like:
     *      * Calling custom business logic methods
     *      * Setting up handles to resources (db, sockets, files, etc.)
     *
     - You can add custom code during bean destruction like:
     *      * Calling custom business logic methods
     *      * Clean up handles to resources (db, sockets, files, etc.)
     *
     * ?? How to do this ??
     * # init method configuration:
     * # For bean initialization we do the following:
     * <bean id="myCoach" class="com.inversionofcontrol.TrackCoach" init-method="doMyStartupStuff">
     *     <!-- init-method="MethodName" ===>> Takes the method name that you would like for spring to call on your bean, the method name can be any name -->
     * </bean>
     *
     * # And we can do the similar thing for the destroy method:
     * <bean id="myCoach" class="com.inversionofcontrol.TrackCoach" destroy-method="doMyDestroyStuff">
     *     <!-- destroy-method="MethodName" ===>> Takes the method name that you would like for spring to call for destroy, the method name can be any name -->
     * </bean>
     *
     * ====> Development process:
     * 1- Define your methods for init and destroy
     * 2- Configure the method names in Spring configuration file.
     */
}
