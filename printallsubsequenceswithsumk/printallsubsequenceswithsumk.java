package printallsubsequenceswithsumk;

import java.util.ArrayList;

public class printallsubsequenceswithsumk 
{
	public static void print(int index,int s,int sum,int arr[],ArrayList<Integer> path)
	{
		if(index==arr.length)
		{
			if(s==sum)
			    System.out.println(path);
			return;
		}
		path.add(arr[index]);
		s=s+arr[index];
		print(index+1,s,sum,arr,path);
		s=s-arr[index];
		path.remove((Integer)arr[index]);     
		print(index+1,s,sum,arr,path);
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,1};
		int index=0;
		int sum=2;
		ArrayList<Integer> path=new ArrayList<>();
		print(index,0,sum,arr,path);
	}
}
