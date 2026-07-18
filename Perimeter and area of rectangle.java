import java.util.Scanner;
class Rectangle 
{
 int l,b, perimeter,area;
 void readData(int x,int y)
 {
    l=x;
    b=y;
 }
 void perimeter1d()
 {
    perimeter =2*(l+b);
 }
 void perimeter2d()
 {
    area=l*b;
 }
 void displayData()
 {
    System.out.println("length ="+l);
    System.out.println("breadth ="+b);
    System.out.println("perimeter ="+perimeter);
    System.out.println("area="+area);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	Rectangle rec = new Rectangle();
	int x;
	int y;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of the rectangle :");
    x=scanner.nextInt();
    System.out.println("Enter the breadth of the rectangle :");
    y=scanner.nextInt();
	rec.readData(x,y);
 	rec.perimeter1d();
 	rec.perimeter2d();
    rec.displayData();
	};
}