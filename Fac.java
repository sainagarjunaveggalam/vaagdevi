
import java.util.*;
public class Fac
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
int res=1;
for(int i=1;i<=num;i++)
{
  if(num==0)
  {
    System.out.println("1");
  }
res=res*i;

}

System.out.println(res);
}

}