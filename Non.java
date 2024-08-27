import java.util.*;
public class Non {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int cou=0;
        while(n>0)
        {
            n=n/10;//1/10=0,2/10=0.......9/10=0
            cou++;
        }
        System.out.println(cou);
    }
    
}
