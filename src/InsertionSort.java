import java.util.Scanner;

public class InsertionSort {
	
	void insertion_sort(int arr[])
	{
		int n=arr.length;
		for(int i=1; i<n; i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void display(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		InsertionSort ob=new InsertionSort();
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
		
		ob.insertion_sort(arr);
		
		System.out.println("The sorted array after bubble sort is: ");
		ob.display(arr);

	}

}
