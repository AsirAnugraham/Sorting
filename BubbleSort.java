package sorting;

public class BubbleSort 
{
	static void main(int[] arr) {
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {4,33,56,6,54,87,9,22};
		
		System.out.println("Array Before Bubble Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
			
		}
		System.out.println();
		main(arr);
		System.out.println("Array After Bubble Sort");
		for(int i=0;i<arr.length;i++);{
	}
		
	}

}
