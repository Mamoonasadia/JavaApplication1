/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Chairtest {
    

    public static void main(String[]args)
    {
        Chair C1=new Chair();
        C1.Setlegs(2);
        C1.Setcolor("green");
        
        
        System.out.println(C1.getlegs());
        System.out.println(C1.getcolor());
    }
}

