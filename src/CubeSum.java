/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */import  java.util.Scanner;
public class CubeSum {

public static void main(String []args)
{
int n1, n2, cube1, cube2;
Scanner scan=new Scanner(System.in);
n1=scan.nextInt();
cube1=(int)Math.pow(n1,3);
n2=scan.nextInt();
cube2=(int)Math.pow(n2,3);
System.out.print("The sum of cube is:"+(cube1+cube2));
  }
}

    

