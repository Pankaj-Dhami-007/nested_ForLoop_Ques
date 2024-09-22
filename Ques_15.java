/*
       *
      * * 
     * * *
    * * * *
     * * * 
    * * * *
   * * * * *
  * * * * * *
   * * * * * 
  * * * * * *
 * * * * * * *
* * * * * * * *
    * * * *
    * * * *
    * * * *
    * * * *

 */

public class Ques_15 {
    static void print(){
        // top triangle
        for(int i=1; i<=5; i++){
            for(int j =1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
               System.out.print("* ");
            }
            System.out.println();
        }
 // diamond shape
        for(int i =3; i<= 6; i++){
            for(int j =1; j<= 6-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i =5; i<= 8; i++){
            for(int j =1; j<= 8-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Rectangle
        for(int i =1; i<= 4; i++){
            for(int j =1; j<= 4; j++){
                System.out.print(" ");
            }
            for(int j =1; j<= 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
