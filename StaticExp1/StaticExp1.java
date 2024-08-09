package StaticExp1;

public class StaticExp1 {
    int count = 0;
    StaticExp1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticExp1 s1 = new StaticExp1();
        StaticExp1 s2 = new StaticExp1();
        StaticExp1 s3 = new StaticExp1();
        
    }
}
