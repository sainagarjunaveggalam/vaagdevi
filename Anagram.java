import java.util.*;
public class Anagram//length same and no of char exists in both string should same and same no of times
{
    public static void main(String[] args)
    {
        
    String str="TSILEE";
    String str1="LISTEE";
    
    char a[]=str.toCharArray();
    char b[]=str1.toCharArray();
    if(a.length!=b.length){
        System.out.println("no anagaram");
        return;
            }
    Arrays.sort(a);
    Arrays.sort(b);
    
    for(int i=0;i<a.length;i++)
    {
if(a[i]!=b[i])
{
System.out.println("no anagram");
return;
    }

    
}

    System.out.println("anagram");
}
}

