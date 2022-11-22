import java.util.*;
class waterContainer
{	
	public static int maxArea(int[] ar)
	{
		int left=0,right=ar.length-1;
		int max=0,hight=0, diff;
		while(left<right)
		{
			diff=right-left;
			if(ar[left]<ar[right])
				hight=ar[left++];
			else
				hight=ar[right--];
			if(max<(diff*hight))
				max=diff*hight;
		}
		return max;
	}
	
	public static  void main(String args[])
	{
		int ar[]=inputArray();
		System.out.println(Arrays.toString(ar));
		int maxArea=maxArea(ar);
		System.out.println(maxArea);
	}
	
	public static int[] inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
		{
			int element=sc.nextInt();
			ar[i]=element;
		}
		return ar;
	}
}