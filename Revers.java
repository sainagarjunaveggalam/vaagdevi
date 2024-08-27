import java.util.*;
public class Revers
{
    public static void main(String[] args)
    {
Scanner numq=new Scanner(System.in);
int num=numq.nextInt();
int reverse=0;

while(num!=0)
{
    int last =num%10;
    reverse=reverse*10+last;
    num=num/10;

}
System.out.println(reverse);
    }
}

    
