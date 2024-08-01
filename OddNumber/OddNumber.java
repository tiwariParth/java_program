package OddNumber;

public class OddNumber {
    public static void main(String[] args) {
        int a =20;
        int sum = 0;
        int count = 0;
        int avg = 1;
        for(int i=1;i<a;i+=2){
            System.out.println("Odd numbers :"+i);
            sum+=i;
            count++;
        }
        System.out.println("Sum is :"+sum);
        avg = sum/count;
        System.out.println("Avg is :"+avg);
    }
}
