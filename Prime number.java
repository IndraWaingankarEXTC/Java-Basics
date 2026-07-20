import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
{
    int num, i=2;
    boolean isPrime = true;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    num=scanner.nextInt();
    
    if (num<=1)
     isPrime = false;
    else
    {
      do
      {
        if (num%i==0 && i!=num)
         {
             isPrime = false;
         break;
         }
      i++;
      }
      while (i<num);
    }
    if (isPrime)
    System.out.println("The no. is prime");
    else
    System.out.println("The no. is not prime");
    
}
	}
}
