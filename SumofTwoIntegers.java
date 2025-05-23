// Problem: **Sum of Two Integers**
// Given two integers, write a function to return their sum.

// solution - just add the two given number

import java.util.Scanner;

class Solution{
	public int SumOfTwoIntegers(int a, int b){
        int sum = a + b;
		return sum;
    }
}

class Main{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first Number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
    sc.close();

		Solution solution = new Solution();
		int result = solution.SumOfTwoIntegers(a, b);
		System.out.println("Sum of two number: "+ result);
	}
}

// ```

// Enter the first Number
// 2
// Enter the second Number
// 3
// Sum of two number: 5