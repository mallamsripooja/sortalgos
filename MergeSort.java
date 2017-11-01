/*
Implementation of merge sort algorithm in Java
Space complexity = O(n)
Time complexity = O(nlogn)
*/
public class MergeSort
{

	private static void merge(int arr[], int l, int m, int r){
		int n1 = m-l+1;
		int n2 = r-m;

		int leftarr[] = new int[n1];
		int rightarr[] = new int[n2];

		// Copying left sub arr to leftarr
		for (int i=0;i<n1 ;i++ )
		{
			leftarr[i]=arr[l+i];
		}

		// Copying right sub arr to rightarr
		for (int i=0;i<n2 ;i++ )
		{
			rightarr[i]=arr[m+i+1];
		}

		int i=0,j=0;
		int k=l;

		// Merge leftarr and rightarr
		while (i<n1 && j<n2)
		{
			if (leftarr[i]<=rightarr[j])
			{
				arr[k++] = leftarr[i++];
			}
			else
			{
				arr[k++] = rightarr[j++];
			}
		}

		// Copy remaining numbers
		while (i<n1)
		{
			arr[k++] = leftarr[i++];
		}

		while (j<n2)
		{
			arr[k++] = rightarr[j++];
		}
	}

	private static void sort(int[] arr, int l, int r){
		int m=0;
		if (l<r)
		{
			m = l+(r-l)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);

			merge(arr,l,m,r);
		}
	}

	public static void main(String[] args){
		int arr[] = {11,21,34,5,67,88,21,10,103,71,63};
		sort(arr,0,arr.length-1) ;

		for (int x : arr)
		{
			System.out.print(x+" ");
		}
	}
}