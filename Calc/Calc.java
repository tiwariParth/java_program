package Calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char opr = sc.next().charAt(0);

        if (opr=='+') {
            int sum = a+b;
            System.out.println("Addition :"+sum);
        }
        else if(opr=='-'){
            int sub = a-b;
            System.out.println("Substraction :"+sub);
        }
        else if(opr=='*'){
            int mul = a*b;
            System.out.println("Multiplication :"+mul);
        }
        else if(opr=='/'){
            int div = a/b;
            System.out.println("Division :"+div);
        }
        else if (opr =='%') {
            int modulo = a%b;
            System.out.println("Remender :"+modulo);
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
