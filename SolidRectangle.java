import java.util.*;
public class SolidRectangle 
{
public static void main(String[] args)
{
  /*  for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }*/



    for(int i=1;i<=4;i++)//0r i=1;i<=m;i++
    {
        for(int j=1;j<=5;j++)//j=1;j<=n;j++,m=4,n=5
        {
            if(i==1||j==1||i==4||j==5)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    
    System.out.println();
    }
}
}