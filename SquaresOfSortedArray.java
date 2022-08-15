// Squares Of Sorted Array
// Given an integer array sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
import java.util.*;

class SquaresOfSortedArray {

    public static int[] squares(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }

        int[] result = squares(array);
        for(int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        
        sc.close();
    }
    
}
