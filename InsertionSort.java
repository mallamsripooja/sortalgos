/*
Implementation of insertion sort in Java
Space complexity = O(1)
Time complexity = O(n*n)
*/
public class InsertionSort
{

	private static int[] sort(int[] arr){

		for (int i=1;i<arr.length ;i++ )
		{
			int key = arr[i];
			int j=i-1;

			while (j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j-=1;
			}

			arr[j+1]=key;
		}

		return arr;
	}

	public static void main(String[] args){
		int arr[] = {11,56,77,100,2,4,1,10,19,4,74};

		for (int x : sort(arr) )
		{
			System.out.print(x+" ");
		}
	}
}