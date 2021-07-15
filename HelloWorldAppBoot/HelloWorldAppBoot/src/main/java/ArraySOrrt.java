
public class ArraySOrrt {
public static void main(String[] args) {
	int arr[]={10,1,60,4,5100,500,20,40};
	
	

	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		}
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]);
	}
}
}
