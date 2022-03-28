package com.psl.training.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.training.model.Customer;
import com.psl.training.service.CustomerService;

@RestController
public class MyController {
	
	@Autowired
	CustomerService service;
	
    @PostMapping("/h")
    public String sayHello(){
        return "Welcome";
    }
    @PostMapping("/")
    public String sayGreet(@RequestBody String customer){
        return "Welcome Shivam" + customer;
    }


}
