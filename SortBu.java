import java.util.*;
public class SortBu

{
    public static void main(String[] args)
    {

        int[] a={2,4,1,5,3,13,23};
        
        for(int num:a)
        {
            System.out.print(num+" ");
        }
         for(int i=0;i<a.length;i++)


{
    for(int j=0;j<a.length-1;j++)
    {
        if(a[j]>a[j+1])
        {
           int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
}
System.out.println();
    for(int num:a){
    System.out.print(num+" ");
}   }
    }
    
