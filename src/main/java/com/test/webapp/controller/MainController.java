package com.test.webapp.controller;

import com.test.webapp.model.User;
import com.test.webapp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/")
@Api(value="MainController", description="Main Controller Api document")
public class MainController {

    @Autowired
    UserService userService;


    @ApiOperation(value = "View a list of available products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("/{id}")
    public Optional<User> getInformationById(@PathVariable("id") Integer id){

        return userService.getUserInformationById(id);
    }

    @PostMapping("/save")
    public User saveInformation(@RequestBody User teacherInformation){

        return userService.saveUserInformation(teacherInformation);
    }

    @ApiOperation(value = "View a list of all products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("/all")
    public List<User> getInformationAll(){

        return userService.getUserAll();
    }

}
