//Method2
//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)

package javaassignment;
import java.util.Scanner;
public class FibonnacciSeries2 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	
	int arr[]=new int[9];
	arr[0]=0;
	arr[1]=1;
	
	System.out.print(arr[0]+" "+arr[1]);
	for(int i=2;i<9;i++)
	{
		arr[i]=arr[i-1]+arr[i-2];
		System.out.print(" "+arr[i]);
	}

}

}



