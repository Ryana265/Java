package JLab;
import java.util.Scanner;

public class freq {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	System.out.println("Enter the character");
	char ch= sc.nextLine().charAt(0);
	int count=0;
	int i=0;
	for(i=0;i<str.length();i++) {
		if(str.charAt(i)==ch) {
			count++;
		}
	}
	System.out.println("count of occurence of"+ch+"="+count);
}
}
