package vk.small.programs.DataStructure;

public class SelectionSort {
	// select first index traverse all from next index then find minimum value index then swap
public static void main(String arg[]){
	//int[] arr={5,4,3,2,1};
	//int[] arr={5,-4,3,2,1};
	int[] arr={5,4,1,0,2,-8,-9,3};
	for(int i=0;i<arr.length;i++){
		//System.out.println(arr[i]);
		int smallIndex=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[smallIndex]>arr[j]){
				smallIndex=j;
			}
		}
		int smallNumber=arr[smallIndex];
		arr[smallIndex]=arr[i];
		arr[i]=smallNumber;
		/*for(int k=0;k<arr.length;k++){
			System.out.println("iteration  : " + i+"  value  :"+arr[k]);
		}*/
	}
	
	for(int k=0;k<arr.length;k++){
		System.out.println("After sort  : " + arr[k]);
	}
	
}
}
