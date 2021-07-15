package com.test.ds.demo;

public class SoringArray {
	 public static void main(String[] args) {  
         int arr[] ={3,60,35,2,45,320,5};  
          
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubbleSort(arr);//sorting array elements using bubble sort  
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  

 }  

	public static void bubbleSort(int[] arr) {
		//int arr[]= {100,200,1030,40,50};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
					
				{
					temp=arr[i];  //100
					arr[i]=arr[j]; //100 200
					arr[j]=temp;
				}
					
			}
		
		}
		
	}

}
