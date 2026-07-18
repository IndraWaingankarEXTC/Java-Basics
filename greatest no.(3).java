import java.util.Scanner;
class Max
{
 int a,b,c;
 void readData(int x,int y,int z)
 {
    a=x;
    b=y;
    c=z;
 }
 void getMax()
 {
    if (a>b && a>c)
    System.out.println("Greatest integer is ="+a);
    else if (b>c)
    System.out.println("Greatest integer is ="+b);
    else 
    System.out.println("Greatest integer is ="+c);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	Max m = new Max();
    int x;
	int y;
	int z;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no. 1:");
    x=scanner.nextInt();
    System.out.println("Enter no. 2:");
    y=scanner.nextInt();
    System.out.println("Enter no. 3:");
    z=scanner.nextInt();
	m.readData(x,y,z);
 	m.getMax();
	};
}

