import java.util.*;


public class _2A_Staff {
	private String staffID, name;
	private float phno;
	private float sal;
	public static Scanner sc;
	
	public static void sc_initialise(){
		sc=new Scanner(System.in);
	}
	
	public void accept(){
		  System.out.println("Enter Staff id");
		  staffID =sc.next();
		  System.out.println("Enter Name");
		  name = sc.next();
		  System.out.println("Enter Phone Number");
		  phno = sc.nextFloat();
		  System.out.println("Enter Salary");
		  sal = sc.nextFloat();
	}
	public void display(){
		System.out.println("Staff id : "+staffID);  
		System.out.println("Name :"+name);
		System.out.println("Phone number :"+phno);
		System.out.println("Salary :"+sal); 
	}
}
class Teaching extends _2A_Staff{
	private String domain;
	private int publications;
	public void accept(){
		//System.out.println("Enter Teaching staff details");
		super.accept();
		System.out.println("Enter Domain");
		domain=sc.next();
		System.out.println("Enter Number of Publications");
		publications =sc.nextInt();
	
	}	
		
	public void display(){
		super.display();
		System.out.println("Domain :"+domain);
		System.out.println("Publications :"+publications);
		
	}
}
class Technical extends _2A_Staff{
	private String[] skills;
	public void accept()
	{
		//System.out.println("Enter Technical staff details");
		super.accept();
		System.out.println("Enter the Number of Skills");
		int n=sc.nextInt();
		skills=new String[n];
		System.out.println("Enter Skills");
		for(int i=0;i<n;i++)
			skills[i] = sc.next();
		
	}
	public void display()
	{
		super.display();
		System.out.println("Skills :");
		for(int i=0;i<skills.length;i++)
			System.out.println(skills[i]);
	}

}

class Contract extends _2A_Staff{
	private int period;
	
	public void accept(){
		super.accept();
		System.out.println("Enter Period");
		period=sc.nextInt();
	}
	
	public void display(){
		super.display();
		System.out.println("Period: "+ period);		
	}
}
class Main{
	public static void main(String[] args) {
		_2A_Staff.sc_initialise();
		Teaching teaching=new Teaching();
		Technical technical= new Technical();
		Contract contract=new Contract();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Enter Details for Teaching Staff Members");
		teaching.accept();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Enter Details for Technical Staff Members");
		technical.accept();
		System.out.println("-------------------------------------------------------------");

		System.out.println("Enter Details for Contract Staff Members");
		contract.accept();
		System.out.println("-------------------------------------------------------------");
		System.out.println(" -----Details for Teaching Staff Members are:-----");
		teaching.display();
		System.out.println("-------------------------------------------------------------");
		System.out.println(" -----Details for Technical Staff Members are:-----");
		technical.display();		
		System.out.println("-------------------------------------------------------------");
		System.out.println(" -----Details for Contract Staff Members are:-----");
		contract.display();
		System.out.println("-------------------------------------------------------------");
	}

}
