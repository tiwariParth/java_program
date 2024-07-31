package salary;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        float basicSalary = sc.nextInt();
        float hre = (basicSalary*40)/100;
        float td = (basicSalary*10)/100;
        float total  = basicSalary + td+hre;
        System.out.println("Total: "+total);

    }
}
