package SumOfArray;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int sum = 0;
        int f = 0;
        for(int j = 0;j<=arr.length-1;j++){
            arr[j]=sc.nextInt();
        }
        System.out.println(arr);

        for(int i = 0;i<=arr.length-1;i++){
            sum = arr[i]+sum;
            f++;
        }
        
        int avg = sum/f;
        System.out.println("Average :"+ avg);
        System.out.println("Sum :"+sum);
    }
}
