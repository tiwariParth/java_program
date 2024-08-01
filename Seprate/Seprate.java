package Seprate;

import java.util.Scanner;

public class Seprate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  = n/1000;
        int b = (n/100)%10;
        int c = (n/10)%10;
        int d = (n/1)%10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        if (a+b==b+c) {
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Unlucky Number");
        }
    }
}
