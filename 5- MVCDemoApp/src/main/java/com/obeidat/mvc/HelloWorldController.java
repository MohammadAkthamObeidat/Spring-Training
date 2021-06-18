package com.obeidat.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // Need a controller method to show the initial HTML page.
    @RequestMapping("/showForm")
    public String showForm(){
        return "show-form";
    }

    // Need a controller method to process HTML form.
    @RequestMapping("/processForm")
    public String processForm(){
        return "process-form";
    }

    @RequestMapping("")
    public String tryTheModel(HttpServletRequest request, Model model){
        /*
        * # HttpServletRequest: holds the data from HTML form
        * # Model: will holds the data.
        * */

        // Get the name value from the HttpServletRequest object
        String name = request.getParameter("name");

        // Add the name value to the model.
        model.addAttribute("name", name.toUpperCase());

        // Return a view page
        return "hello-world";

    }
}
