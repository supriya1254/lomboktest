package com.lombok.builderPattern;

public class Shop {
    public static void main(String[] args) {

        //without Builder pattern
       //Phone phoneDetails = new Phone("Android",2,"Qualcomm",5.5,3100);
        //System.out.println("Display phone details : "+ phoneDetails);

        //with Builder pattern
       // Phone phoneDetails1 = new PhoneBuilder().setOS("Android").setBattery(3100).getPhone();
       // System.out.println("Display phone details1 : "+ phoneDetails1);

        //with @Builder annotation
        //Using Lombok to create builders for classes with required and optional attributes
        //create an instance ---> builder()
        //Return the finally consrcuted phone object --> build()
        PhoneBuilderAnnotation phoneDet = PhoneBuilderAnnotation.builder().OS("Android").screenSize(5.5).build();
        System.out.println("Display phone details : "+ phoneDet);


    }
}
