import java.util.*;
public class Rn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
  
        int reversed=0;
        
        while(num!=0)
        {
           int temp= num%10;
           reversed=10*reversed+temp;
           num/=10;

        }
        System.out.println(reversed);
    }
}