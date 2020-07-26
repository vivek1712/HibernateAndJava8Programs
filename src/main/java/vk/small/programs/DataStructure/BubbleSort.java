package vk.small.programs.DataStructure;

public class BubbleSort {
public static void main(String arg[]){
	int arr[]={2,1,-5,0,8,3,3};
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			int temp;
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int k=0;k<arr.length;k++){
		System.out.println("After Sort  : "+arr[k]);
	}
}
}
