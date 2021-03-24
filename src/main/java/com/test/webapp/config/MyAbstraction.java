package com.test.webapp.config;

import java.util.ArrayList;
import java.util.List;

public abstract class MyAbstraction {
    abstract String sayHello();
    public List<String> getList(){
        final List<String> defaultList=new ArrayList<>();
        defaultList.add("abstract");
        return  defaultList;

    }
}
