package CheckNumFreqInArr;

import java.util.Scanner;

public class CheckNumFreqInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int freq = 0;
        for(int i = 0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
        System.out.print("Enter the number to check frequency: ");
        int num = sc.nextInt();
        for(int j = 0; j<=arr.length-1;j++){
            if(arr[j]==num){
                freq++;
            }
        }
        System.out.println("Frequency of your number is :"+freq);


    }
}
