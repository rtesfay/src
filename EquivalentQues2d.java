import java.util.Scanner;

public class BooleanQues3{
        public static void main(String[] args) {
            int x=10;
            int y=20;
            int z=30;
                    boolean isValid = false;
                            (x < 10) || (x>10);
                    System.out.println(isValid); //    x<10 || x>10==F||F is false

            (x>y) && (y>x);
            System.out.println(isValid);//F&&T is false

            (x<y+z) && (x+10<=20);
            System.out.println("invalid");//T&&T is true

            (z-y)==x && Math.abs(y-z)==x;
            System.out.println("invalid");//T&&T is true

            (x<10) && (x>10);
            System.out.println(isValid);//F&&F is false

            (x>y) || (y>x);
            System.out.println("invalid");//F||T is true

            !(x<y+z)|| !(x+10 <=20);
            System.out.println(isValid);//!T||!T is F||F is false

            !(x==y)) && (x!=y))&&(x<y||y<x);
            System.out.println("invalid");// !F && T && (T ||F) is equal to T && T && T is true

        }
    }


