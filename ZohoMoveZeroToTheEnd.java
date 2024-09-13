import java.util.Arrays;

public class ZohoMoveZeroToTheEnd 
{
 public static void main(String []args) 
 {
	 int []arr= {9,2,0,4,3,0,2,0};
	 for(int i=0;i<arr.length;i++)
	 {
		  for(int j=0;j<arr.length-1;j++)
		  {
	          if(arr[j]==0)
	          {
	             arr[j]=arr[j+1];
	             arr[j+1]=0;
	          }

		  }
	 }
	 System.out.println(Arrays.toString(arr));
 }
}
  
