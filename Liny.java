import java.util.*;
public class Liny
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
       int left=0;
       int right=a.length-1;
       int target=3;
       int i=(left+right)/2;
        if(a[i]==target)
        {
         System.out.println(i);
        }
        for(i=2;i<target;i++)
        {

        
        if(a[i]<target)
        {
           left=i+1;
        
        if(a[left]==target)
        {
         System.out.println(left);
        }
    }
}       
right=i-1;
if(a[right]==target)
        {
         System.out.println(right);
        }
    }
}    
    
    
    

