import java.util.*;
public class MethodOverloading//will be having same mathod name but differ no of parametes/variables and even for same no of parameter different type exist
{
    static int sameMethod(int x,int y)//
    {
        return x+y;
    }
    static double sameMethod(double x,double y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
       int value1= sameMethod(2,3);//int can be conveted to float/double when we keep float in place of int
       double value2=sameMethod(2.3,3.2);//double cannot be converted into int
        System.out.println(value1);
        System.out.println(value2);
    }
}