

import java.util.*;
public class Bubsor
{
    public static void main(String[] args)
    {
        int a[]={5,800,2,3,99};
        int temp=0;
        System.out.println("befor");
        for(int i=0;i<a.length;i++)
        {
         
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a.length-i-1;j++)
    {
        if(a[j]>a[j+1])
        {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
    
    }
    System.out.println("after");
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}}
    }