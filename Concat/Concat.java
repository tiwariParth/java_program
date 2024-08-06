package Concat;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.compareTo(s2)==0) {
            System.out.println("Strings are equal");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println(s1+" is greater");
        }
        else{
            System.out.println(s2+" is greater");
        }
    }
}
