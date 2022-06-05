package com.cydeo.tests.day9_javafaker_testfaker_testbase_driverUtil;

public class Singleton {

    private  Singleton(){}
    private static String word;

    public static String getWord(){
        if (word==null){
            System.out.println("First time call.Word object is null."+"Assigning value to it now!");
            word = "something";
        } else{
            System.out.println("Word already has value.");
        }
           return word;
    }
}
