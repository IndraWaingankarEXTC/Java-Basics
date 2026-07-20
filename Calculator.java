import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
{
int a,b;
char op;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter no. 1 :");
a=scanner.nextInt();
System.out.print("Enter no. 2 :");
b=scanner.nextInt();
System.out.print("Enter operater(+,-,*,/):");
op=scanner.next().charAt(0);
switch(op)
{
    case '+':
    System.out.println("Sum is :"+(a+b));
    break;
    case '-':
    System.out.println("Subtraction is :"+(a-b));
    break;
    case '*':
    System.out.println("Multiplication is :"+(a*b));
    break;
    case '/':
    System.out.println("Division is :"+(a/b));
    break;
    default:
    System.out.println("Error");
    
}
    
    
}
	}
}
