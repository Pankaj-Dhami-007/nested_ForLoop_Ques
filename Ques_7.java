import java.util.Scanner;
/*
12345
1234
123
12
1

 */
public class Ques_7 {
    static void printPattern(int n, int m){
        for (int i = n; i>=1; i--) {
          for(int j = 1; j<=i; j++){
           System.out.print(j+" ");
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
