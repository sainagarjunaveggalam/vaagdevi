import java.util.*;
public class Static
{
    static void staticMethod()
    {
        
        System.out.println("static keyword define that method belongs to class instead instance ,can be called directly ");
    }
    public void instanceMethod()
    {
       System.out.println("instance defines that method belong to instance of class and can be acceses by creating object");
    }

    public static void main(String[] args)
    {
       staticMethod();
      Static obj=new Static();
       obj.instanceMethod();
    }
}