import java.util.*;
public class Parameter1
{
    static void staticMethod(int val)

{
    if(val%2==0)
    {
        System.out.println("val is even");

    }
    else
    {
        System.out.println("val is odd");

    }
    public static void main(String[] args)
    {
        staticMethod(5);
    }
}
}