/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Box {
    private double height,width,depth;
    private boolean full;
    public Box (double h,double w,double d,boolean f)
    {
        height=h;
        width=w;
        depth=d;
        full=f;
    }
           
 public void setheight(double h)
{
  height=h;
}
 public void setwidth(double w)
 {
     width=w;
    
 }
 public void setdepth(double d)
    
 {
     depth=d;
 }
 public void setfull(boolean b)
 {
     full=b;
 }
 public double getheight()
{
 return height;
}
 public double getwidth()
 {
   return width;
    
 }
 public double getdepth()
    
 {
    return depth;
 }
 public boolean getfull()
 {
   return  full;
 }
 public String toString()
 {
String result="Box height:"+getheight()+"Box width is:"+getwidth()+"Box depth is:"+
     getdepth()+"Box full is:"+getfull();
String result1 = getfull()==true?" Box is full" : "Empty";
     return result+= result1;
 }
}