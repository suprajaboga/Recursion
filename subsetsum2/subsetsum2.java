//Given an integer array nums that may contain duplicates, return all possible subsets.
//The solution set must not contain duplicate subsets. Return the solution in any order.

package subsetsum2;

import java.util.*;

public class subsetsum2 
{
    public static void findSubsets(int index,int[] arr,List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++)
        {
            if(i!=index&&arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            findSubsets(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
	public static void main(String[] args)
	{
		int arr[]={2,2,1,2,3,3};
		int index=0;
		Arrays.sort(arr);
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findSubsets(index,arr,ans,ds);
		System.out.println(ans);
	}

}
