/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Cartest {
    public static void main (String[] args)
    {
        Car c1=new Car();
        Car c2=new Car();
        c1.setmake("muhammad ali");
        c1.setmodel("suzuki");
        c1.setyear(1998);
        c2.setmake("aslam");
        c2.setmodel("Honda");
        c2.setyear(2010);
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
