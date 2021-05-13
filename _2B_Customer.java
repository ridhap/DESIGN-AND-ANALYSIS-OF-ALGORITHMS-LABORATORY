import java.util.*;
public class _2B_Customer {
		private String nm,dob;
		protected static Scanner sc = new Scanner(System.in);

		public void accept()
		{
			System.out.println("Enter name");
			nm = sc.next();
			System.out.println("Enter DOB(dd/mm/yyyy)");
			dob=sc.next();
		}
		public void display()
		{
			System.out.print("<"+nm+",");
			StringTokenizer s = new StringTokenizer(dob,"/");
			 
			int cnt=0;
			while(s.hasMoreTokens())
			{
				
			  System.out.print(s.nextToken());
			  cnt++;
			   if (cnt<3)
				    System.out.print(",");
			}
			
			System.out.println(">");
		}
	}
	class test
	{
		public static void main(String [] args)
		{
			_2B_Customer c = new _2B_Customer();
			c.accept();
			c.display();
		}
	}
