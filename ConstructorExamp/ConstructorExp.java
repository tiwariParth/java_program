package ConstructorExamp;

import java.util.Scanner;

class Add{
    int a ,b,sum;
    Add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Add: "+sum);
    }
}
public class ConstructorExp {
    public static void main(String[] args) {
        Add a = new Add();
    }
}
