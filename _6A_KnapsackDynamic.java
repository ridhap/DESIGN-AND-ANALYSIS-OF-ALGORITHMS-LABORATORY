
import java.util.*;
public class _6A_KnapsackDynamic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items:");
		int items = sc.nextInt();
		System.out.println("Enter maximum capacity of the Knapsack:");
		int capacity = sc.nextInt();
		System.out.println("Enter the weights of items:");
		int[] weight = new int[items+1];
		for(int i=1; i<=items; i++)
		weight[i] = sc.nextInt();
		System.out.println("Enter the values of items:");
		int[] value = new int[items+1];
		for(int i=1; i<=items; i++)
		value[i] = sc.nextInt();
		knapsack(items, capacity, weight, value);
	}
	public static void knapsack(int items, int capacity, int[] weight, int[] value)
	{
		Scanner sc = new Scanner(System.in);
		int[][] soln_matrix = new int[items+1][capacity+1];
		for(int i=0; i<=items; i++)
		for(int j=0; j<=capacity; j++)
		{
			if(i==0 || j==0)
				soln_matrix[i][j] = 0;
		}
		for(int i=1; i<=items; i++)
			for(int j=1; j<=capacity; j++)
			{
				if( weight[i] > j)
					soln_matrix[i][j] = soln_matrix[i-1][j];
				else
					soln_matrix[i][j] = maximum( soln_matrix[i-1][j] , (value[i] + soln_matrix[i-1][j-weight[i]]));
			}
		profit_table( items, capacity, soln_matrix);
		selected_items( items, capacity, soln_matrix, weight);
		System.out.println("Maximum value that can be put in knapsack of capacity "+capacity+" is:"+soln_matrix[items][capacity]);
	}
	public static int maximum( int a, int b)
	{
		return (a>b)?a:b;
	}
	public static void profit_table(int items, int capacity, int[][] soln_matrix)
	{
		System.out.println("Product table:");
		for(int i=0; i<=items; i++)
		{
			for(int j=0; j<=capacity; j++)
				System.out.print(soln_matrix[i][j]+"\t");
			System.out.println();
		}
	}
	public static void selected_items(int items, int capacity, int[][] soln_matrix, int[] weight)
	{
		System.out.println("Selected items:");
		while(items>0 && capacity>0)
		{
			if(soln_matrix[items][capacity] != soln_matrix[items-1][capacity])
			{
				System.out.println(items);
				capacity -= weight[items];
				items -= 1;
			}
			else
				items -= 1;
		}
	}
}