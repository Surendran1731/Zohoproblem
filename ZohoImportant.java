import java.util.Scanner;

public class ZohoImportant 
{
  public static void main(String [] args) 
  {
   Scanner sc=new Scanner(System.in);
   while(true) //custom check
   {
   System.out.println("Enter the number");
   int num=sc.nextInt();
     for(int i=1;i<=num*2;i++) 
        {
    	 for(int j=1;j<=num;j++) 
    		{
    		  if(i>=num+j) 
    		    {
    			 System.out.print("   ");
    			}
    		  else if(i>=j)
    				{
    					System.out.print(j+"  ");
    				}
    		  else  {
    					System.out.print("   ");
    				}
    		 }
    	 System.out.println();
    	}
      }	
    }
}
