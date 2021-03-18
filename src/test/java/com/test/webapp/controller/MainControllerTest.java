package com.test.webapp.controller;
import com.test.webapp.model.User;
import com.test.webapp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class MainControllerTest {

    @Autowired
    UserService userService;



    @Test
    void getInformationAll() throws Exception{

       int listSize= userService.getUserAll().size();
        assertEquals(4, listSize);

    }

    @Test
    void getInformationById() throws Exception{

       User user= userService.getUserInformationById(5).get();
       System.out.println(user.getName());

       assertEquals("Alhaj", user.getName());

    }

    @Test
    void saveInformation() throws Exception{

        User user=new User();
        user.setName("Man");
        user.setEmail("man@gmail.com");

        User user1=userService.saveUserInformation(user);
        System.out.println(user1.getName());
        assertEquals("Man", user1.getName());
    }
}
