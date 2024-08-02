package MaxMin;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (num != -1) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num != -1) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
