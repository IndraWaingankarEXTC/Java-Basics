import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	{
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    boolean isPalindrome = true;
    int left = 0;
    int right = str.length() -1;
    
    while 
           (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
         {   isPalindrome = false;
        break;
        }left++;
        right--;
}
    if (isPalindrome)
    System.out.println("It is a Palindrome ");
    else
    System.out.println("It is not a Palindrome ");
   }
	}
}
