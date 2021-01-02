package com.example.customerpage.customerloginpage.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/")
    public ModelAndView defaultHome() {
        return new ModelAndView("login");
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping("/dashboard")
    public ModelAndView userDashboard() {
        return new ModelAndView("dashboard");
    }

    @RequestMapping("/accessdenied")
    public ModelAndView userAccessError() {
        return new ModelAndView("accessdenied");
    }

    @RequestMapping("/admin/")
    public ModelAndView admin() {
        return new ModelAndView("admin/login");
    }

    @RequestMapping("/admin/login")
    public ModelAndView adminlogin() {
        return new ModelAndView("admin/login");
    }

    @RequestMapping("/admin/dashboard")
    public ModelAndView admindashboard() {
        return new ModelAndView("admin/dashboard");
    }

    @RequestMapping("/admin/accessdenied")
    public ModelAndView adminAccessError() {
        return new ModelAndView("admin/accessdenied");
    }
}
