/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Book {
    private String title,author,publisher;
    private int date;
    public Book()
    {
        title="";
        author="";
        publisher="";
        date=0;
    }
    public void settitle(String t)
    {
      title=t;  
    }
     public void setauthor(String a)
    {
      author=a;  
    }
      public void setpublisher(String p)
    {
      publisher=p;  
    }
       public void setdate(int d)
    {
      date=d;  
    }
       public String gettitle()
       {
           return title;
       }
       public String getauthor()
       {
           return author;
       }
       public String getpublisher()
       {
           return publisher;
       }
       public int getdate()
       {
           return date;
       }
       public String toString()
       {
           String result="The title of book is:"+gettitle()+
                   "The author of book is:"+getauthor()+
                   "The publisher of book is:"+getpublisher()+
                   "The copyright of book is:"+getdate();
           return result;
       }
}
