import java.util.Scanner;
/*
***********
*         *
*         *
*         *
*         *
*         *
*         *
***********

 */
public class Ques_9 {
    static void printPattern(int n, int m){
        for (int i = 1; i<=n; i++) {
          for(int j = 1; j<=m; j++){
           if(i == 1 || j == 1 || i == n || j == m){
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
          }
          System.out.println();
        }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns :");
        int columns = sc.nextInt();
        printPattern(rows, columns);
    }
}
