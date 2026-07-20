import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
{
   int num,a=0,b=1,c,i=1;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter no. of terms :");
   num = scanner.nextInt();
   do{
       System.out.println(" "+a);
       c=a+b;
       a=b;
       b=c;
   i++;
   }
   while (i<num);
}
	}
}
