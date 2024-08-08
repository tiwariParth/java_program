package AreaOfRectangleSqaureCube;

import java.util.Scanner;

class Area{
    int l,b,h;

    Area(int a,int d,int c){
        l = a;
        b= d;
        h =c;
    }

    void AreaOfRectangle(){
        int AreaOfRectangle = l*b*h;
        System.out.println("Area of Rectangle is: "+ AreaOfRectangle);
    }

    void AreaOfSquare(){
        int AreaOfSquare = l*l;
        System.out.println("Area of Square is: "+ AreaOfSquare);
    }

    void volumeOfcube(){
        int volumeOfcube = l*3;
        System.out.println("Volume of Cube: "+volumeOfcube);
    }
}

public class AreaOfRectangleSquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parameters");
        int length = sc.nextInt();
        int breath = sc.nextInt();
        int height = sc.nextInt();

        Area a1 = new Area(length, breath, height);
        a1.AreaOfRectangle();
        a1.AreaOfSquare();
        a1.volumeOfcube();
    }
}
