import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        String str="SaiNagarjunaV";
        StringBuilder obj=new StringBuilder(str);//stringbuillder is a class which includes reverse method
        obj.reverse();//reverse method used to reverse string
        
        System.out.println(obj);
    }
}