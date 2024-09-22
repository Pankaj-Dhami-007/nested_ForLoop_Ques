import java.util.Scanner;
/*
5.
1
12
123
1234
12345

 */
public class Ques_5 {
    static void printPattern(int n, int m){
        for (int i = 1; i<= n; i++) {
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
