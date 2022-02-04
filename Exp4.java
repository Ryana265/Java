package JLab;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,breadth;
		float base,height,radius;
		System.out.print("Input the base length of the triangle: ");
		base = sc.nextFloat();
		System.out.print("Input the height of the triangle: ");
		height = sc.nextFloat();
		System.out.println("Area of triangle = "+(area(base,height)));
		System.out.print("Input the length of the rectangle: ");
		length = sc.nextInt();
		System.out.print("Input the breadth of the rectangle: ");
		breadth = sc.nextInt();
		System.out.println("Area of the rectangle = "+(area(length, breadth)));
		System.out.print("Input the radius of the circle: ");
		radius = sc.nextFloat();
		System.out.println("Area of the circle = "+(area(radius)));
		sc.close();
	}
