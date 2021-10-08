//Name: Tasfiah Tahsin Ahsan
//ID: 2012020258   Sec: F
//email: cse_2012020258@lus.ac.bd


import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        int n,s,count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();
        int [] number = new int[n];
        System.out.print("Enter "+n+" integers: ");
        for(int i=0; i<n; i++){
            number[i] = input.nextInt();
        }
        System.out.print("Enter the number to search: ");
        s = input.nextInt();
        for(int i=0; i<n; i++){
            if(number[i] == s)
            {
                count++;
                System.out.print(s+ " occurred "+count+ " times in the array.");
            }
        }
    }
}
