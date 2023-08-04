import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int n1  = scanner.nextInt();
    System.out.println("Enter second num");
    int n2 = scanner.nextInt();
    int sum = n1+n2;
    System.out.println("sum is" +sum);  
    scanner.close();
}
}
