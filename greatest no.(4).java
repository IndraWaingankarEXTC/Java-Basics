import java.util.Scanner;
class Max
{
 int a,b,c,d;
 void readData(int w,int x,int y,int z)
 {
    a=w;
    b=x;
    c=y;
    d=z;
 }
 void getMax()
 {
    if (a>b && a>c && a>d)
    System.out.println("Greatest integer is ="+a);
    else if (b>c && b>d)
    System.out.println("Greatest integer is ="+b);
    else if (c>d)
    System.out.println("Greatest integer is ="+c);
    else
    System.out.println("Greatest integer is ="+d);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	Max m = new Max();
    int w;
    int x;
	int y;
	int z;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no. 1:");
    w=scanner.nextInt();
    System.out.println("Enter no. 2:");
    x=scanner.nextInt();
    System.out.println("Enter no. 3:");
    y=scanner.nextInt();
    System.out.println("Enter no. 4:");
    z=scanner.nextInt();
	m.readData(w,x,y,z);
 	m.getMax();
	};
}
