package MaxMinArray;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max = 0;
        int min = 0;
        
        for(int i = 0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
            max = arr[i];
            min = arr[i];
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Max number is :"+ max);
        System.out.println("Min num is :"+ min );
    }
}
