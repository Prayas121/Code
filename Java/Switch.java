import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        System.out.println("Enter the days no.");
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        switch(n){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
             System.out.println("monday");
             break;
             case 3:
             System.out.println("tuesday");
             break;
             case 4:
             System.out.println("wednesday");
             break;
             case 5:
             System.out.println("thurday");
             break;
             case 6:
             System.out.println("friday");
             break;
             case 7:
             System.out.println("Saturday");
             break;
             default :
             System.out.println("pryasdoona");
             break;
        }
    }

    
}
