package Addition;

import java.util.Scanner;

class Add{
    int a,b,sum;
    int input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        return a;
    }
    int input2(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        return b;
    }
    int sum(){
        sum = a+b;
        System.out.println("Sum is: "+sum);
        return sum;
    }
}

public class Addition {
    public static void main(String[] args) {
        Add a = new Add();
        int s1 = a.input();
        int s2 = a.input2();
        int sum = a.sum();
    }
}
