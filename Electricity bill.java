import java.util.Scanner;
class Electric
{
 int a,b,c,d;
 void readData(int x,int y,int z)
 {
    a=x;
    b=y;
    c=z;
 }
 void bill()
 {
    d=a*b*c;
 }
 void displayData()
 {
    System.out.println("Gross bill ="+d);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	Electric et = new Electric();
	int x;
	int y;
	int z;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no. of units :");
    x=scanner.nextInt();
    System.out.println("Enter cost of each unit per hour:");
    y=scanner.nextInt();
    System.out.println("Enter no. of hours used:");
    z=scanner.nextInt();
	et.readData(x,y,z);
 	et.bill();
    et.displayData();
	};
}