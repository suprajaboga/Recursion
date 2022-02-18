//Approach2, it doesn't require extra space, so space complexity is less compared with approach1

package printallpermutations2;

import java.util.ArrayList;
import java.util.List;

public class printallpermutations2 
{
	public static void findPermutations(int index,int arr[],List<List<Integer>> ans)
	{
		if(index==arr.length)
		{
			//copy the ds to ans
			List<Integer> ds=new ArrayList<>();
			for(int i=0;i<arr.length;i++)
				ds.add(arr[i]);
			System.out.println(ds);
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=index;i<arr.length;i++)
		{
			swap(i,index,arr);
			for(int k=0;k<arr.length;k++)
				System.out.print(arr[k]+" ");
			
			findPermutations(index+1,arr,ans);
			
			System.out.println();
			
			swap(i,index,arr);
			for(int k=0;k<arr.length;k++)
				System.out.print(arr[k]+" ");
			
			System.out.println();
			System.out.print(i+" "+index);
			System.out.println();
		}
	}
	public static void swap(int i,int j,int arr[])
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

	public static void main(String[] args)
	{
		int arr[]= {1,2,3};
		int n=arr.length;
		int index=0;
		List<List<Integer>> ans=new ArrayList<>();
		findPermutations(index,arr,ans);
		System.out.println(ans);
	}

}
