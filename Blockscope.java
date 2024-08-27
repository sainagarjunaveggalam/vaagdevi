import java.util.*;
public class Blockscope
{
    public static void main(String[] args)  {//method begin
        
        {//block begin,here x cannot access
//x cannot access
         System.out.println(x);//x cannot access
         System.out.println(x);// x cannot access
            int x=20;//x is declared and x can be accessible
            System.out.println(x);//x can be accesible
      System.out.println(x);  }//block close,can be accesible
    }//method close
}