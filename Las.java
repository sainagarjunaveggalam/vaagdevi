import java.util.*;
public class Las
{
public static void main(String[] args)
{
    int a[]={2,3,10,4,1};
int min=a[0];
int max=a[0];
//int max=a[0];
for( int i=0;i<a.length;i++){
if(a[i]<=min)
min=a[i];
if(a[i]>=max)
max=a[i];
}

System.out.println(min);
System.out.println(max);
}
}