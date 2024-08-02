import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (num>=0 && num<=9) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
