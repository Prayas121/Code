import java.util.Scanner;

public class Arrde {
    public static void main(String[] args) {
        int[] n = new int [5];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 6 elements");
    for(int i=0; i<5; i++){
        System.out.println(n[i]);
        n[i]= Integer.parseInt(scanner.nextLine());

    }System.out.println("Your values");
    for(int i=0; i<5; i++){
        System.out.println(n[i]);
    }
    }
}
