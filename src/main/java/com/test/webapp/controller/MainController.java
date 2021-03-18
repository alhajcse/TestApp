package com.test.webapp.controller;

import com.test.webapp.model.User;
import com.test.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/")
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Optional<User> getInformationById(@PathVariable("id") Integer id){

        return userService.getUserInformationById(id);
    }

    @PostMapping("/save")
    public User saveInformation(@RequestBody User teacherInformation){

        return userService.saveUserInformation(teacherInformation);
    }


    @GetMapping("/all")
    public List<User> getInformationAll(){

        return userService.getUserAll();
    }

}
