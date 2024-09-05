import java.util.Scanner;

class GettingGreater{
    public static void main (String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Getting the Greater Value");
    System.out.print("Enter first character: ");
    char ch1 = scanner.next().charAt(0);
    System.out.print("Enter second character: ");
    char ch2 = scanner.next().charAt(0);
    
    int num1 = (int) ch1;
    int num2 = (int) ch2;
    
    System.out.println("------------------------------------");
    if (ch1 > ch2)
    {
        System.out.println("The character with greater value is: " +ch1);
    }
    else
    {
        System.out.println("The character with greater value is: " +ch2);
    }
    System.out.println("------------------------------------");
    
    System.out.println("Showing the ASCII Codes");
    System.out.println("a : " +num1);
    System.out.println("a : " +num2);
    }
}