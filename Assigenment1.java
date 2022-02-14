package geek14feb;

import java.util.Scanner;

public class Assigenment1 {
    public static void main(String[] args) {
//   To calculate sum of numbers till n, taking user input using for loop

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number till you want sum of numbers");
        int n = sc.nextInt();

        int sum = 0;
        for(int i =0;i<=n ; i++){
            sum = sum +i;

        }
        System.out.println(sum);
    }
}
