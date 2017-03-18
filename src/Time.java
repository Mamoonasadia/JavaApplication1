/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */import java.util.Scanner;
public class Time {
      
    
  
      public static void main (String[] args)
  {
    Scanner  Scan=new Scanner (System.in);
    int speed, distance;
    float time;
    speed=Scan.nextInt();
    distance=Scan.nextInt();
    time=speed/distance;
    System.out.print ("Time for travel s:"+time);
  }
}


