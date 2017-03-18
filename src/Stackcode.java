/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Stackcode 
{
   private final int Size;
   private final int stackArray[];
   private int top;
   
   public Stackcode(  )
 {
      Size = 5;
      stackArray = new  int[Size];
      top = -1;
   }
   public void push(int j) 
 {
      stackArray[++top] = j;
 }
   public int pop() 
 {
      return  stackArray[top--];
   }
   public int peek() 
 {
      return  stackArray[top];
   }
   public boolean isEmpty()
 {
      return (top == -1);
   }
   public Boolean  isFull( )
 {
      return (top == Size - 1);
   }
}  

    

