package Array.src;

//1. Write a program to sum all the values of a given Array in Java.

public class SumArray {
    public static void main(String[] args) {
        
        int[] array = {8, 4, 98, 23, 11};

        int total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
    
        System.out.println(total);
    }
}
