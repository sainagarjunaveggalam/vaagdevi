import java.util.ArrayList;

public class ArrayLists{

    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();//ArrayList is a inbuilt 
        list.add(2);//adds ele
        list.add(4);
        
        System.out.println(list.get(1)); //get with index
        list.add(6);
        System.out.println(list);
        list.add(2,8);//add adds ele at specified index
        System.out.println(list);
        list.set(3,10);
        System.out.println(list);//set replaces value wit other at index 
        int sizing=list.size();
        System.out.println(sizing);
        list.remove(2);
        System.out.println(list);
        for(int i=0;i<list.size();i++)

        {
            System.out.print(list.get(i)+" ");
    }

}}