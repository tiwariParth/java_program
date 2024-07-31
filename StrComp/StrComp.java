package StrComp;

import java.util.Scanner;

public class StrComp {
    public static void main(String[] args) {
        String name = "Raj";
        
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        System.out.println(name==username);
    }
}
