package JLab;
import java.util.Scanner;
public class matrix_multiplication {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner ob = new Scanner (System.in);
System.out.println("Enter the no of rows of 1st matrix : ");
int m = ob.nextInt();
System.out.println("Enter the no of columns of 1st matrix : ");
int n = ob.nextInt();
System.out.println("Enter the no of rows of 2nd matrix : ");
int p = ob.nextInt();
System.out.println("Enter the no of columns of 2nd matrix : ");
int q = ob.nextInt();
int m1[][]= new int[m][n];
int m2[][]= new int [p][q];
int multi[][]= new int [m][q];
if (n!=p)
{
System.out.println("Matrix Multiplication not possible.");
}
else
{
System.out.println("Enter the elements of 1st matrix:");

for(int i=0;i<m;i++)
{
for (int j=0;j<n;j++)
{
m1[i][j]=ob.nextInt();
}
}
System.out.println("Enter the elements of 2nd matrix:");

for(int i=0;i<p;i++)
{
for (int j=0;j<q;j++)
{
m2[i][j]=ob.nextInt();
}
}
System.out.println("The resultant matrix is:");

for(int i=0;i<m;i++)
{
for (int j=0;j<q;j++)
{
multi[i][j]=0;
  for (int k=0;k<n;k++)
  {
  multi[i][j]+=m1[i][k]*m2[k][j];
  }
}
}

for(int i=0;i<m;i++)
{
for (int j=0;j<q;j++)
{
System.out.print(multi[i][j]+"\t");
}System.out.println("\n");
   }



}
ob.close();
}
}
