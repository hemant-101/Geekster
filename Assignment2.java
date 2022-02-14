package geek14feb;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//        print table using userinput

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get table");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            int table = i * n;
            System.out.println(table);
        }
    }
}
