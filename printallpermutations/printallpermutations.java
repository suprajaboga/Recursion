//Approach 1, it requires more space as we are using a map to mark the element as visited or not. Here map means the boolean array,initially values are false

package printallpermutations;
import java.util.*;

public class printallpermutations 
{
	public static void findPermutations(int arr[],List<Integer> ds,List<List<Integer>> ans,boolean freq[])
	{
		if(ds.size()==arr.length)
		{
			ans.add(new ArrayList<>(ds));
		}
		for(int i=0;i<arr.length;i++)
		{
			if(!freq[i])
			{
				freq[i]=true;
				ds.add(arr[i]);
				findPermutations(arr,ds,ans,freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
		}
	}

	public static void main(String[] args)
	{
		int arr[]= {1,2,3};
		int n=arr.length;
		boolean freq[]=new boolean[n];
		List<Integer> ds=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		findPermutations(arr,ds,ans,freq);
		System.out.println(ans);
	}

}
