package com.example.bean_team;

abstract class Shape{

    Integer x;
    Integer y;
    
    String color = "purple";

    public Shape(Integer x,Integer y,String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
