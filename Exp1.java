package JLab;
import java.util.Scanner;
 class palindrome {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String str=sc.nextLine();
		 int flag=0;
		 int i=0;
		 int len= str.length();
		 for(i=0;i<len/2;i++) {
			 if(str.charAt(i)!=str.charAt(len-i-1)) {
				 flag=1;
				 break;
				
			 }
		 }
		 if (flag== 0) {
			 System.out.println("palindrome");
		 }
		 else
			 System.out.println("NOT Palindrome");
		 }
	}
		 
	
