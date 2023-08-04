import java.util.Scanner;

    public class Practise {
    
  public static void main(String[] args) {

    /*
     * 
     * //for binary
     * int num = 0b0011;
     * System.out.println(num);
     */

    /*
     * // for conversion
     * 
     * float f = 6.5f;
     * int x = (int)f;
     * System.out.println(x);
     */

    /*
     * // for byte and int.
     * 
     * byte a = 49;
     * byte b = 20;
     * int result = a*b;
     * System.out.println(result);
     */

    /*
     * //for remainder and division,
     * 
     * int a=4;
     * int b= 4;
     * int result= a/b; // used for only quotient.
     * int result1= a%b; //it is used for only for remainder.
     * System.out.println( result1);
     */

    /*
     * //for boolean value
     * 
     * int x=5;
     * int y=4;
     * boolean result= x>y;
     * System.out.println(result);
     */

    /*
     * // for 2 expression.
     * 
     * int x=4;
     * int y=3;
     * int a=8;
     * int b=9;
     * 
     * boolean result1 = x<y || a<b; // OR operator is used.
     * boolean result2 = x<y && a<b; // AND operator is used.
     * System.out.println(!result1); // If we want negative result then we can use
     * !before result.
     * System.out.println(result2);
     */

    // if elsle
    /*
     * int x=10;
     * int y=8;
     * 
     * if(x<y){
     * System.out.println(x);
     * }
     * else{
     * System.out.println(y);
     */

    // if else if

    /*
     * int x = 8;
     * int y = 10;
     * int z = 9;
     * 
     * if(x>y && x>z){
     * System.out.println(x);
     * }
     * else if( y>z)
     * {
     * System.out.println(y);
     * }
     * else {
     * System.out.println(z);
     * }
     */

    // Even and odd
    /*
     * int num = 5;
     * int result = 0;
     * if(num%2==0)
     * result = 10;
     * 
     * else
     * result = 67;
     * System.out.println(result);
     */

    // ?: use of it.
    /*
     * int num = 9;
     * int result= 0;
     * result = num % 2 == 0 ? 10 : 45; // Ternary operator:
     * 
     * System.out.println(result);
     * if ( result==10){
     * System.out.println("10 means even");
     * }
     * else{
     * System.out.println("45 means odd");
     * }
     */

    // Switch Case
    /*
     * int n;
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.println("Enter the num:");
     * n = Integer.parseInt(scanner.nextLine());
     * switch (n) {
     * case 1:
     * System.out.println("Sunday");
     * break;
     * case 2:
     * System.out.println("Monday");
     * break;
     * case 3:
     * System.out.println("Tuesday");
     * break;
     * case 4:
     * System.out.println("Wednedday");
     * break;
     * case 5:
     * System.out.println("Thursday");
     * break;
     * case 6:
     * System.out.println("Friday");
     * break;
     * case 7:
     * System.out.println("Saturday");
     * break;
     * default:
     * System.out.println("Default");
     * }
     */

    // Looping: used for multiple repeat.

    // for loop.

    /*
     * for (int i = 0; i < 10; i++)
     * System.out.println("Prayas Baral");
     */

    // while
    /*
     * int i = 1;
     * while (i<=4) {
     * System.out.println("prayass " + i );
     * int j = 1;
     * while( j<=3){
     * System.out.println("rayssss");
     * j++;
     * }
     * i++;
     * }
     */

    // do while
    /*
     * int i = 5;
     * do{
     * System.out.println("Hi");
     * }
     * while(i<=5);
     */

    // another example of for loop.
    /*
     * for(int j=0; j<=6; j++){
     * System.out.println("Days " +j);
     * 
     * for(int i=0; i<=9; i++){
     * System.out.println("  " +(i+8) + "- " + (i+9));
     * }
     * }
     */


     class Rat{
      public int add ( int n1, int n2, int n3)
      {
        return n1+n2+n3;
      }
      public int add (int n1, int n2){
        return n1+n2;
      }
     }

     public class Mouse{
      public static void main(String[] args){
        Rat prayas = new Rat();
        int r = prayas.add(12, 03);
        r = prayas.add(43, 4, 5);
        System.out.println(r);
      }
     } 

    }
    }
