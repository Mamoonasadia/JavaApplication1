/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Multisphere {
    public static void main(String [] args)
    {
        Sphere s1=new Sphere();
        s1.setsd(6);
        System.out.println("the sphere of diameter is:"+s1);
        System.out.println("the area is:"+s1.area());
        System.out.println("the volume is:"+s1.volume());
    }
    
}
