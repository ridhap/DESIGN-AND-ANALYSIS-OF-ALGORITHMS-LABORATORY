import java.util.Scanner;
public class _3A_Exceptions {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a");
		a = sc.nextInt();
		System.out.println("Enter value for b");
		b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is generated "+ e);
		}
		sc.close();
	}
}