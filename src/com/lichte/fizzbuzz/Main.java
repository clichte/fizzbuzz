package com.lichte.fizzbuzz;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        int from;
        int to;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter beggining number: ");
        from = sc.nextInt();
        System.out.print("Enter ending number: ");
        to = sc.nextInt();
        
        ConsoleBasedFizzBuzz fb = new ConsoleBasedFizzBuzz();
        fb.print(from, to);
    }
    
}
