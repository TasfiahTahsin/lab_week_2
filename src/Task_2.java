//Name: Tasfiah Tahsin Ahsan
//ID: 2012020258   Sec: F
//email: cse_2012020258@lus.ac.bd


import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        int n, i, j, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            r = 1;
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(r + " ");
                r++;
            }
            System.out.println();
        }
    }
}