import java.util.*;
class customer
{
    private String name, dob;
    public void read()
    {
        Scanner inscan = new Scanner(System.in);
        System.out.println("Name:");
        name= inscan.next();
        System.out.println("DOB:");
        dob = inscan.next();
    }
    public void display()
    {
        System.out.println("Name: "+name);
        StringTokenizer st = new StringTokenizer(dob, "/");
        System.out.println("DOB: ");
        for(int i = 0; i<=st.countTokens()+1; i++)
        {
            System.out.println(st.nextToken());
        }
    }
}
class Customer_2b
{
    public static void main(String[] args)
    {
        customer x = new customer();
        x.read();
        x.display();
    }
}
