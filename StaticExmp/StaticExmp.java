package StaticExmp;

public class StaticExmp {
    int rollno;
    String name;
    static String college = "ITS";

    StaticExmp(int r,String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " " + name+ " "+ college);
    }

    public static void main(String[] args) {
        StaticExmp s1 = new StaticExmp(111, "Parth");
        StaticExmp s2 = new StaticExmp(121, "Aryan");
        s1.display();
        s2.display();       
    }
}
