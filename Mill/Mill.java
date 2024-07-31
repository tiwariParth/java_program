package Mill;

import java.util.Scanner;

public class Mill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice :");
        int ch = sc.nextInt();

        if (ch==1) {
            System.out.println("hot milk is ready");
        }
        else if(ch==2){
            System.out.println("Hot water is ready");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
