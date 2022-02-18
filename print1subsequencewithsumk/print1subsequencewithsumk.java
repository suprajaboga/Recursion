//print only 1 subsequence with sum k by returning true/false and avoid further recursion calls if you get true

package print1subsequencewithsumk;

import java.util.ArrayList;

public class print1subsequencewithsumk
{
	public static boolean print(int index,int s,int sum,int arr[],ArrayList<Integer> path)
	{
		if(index==arr.length)
		{
			if(s==sum)
			{
			    System.out.println(path);
			    return true;
			}
			return false;
		}
		path.add(arr[index]);
		s=s+arr[index];
		if(print(index+1,s,sum,arr,path)==true)
			return true;
		s=s-arr[index];
		path.remove((Integer)arr[index]);     
		if(print(index+1,s,sum,arr,path)==true)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,1};
		int index=0;
		int sum=2;
		ArrayList<Integer> path=new ArrayList<>();
		boolean res=print(index,0,sum,arr,path);
	}
}
