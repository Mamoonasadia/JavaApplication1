/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */import java.util.Scanner;
public class Average {
        
  
      public static void main (String[] args)
  {
    Scanner  Scan=new Scanner (System.in);
    int x,y,z,sum;
    double avg;
    x= Scan.nextInt();
    y= Scan.nextInt();
    z= Scan.nextInt();
    sum=x+y+z;
   avg=sum/3.0;
   System.out.print ("The Average of integer values is:"+avg);
  }
}
   
