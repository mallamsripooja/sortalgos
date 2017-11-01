/*
Implementation of bubble sort algorithm in Java
Space complexity = O(1)
Time complexity = O(n*n)
*/
public class BubbleSort{

	private static int[] sort(int arr[]){
		for (int i=0;i<arr.length-1 ;i++ )
		{
			for (int j=0;j<arr.length-i-1;j++ )
			{
				if (arr[j+1]<arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[]  args){
		int arr[] = {62,37,4,1,56,77,100,12,39,4};

		for (int x : sort(arr) )
		{
			System.out.print(x+" ");
		}
	}
}
