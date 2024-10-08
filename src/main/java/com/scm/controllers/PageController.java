package com.scm.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



// # now ye controller bn chuka ha and ab ye request ko handel krr skta ha 
@Controller
public class PageController {

    // now we can write a method which will handle request
    @RequestMapping("/home")
    public String home(Model model){ // if dynamic data bhejna ha toh Model ka use kro 
        System.out.println("Home page handler!!");
        model.addAttribute("name", "subsrting technology");
        model.addAttribute("YoutubeChannel", "Play CODM free");
        model.addAttribute("GithubRepo", "link ot git hub repo");
        return "home"; // returning name of the page , so this page must be there in template
    }


    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(Model model){
        model.addAttribute("isLogin", false);  // passing temporary value
        return "services";
    }

    // @RequestMapping("/contact")
    // public String contactPage()
    // {
    //     return "contact";
    // }
    // lets make with diff approach

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    

}
