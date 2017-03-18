/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Car {
    private String make,model;
    private int year;
    public Car()
    {
        make="";
        model="";
        year=0;
    }
    public void setmake(String k)
    {
        make=k;
    }
    public void setmodel(String m)
    {
        model=m;
    }
    public void setyear(int y)
            
    {
        year=y;
    }
    public String getmake()
    {
        return make;
    }
    public String getmodel()
    {
        return model;
    }
    public int getyear()
    {
        return year;
    }
    public String toString()
    {
        String result="the Car make by:" +getmake()+"the car model is:" +getmodel()+"the year is"+getyear();
        return result;
    }
        
        
    }