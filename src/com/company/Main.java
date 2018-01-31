package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 int n = 0;
	 int sum = 0 ;

        for(n = scanner.nextInt(); n != 0; n /= 10)
        {
            sum += (n % 10);
        }
        System.out.println(sum + " ");

    }
}
