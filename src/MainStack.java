/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class MainStack {
   
 public static void main(String[] args)
 {
      Stackcode  Stack = new  Stackcode(); 
      Stack.push(10);
      Stack.push(20);
      Stack.push(30);
      Stack.push(40);
      Stack.push(50);
      
      while (!Stack.isEmpty()) 
{
         int  value = Stack.pop();
         System.out.print(value);
   }
}

    
}
