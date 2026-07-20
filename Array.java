import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
{
   int i;
   int[] a = new int[5];
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter 5 no.s for array :");
   for(i = 0;i<5;i++)
   a[i] = scanner.nextInt();
   System.out.println("The array is :");
   for(i = 0;i<5;i++)
   System.out.println(" "+a[i]);
   }
	}
}
