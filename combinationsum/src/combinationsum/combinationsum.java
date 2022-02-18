//Each element can be considered multiple times to sum up to a given target(pick & not pick method)

package combinationsum;
import java.util.*;

public class combinationsum 
{
    public static void findCombinations(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds)
    {
    	if(index==arr.length)
    	{
    		if(target==0)
    		    ans.add(new ArrayList(ds));
    		return;
    	}
    	if(arr[index]<=target)
    	{
    		ds.add(arr[index]);
    		findCombinations(index,arr,target-arr[index],ans,ds);
    		ds.remove(ds.size()-1);
    	}
    	findCombinations(index+1,arr,target,ans,ds);
    }
	public static void main(String[] args)
	{
		int arr[]={2,3,6,7};
		int index=0;
		int target=7;
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ds=new ArrayList<>();
		findCombinations(index,arr,target,ans,ds);
		System.out.println(ans);
	}

}
