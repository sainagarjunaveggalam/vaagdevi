

import  java.util.ArrayList;
public class wrapper
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
       // System.out.println(list.indexOf(1));
        System.out.println(list.remove(list.indexOf(1)));
        System.out.println(list);
       // list.add(1,8);
       // System.out.println(list);
       // list.clear();
      // System.out.println( list.contains(2));
        //System.out.println(list);
    }
}