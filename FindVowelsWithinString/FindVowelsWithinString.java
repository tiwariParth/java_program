package FindVowelsWithinString;

import java.util.Scanner;

public class FindVowelsWithinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        s = s.replaceAll("\\s", "");
        String s1 = s.toLowerCase();
        System.out.println(s1);
        System.out.println(s1);
        int num = 0;
        int num2= 0;
        for(int i = 0; i<=s1.length()-1;i++){
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='i') {
                System.out.println("String has a vowel ");
                num++;
            }else{
                num2++;
            }
        }
        System.out.println("No of vowels are :"+num);
        System.out.println("No of consonent are :"+num2);
    }
}
