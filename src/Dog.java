/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Dog {
    private String name;
    private int age;
    public Dog()
    {
        name="";
        age=0;
    }
    public void setname(String n)
    {
        name=n;
    }
    public void setage(int a)
    {
        age =a;
    }
    public String getname()
    {
        return name;
    }
public int getage()
{
    return age;
}
public String toString()
{
    String result="the name of dog is:" +getname()+"the age of dog is:"+getage();
     return result;
}
}


