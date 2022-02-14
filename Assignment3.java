package geek14feb;

import java.util.Scanner;

public class Assignment3 {
//    swap two numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("a = " + a);

        System.out.println("enter b = ");
        int b = sc.nextInt();
        System.out.println("b = " + b);
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println( "a = " + a + " "+ " b = " + b );
    }
}
