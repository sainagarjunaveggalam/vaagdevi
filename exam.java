import java.util.*;
public class exam


{
public static void main(String args[])
{
   /* String str="SaiNagarjuna";
    char c='a';
    int cot=0;
    for(int i=0;i<str.length();i++)
    {
if(str.charAt(i)==c)
{
    cot+=1;
}
    }
System.out.println(cot);
}
}*/
int a[]={1,2,3,6,8};
String cou="";
for(int i=0;i<a.length;i++)
{
    if(a[i]%2==0)
    {
        cou+="even";
    }
    else{
    cou+="odd";
    }
}
System.out.println(cou);
}
}