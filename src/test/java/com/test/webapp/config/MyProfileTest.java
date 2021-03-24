package com.test.webapp.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyProfileTest {

    private  MyProfile myProfile;


    @Test
    void sayHello() {
        String result = myProfile.sayHello();
        assertEquals(result,"Hello!");
    }

    @BeforeEach
    void setUp() {
        myProfile=new MyProfile();
    }

    @Test
    public void getList(){
        List<String> result = myProfile.getList();
        assertEquals(result.get(0),"abstract");
    }
}
