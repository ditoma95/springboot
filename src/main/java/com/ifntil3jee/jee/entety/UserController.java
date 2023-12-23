/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifntil3jee.jee.entety;

import com.ifntil3jee.jee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author dimitri
 */
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/app")
    public String listUsers(){
        
        User u1 = new User("a", "b", "c", "d", "e", "f");
        userRepository.save(u1);
        
        return null;
        
    }
}



