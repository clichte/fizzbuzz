package com.lichte.fizzbuzz;

public class ConsoleBasedFizzBuzz implements FizzBuzz {

    /**
     *
     * @param from
     * @param to
     */
    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i);
                System.out.println("\tFizz");
            } else if ( i % 5 == 0 && i % 3 != 0) {
                System.out.print(i);
                System.out.println("\tBuzz");
            } else if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.print(i);
                System.out.println("\tFizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
