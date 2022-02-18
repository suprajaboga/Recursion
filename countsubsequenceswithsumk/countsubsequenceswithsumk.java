package countsubsequenceswithsumk;

import java.util.ArrayList;

public class countsubsequenceswithsumk 
{
	public static int print(int index,int s,int sum,int arr[])
	{
		if(index==arr.length)
		{
			if(s==sum)
			    return 1;
			else
				return 0;
		}
		s=s+arr[index];
		int l=print(index+1,s,sum,arr);
		s=s-arr[index];  
		int r=print(index+1,s,sum,arr);
		return l+r;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,1,4,-2};
		int index=0;
		int sum=2;
		System.out.println(print(index,0,sum,arr));
	}
}
