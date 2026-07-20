import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	{
    int i,j;
    int[][] a = new int [2][2];
    int[][] b = new int [2][2];
    int[][] c = new int [2][2];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 4 Elements for a :");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            a[i][j]=scanner.nextInt();
        }
    }
    System.out.println("The array is :\n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }
     System.out.println("Enter 4 Elements for b:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            b[i][j]=scanner.nextInt();
        }
    }
    System.out.println("The array is :");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.print(" "+b[i][j]);
        }
        System.out.println();
    }
    
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            c[i][j]=a[i][j] + b[i][j];
        }
    }
    System.out.println("The addition is :");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.print(" "+c[i][j]);
        }
        System.out.println();
    }

}
	}
}
