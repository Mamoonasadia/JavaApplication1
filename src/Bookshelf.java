/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Bookshelf {
    public static void main(String[]args)
    {
        Book b1=new Book();
        Book b2=new Book();
        b1.settitle("java");
        b1.setauthor("levin devis");
        b1.setpublisher("ahmad ali");
        b1.setdate(12_12_1998);
        b2.settitle("web programming");
        b2.setauthor("murtaza ali");
        b2.setpublisher("raza");
        b2.setdate(26_4_2011);
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
