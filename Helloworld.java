import java.util.*;
class Helloworld {
    public static void main(String[] args) {
    
    int a[]={2,11,7,15};
   a[0]=2;
   int tar=9;
  int temp=0;
for(int i=1;i<a.length;i++)
{
    temp=a[0]+a[i];
   if(temp==tar)
   {
    System.out.println(temp);
    return;
   
   }

}
   System.out.println(temp); 


    }
}
