import java.util.Scanner;
class circle 
{
 int r;
 double circumference,area;
 void readData(int x)
 {
    r=x;
 }
 void c()
 {
    circumference=2*3.1412*r;
 }
 void a()
 {
    area=3.1412*r*r;
 }
 void displayData()
 {
    System.out.println("radius of circle ="+r);
    System.out.println("circumference of circle ="+circumference);
    System.out.println("area of circle ="+area);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	circle cir = new circle();
	int x;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Radius of the circle :");
    x=scanner.nextInt();
	cir.readData(x);
 	cir.c();
 	cir.a();
    cir.displayData();
	};
}