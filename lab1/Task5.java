package ru.mirea.lab1;

public class Task5 {
    public class Factorial {
        public static int factorial(int num) {
            if(num == 1) {
                return 1;
            }

            return num*factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(4));
    }
}
