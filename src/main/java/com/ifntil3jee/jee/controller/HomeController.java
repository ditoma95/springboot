/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifntil3jee.jee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author dimitri
 */
@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;
    
    
    
    
    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "index";
    }
}
