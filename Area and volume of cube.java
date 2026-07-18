import java.util.Scanner;
class cube
{
 int s ,area, volume;
 void readData(int x)
 {
    s=x;
 }
 void perimeter2d()
 {
    area =6*s*s;
 }
 void perimeter3d()
 {
    volume=s*s*s;
 }
 void displayData()
 {
    System.out.println("Side ="+s);
    System.out.println("area ="+area);
    System.out.println("volume="+volume);
 }
};

public class Main
{
	public static void main(String[] args)
	{
	cube cb = new cube();
	int x;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the side of the cube:");
    x=scanner.nextInt();
	cb.readData(x);
 	cb.perimeter2d();
 	cb.perimeter3d();
    cb.displayData();
	};
}
