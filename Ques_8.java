import java.util.Scanner;
/*
A
AB
ABC
ABCD
ABCDE

 */
public class Ques_8 {
    static void printPattern(){
        String str = "ABCDE";
        for(int i =1; i< str.length()+1; i++){
            System.out.println(str.substring(0, i));
        }
  }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns :");
        int columns = sc.nextInt();
        printPattern();
    }
}
