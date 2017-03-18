/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */import java.util.Scanner;
public class Opreation {    

  
      public static void main (String[] args)
  {
    Scanner  Scan=new Scanner (System.in);
    float var1, var2, sum, diff, prod;
    var1=Scan.nextFloat();   
    var2=Scan.nextFloat();   
   sum=var1+var2;
   diff=var1-var2;
   prod=var1*var2;
  System.out.print ("The sum of variable is:"+sum);
  System.out.print ("The difference of variable is:"+diff);
  System.out.print ("The product of variable is:"+prod);
  }
}

    

