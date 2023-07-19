import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacci(n));
    }
    public static int findFibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
/*
Find Fibonacci
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number using recursion
Given that F0 = 0 and F1 = 1.

Input 1:
A = 2
Input 2:
A = 9

Output 1:
1
Output 2:
34
 */
