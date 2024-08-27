import java.util.*;
public class SelectionSort
{
public static void main(String[] args)
{
   int a[]={2,5,1,3,8};
   for(int i=0;i<a.length-1;i++)
   {
   int smallest=i;
    for(int j=i+1;j<a.length;j++)
    {
        if(a[smallest]>a[j])
        {
            smallest=j;
        }
    }
    int temp=a[smallest];
    a[smallest]=a[i];
    a[i]=temp;
   }
   for(int num:a)
   {
    System.out.println(num);
   }

}

}