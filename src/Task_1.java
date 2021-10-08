//Name: Tasfiah Tahsin Ahsan
//ID: 2012020258   Sec: F
//email: cse_2012020258@lus.ac.bd


import java.util.Scanner;
class Task_1
{
    public static void main(String[] args)
    {
        int count_p=0, count_n=0, i;
        int [] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = input.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                count_n++;
            }
            else
            {
                count_p++;
            }
        }
        System.out.print(count_p + " Positive Numbers");
        System.out.print("\n" + count_n + " Negative Numbers");
    }
}