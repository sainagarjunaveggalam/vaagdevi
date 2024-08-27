import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of terms");
       int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println("enter values");
            int n=sc.nextInt();
        
        int cou=0;
        
        for(int div=1;div<=n;div++)
        {
            if(n%div==0)
            {
            cou++;
        }
    }
        if(cou==2){
                System.out.println("prime");
            }
            else{
            System.out.println("not prime");
        }
    }
}
}


    
