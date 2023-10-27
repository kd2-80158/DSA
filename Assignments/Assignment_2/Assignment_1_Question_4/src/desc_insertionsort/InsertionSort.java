package desc_insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void descInsertionSort(int arr[],int size)
	{
		for(int i=1;i<size;i++)
		{
			int temp=arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]<temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		
	int arr[] = {23,45,12,56,32,22};
	
	System.out.println("Array before sort: "+Arrays.toString(arr));
	
	descInsertionSort(arr,arr.length);
	
	System.out.println("Array after sort: "+Arrays.toString(arr));
	

	}

}
