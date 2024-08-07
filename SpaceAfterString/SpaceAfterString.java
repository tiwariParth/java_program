package SpaceAfterString;

import java.util.Scanner;

public class SpaceAfterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for(int i = 1;i<=s.length()-1;i++){
            char x = s.charAt(i);
            char z = s.charAt(i-1);
            if (x==' '&&z!=' ') {
                count++;
            }
            }
            System.out.println("Total words are :"+count);
        }
}
