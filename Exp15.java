package JLab;
import java.util.StringTokenizer;  
import java.util.Scanner;
public class Exp15
{  
	public static void main(String args[])
	{  
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integers:");
		String str=sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");  
	    while (st.hasMoreTokens()) //checksmoretokens.
	    {  
	    	int temp =Integer.parseInt(st.nextToken());  
	        System.out.println(temp);  
	        sum=sum+temp;
	    }  
	    System.out.println("\nSum="+sum);
	    sc.close();
	}  
}
