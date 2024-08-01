package SwitchCase;

import java.util.Scanner;

public class SwitchCaseExp {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    switch (a%2) {
        case 0:
                System.out.println("even");
            break;
        case 1:
            System.out.println("odd");
            break;
   
    }
   }
}
