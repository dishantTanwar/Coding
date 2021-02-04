import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;
class InsertionSort {
    public static int[] insertionSort(int[] input) {

       for (int i = 0; i < input.length - 1; i++) {
           // Split Array into two halves
            int numToInsert = input[i+1];
            int NumToInsertIdx = i+1;
            for (int j = 0; j < NumToInsertIdx; j++) {
                // Find index ie. where to insert the new number
                // Shift all numbers to the next index of left half
                // Insert the new number to its right place.
                if (numToInsert < input[j]) {
                    int idxToInsert = j;
                    for (int j2 = NumToInsertIdx; j2 > idxToInsert; j2--) {
                        input[j2] = input[j2 - 1];
                    }
                    input[idxToInsert] = numToInsert;
                    break;
                }
            }

       }
        return input;
        
    }
//                  4 | 3 1 2 5
//                  3 4 | 1 2 5
//                  1 3 4 | 2 5
//                  1 2 3 4 | 5
//                  1 2 3 4 5 |


    public static int[] insertionSortBetter(int[] input) {
        for(int i = 1; i < input.length; i++) {
            int numToInsert = input[i];
            int lastSortedIndex = i - 1;

            while (lastSortedIndex >= 0 && numToInsert < input[lastSortedIndex]) {
                input[lastSortedIndex + 1] = input[lastSortedIndex];
                lastSortedIndex--;
            }
        }
        return input;
    }
    public static void print(int[] input) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
    public  static void main(String[] args) {
        System.out.println("Hello, this program performs a Bubble Sort.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Array Size: ");
        int size  = scanner.nextInt();
        int input[] = new int[size];
        
        System.out.println("Enter your array : (" + size + " elements)" );
        // get Array from user
        for(int i=0; i < size; i++) {
            input[i]  = scanner.nextInt();                
        }
        System.out.println("Bubble sort normal");
        print(insertionSort(input));
        System.out.println("Bubble sort better");
        print(insertionSortBetter(input));

        scanner.close();
    }

}