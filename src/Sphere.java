/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Sphere {
    private int sd;
    public Sphere()
    {
        sd=0;
    }
    public void setsd(int s)
    {
        sd=s;
    
    }
    public int getsd()
    {
       return sd;
    
    }
    public double volume()
    {
        double x=(4.0/3.0)*Math.PI*Math.pow(sd,3);
        return x;
    }
    public double area()
    {
        double f=4*Math.PI*Math.pow(sd,2);
        return f;
    }
    public String toString()
    {
        String result="the sphere is:"+getsd();
        return result;
    }
    
    
}
