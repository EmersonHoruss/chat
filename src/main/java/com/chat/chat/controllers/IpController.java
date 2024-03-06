/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chat.chat.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DAVID
 */
@RestController
public class IpController {
    @GetMapping("/ip")
    public String getIp(HttpServletRequest req){
     return "Client IP Addres" + req.getRemoteAddr();
    }
}
