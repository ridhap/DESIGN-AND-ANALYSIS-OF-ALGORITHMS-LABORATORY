import java.util.Scanner;
class _1A_Student {
	private String usn, name, branch, ph;
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Usn\n");
		usn = scanner.next();
		System.out.println("Enter Name\n");
		name = scanner.next();
		System.out.println("Enter Branch\n");
		branch = scanner.next();
		System.out.println("Enter Phone\n");
		ph = scanner.next();
		
		
}
	public void display() {
		System.out.println("Student details of student");
		System.out.println("Usn: " + usn);
		System.out.println("Name: " + name);
		System.out.println("Branch: " + branch);
		System.out.println("Phone: " + ph);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n");
		int n = sc.nextInt();
		_1A_Student[] ob1 = new _1A_Student[n];
		for (int i = 0; i < n; i++)
		{
			ob1[i] = new _1A_Student();
			ob1[i].accept();
		}
		for (int i = 0; i < n; i++)
		{
			ob1[i].display();
		}
		
		
		sc.close();
	}
}


