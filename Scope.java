import java.util.*;
public class Scope
{

    
    public static void main(String[] args)
    {
        
     System.out.println(x);//here x cannot be accessed
        int x=2;//here x isdeclared, accessesd from here to closed curly braces called method scope
        System.out.println(x);//x can be accesseble
  System.out.println(x);  }//can be accessible x as it ends with curly brac
}//cannot access ,it is not methods curly bracees
