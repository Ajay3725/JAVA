import java.util.Scanner;
public class Arraylargestnum
{	
	public static void main(String[] args)
	{
	Scanner ajay=new Scanner(System.in);
	System.out.print("enter the limit number");
	int n=ajay.nextInt();
	
	int arr[]=new int[n];
		for(int i=0;i<n;i++)
	{
		arr[i]=ajay.nextInt();
	}
	int large =arr[0];
	for(int i=1;i<n;i++)
	{
		if(arr[i]>large)
		{
		large=arr[i];
	}}
	System.out.println("Largest Number:"+large);
}

}