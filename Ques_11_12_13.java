/*
    *
   **
  ***
 ****
*****

 */
import java.util.*;
public class Ques_11_12_13 {
    static void patternThird(int n){
        for(int i =n; i>=1; i--){
            for(int j =1; j<= n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=2*i-1; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<= n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = sc.nextInt();
          for(int i =1; i<=n; i++){
            for(int j =1; j<= n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          System.out.println();
          pattern(n);
          System.out.println();
          patternThird(n);
    }
}
