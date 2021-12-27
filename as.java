package aa;
import java.util.Scanner;
public class as 
{
	public static void main(String[] args)
{	
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		 if (n > 32767) 
		 {
		      System.out.println("number too large");
          }
		 else if (n < 0)
		 {
		      System.out.println("number too small");
         }
		 else if(n==0) 
		 {
		      System.out.println("if the coupen does not exist");
         }
		// else if(n > 20000) 
		// {
	    //      System.out.println(n*17/100+1500);
	   //  }
	   // else if(n > 15000)
	  //   {
	 //     System.out.println(n*15/100+1200);
        // }
		// else if(n > 10000) 
		// {
		//      System.out.println(n*12/100+1000);
        // }
		// else if(n<10000)
		// {
	    //  System.out.println(n*8/100+500);
        // }
		 else
		 {
			 String temp=String.valueOf(n);
			 String[]temp1=temp.split("");
			 String val="";
			 for(String i:temp1)
			 {
				 if(Integer.valueOf(i)%2==0)
				 {
					 val+=i;
				 }
			 }
			 System.out.println(val);
		 }
}
		 
}
