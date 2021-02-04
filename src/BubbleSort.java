import java.util.Scanner;

public class BubbleSort {
	
	void bubble_sort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void display(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSort ob=new BubbleSort();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int arr[];
		arr=new int[n];
		int num;
		
		System.out.println("Enter the numbers");
		for(int i=0; i<n; i++)
		{
			num=sc.nextInt();
			arr[i]=num;
		}
		
		ob.bubble_sort(arr);
		
		System.out.println("The sorted array after bubble sort is: ");
		ob.display(arr);
	}

}
