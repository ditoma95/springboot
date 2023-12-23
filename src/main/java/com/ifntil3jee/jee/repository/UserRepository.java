/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifntil3jee.jee.repository;

import com.ifntil3jee.jee.entety.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dimitri
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
