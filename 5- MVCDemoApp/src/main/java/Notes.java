public class Notes {
    /**
     *                                                          ### Spring MVC configuration process ###
     * ==> Part 1:
     * - Add configurations to file WEB-INF/web.xml
     * 1- Configure Spring MVC Dispatcher Servlet.
     *      - Add an entry for Spring Dispatcher Servlet OR the Front Controller.
     *      - Again the Spring Dispatcher Servlet is a part of core Spring framework.
     *      <web-app>
     *          <servlet>
     *              <servlet-name>dispatcher</servlet-name>
     *              <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
     *
     *              <init-param>
     *              <param-name>ContextConfigLocation</param-name>
     *              <param-va1ue>/WEB-INF/spring-mvc-demo-serv1et.xml</param-value>
     *              </init-param>
     *              <load-on-startup>l</load-on-startup>
     *          </servlet>
     *      </web-app>
     *
     * 2- Setup a URL mappings to Spring MVC dispatcher servlet.
     *      <web-app>
     *          <servlet>
     *              <servlet-name>dispatcher</servlet-name>
     *              .
     *          </servlet>
     *          <servlet-mapping>
     *              <servlet-name>dispatcher [[[ must be the same of servlet name  ]]]</servlet-name>
     *              <url-pattern>/</url-pattern>
     *          </servlet-mapping>
     *
     *      </web-app>
     *
     *
     * ==> Part 2:
     * - Add configurations to file WEB-INF/spring-mvc-demo-servlet.xml
     * 3- Add support for Spring component scanning
     *      <beans>
     *          <context:component-scan base-package = "com.packageName" />
     *      </beans>
     *
     * 4- Add support for conversion, formatting & validation.
     *      <beans>
     *          <mvc:annotation-driven/>
     *      </beans>
     *
     * 5- Configure Spring MVC view resolver.
     *      <beans>
     *          <bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
     *              <property name = "prefix" value = "/WEB-INF/view/" />
     *              <property name = "suffix" value = ".jsp" />
     *          </bean>
     *      </beans>
     *
     * => View Resolver Configs - Explained:
     *      - When your app provides a "view" name, Spring MVC will
     *          # prepend the prefix
     *          # append the suffix
     */


    /**
     *                              #### Spring home controller and view development process ####
     * 1- Create Controller class.
     *      # Annotate the class with @Controller annotation.
     *      # @Controller inherits from @Component ... supports scanning; So the @Controller is a specialized
     *          component that supports web MVC.
     * 2- Define Controller method.
     * 3- Add request mapping to controller method.
     *      # Annotate the method with @RequestMapping("PATH") annotation
     * 4- Return view name.
     * 5- Develop view page.
     */
}
