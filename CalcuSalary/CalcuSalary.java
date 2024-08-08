package CalcuSalary;

import java.util.Scanner;

class TotalSalary{
    int baseSalary,currentSalary,depositSalary;
    Scanner ip = new Scanner(System.in);

    int intpurBaseSalary(){
        System.out.println("Enter base salary");
        baseSalary = ip.nextInt();
        System.out.println("Base Salary is: "+baseSalary);
        return baseSalary;
    }
    

    int depositSalary(){
        System.out.println("Enter the amount to deposite: ");
        depositSalary = ip.nextInt();
        System.out.println("Amout deposited: "+depositSalary);
       return depositSalary;
    } 
    int currentSalary(){
        currentSalary = baseSalary+depositSalary;
        System.out.println("Current Salary :"+currentSalary);
        return currentSalary;
    }
}
public class CalcuSalary{
    public static void main(String[] args) {
        TotalSalary total = new TotalSalary();
        int baseSalary = total.intpurBaseSalary();
        int depositSalary = total.depositSalary();
        int currentSalary = total.currentSalary();
    }
}