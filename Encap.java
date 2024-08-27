import java.util.*;
public class Encap
{
    private int Id;
    private String name;
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getId()
    {
        return Id;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args)
    {
Encap gh=new Encap();
gh.setId(501);
gh.setName("SaiNagarjuna");
//System.out.println(a+" "+b);/
int a=gh.getId();
String b=gh.getName();
System.out.println(a+" "+b);
    }
}