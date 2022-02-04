package JLab;
import java.util.*;
public class matrix_multiplication
{
    public static void main(String[] args)
    {
        int m1,m2,n1,n2,sum=0,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:\n");
        m1=sc.nextInt();
        System.out.print("Enter the number of columns in the first matrix:\n");
        n1=sc.nextInt();
        int matrix1[][]=new int[m1][n1];
        System.out.print("Enter the elements\n");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            matrix1[i][j]=sc.nextInt();
        }
        System.out.print("Enter the number of rows in the second matrix:\n");
        m2=sc.nextInt();
        System.out.print("Enter the number of columns in the second matrix:\n");
        n2=sc.nextInt();
        
        int matrix2[][]=new int[m2][n2];
        if(m2==n1)
        {
        System.out.print("Enter the elements\n");
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            matrix2[i][j]=sc.nextInt();
        }
        System.out.print("The first matrix is:\n");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            System.out.print(matrix1[i][j]+"\t");
            System.out.print("\n");
        }
        System.out.print("The second matrix is:\n");
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            System.out.print(matrix2[i][j]+"\t");
            System.out.print("\n");
        }
        }
        if(n1!=m2)
        {
        System.out.print("Matrix Multiplication is not possible");
        }
         else
         {
             int product[][]=new int[m1][n2];
             for(i=0;i<m1;i++)
             {
                 for(j=0;j<n2;j++)
                 {
                     for(k=0;k<m2;k++)
                     sum=sum+matrix1[i][k]*matrix2[k][j];
                     product[i][j]=sum;
                     sum=0;
                 }
             }
             System.out.print("The product matrix is:\n");
             for(i=0;i<m1;i++)
             {
                 for(j=0;j<n2;j++)
                 System.out.print(product[i][j]+"\t");
                 System.out.print("\n");
             }
             
         }
        
        
        
    }
}
