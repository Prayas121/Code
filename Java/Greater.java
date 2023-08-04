import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the no.");
        int num1= scanner.nextInt();
        System.out.println("enter 2nd"); 
        int num2= scanner.nextInt();
        if(num1 > num2){
            System.out.println("greater" +num1);
        }
            else{
            System.out.println(" grater" +num2);
        }
}
