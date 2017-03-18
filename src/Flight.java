/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
public class Flight {
    
    private String name;
            private String cities;
                    private String origin;
    private int number;
    public Flight()
    {
      name=" ";
      cities=" ";
      origin=" ";
      number=0;
    }
    public void setname(String n)
    {
        name=n;
    }
    public void setcities(String c)
    {
        cities=c;
    }
    
   public void setorigin(String o)
    {
        origin=o;
    }
   public void setnumber(int num)
    {
        number=num;
    }
   public String getname()
   {
       return name;
   }
   public String getcities()
   {
       return cities;
   }
   public String getorigin()
   {
       return origin;
   }
   public int getnumber()
   {
       return number;
   }
   
   public String toString()
   {
       String r="The name of flight is:"+getname()+
               "The name of cities is:"+getcities()+
               "The origin of flight is:"+getorigin()+
               "The number of flight is:"+getnumber();
        return r;
   }
   
}
