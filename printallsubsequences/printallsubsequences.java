//Print all subsequences in contiguous and non-contiguous way

package printallsubsequences;
import java.util.*;

public class printallsubsequences 
{
	public static void print(int index,int arr[],ArrayList<Integer> path)
	{
		if(index==arr.length)
		{
			System.out.println(path);
			return;
		}
		path.add(arr[index]);
		print(index+1,arr,path);
		path.remove((Integer)arr[index]);    //Arraylist.remove() removes the ele by index and by object...so, cast it to Integer obj as it throws an error when doing with index
		print(index+1,arr,path);
	}
	public static void main(String[] args) 
	{
		int arr[]= {3,1,2};
		int index=0;
		ArrayList<Integer> path=new ArrayList<>();
		print(index,arr,path);
	}

}
