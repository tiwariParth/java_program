package Parameterized;

import java.util.Scanner;

class Add{
    int a,b,tot;
    Scanner sc = new Scanner(System.in);
    Add(int x,int y){
        a = x;
        b = y;
    }
    void sum(){
        tot = a+b;
        System.out.println(tot);
    }
}

public class Parameterized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add a1= new Add(a, b);
        a1.sum();
    }
}
