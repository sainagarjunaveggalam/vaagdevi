import java.util.*;
public class Non {
    public static void main(String[] args)
    {
        int sum=0;
        int n=43245;
       while(n>0)
       { 
       int temp=n%10;
       sum=sum+temp;
       n=n/10;
        
    }
    System.out.println(sum);
} 
}
