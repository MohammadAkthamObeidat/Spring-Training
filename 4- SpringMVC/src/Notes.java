public class Notes {

    /*
     *                                                              ### What is Spring MVC? ###
     * - Framework for building web applications in Java
     * - Based on Model-View-Controller design pattern
     * - Leverages features of the Core Spring Framework (IOC, DI)
     */

    /*
     *                                                              ### Spring MVC Benefits ###
     *
     * - The Spring way of building web app UIs in Java
     * - Leverage a set of reusable UI components
     * - Help manage application state for web requests
     * - Process form data: validation, conversion etc
     * - Flexible configuration for the view layer
     */

    /*
     *                                                      ### Components of a Spring MVC Application ###
     * - A set of web pages to layout UI components
     * - A collection of Spring beans (controllers, services, etc. ..)
     * - Spring configuration (XML, Annotations or Java)
     */

    /**                                                             ### Spring MVC Front Controller ###
     *
     * # Every thing starts off with that first incoming request and it encounters something called front controller.
     * # Front controller
     * 
     * - Front controller known as DispatcherServlet
     *      # Part of the Spring Framework
     *      # Already developed by Spring Dev Team
     *      # We don't have to create the front controller, it's a part of Spring jar files; So out of the box we have this front controller.
     *
     * - As a developer you will create
     *      # Model objects.
     *          - The model objects are contain data.
     *      # View templates.
     *          - The view are actual JSP page, or view page to actually render the data.
     *      # Controller classes.
     *          - Controllers will contains the business logic or processing logic.
     *
     * # Front controller will delegate the request to some other objects or items in our system
     *
     */

// ############################################################################################################################################################


    /**                                                              ### Controller ###
     *
     * # So when the Front Controller has a request, it delegates the request to the Controller ( That MADE by the developer).
     *
     * - Code created by developer
     * - Contains your business logic
     *      # Handle the request
     *      # Store/ retrieve data (db, web service...)
     *      # Place data in model
     * - Send to appropriate view template
     *
     */


    // ############################################################################################################################################################

    /**                                                              ### Model ###
     *
     * # So when Your Controller goes off and performs an operation to retrieve data
     *
     * - Model: contains your data
     * - Store/ retrieve data via backend systems
     *      # database, web service, etc...
     *      # Use a Spring bean if you like
     * - Place your data in the model
     *      #Data can be any Java object/ collection
     *
     * # The model is a container like your suitcase or your luggage for shipping data between various parts of your Spring MVC application; So that model
     *      data will actually get passed over to the view template and they actually can handle that for displaying the data.
     *
     * # In your application you can put anything in the model, like: objects, strings, info. from Database etc...
     * # Your view page (JSP) can access data from the model.
     */


    // ############################################################################################################################################################

    /**                                                              ### View Template ###
     *
     * - Spring MVC is flexible
     *      #Supports many view templates
     * - Most common is JSP + JSTL
     * - Developer creates a page
     *      # Displays data
     *
     */


}
