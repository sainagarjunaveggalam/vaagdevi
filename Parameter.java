import java.util.*;
public class Parameter
{
    static void staticMethod(int val)
//parameter is like info which considered to be a variable iside the method here val is parameter 
{
    if(val%2==0)
    {
        System.out.println("val is even");

    }
    else
    {
        System.out.println("val is odd");

    }
}
public void instanceMethod(String str)
{
    if(str=="Nag")
{
    System.out.println("both are same");
}
else{
    System.out.println("both are not same");
}
}

    public static void main(String[] args)
    {
        Parameter.staticMethod(5);
        Parameter object=new Parameter();
       object.instanceMethod("Nag");
    }
}
