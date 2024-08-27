import java.lang.*;
public class Nagarjuna
{
    public static void main(String[] args)
    {
        int a=2,b=3,c;
        c=a;
        a=b;
        b=c;
        System.out.println("using the third variable c," +" a="+a + " b:"+b);
        int d=4,e=5;
        d=d+e;
        e=d-e;
        d=d-e;
        System.out.println("'without using third variable"+" d=" + d + " e=" + e);
    }
}