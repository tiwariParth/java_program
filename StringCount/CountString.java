package StringCount;

import java.util.Scanner;

public class CountString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.toLowerCase();
    int count = 1;
    for (int i = 0; i<=s.length()-1; i++) {
      if (s.charAt(i)==' ') {
        count++;
      }
      
    }
    System.out.println(count + " Words");
  }
}
