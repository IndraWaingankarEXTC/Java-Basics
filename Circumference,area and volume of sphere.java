import java.util.Scanner;
class sphere
{
 int r;
 double circumference,area,volume;
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
 void v()
 {
     volume=(4/3)*3.1412*r*r*r;
 }
 void displayData()
 {
    System.out.println("radius ="+r);
    System.out.println("circumference ="+circumference);
    System.out.println("area ="+area);
    System.out.println("volume ="+volume);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	sphere sp = new sphere();
	int x;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Radius of the sphere :");
    x=scanner.nextInt();
	sp.readData(x);
 	sp.c();
 	sp.a();
 	sp.v();
    sp.displayData();
	};
}