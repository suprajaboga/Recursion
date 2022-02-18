//find all the subsets of an array, find the sum of each subset, and sort the sums obtained from each subset

package subsetsum;
import java.util.*;

public class subsetsum 
{
	public static void print(int index,int sum,ArrayList<Integer> ds,int arr[])
	{
		if(index==arr.length)
		{
			ds.add(sum);
		    return;
		}
		
		//pick the element
		print(index+1,sum+arr[index],ds,arr);
		
		//don't pick the element
		print(index+1,sum,ds,arr);
	}

	public static void main(String[] args)
	{
		int arr[]= {3,1,2};
		int index=0,sum=0;
		ArrayList<Integer> ds=new ArrayList<>();
		print(index,sum,ds,arr);
		Collections.sort(ds);
		System.out.println(ds);
	}

}
