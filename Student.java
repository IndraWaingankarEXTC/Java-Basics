import java.util.Scanner;
class Student
{String name;
float per;
int roll;
Student(String n,float p, int r)
{
    name = n;
    per = p;
    roll = r;
    }void displayData()
    {System.out.println("Name="+name);
    System.out.println("Percentage="+per);
    System.out.println("Roll no.="+roll);
}
}
public class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a;
    float b;
    int c;
    System.out.println("Enter your name=");
    a=scanner.nextLine();
    System.out.println("Enter your percentage=");
    b=scanner.nextFloat();
    System.out.println("Enter your roll no.=");
    c=scanner.nextInt();
    Student sd = new Student(a,b,c);
	sd.displayData();
	}
    
}
