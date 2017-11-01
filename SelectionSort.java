/*
Selection sort algorithm implementation in Java
Space complexity = O(1)
Time complexity = O(n*n)
*/
public class SelectionSort
{

	private static int[] sort(int arr[]){

		for (int i=0;i<arr.length-1 ;i++ )
		{
			int ind = i;
			for (int j=i+1;j<arr.length ;j++ )
			{
				//Finding minimum element
				if (arr[j]<arr[ind])
				{
					ind=j;
				}
			}

			//Swap the elements
			int temp = arr[ind];
			arr[ind] = arr[i];
			arr[i] = temp;
		}

		return arr;
	}

	public static void main(String args[]){
		int arr[] = {24,7,54,33,10,37,62,10,44,29};
		
		for (int x : sort(arr)){
			System.out.print(x+" ");
		}
	}
}
