package Array.src;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialArray {
    public static void main(String[] args) throws Exception {

        // 3.
        // Write a public static method called "toPower" that takes in
        // as parameters two integers called size and power. The method
        // should return an array of size "size" with each array index
        // raised to the value of "power." So, for example, if we passed
        // in "size = 4" and "power = 2" to the "toPower," the method
        // should return the following result: [0,1,4,9].

        Scanner input = new Scanner(System.in);

        System.out.println("length of array? (integer)");
        int size = input.nextInt();

        System.out.println("raise each index to the power of what integer?");
        int power = input.nextInt();

        int[] array = toPower(size, power);
        System.out.println(Arrays.toString(array));
    }

    public static int[] toPower(int size, int power) {

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.pow(i, power);
        }
        return array;
    }
}
