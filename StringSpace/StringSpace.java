package StringSpace;

import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        s = s.toLowerCase();
        for(int i = 0; i<=s.length()-1;i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
}
