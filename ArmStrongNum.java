package com.jsp.Numberpack;

import java.util.Scanner;

class ArmStrong
{
	

	public void getArmstrong(int num,int m) 
	{ 
		
	
		int sum=0;
		int n=num;
	//	int n;
	//	int r;
		 int l=0;
//		 
//		   for(int i=num;i<=m;i++)
//			{
//			   n=i;
//			   
//	        	while(i>0)
//	    		 {
//	    			 r= i%10;
//	    			 System.out.println(r);
//	    			i/=10;
//	    			l++;
//	    			 
//	    		 }
//	        	 System.out.println(i);
//				int d=(i%10);
////				System.out.println(d);
//				int product=1;
//				for(int j=1;j<=l;j++) 
//				{
//					product=product*d;
//					
//				}
////				System.out.println(d);
//				sum+=product;
////				System.out.println(sum);
//				if(sum==n)
//				System.out.println(n);
//				
//				i/=10;
//			}
	        
	         

		
//		
			
         for(int i=1;i<=num;i++)
		{
        	
        	 while(num>0)
    		 {
    			int r= num%10;
    			num/=10;
   			l++;
    			 
    		 }
        	 System.out.println(num);
			int d=(num%10);
//			System.out.println(d);
			int product=1;
			for(int j=1;j<=l;i++) 
			{
				product=product*d;
			}
//			System.out.println(d);
			sum+=product;
//			System.out.println(sum);
			num/=10;
		}
        
      //  System.out.println(sum);
         if(sum==num) {System.out.println("it is a Armstrong Number");
         } else { System.out.println("it is not a Armstrong Number");
         }
         
        
        
		}
}

public class ArmStrongNum 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int n=scn.nextInt();
		int m=scn.nextInt();
		
	ArmStrong armstrong = new ArmStrong();
	armstrong.getArmstrong(n,m);
	
	
	
//	  for(int i=n;i<=m;i++)
//	  {
//		  int A=armstrong.getArmstrong(n);
//		  System.out.println(A);
//	  }
//	
		 
	
	}

}
