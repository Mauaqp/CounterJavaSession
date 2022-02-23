package com.contador.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	    
    @RequestMapping("/")
    public String index(HttpSession session) {
    	if (session.getAttribute("count") == null) {
    		session.setAttribute("count", 0);
    	}
    	Integer countNum = (Integer) session.getAttribute("count");
    	session.setAttribute("count", countNum +1);
    	return "index.jsp";	
    }
    
    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
    	if (session.getAttribute("count") == null) {
    		session.setAttribute("count", 0);
    	}
    	Integer countNum = (Integer) session.getAttribute("count");
    	model.addAttribute("count", countNum);
    	return "counter.jsp";	
    }
    
    @RequestMapping("/counter2")
    public String counter2 (HttpSession session, Model model) {
    	if (session.getAttribute("count") == null) {
    		session.setAttribute("count", 0);
    	}
    	Integer countNum = (Integer) session.getAttribute("count");
    	model.addAttribute("count", countNum + 2);
    	return "counter2.jsp";	
    }
    
    @RequestMapping("/reset")
    public String reset ( HttpSession session) {
    	session.setAttribute("count", 0);
    	return("redirect:/");
    }
}
