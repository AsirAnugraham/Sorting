package sorting;

public class SelectionSort {
	public static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int index = i ;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				
				}
			}
			int smallerNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
		}
	}
	public static void main(String a[]) {
		int[] arr1= {9,14,3,2,43,11,58,22};
		System.out.println("Before Selection Sort");
		for(int i:arr1) {
			System.out.println(i+"");
		}
		System.out.println();
		selection(arr1);
		System.out.println("after selcetion sort");
		for(int i:arr1) {
			System.out.println(i+"");
			
		}
	}

}



