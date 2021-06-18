package com.obeidat.springcoursenotes.lifecycle;

public class Notes {

    /**                                                  ### Bean LifeCycle ###
     *
     * # When the Spring Container first starts there are couple of things that happens:
     *
     * 1- The beans are instantiated, and then the dependencies are injected, next there's an internal spring processing that occurs with the
     *    bean factory, and then I have the option of adding my own custom initialization code, and then at this point the bean is ready to use,
     *    and then at certain point the containers actually shutdown meaning my application is shutdown like with "context.close()",
     *    then I have the choice to call my custom destroy method and that code will execute before the actual application stopped or before
     *    the actual beans lifecycle is over
     *
    * */

    /**                                                ### Bean LifeCycle Methods/Hooks ###
     *
     * ## You can add custom code during bean initialization like:
     *  - Calling custom business logic methods.
     *  - Setting up handles to resources (db, sockets, file etc).
     *
     *
     * ## You can add custom code during bean destruction like:
     *  - Calling custom business logic methods.
     *  - Setting up handles to resources (db, sockets, file etc).
     *
     *  So how to do this?
     *  - Simply make configuration entry in the XML file, so for bean initialization
     *      you make use this attribute called "INIT-METHOD", and then you give the actual
     *      method name that you would like for Spring to call on your bean.
     *
     * - We can also do the similar thing for the destroy method, so again you simply make
     *      a configuration entry in the XML file called "DESTROY-METHOD" that the Spring call
     *      on destroy
     *
     *  # Development Process:
     *  1- Define your methods for init and destroy
     *  2- Configure the method names in Spring config file.
     */
}
