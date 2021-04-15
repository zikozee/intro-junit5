package com.zikozee;

/**
 * @author : zikoz
 * @created : 15 Apr, 2021
 */
public class Greeting {

    public static final String HELLO = "Hello";
    public static final String WORLD = "World!";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }
}
