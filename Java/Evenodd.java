import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args)
    {
    System.out.println("enter the no.");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if(n%2==0)
    System.out.println("even");
    else
System.out.println("odd");
    
    }
}
